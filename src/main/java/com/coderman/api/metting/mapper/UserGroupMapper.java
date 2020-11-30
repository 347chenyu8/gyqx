package com.coderman.api.metting.mapper;

import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.common.pojo.metting.UserGroup;
import com.coderman.api.common.pojo.system.User;
import com.coderman.api.system.vo.UserGroupVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserGroupMapper extends Mapper<UserGroup> {
    /**
     * 获取会议分组成员
     * @return
     */
    List<UserGroupVO> findGroupUser();

}
