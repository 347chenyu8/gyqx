package com.coderman.api.metting.service;

import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.system.vo.PageVO;
import com.coderman.api.system.vo.UserGroupVO;

import java.util.List;


public interface MettingGroupService {
    /**
     * 获取会议列表
     * @param pageNum
     * @param pageSize
     * @param group
     * @return
     */
    PageVO<Group> findMettingGroupList(Integer pageNum, Integer pageSize, Group group);

    /**
     * 保存会议
     * @param group
     */
    void add(Group group);

    /**
     * 删除会议
     * @param id
     */
    void delete(Long id);
    /**
     * 查找分组
     * @param id
     */
    Group findGroupByid( Long id);


    /**
     * 查找分组人员IDlist
     * @param id
     */
    List<Long> GroupUsers(Long id);

    /**
     * 分配成员
     * @param id
     */
    void assignUsers(Long id,Long[] rids);

    /**
     * 获取分组信息
     */
    List<Group> findGroupArray();

    /**
     * 获取会议成员信息
     */
    List<UserGroupVO> getAllGroupUser();
}
