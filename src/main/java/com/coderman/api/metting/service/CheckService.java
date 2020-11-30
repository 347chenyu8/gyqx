package com.coderman.api.metting.service;


import com.coderman.api.common.pojo.metting.Check;
import com.coderman.api.system.vo.CheckVo;

import java.util.List;

public interface CheckService {
    /**
     * 会议签到
     */
    void check(Check check);

    /**
     * 根據会议ID获取签到记录
     * @param id
     * @return
     */
    List<CheckVo> getCheckByMettingID(long id);
}
