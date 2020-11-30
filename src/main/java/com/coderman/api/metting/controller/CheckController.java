package com.coderman.api.metting.controller;

import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.pojo.metting.Check;
import com.coderman.api.metting.service.CheckService;
import com.coderman.api.system.vo.CheckVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 系统日志
 *
 * @Author zhangyukang
 * @Date 2020/3/22 21:03
 * @Version 1.0
 **/
@Api(tags = "会议签到接口")
@RestController
@RequestMapping("/check")
public class CheckController {
    @Autowired
    CheckService checkService;

    /**
     * 签到
     *
     * @return
     */
    @PostMapping("/check")
    public ResponseBean check(@RequestBody Check check) {
        checkService.check(check);
        return ResponseBean.success();
    }
    @GetMapping("/getAllCheck/{id}")
    public ResponseBean getAllCheck(@PathVariable Long id) {
        List<CheckVo> checkVolist = checkService.getCheckByMettingID(id);
        return ResponseBean.success(checkVolist);
    }


}
