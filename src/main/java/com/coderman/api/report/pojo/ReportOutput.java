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
    private String system; //系统来源
    private String goodscode; //商品编码
    private String goodsname; //商品名称
    private String goodsmodle;  //商品规格
    private String suppliername; //供应商名称
    private String suppliercode; //供应商编码
    private String batch; //批次
    private String orderno; //订单号
    private String  ordertype;//销售订单类型
    private String orderline; //销售订单行号
    private BigDecimal price; //销售单价
    private BigDecimal count; //销售数量
    private String unit; //单位

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
    private String result;

}