package com.coderman.api.report.pojo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "report_jdestorage")
public class JDEInputStorage {
    @Id
    @GeneratedValue(generator = "JDBC")
    @ExcelIgnore
    private Long id;

    @ExcelProperty("定单 号")
    private String orderno;  //关联采购单价号

    @ExcelProperty("定单 类型")
    private String ordertype;  //原单类型
    @ExcelProperty("行 号")
    private String orderline;  //原单类型

    @ExcelProperty("商品编码")
    private String goodscode; //商品编码

    @ExcelProperty("商品名称")
    private String goodsname; //商品名称

    @ExcelProperty("规格型号")
    private String goodsmodle; //'商品规格'

    @ExcelProperty("生产批号")
    private String batch; //''生产批号''

    @ExcelProperty("批次号")
    private String related; //'销售数量'

    @ExcelProperty("收货日期")
    private Date inputtime;//入库时间

}