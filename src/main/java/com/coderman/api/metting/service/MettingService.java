package com.coderman.api.metting.service;

import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.system.vo.LogVO;
import com.coderman.api.system.vo.PageVO;



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

}
