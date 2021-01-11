package com.coderman.api.report.service.impl;

import com.coderman.api.common.pojo.report.QfbjOutput;
import com.coderman.api.report.mapper.QfbjOutputMapper;
import com.coderman.api.report.service.DwsOutputService;
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
public class DwsOutputServiceImpl implements DwsOutputService {

    @Autowired
    private QfbjOutputMapper qfbjOutputMapper;


    /**
     * 保存导入数据
     */
    @Override
    public void save(List<Object> list){
        for (Object jdeinput : list) {
            QfbjOutput data = (QfbjOutput)jdeinput;
            data.setType("0");
            data.setInputTime(new Date());
            data.setRinse("0");
            qfbjOutputMapper.insert(data);
        }
    }


}
