package com.coderman.api.report.mapper;

import com.coderman.api.common.pojo.metting.Check;
import com.coderman.api.common.pojo.report.JdeInput;
import com.coderman.api.system.vo.CheckVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:27
 * @Version 1.0
 **/
public interface JdeInputMapper extends Mapper<JdeInput> {
    /**
     * 查询某个系统的数据最大采购时间
     * @return
     */
    Date getMax();

}
