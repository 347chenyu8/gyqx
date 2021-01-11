package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.JdeInput;
import com.coderman.api.common.pojo.report.JdeOutput;
import com.coderman.api.report.mapper.JdeInputMapper;
import com.coderman.api.report.mapper.JdeOutputMapper;
import com.coderman.api.report.service.JdeInputService;
import com.coderman.api.report.service.JdeOutputService;
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
public class JdeOutputServiceImpl implements JdeOutputService {

    @Autowired
    private JdeOutputMapper jdeOutputMapper;


    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list){
        for (Object jdeinput : list) {
            JdeOutput data = (JdeOutput)jdeinput;
            data.setInputTime(new Date());
            data.setRinse("0");
            jdeOutputMapper.insert(data);
        }
    }


}
