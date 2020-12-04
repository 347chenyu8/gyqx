package com.coderman.api.common.pojo.metting;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "m_check")
public class Check {
    @Id
    private Long id;

    private Long mettingid;

    private Long userid;

    private Long groupid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date checkTime;


}