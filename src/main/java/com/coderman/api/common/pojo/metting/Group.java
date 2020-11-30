package com.coderman.api.common.pojo.metting;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "m_group")
public class Group {
    @Id
    private Long id;

    private String name;

    private String remake;

    private String isdelete;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;
}