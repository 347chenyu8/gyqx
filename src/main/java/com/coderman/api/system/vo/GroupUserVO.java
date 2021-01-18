package com.coderman.api.system.vo;

import lombok.Data;

import javax.persistence.Table;

@Data
public class GroupUserVO {

    private Long groupid;

    private String groupname;

    private Long userid;

    private String username;


}