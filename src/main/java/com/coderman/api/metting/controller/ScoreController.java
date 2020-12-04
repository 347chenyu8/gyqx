package com.coderman.api.metting.controller;

import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.pojo.metting.Score;
import com.coderman.api.metting.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 系统日志
 *
 * @Author chenyu
 * @Date 2020/3/22 21:03
 * @Version 1.0
 **/
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;
    @GetMapping("/getAllScore/{id}")
    public ResponseBean getAllCheck(@PathVariable Long id) {
        List<Score> ScoreList = scoreService.getAllScore(id);
        return ResponseBean.success(ScoreList);
    }
}
