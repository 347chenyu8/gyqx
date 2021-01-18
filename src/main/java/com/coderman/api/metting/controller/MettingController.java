package com.coderman.api.metting.controller;

import com.coderman.api.common.annotation.ControllerEndpoint;
import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.pojo.metting.*;
import com.coderman.api.common.pojo.system.User;
import com.coderman.api.common.utils.QRCodeUtils;
import com.coderman.api.metting.service.MettingService;
import com.coderman.api.system.converter.UserConverter;
import com.coderman.api.system.vo.GroupInfoVO;
import com.coderman.api.system.vo.PageVO;
import com.coderman.api.system.vo.RoleTransferItemVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 系统日志
 *
 * @Author chenyu
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
    public ResponseBean  edit(@PathVariable Long id){
        Metting metting = mettingService.findMettingByid(id);
        return ResponseBean.success(metting);
    }
    @PostMapping("/findMettingByID")
    public ResponseBean findMettingByID(@RequestParam(value = "id")  Long id){
        Metting metting = mettingService.findMettingByid(id);
        return ResponseBean.success(metting);
    }


//    @GetMapping("/setConstitutor/{id}")
//    public ResponseBean  findGroupByID(@PathVariable Long id){
//        Group group = mettingService.findConstitutorByid(id);
//        return ResponseBean.success(group);
//    }

    @GetMapping("/{id}/constitutorUsers")
    public ResponseBean users(@PathVariable Long id) {
        List<Long> values = mettingService.constitutorUsers(id);
        List<User> list = mettingService.findNotInConstitutorUsersList(id);
        //转成前端需要的角色Item
        List<RoleTransferItemVO> items = UserConverter.converterToUserTransferItem(list);
        Map<String, Object> map = new HashMap<>();
        map.put("users", items);
        map.put("values", values);
        return ResponseBean.success(map);
    }
    /**
     * 分配成员
     *
     * @param id
     * @param rids
     * @return
     */
    @ControllerEndpoint(exceptionMessage = "会议分配组织者失败", operation = "会议分配组织者")
    @PostMapping("/{id}/ConstitutorUsers")
    public ResponseBean assignUsers(@PathVariable Long id, @RequestBody Long[] rids) {
        mettingService.setConstitutorUsers(id, rids);
        return ResponseBean.success();
    }

//    @PostMapping("/getMettingUserInfo")
//    public ResponseBean check(@RequestBody Long id) {
//        Metting metting = mettingService.findMettingByid(id);
//        GroupInfoVO [] groupUser = mettingService.getMettingUserInfo();
//        return ResponseBean.success();
//    }
}
