package com.coderman.api.report.service.impl;

import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.report.mapper.JdeInputStorageMapper;
import com.coderman.api.report.mapper.ReportGlMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportOutputMapper;
import com.coderman.api.report.pojo.*;
import com.coderman.api.report.service.ReportService;
import com.coderman.api.report.vo.AnalyseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

    private  static final String corp_name_gyqx="国药器械（海南）有限公司";
    private  static final String corp_name_dws="海南达沃斯科技有限公司";
    private  static final String corp_name_zhj="海南智合健科技有限公司";

    @Override
    public ResponseBean analyseData() {
        AnalyseResult analyseResult = new AnalyseResult();
        int count = 0;//处理数量
        int successCount = 0;//成功数量
        int failedCount = 0;//失败数量
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date beginTime;//数据最小日期
        Date EndTime ;//数据最大日期
        Date analyseBeginData;
        try{
            beginTime = sdf.parse("2099-01-01 00:00:00");
            EndTime = sdf.parse("2000-01-01 00:00:00");
            analyseBeginData = sdf.parse("2021-02-01 00:00:00");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseBean.error("系统错误，请联系管理员");
        }

        List<ReportOutput> succesData = new ArrayList<ReportOutput>();//失败数据
        List<ReportOutput> failedData = new ArrayList<ReportOutput>();;//失败数据


        //1.关联采销数据
        //1.1查找所有销售数据 (未处理的、采购对象不是内部单位的、时间大于2021-02-01号的销售记录）
        Example o = new Example(ReportOutput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("origflag",'0');
        List<String> insideCorpList = new ArrayList<>();
        insideCorpList.add(corp_name_gyqx);
        insideCorpList.add(corp_name_dws);
        insideCorpList.add(corp_name_zhj);
        criteria.andNotIn("suppliername",insideCorpList);
        criteria.andGreaterThanOrEqualTo("inputtime",analyseBeginData);
        List<ReportOutput> reportOutputs = reportOutputMapper.selectByExample(o);
        //1.2逐条查找采购订单号
        for(ReportOutput item : reportOutputs ){
            count++;//数量增加
            if(item.getInputtime().getTime() < beginTime.getTime()){
                beginTime = item.getInputtime();
            }
            if(item.getInputtime().getTime() > EndTime.getTime()){
                EndTime = item.getInputtime();
            }

            //获取销售数据
            BigDecimal count1 = item.getCount(); //销售数量
            String factoryname1 = item.getFactoryname(); //销售厂家
            Long id = item.getId();//销售记录ID
            String system = item.getSystem(); //数据来源系统

            ReportInput buyData = getBuyData(item);
            while(buyData !=null){
                if(insideCorp(buyData.getSuppliername())){
                    ReportOutput outPutByInput = getOutPutByInput(buyData);
                    if(outPutByInput == null){
                        failedCount++;// 失败数量增加
                        item.setOrigflag("2");//失败溯源
                        item.setOrigprice(item.getCostprice()); // 溯源成本单价
                        item.setOrigcost(item.getCost()); //溯源成本
                        item.setResult("未能关联到上级"+buyData.getSuppliername()+"内部销售单");
                        failedData.add(item);
                        break;
                    }
                    buyData = getBuyData(outPutByInput);

                }else{
                    successCount++;//成功数量增加
                    item.setOrigflag("1");//成功溯源
                    BigDecimal price = buyData.getPrice();
                    if(price == null){
                        price = new BigDecimal("0");
                    }
                    BigDecimal cost = price.multiply(count1);
                    item.setOrigprice(price); // 溯源成本单价
                    item.setOrigcost(cost); //溯源成本
                    succesData.add(item);
                    break;
                }
            }
            if(buyData == null){
                failedCount++;// 失败数量增加
                item.setOrigflag("2");//失败溯源
                item.setOrigprice(item.getCostprice()); // 溯源成本单价
                item.setOrigcost(item.getCost()); //溯源成本
                item.setResult("未能关联到采购订单");
                failedData.add(item);
            }
            //更新溯源销售记录
            UpdateOutPutByID(item);
        }

        analyseResult.setBeginTime(beginTime);
        analyseResult.setEndTime(EndTime);
        analyseResult.setCount(count);
        analyseResult.setFailedCount(failedCount);
        analyseResult.setSuccessCount(successCount);
        analyseResult.setCount(count);
        analyseResult.setSuccesData(succesData);
        analyseResult.setFailedData(failedData);
        return ResponseBean.success(analyseResult);
    }

    /**
     * 根据订单号和行号获取采购数据
     * @param order
     * @param line
     * @return
     */
    ReportInput getInputByOrderAndLine(String order,String line,String buyyear){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date beginTime =null;
        Date endTime =null;

        try{
             beginTime = sdf.parse(buyyear+"-01-01 00:00:00");
             endTime = sdf.parse(buyyear+"-12-31 23:59:59");

        }catch (Exception e){
            return null;
        }



        Example o = new Example(ReportInput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("orderno",order);
        criteria.andEqualTo("orderline",line);
        criteria.andGreaterThanOrEqualTo("inputtime",beginTime);//大于等于
        criteria.andLessThanOrEqualTo("inputtime",endTime);//小于等于
        List<ReportInput> ReportInput = reportInputMapper.selectByExample(o);
        return  ReportInput.get(0);
    }

    /**
     * 判断企业名称是否是内部企业
     * @param factoryname
     * @return
     */
    boolean insideCorp(String factoryname){
        if(factoryname.equals(corp_name_gyqx) || factoryname.equals(corp_name_dws) || factoryname.equals(corp_name_zhj)){
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
        if(suppliername.equals(corp_name_gyqx) ){
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
//        criteria.andEqualTo("ordertype","OP");  //测试环境没有这个类型
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
            String orderline = storageByRelated.getOrderline();//商品编码
            Example o = new Example(ReportInput.class);
            Example.Criteria criteria = o.createCriteria();
            criteria.andEqualTo("system",system);
            criteria.andEqualTo("goodscode",goodscode);
            criteria.andEqualTo("orderno",orderno);
            criteria.andEqualTo("orderline",orderline);
            List<ReportInput> reportInputs = reportInputMapper.selectByExample(o);
            if(reportInputs.size() == 0){
                return null;
            }
            return  reportInputs.get(0);

        }else{
            //达沃斯和智和健 前方百计系统
            Example gl = new Example(ReportGl.class);
            Example.Criteria glcriteria = gl.createCriteria();
            Date inputtime = reportOutput.getInputtime();
            Calendar c = Calendar.getInstance();
            c.setTime(inputtime);
            String year = ""+c.get(Calendar.YEAR);
            glcriteria.andEqualTo("saleorder",reportOutput.getOrderno());
            glcriteria.andEqualTo("saleorderline",reportOutput.getOrderline());
            glcriteria.andEqualTo("year",year);
            List<ReportGl> reportGls = reportGlMapper.selectByExample(gl);
            if (reportGls.size() !=1 ){
                return null;
            }else{
                String buyOrder = reportGls.get(0).getBuyorder();
                String buyOrderline = reportGls.get(0).getBuyorderline();
                String buyyear = reportGls.get(0).getBuyyear();
                ReportInput inputByOrderAndLine = getInputByOrderAndLine(buyOrder, buyOrderline,buyyear);
                inputByOrderAndLine.setRemake(reportGls.get(0).getRemake());
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
     *
     * @param reportInput
     * @return
     */
    private ReportOutput getOutPutByInput(ReportInput reportInput) {
        String Suppliername = reportInput.getSuppliername();
        if (reportInput.getSystem().equals("0")) {
            //国药从达沃斯采购
            if (Suppliername.equals(corp_name_dws)) {
                String remake = reportInput.getRemake();
                Example o = new Example(ReportOutput.class);
                Example.Criteria criteria = o.createCriteria();
                criteria.andEqualTo("related",remake);
                criteria.andEqualTo("system",'1');
                List<ReportOutput> reportOutputList = reportOutputMapper.selectByExample(o);
                if(reportOutputList.size()==0){
                    return null;
                }
                return reportOutputList.get(0);
            }
        } else if (reportInput.getSystem().equals("1")) {
            //达沃斯从国药采购
            if (Suppliername.equals(corp_name_gyqx)) {
                String remake = reportInput.getRemake();
                if(StringUtils.isEmpty(remake)){
                    return null;
                }
                Example sale = new Example(ReportOutput.class);
                Example.Criteria salecriteria = sale.createCriteria();
                salecriteria.andEqualTo("system", "0");
                salecriteria.andEqualTo("suppliername", corp_name_dws);
                salecriteria.andEqualTo("related", remake);
                List<ReportOutput> solereport = reportOutputMapper.selectByExample(sale);
                if (solereport.size() == 0) {
                    return null;
                } else {
                    return solereport.get(0);
                }
            }
        } else if (reportInput.getSystem().equals("2")) {
            //智合健从国药采购
            if (Suppliername.equals(corp_name_gyqx)) {
                String remake = reportInput.getRemake();
                if(StringUtils.isEmpty(remake)){
                    return null;
                }
                Example sale = new Example(ReportOutput.class);
                Example.Criteria salecriteria = sale.createCriteria();
                salecriteria.andEqualTo("system", "0");
                salecriteria.andEqualTo("suppliername", corp_name_zhj);
                salecriteria.andEqualTo("related", remake);
                List<ReportOutput> solereport = reportOutputMapper.selectByExample(sale);
                if (solereport.size() == 0) {
                    return null;
                } else {
                    return solereport.get(0);
                }
            }
        }
        return  null;
    }
}
