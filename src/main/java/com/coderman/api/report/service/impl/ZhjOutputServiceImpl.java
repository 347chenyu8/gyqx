package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.QfbjOutput;
import com.coderman.api.report.mapper.QfbjOutputMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportOutputMapper;
import com.coderman.api.report.mapper.ReportTimeMapper;
import com.coderman.api.report.pojo.ReportOutput;
import com.coderman.api.report.pojo.ReportTime;
import com.coderman.api.report.service.ZhjOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class ZhjOutputServiceImpl implements ZhjOutputService {

    @Autowired
    private QfbjOutputMapper qfbjOutputMapper;
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
        criteria.andEqualTo("system","2");
        criteria.andEqualTo("type","1");
        List<ReportTime> maxList = reportTimeMapper.selectByExample(o);
        Date maxtime = maxList.get(0).getMax();

        for (Object jdeinput : list) {
            QfbjOutput data = (QfbjOutput)jdeinput;
            data.setType("3");
            data.setInputTime(new Date());
            data.setRinse("0");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date inputDate = sdf.parse(data.gettB());
                if( inputDate.getTime() > maxtime.getTime()){
                    qfbjOutputMapper.insert(data);
                    this.inputReport(data);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public void updateReportTime() {
        Date maxdate = qfbjOutputMapper.getMax("3");

        ReportTime reportTime = new ReportTime();
        reportTime.setMax(maxdate);
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system","2");
        criteria.andEqualTo("type","1");
        reportTimeMapper.updateByExampleSelective(reportTime,o);
    }
    private void inputReport(QfbjOutput data){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            ReportOutput reportOutput = new ReportOutput();
            reportOutput.setSystem("2");
            reportOutput.setGoodscode(data.gettR());
            reportOutput.setGoodsname(data.gettS());
            reportOutput.setGoodsmodle(data.gettU());
            reportOutput.setSuppliercode(data.gettC());
            reportOutput.setSuppliername(data.gettD());
            reportOutput.setBatch(data.gettAf());
            reportOutput.setOrderno(data.gettE());
            reportOutput.setOrdertype(data.gettH());
            reportOutput.setOrderline(data.gettI());
            reportOutput.setPrice(data.gettAv());//含税单价
            reportOutput.setCount(data.gettAp());//采购数量
            reportOutput.setUnit(data.gettT());//基本单位
            reportOutput.setInputtime(sdf.parse(data.gettB())); //采购日期
            reportOutput.setFactorycode(data.gettY()); //厂商编码
            reportOutput.setFactoryname(data.gettZ()); //厂商全称
            reportOutput.setCreatetime(new Date());

            reportOutput.setCostprice(data.gettAy());
            reportOutput.setCost(data.gettAz());
            reportOutput.setSum(data.gettAt());
            reportOutput.setOrigflag("0");

            reportOutputMapper.insert(reportOutput);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
