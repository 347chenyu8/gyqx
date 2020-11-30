package com.coderman.api.metting.service.impl;

import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.metting.mapper.MettingMapper;
import com.coderman.api.metting.service.MettingService;
import com.coderman.api.system.vo.PageVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @Author zhangyukang
 * @Date 2020/4/2 20:24
 * @Version 1.0
 **/
@Service
public class MettingServiceImpl implements MettingService {

    @Autowired
    private MettingMapper mettingMapper;



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
    public void add(Metting metting) {
        if(StringUtils.isEmpty(metting.getId())){
            metting.setCreate_time(new Date());
            mettingMapper.insert(metting);
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
