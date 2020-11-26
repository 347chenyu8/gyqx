package com.coderman.api.common.pojo.metting;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "m_metting")
public class Metting {
    @Id
    private Long id;

    private String title;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    private String qrCode;

    private String isdelete;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;
}