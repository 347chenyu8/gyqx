package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.QfbjInput;
import com.coderman.api.report.mapper.QfbjInputMapper;
import com.coderman.api.report.mapper.ReportGlMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportTimeMapper;
import com.coderman.api.report.pojo.ReportGl;
import com.coderman.api.report.pojo.ReportInput;
import com.coderman.api.report.pojo.ReportTime;
import com.coderman.api.report.service.DwsInputService;
import com.coderman.api.report.service.ReportGlService;
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
public class ReportGlServiceImpl implements ReportGlService {

    @Autowired
    private ReportGlMapper reportGlMapper;



    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list)  {

        for (Object jdeinput : list) {
            ReportGl data = (ReportGl)jdeinput;
            reportGlMapper.insert(data);
        }
    }

    @Override
    public void updateReportTime() {

    }


}
