package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.JdeInput;
import com.coderman.api.common.pojo.report.QfbjInput;
import com.coderman.api.report.mapper.JdeInputMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportTimeMapper;
import com.coderman.api.report.pojo.ReportInput;
import com.coderman.api.report.pojo.ReportTime;
import com.coderman.api.report.service.JdeInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class JdeInputServiceImpl implements JdeInputService {

    @Autowired
    private JdeInputMapper jdeInputMapper;

    @Autowired
    private ReportTimeMapper reportTimeMapper;

    @Autowired
    private ReportInputMapper reportinputMapper;


    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list){
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("max desc");
        //查询isdelete不等于1的数据
        criteria.andEqualTo("system","0");
        criteria.andEqualTo("type","0");
        List<ReportTime> maxList = reportTimeMapper.selectByExample(o);
        Date maxtime = maxList.get(0).getMax();

        for (Object jdeinput : list) {
            JdeInput data = (JdeInput)jdeinput;
            data.setInputTime(new Date());
            data.setRinse("0");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date inputDate = sdf.parse(data.gettAi());
                if( inputDate.getTime() > maxtime.getTime()){
                    jdeInputMapper.insert(data);
                    this.inputReport(data);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public void updateReportTime() {
        Date maxdate = jdeInputMapper.getMax();

        ReportTime reportTime = new ReportTime();
        reportTime.setMax(maxdate);
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system","0");
        criteria.andEqualTo("type","0");
        reportTimeMapper.updateByExampleSelective(reportTime,o);
    }

    private void inputReport(JdeInput data){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ReportInput reportInput = new ReportInput();
            reportInput.setSystem("0");
            reportInput.setGoodscode(data.gettH()); //商品编码
            reportInput.setGoodsname(data.gettJ()); //商品名称
            reportInput.setGoodsmodle(data.gettL()); //商品规格
            reportInput.setSuppliercode(data.gettAg());//供应商编码
            reportInput.setSuppliername(data.gettAh());//供应商名称
            reportInput.setBatch(data.gettN());//生产批次
            reportInput.setOrderno(data.gettA());//订单号
            reportInput.setOrdertype(data.gettB());//订单类型
            reportInput.setOrderline(data.gettBs());//订单行号
            reportInput.setPrice(data.gettW());//含税单价
            reportInput.setCount(data.gettT());//采购数量
            reportInput.setUnit(data.gettP());//基本单位
            reportInput.setInputtime(sdf.parse(data.gettAi())); //采购日期
            reportInput.setFactorycode(data.gettBa()); //厂商编码
            reportInput.setFactoryname(data.gettBb()); //厂商全称
            reportInput.setProductline(data.gettBk());
            reportInput.setProductlinecode(data.gettBj());

            reportInput.setRelated(data.gettBq());//入库批号/批次
            reportInput.setCreatetime(new Date());




            reportinputMapper.insert(reportInput);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
