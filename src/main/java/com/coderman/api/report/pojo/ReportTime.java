package com.coderman.api.report.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "report_time")
public class ReportTime {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    private String system;
    private String type;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date max;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;
}