package com.coderman.api.metting.controller;

import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.pojo.metting.Check;
import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.metting.service.CheckService;
import com.coderman.api.metting.service.MettingGroupService;
import com.coderman.api.system.vo.CheckVo;
import com.coderman.api.system.vo.UserGroupVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 系统日志
 *
 * @Author chenyu
 * @Date 2020/3/22 21:03
 * @Version 1.0
 **/
@Controller
public class CheckFreemarkerController {
    @Autowired
    CheckService checkService;
    @Autowired
    private MettingGroupService groupService;

    @RequestMapping("/getCheckIndex/{mettingid}")
    public String  getCheckIndex(ModelMap map,@PathVariable(value="mettingid") String mettingid) {
        System.out.println(mettingid);
        List<UserGroupVO> allGroupUser = groupService.getAllGroupUser();
        List<Group> groupArray = groupService.findGroupArray();
        map.addAttribute("group", groupArray);
        map.addAttribute("groupUser", allGroupUser);
        map.addAttribute("mettingid", mettingid);
        return "getCheckIndex";
    }


}
