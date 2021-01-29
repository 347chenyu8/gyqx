package com.coderman.api.report.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "report_input")
public class ReportInput {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    private String system;
    private String goodscode;
    private String goodsname;
    private String goodsmodle;
    private String suppliername;
    private String suppliercode;
    private String batch;  //批次号
    private String orderno;
    private String  ordertype;
    private String orderline;
    private BigDecimal price;
    private BigDecimal count;
    private String unit;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inputtime;
    private String factorycode;
    private String factoryname;
    private String productline;
    private String productlinecode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;
    private String related; //关联入库号
    private String remake;  //两系统采销订单号

}