package com.coderman.api.metting.service.impl;

import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.common.pojo.metting.UserGroup;
import com.coderman.api.common.pojo.system.User;
import com.coderman.api.metting.mapper.MettingGroupMapper;
import com.coderman.api.metting.mapper.UserGroupMapper;
import com.coderman.api.metting.service.MettingGroupService;
import com.coderman.api.system.mapper.UserMapper;
import com.coderman.api.system.vo.PageVO;
import com.coderman.api.system.vo.UserGroupVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Transactional
@Service
public class MettingGroupServiceImpl implements MettingGroupService {

    @Autowired
    private MettingGroupMapper mettingGroupMapper;

    @Autowired
    private UserGroupMapper userGroupMapper;


    @Override
    public PageVO<Group> findMettingGroupList(Integer pageNum, Integer pageSize, Group group) {
        PageHelper.startPage(pageNum,pageSize);
        Example o = new Example(Metting.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("create_time desc");
        if(group.getName() != null && !"".equals(group.getName() )){
            criteria.andLike("title","%"+group.getName() +"%");
        }
        //查询isdelete不等于1的数据
        criteria.andEqualTo("isdelete","0");
        criteria.orIsNull("isdelete");
        List<Group> groupList = mettingGroupMapper.selectByExample(o);
        PageInfo<Group> info=new PageInfo<>(groupList);
        return new PageVO<>(info.getTotal(),groupList);
    }



    @Override
    public void add(Group group) {
        if(StringUtils.isEmpty(group.getId())){
            group.setCreate_time(new Date());
            mettingGroupMapper.insert(group);
        }else{
            mettingGroupMapper.updateByPrimaryKeySelective(group);
        }

    }

    @Override
   public void delete( Long id){
        Group group = new Group();
        group.setId(id);
        group.setIsdelete("1");
        mettingGroupMapper.updateByPrimaryKeySelective(group);
    }

    /**
     * 查找分组
     * @param id
     */
    @Override
    public Group findGroupByid( Long id){
        Group group = new Group();
        group.setId(id);
        return  mettingGroupMapper.selectByPrimaryKey(group);
    }
    /**
     * 查找分组人员IDlist
     * @param id
     */
    @Override
    public List<Long> GroupUsers(Long id){
        // 创建Example
        Example example = new Example(UserGroup.class);
        // 创建Criteria
        Example.Criteria criteria = example.createCriteria();
        // 添加条件
        criteria.andEqualTo("groupid", id);

        List<UserGroup> uglist = userGroupMapper.selectByExample(example);

        List<Long> usserid=new ArrayList<>();
        if(!CollectionUtils.isEmpty(uglist)){
            for (UserGroup userGroup : uglist) {
                if(userGroup.getUserid()!=null){
                    usserid.add(userGroup.getUserid());
                }
            }
        }
        return usserid;
    }

    @Override
    public void assignUsers(Long id,Long[] rids){
//        1、删除之前分配的用户
        Example o = new Example(UserGroup.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("groupid",id);
        userGroupMapper.deleteByExample(o);

        for(Long userid:rids){
            UserGroup userGroup = new UserGroup();
            userGroup.setUserid(userid);
            userGroup.setGroupid(id);
            userGroupMapper.insert(userGroup);
        }
    }

    @Override
    public List<Group> findGroupArray(){
        Example o = new Example(Metting.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("create_time desc");
        //查询isdelete不等于1的数据
        criteria.andEqualTo("isdelete","0");
        criteria.orIsNull("isdelete");
        List<Group> groupList = mettingGroupMapper.selectByExample(o);
        return  groupList;

    }
    @Override
    public List<UserGroupVO> getAllGroupUser(){
        List<UserGroupVO> ugList = userGroupMapper.findGroupUser();
        return ugList;
    }
}
