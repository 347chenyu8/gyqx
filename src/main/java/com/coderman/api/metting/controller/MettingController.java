package com.coderman.api.metting.controller;

import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.common.utils.QRCodeUtils;
import com.coderman.api.metting.service.MettingService;
import com.coderman.api.system.service.LogService;
import com.coderman.api.system.vo.LogVO;
import com.coderman.api.system.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统日志
 *
 * @Author zhangyukang
 * @Date 2020/3/22 21:03
 * @Version 1.0
 **/
@Api(tags = "会议接口")
@RestController
@RequestMapping("/metting")
public class MettingController {

    @Value("${vue.MettingChick}")
    private String VueURL;

    @Autowired
    private MettingService mettingService;

    /**
     * 日志列表
     *
     * @return
     */
    @ApiOperation(value = "会议列表", notes = "会议列表")
    @GetMapping("/findMettingList")
    public ResponseBean findMettingList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                    @RequestParam(value = "pageSize") Integer pageSize,
                                    Metting metting) {
        PageVO<Metting> mettingList = mettingService.findMettingList(pageNum, pageSize, metting);
        return ResponseBean.success(mettingList);
    }


    @ApiOperation(value = "保存会议", notes = "保存会议")
    @PostMapping("/add")
    public ResponseBean addMetting(@RequestBody @Validated Metting metting) {

        mettingService.add(metting);
        return ResponseBean.success(metting);
    }

    @ApiOperation(value = "删除会议", notes = "删除会议")
    @PostMapping("/delete/{id}")
    public ResponseBean deleteMetting(@PathVariable Long id) {
        mettingService.delete(id);
        return ResponseBean.success();
    }
    @GetMapping("/getQRCode/{id}")
    public void getQRCode(@PathVariable Long id,HttpServletResponse response) {
        try {
            String content = VueURL+"?id="+id;
            QRCodeUtils.encode(content,response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/edit/{id}")
    public ResponseBean  findMettingByID(@PathVariable Long id){
        Metting metting = mettingService.findMettingByid(id);
        return ResponseBean.success(metting);
    }
}
