package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.QfbjInput;
import com.coderman.api.report.mapper.QfbjInputMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportTimeMapper;
import com.coderman.api.report.pojo.ReportInput;
import com.coderman.api.report.pojo.ReportTime;
import com.coderman.api.report.service.DwsInputService;
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
public class DwsInputServiceImpl implements DwsInputService {

    @Autowired
    private QfbjInputMapper qfbjInputMapper;
    @Autowired
    private ReportTimeMapper reportTimeMapper;
    @Autowired
    private ReportInputMapper reportinputMapper;



    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list)  {
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("max desc");
        //查询isdelete不等于1的数据
        criteria.andEqualTo("system","1");
        criteria.andEqualTo("type","0");
        List<ReportTime> maxList = reportTimeMapper.selectByExample(o);
        Date maxtime = maxList.get(0).getMax();

        for (Object jdeinput : list) {
            QfbjInput data = (QfbjInput)jdeinput;
            data.setType("0");
            data.setInputTime(new Date());
            data.setRinse("0");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date inputDate = sdf.parse(data.gettB());
                if( inputDate.getTime() > maxtime.getTime()){
                    qfbjInputMapper.insert(data);
                    this.inputReport(data);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateReportTime() {
        Date maxdate = qfbjInputMapper.getMax("0");

        ReportTime reportTime = new ReportTime();
        reportTime.setMax(maxdate);
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system","1");
        criteria.andEqualTo("type","0");
        reportTimeMapper.updateByExampleSelective(reportTime,o);
    }

    private void inputReport(QfbjInput data){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            ReportInput reportInput = new ReportInput();
            reportInput.setSystem("1");
            reportInput.setGoodscode(data.gettI());
            reportInput.setGoodsname(data.gettJ());
            reportInput.setGoodsmodle(data.gettL());
            reportInput.setSuppliercode(data.gettC());
            reportInput.setSuppliername(data.gettD());
            reportInput.setBatch(data.gettAa());
            reportInput.setOrderno(data.gettE());
            reportInput.setOrdertype(data.gettG());
            reportInput.setOrderline(data.gettH());
            reportInput.setPrice(data.gettAh());//不含税单价
            reportInput.setCount(data.gettAg());//采购数量
            reportInput.setUnit(data.gettK());//基本单位
            reportInput.setInputtime(sdf.parse(data.gettB())); //采购日期
            reportInput.setFactorycode(data.gettP()); //厂商编码
            reportInput.setFactoryname(data.gettQ()); //厂商全称
            reportInput.setCreatetime(new Date());
            reportinputMapper.insert(reportInput);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
