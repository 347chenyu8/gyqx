package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.QfbjInput;
import com.coderman.api.report.mapper.JdeInputStorageMapper;
import com.coderman.api.report.mapper.QfbjInputMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportTimeMapper;
import com.coderman.api.report.pojo.JDEInputStorage;
import com.coderman.api.report.pojo.ReportInput;
import com.coderman.api.report.pojo.ReportTime;
import com.coderman.api.report.service.DwsInputService;
import com.coderman.api.report.service.JdeInputStorageService;
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
public class JdeInputStorageServiceImpl implements JdeInputStorageService {

    @Autowired
    private JdeInputStorageMapper storageMapper;
    @Autowired
    private ReportTimeMapper reportTimeMapper;
    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list)  {
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("max desc");
        //查询isdelete不等于1的数据
        criteria.andEqualTo("system","0");
        criteria.andEqualTo("type","2");
        List<ReportTime> maxList = reportTimeMapper.selectByExample(o);
        Date maxtime = maxList.get(0).getMax();

        for (Object jdeinput : list) {
            JDEInputStorage data = (JDEInputStorage)jdeinput;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {

                Date inputDate = data.getInputtime();
                if( inputDate.getTime() > maxtime.getTime()){
                    storageMapper.insert(data);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateReportTime() {
        Date maxdate = storageMapper.getMax();
        ReportTime reportTime = new ReportTime();
        reportTime.setMax(maxdate);
        Example o = new Example(ReportTime.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system","0");
        criteria.andEqualTo("type","2");
        reportTimeMapper.updateByExampleSelective(reportTime,o);
    }


}
