package com.coderman.api.report.pojo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "report_gl")
public class ReportGl {
    @Id
    @GeneratedValue(generator = "JDBC")
    @ExcelIgnore
    private Long id;

    @ExcelProperty("来源系统")
    private String system;  //数据来源系统 0：国药；1：达沃斯；2：智合健

    @ExcelProperty("采购订单号")
    private String buyorder; //采购订单号

    @ExcelProperty("采购订单行号")
    private String buyorderline; //采购订单行号

    @ExcelProperty("销售订单号")
    private String saleorder; //销售订单号

    @ExcelProperty("销售订单行号")
    private String saleorderline; //销售订单行号


    @ExcelProperty("商品编码")
    private String goodscode; //商品编码

    @ExcelProperty("商品名称")
    private String goodsname; //商品名称

    @ExcelProperty("商品规格")
    private String goodsmodle; //'商品规格'

    @ExcelProperty("批号")
    private String batch; //''批次''

    @ExcelProperty("销售数量")
    private BigDecimal count; //'销售数量'

    @ExcelProperty("销售单价")
    private BigDecimal buyprice; //'采购单价'

    @ExcelProperty("采购单价")
    private BigDecimal saleprice; //'销售单价'

    @ExcelProperty("备注")
    private String remake; //''备注''

    @ExcelProperty("年份")
    private String year; //''年份''
    @ExcelProperty("采购年份")
    private String buyyear; //''年份''
}