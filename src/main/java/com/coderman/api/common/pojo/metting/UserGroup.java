package com.coderman.api.common.pojo.metting;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "m_user_group")
public class UserGroup {
    private Long id;

    private Long userid;

    private Long groupid;


}