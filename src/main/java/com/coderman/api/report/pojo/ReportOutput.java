package com.coderman.api.report.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "report_output")
public class ReportOutput {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    private String system;
    private String goodscode;
    private String goodsname;
    private String goodsmodle;
    private String suppliername;
    private String suppliercode;
    private String batch;
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
    private String related;
    private BigDecimal costprice; //成本单价
    private BigDecimal cost; //总成本
    private BigDecimal sum; //总销售金额
    private BigDecimal origprice;//溯源单价
    private BigDecimal origcost; //溯源成本
    private BigDecimal origsum;  //溯源销售总金额
    private BigDecimal origcount; //溯源销售数量
    private String origflag; //溯源标识 0 未溯源，1溯源成功 2 溯源失败

}