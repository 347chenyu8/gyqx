package com.coderman.api.metting.service;

import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.system.vo.LogVO;
import com.coderman.api.system.vo.PageVO;

import java.util.List;


public interface MettingService {
    /**
     * 获取会议列表
     * @param pageNum
     * @param pageSize
     * @param Metting
     * @return
     */
    PageVO<Metting> findMettingList(Integer pageNum, Integer pageSize, Metting Metting);

    /**
     * 保存会议
     * @param Metting
     */
    void add( Metting Metting);

    /**
     * 删除会议
     * @param id
     */
    void delete( Long id);
    /**
     * 查找会议
     * @param id
     */
    Metting findMettingByid( Long id);

}
