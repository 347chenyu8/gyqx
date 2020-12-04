package com.coderman.api.metting.service.impl;

import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.common.pojo.metting.Score;
import com.coderman.api.metting.mapper.ScoreMapper;
import com.coderman.api.metting.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class ScoreServiceImpl implements ScoreService {
    
    @Autowired
    ScoreMapper scoreMapper;

    @Override
    public List<Score> getAllScore(Long id) {
        Example o = new Example(Score.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("mettingid",id);
        List<Score> mettingList = scoreMapper.selectByExample(o);
        return mettingList;
    }
}
