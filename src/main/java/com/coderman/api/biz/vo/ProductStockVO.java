package com.coderman.api.biz.vo;

import lombok.Data;

/** 商品库存
 * @Author chenyu
 * @Date 2020/12/16 09:27
 * @Version 1.0
 **/
@Data
public class ProductStockVO {

    private Long id;

    private String name;

    private String pNum;

    private String model;

    private String unit;

    private String remark;

    private Long stock;

    private String imageUrl;
}
