package com.coderman.api.report.mapper;

import com.coderman.api.common.pojo.report.QfbjInput;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:27
 * @Version 1.0
 **/
public interface QfbjInputMapper extends Mapper<QfbjInput> {

    /**
     * 查询某个系统的数据最大采购时间
     * @param type
     * @return
     */
    Date getMax(String type);
}
