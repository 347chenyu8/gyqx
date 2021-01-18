package com.coderman.api.system.mapper;

import com.coderman.api.common.pojo.system.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<User> {
    /**
     * 用户登入报表
     * @return
     */
    List<User> findNotGroupUser(Long id);

    /**
     * 不在指定会议的组织者的人员
     * @return
     */
    List<User> findNotConstitutorUser(Long id);

}
