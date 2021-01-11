package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.JdeInput;
import com.coderman.api.report.mapper.JdeInputMapper;
import com.coderman.api.report.service.JdeInputService;
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
public class JdeInputServiceImpl implements JdeInputService {

    @Autowired
    private JdeInputMapper jdeInputMapper;


    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list){
        for (Object jdeinput : list) {
            JdeInput data = (JdeInput)jdeinput;
            data.setInputTime(new Date());
            data.setRinse("0");
            jdeInputMapper.insert(data);
        }
    }


}
