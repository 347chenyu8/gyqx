package com.coderman.api.report.mapper;

import com.coderman.api.report.pojo.JDEInputStorage;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:27
 * @Version 1.0
 **/
public interface JdeInputStorageMapper extends Mapper<JDEInputStorage> {
    /**
     * 查询某个系统的数据最大采购时间
     * @return
     */
    Date getMax();

}
