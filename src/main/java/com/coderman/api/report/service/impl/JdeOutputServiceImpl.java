package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.JdeInput;
import com.coderman.api.common.pojo.report.JdeOutput;
import com.coderman.api.report.mapper.*;
import com.coderman.api.report.pojo.ReportInput;
import com.coderman.api.report.pojo.ReportOutput;
import com.coderman.api.report.pojo.ReportTime;
import com.coderman.api.report.service.JdeInputService;
import com.coderman.api.report.service.JdeOutputService;
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
public class JdeOutputServiceImpl implements JdeOutputService {

    @Autowired
    private JdeOutputMapper jdeOutputMapper;
    @Autowired
    private ReportTimeMapper reportTimeMapper;
    @Autowired
    private ReportOutputMapper reportOutputMapper;


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
        criteria.andEqualTo("type","1");
        List<ReportTime> maxList = reportTimeMapper.selectByExample(o);
        Date maxtime = maxList.get(0).getMax();

        for (Object jdeinput : list) {
            JdeOutput data = (JdeOutput)jdeinput;
            data.setInputTime(new Date());
            data.setRinse("0");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date inputDate = sdf.parse(data.gettZ());
                if( inputDate.getTime() > maxtime.getTime()){
                    jdeOutputMapper.insert(data);
                    this.inputReport(data);
                }
            }catch (Exception e){
                e.printStackTrace();
            }


        }
    }

    @Override
    public void updateReportTime() {
        Date maxdate = jdeOutputMapper.getMax();
        ReportTime reportTime = new ReportTime();
        reportTime.setMax(maxdate);
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system","0");
        criteria.andEqualTo("type","1");
        reportTimeMapper.updateByExampleSelective(reportTime,o);
    }
    private void inputReport(JdeOutput data){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ReportOutput reportOutput = new ReportOutput();
            reportOutput.setSystem("0");
            reportOutput.setGoodscode(data.gettL()); //商品编码
            reportOutput.setGoodsname(data.gettM()); //商品名称
            reportOutput.setGoodsmodle(data.gettO()); //商品规格
            reportOutput.setSuppliercode(data.gettH());//供应商编码
            reportOutput.setSuppliername(data.gettI());//供应商名称
            reportOutput.setBatch(data.gettP());//批号/批次
            reportOutput.setOrderno(data.gettA());//订单号
            reportOutput.setOrdertype(data.gettB());//订单类型
            reportOutput.setOrderline(data.gettE());//订单行号
            reportOutput.setPrice(data.gettBi());//含税单价
            reportOutput.setCount(data.gettS());//采购数量
            reportOutput.setUnit(data.gettW());//基本单位
            reportOutput.setInputtime(sdf.parse(data.gettZ())); //采购日期
            reportOutput.setFactorycode(data.gettCg()); //厂商编码
            reportOutput.setFactoryname(data.gettCh()); //厂商全称
            reportOutput.setProductline(data.gettEr());
            reportOutput.setProductlinecode(data.gettEq());
            reportOutput.setCreatetime(new Date());

            reportOutput.setCostprice(data.gettCq());
            reportOutput.setCost(data.gettCq());
            reportOutput.setSum(data.gettCs());
            reportOutput.setOrigflag("0");
            reportOutput.setRelated(data.gettAp());//批号/批次
            reportOutputMapper.insert(reportOutput);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
