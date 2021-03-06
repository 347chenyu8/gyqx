package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.QfbjInput;
import com.coderman.api.common.pojo.report.QfbjOutput;
import com.coderman.api.report.mapper.QfbjInputMapper;
import com.coderman.api.report.mapper.QfbjOutputMapper;
import com.coderman.api.report.service.SgInputService;
import com.coderman.api.report.service.SgOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class SgInputServiceImpl implements SgInputService {

    @Autowired
    private QfbjInputMapper qfbjInputMapper;


    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list){
        for (Object jdeinput : list) {
            QfbjInput data = (QfbjInput)jdeinput;
            data.setType("2");
            data.setInputTime(new Date());
            data.setRinse("0");
            qfbjInputMapper.insert(data);
        }
    }
    @Override
    public void updateReportTime() {

    }

}
