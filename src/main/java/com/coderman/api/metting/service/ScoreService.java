package com.coderman.api.metting.service;


import com.coderman.api.common.pojo.metting.Score;

import java.util.List;

public interface ScoreService {
    /**
     * 根据会议id获取分数
     * @param id
     * @return
     */
    List<Score> getAllScore(Long id);
}
