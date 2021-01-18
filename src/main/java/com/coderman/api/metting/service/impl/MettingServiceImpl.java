package com.coderman.api.metting.service.impl;

import com.coderman.api.common.pojo.metting.*;
import com.coderman.api.common.pojo.system.User;
import com.coderman.api.metting.mapper.*;
import com.coderman.api.metting.service.MettingService;
import com.coderman.api.system.mapper.UserMapper;
import com.coderman.api.system.vo.GroupInfoVO;
import com.coderman.api.system.vo.GroupUserVO;
import com.coderman.api.system.vo.PageVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;
import java.util.ArrayList;
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
    @Autowired
    private MettingConstitutorMapper mettingConstitutorMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserGroupMapper userGroupMapper;


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

    @Override
    public List<Long> constitutorUsers(Long id) {
        Example o = new Example(MettingConstitutor.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("metting_id",id);
        List<MettingConstitutor> ConstitutorList = mettingConstitutorMapper.selectByExample(o);
        List<Long> usserid=new ArrayList<>();
        if(!CollectionUtils.isEmpty(ConstitutorList)){
            for (MettingConstitutor Constitutor : ConstitutorList) {
                if(Constitutor.getUser_id() != null){
                    usserid.add(Constitutor.getUser_id());
                }
            }
        }
        return usserid;
    }

    @Override
    public List<User> findNotInConstitutorUsersList(Long id) {
        List<User> userList = userMapper.findNotConstitutorUser(id);
        return  userList;
    }

    @Override
    public void setConstitutorUsers(Long id, Long[] rids) {
        //1、删除之前分配的用户
        Example o = new Example(MettingConstitutor.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("metting_id",id);
        mettingConstitutorMapper.deleteByExample(o);

        for(Long userid:rids){
            MettingConstitutor userGroup = new MettingConstitutor();
            userGroup.setUser_id(userid);
            userGroup.setMetting_id(id);
            mettingConstitutorMapper.insert(userGroup);
        }
    }

//    @Override
//    public GroupInfoVO[] getMettingUserInfo() {
//        GroupInfoVO[] result = null;
//        List<GroupUserVO> groupUser = userGroupMapper.getMettingUserInfo();
//        for(GroupUserVO user : groupUser){
//            String groupid = user.getGroupid().toString();
//            if(!isInArray(groupid,result)){
//                GroupInfoVO temp = new GroupInfoVO();
//                temp.setValue(groupid);
//                temp.setText(user.getGroupname());
//            }else{
//
//            }
//
//
//        }
//        return new GroupInfoVO[0];
//    }
//    private boolean isInArray(String id,GroupInfoVO[] arrayInfo){
//        if(arrayInfo == null){
//            return false;
//        }else{
//            for (GroupInfoVO user: arrayInfo){
//                if(user.getValue().equals(id)){
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
}
