package com.coderman.api.system.vo;

import lombok.Data;

import java.util.List;


@Data
public class GroupInfoVO {
    private String text;
    private String value;
    List<GroupInfoChildVO> GroupInfoChild;

}