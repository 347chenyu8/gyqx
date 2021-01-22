package com.coderman.api.report.service.impl;

import com.coderman.api.report.mapper.JdeInputStorageMapper;
import com.coderman.api.report.mapper.ReportGlMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportOutputMapper;
import com.coderman.api.report.pojo.*;
import com.coderman.api.report.service.ReportGlService;
import com.coderman.api.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportOutputMapper reportOutputMapper;
    @Autowired
    ReportInputMapper reportInputMapper;
    @Autowired
    ReportGlMapper reportGlMapper;
    @Autowired
    JdeInputStorageMapper jdeInputStorageMapper;

    @Override
    public void analyseData() {
        //1.关联采销数据
        //1.1查找智合健所有销售数据 未处理的销售
        Example o = new Example(ReportOutput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system",'2');
        criteria.andEqualTo("origflag",'0');
        List<ReportOutput> reportOutputs = reportOutputMapper.selectByExample(o);
        //1.2逐条查找采购订单号
        for(ReportOutput item : reportOutputs ){
            //获取销售数据
            BigDecimal count1 = item.getCount(); //销售数量
            String factoryname1 = item.getFactoryname(); //销售厂家
            Long id = item.getId();//销售记录ID
            String system = item.getSystem(); //数据来源系统

            ReportInput buyData = getBuyData(item);
            while(buyData !=null){
                if(insideCorp(buyData.getSuppliername())){
                    ReportOutput outPutByInput = getOutPutByInput(buyData);
                    buyData = getBuyData(outPutByInput);
                }else{
                    item.setOrigflag("1");//成功溯源
                    BigDecimal price = buyData.getPrice();
                    BigDecimal cost = price.multiply(count1);
                    item.setOrigprice(price); // 溯源成本单价
                    item.setOrigcost(cost); //溯源成本
                    break;
                }
            }
            if(buyData == null){
                item.setOrigflag("2");//失败溯源
                item.setOrigprice(item.getCostprice()); // 溯源成本单价
                item.setOrigcost(item.getCost()); //溯源成本
            }
            //更新溯源销售记录
            UpdateOutPutByID(item);
        }
    }

    /**
     * 根据订单号和行号获取采购数据
     * @param order
     * @param line
     * @return
     */
    ReportInput getInputByOrderAndLine(String order,String line){
        Example o = new Example(ReportInput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("orderno",order);
        criteria.andEqualTo("orderline",line);
        List<ReportInput> ReportInput = reportInputMapper.selectByExample(o);
        return  ReportInput.get(0);
    }

    /**
     * 判断企业名称是否是内部企业
     * @param factoryname
     * @return
     */
    boolean insideCorp(String factoryname){
        if(factoryname.equals("国药器械（海南）有限公司") || factoryname.equals("海南达沃斯科技有限公司")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 根据供应商名称获取系统编码
     * @param suppliername
     * @return
     */
    String getSystemCodeBySuppliername(String suppliername){
        if(suppliername.equals("国药器械（海南）有限公司") ){
            return "0";
        }else if(suppliername.equals("海南达沃斯科技有限公司")){
            return "1";
        }
        return "-1";
    }

    /**
     * JDE根据批次关联入库单
     * @param reportOutput
     * @return
     */
    private JDEInputStorage getStorageByRelated(ReportOutput reportOutput){
        String related = reportOutput.getRelated();
        Example o = new Example(JDEInputStorage.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("related",related);
        List<JDEInputStorage> storages = jdeInputStorageMapper.selectByExample(o);
        if(storages.size() == 1){
            return  storages.get(0);
        }else{
            return null;
        }
    }
    /**
     * 根据销售单获取采购单
     * @param reportOutput
     */
    ReportInput getBuyData(ReportOutput reportOutput){
        if(reportOutput == null){
            return null;
        }
        String system = reportOutput.getSystem();
        if(system.equals("0")){
            //国药JDE销售系统
            JDEInputStorage storageByRelated = getStorageByRelated(reportOutput);
            if(storageByRelated == null){
                return  null;
            }
            String orderno = storageByRelated.getOrderno(); //采购订单号
            String goodscode = storageByRelated.getGoodscode();//商品编码
            Example o = new Example(ReportInput.class);
            Example.Criteria criteria = o.createCriteria();
            criteria.andEqualTo("system",system);
            criteria.andEqualTo("goodscode",goodscode);
            criteria.andEqualTo("orderno",orderno);
            List<ReportInput> reportInputs = reportInputMapper.selectByExample(o);
            if(reportInputs.size() != 1){
                return null;
            }
            return  reportInputs.get(0);

        }else{
            //达沃斯和智和健 前方百计系统
            Example gl = new Example(ReportGl.class);
            Example.Criteria glcriteria = gl.createCriteria();
            glcriteria.andEqualTo("saleorder",reportOutput.getOrderno());
            glcriteria.andEqualTo("saleorderline",reportOutput.getOrderline());
            List<ReportGl> reportGls = reportGlMapper.selectByExample(gl);
            if (reportGls.size() !=1 ){
                return null;
            }else{
                String buyOrder = reportGls.get(0).getBuyorder();
                String buyOrderline = reportGls.get(0).getBuyorderline();
                ReportInput inputByOrderAndLine = getInputByOrderAndLine(buyOrder, buyOrderline);
                return inputByOrderAndLine;
            }
        }
    }

    /**
     * 更新销售数据
     * @param reportOutput
     */
    private void UpdateOutPutByID(ReportOutput reportOutput){

        Example o = new Example(ReportOutput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("id",reportOutput.getId());
        reportOutputMapper.updateByExampleSelective(reportOutput,o);
    }

    /**
     * 根据系统编码获取系统名称
     * @param code
     * @return
     */
    private String getSystemNameBySystemCode(String code){
        if(code.equals("0")){
            return  "国药器械（海南）有限公司";
        }else if(code.equals("1")){
            return "海南达沃斯科技有限公司";
        }else{
            return "海南智合健科技有限公司";
        }
    }
    /**
     * 根据A系统的采购单关联B系统的销售单
     * 主要根据销售数量商品名称 规格 价格，采购日期之前 仅匹配
     * @param reportInput
     * @return
     */
    private ReportOutput getOutPutByInput(ReportInput reportInput){
        String factoryname = reportInput.getSuppliername();
        String batch = reportInput.getBatch(); //获取生产批次
        BigDecimal count = reportInput.getCount(); //获取采购数量
        String goodsname = reportInput.getGoodsname();//获取名称
        String goodsmodle = reportInput.getGoodsmodle(); //获取采购规格
        BigDecimal price = reportInput.getPrice();//获取采购单价
        Date inputtime = reportInput.getInputtime(); //获取采购日期
        String system = getSystemCodeBySuppliername(factoryname);
        String suppliername = getSystemNameBySystemCode(reportInput.getSystem());
        Example o = new Example(ReportInput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system",system);
        criteria.andEqualTo("count",count);
        criteria.andEqualTo("goodsname",goodsname);
//        criteria.andEqualTo("goodsmodle",goodsmodle);  //取消商品规格
        criteria.andEqualTo("price",price);
        criteria.andEqualTo("suppliername",suppliername);
        criteria.andLessThanOrEqualTo("inputtime",inputtime);
        o.setOrderByClause("inputtime desc");

        List<ReportOutput> reportOutputs = reportOutputMapper.selectByExample(o);
        if(reportOutputs.size() != 0){
            return  reportOutputs.get(0);
        }else{
            return null;
        }

    }


}
