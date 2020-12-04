package com.coderman.api.metting.mapper;

import com.coderman.api.common.pojo.metting.Check;
import com.coderman.api.system.vo.CheckVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:27
 * @Version 1.0
 **/
public interface CheckMapper extends Mapper<Check> {

    List<CheckVo> getCheckByMettingID(long id);
}
