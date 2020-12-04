package com.coderman.api.metting.service.impl;

import com.coderman.api.common.pojo.metting.Check;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.metting.mapper.CheckMapper;
import com.coderman.api.metting.mapper.MettingMapper;
import com.coderman.api.metting.service.CheckService;
import com.coderman.api.metting.service.MettingService;
import com.coderman.api.system.vo.CheckVo;
import com.coderman.api.system.vo.PageVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    private CheckMapper checkMapper;


    /**
     * 会议签到
     */
    @Override
    public void check(Check check){
        check.setCheckTime(new Date());
        checkMapper.insert(check);
    }

    @Override
    public List<CheckVo> getCheckByMettingID(long id){
        List<CheckVo> checkRecord = checkMapper.getCheckByMettingID(id);
//        Set<CheckVo> checkRecordSet = new HashSet<>(checkRecord);
//        List<CheckVo> checkRecordList = new ArrayList<>(checkRecordSet);
        return  checkRecord;
    }
}
