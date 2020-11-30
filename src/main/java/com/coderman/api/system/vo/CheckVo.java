package com.coderman.api.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
public class CheckVo {
    private Long id;

    private Long mettingid;

    private Long userid;

    private Long groupid;

    private Date checkTime;

    private String name;
}