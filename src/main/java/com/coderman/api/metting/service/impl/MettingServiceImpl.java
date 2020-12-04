package com.coderman.api.metting.service.impl;

import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.common.pojo.metting.Score;
import com.coderman.api.metting.mapper.MettingGroupMapper;
import com.coderman.api.metting.mapper.MettingMapper;
import com.coderman.api.metting.mapper.ScoreMapper;
import com.coderman.api.metting.service.MettingService;
import com.coderman.api.system.vo.PageVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class MettingServiceImpl implements MettingService {

    @Autowired
    private MettingMapper mettingMapper;

    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private MettingGroupMapper mettingGroupMapper;


    @Override
    public PageVO<Metting> findMettingList(Integer pageNum, Integer pageSize, Metting Metting) {
        PageHelper.startPage(pageNum,pageSize);
        Example o = new Example(Metting.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("create_time desc");
        if(Metting.getTitle() != null && !"".equals(Metting.getTitle())){
            criteria.andLike("title","%"+Metting.getTitle()+"%");
        }
        //查询isdelete不等于1的数据
        criteria.andEqualTo("isdelete","0");
        criteria.orIsNull("isdelete");
        List<Metting> mettingList = mettingMapper.selectByExample(o);
        PageInfo<Metting> info=new PageInfo<>(mettingList);
        return new PageVO<>(info.getTotal(),mettingList);
    }

    @Override
    @Transactional
    public void add(Metting metting) {
        if(StringUtils.isEmpty(metting.getId())){
            metting.setCreate_time(new Date());
            mettingMapper.insert(metting);
            Example o = new Example(Group.class);
            Example.Criteria criteria = o.createCriteria();
            criteria.andEqualTo("isdelete","0");
            criteria.orIsNull("isdelete");
            List<Group> groupList = mettingGroupMapper.selectByExample(o);

            for (Group group : groupList) {
                Score score = new Score();
                score.setGroupid(group.getId());
                score.setTotle(new BigDecimal(0));
                score.setTurns1(new BigDecimal(0));
                score.setTurns2(new BigDecimal(0));
                score.setTurns3(new BigDecimal(0));
                score.setTurns4(new BigDecimal(0));
                score.setTurns5(new BigDecimal(0));
                scoreMapper.insert(score);
            }
        }else{
            mettingMapper.updateByPrimaryKeySelective(metting);
        }

    }

    @Override
   public void delete( Long id){
        Metting metting = new Metting();
        metting.setId(id);
        metting.setIsdelete("1");

        mettingMapper.updateByPrimaryKeySelective(metting);
    }
    /**
     * 查找会议
     * @param id
     */
    @Override
    public Metting findMettingByid( Long id){
        Metting group = new Metting();
        group.setId(id);
        return  mettingMapper.selectByPrimaryKey(group);
    }


}
