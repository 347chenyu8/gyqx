package com.coderman.api.metting.controller;

import com.coderman.api.common.annotation.ControllerEndpoint;
import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.common.pojo.system.Role;
import com.coderman.api.common.pojo.system.User;
import com.coderman.api.common.utils.QRCodeUtils;
import com.coderman.api.metting.service.MettingGroupService;
import com.coderman.api.metting.service.MettingService;
import com.coderman.api.system.converter.RoleConverter;
import com.coderman.api.system.converter.UserConverter;
import com.coderman.api.system.service.UserService;
import com.coderman.api.system.vo.PageVO;
import com.coderman.api.system.vo.RoleTransferItemVO;
import com.coderman.api.system.vo.UserTransferItemVO;
import com.coderman.api.system.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Api(tags = "会议分组接口")
@RestController
@RequestMapping("/mettingGroup")
public class MettingGroupController {


    @Autowired
    private MettingGroupService groupService;

    @Autowired
    private UserService userService;

    /**
     * 日志列表
     *
     * @return
     */
    @ApiOperation(value = "会议分组列表", notes = "会议分组列表")
    @GetMapping("/findGroupList")
    public ResponseBean findGroupList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                    @RequestParam(value = "pageSize") Integer pageSize,
                                    Group group) {
        PageVO<Group> mettingList = groupService.findMettingGroupList(pageNum, pageSize, group);
        return ResponseBean.success(mettingList);
    }


    @GetMapping("/getAllGroup")
    public ResponseBean findGroupList() {
        return ResponseBean.success(groupService.findGroupArray());
    }
    @GetMapping("/getAllGroupUser")
    public ResponseBean getAllGroupUser() {
        return ResponseBean.success(groupService.getAllGroupUser());
    }


    @ApiOperation(value = "保存会议分组", notes = "保存会议分组")
    @PostMapping("/add")
    public ResponseBean addMetting(@RequestBody @Validated Group group) {

        groupService.add(group);
        return ResponseBean.success(group);
    }

    @ApiOperation(value = "删除会议分组", notes = "删除会议分组")
    @PostMapping("/delete/{id}")
    public ResponseBean deleteMetting(@PathVariable Long id) {
        groupService.delete(id);
        return ResponseBean.success();
    }

    @GetMapping("/edit/{id}")
    public ResponseBean  findGroupByID(@PathVariable Long id){
        Group group = groupService.findGroupByid(id);
        return ResponseBean.success(group);
    }

    @GetMapping("/{id}/users")
    public ResponseBean users(@PathVariable Long id) {
        List<Long> values = groupService.GroupUsers(id);
        List<User> list = userService.findNotInGroupUserList(id);
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
    @ControllerEndpoint(exceptionMessage = "会议分配用户失败", operation = "会议分配用户")
    @PostMapping("/{id}/assignUsers")
    public ResponseBean assignUsers(@PathVariable Long id, @RequestBody Long[] rids) {
        groupService.assignUsers(id, rids);
        return ResponseBean.success();
    }
}
