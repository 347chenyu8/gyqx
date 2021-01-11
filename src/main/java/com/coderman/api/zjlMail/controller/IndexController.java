package com.coderman.api.zjlMail.controller;

import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.config.dingding.URLConstant;
import com.coderman.api.common.pojo.zjlMail.ZjlMail;
import com.coderman.api.common.utils.AccessTokenUtil;
import com.coderman.api.common.utils.UuidUtils;
import com.coderman.api.zjlMail.service.ZjlMailService;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiUserGetRequest;
import com.dingtalk.api.request.OapiUserGetuserinfoRequest;
import com.dingtalk.api.request.OapiWorkrecordAddRequest;
import com.dingtalk.api.request.OapiWorkrecordAddRequest.FormItemVo;
import com.dingtalk.api.request.OapiWorkrecordUpdateRequest;
import com.dingtalk.api.response.OapiUserGetResponse;
import com.dingtalk.api.response.OapiUserGetuserinfoResponse;
import com.dingtalk.api.response.OapiWorkrecordAddResponse;
import com.dingtalk.api.response.OapiWorkrecordUpdateResponse;
import com.taobao.api.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 企业内部内部-小程序Quick-Start示例代码 实现了最简单的免密登录（免登）功能
 */
@RestController
@RequestMapping("/zjlmail")
public class IndexController {
    private static final Logger bizLogger = LoggerFactory.getLogger(IndexController.class);
    private static final String ZJL_USERID = "13123655331868076776";
    @Autowired
    ZjlMailService zjlMailService;
    /**
     * 欢迎页面,通过url访问，判断后端服务是否启动
     */
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
    /**
     * 钉钉用户登录，显示当前登录用户的userId和名称
     *
     * @param requestAuthCode 免登临时code
     */
    @PostMapping("/login")
    @ResponseBody
    public ResponseBean login(@RequestParam(value = "authCode") String requestAuthCode) {
        //获取accessToken,注意正是代码要有异常流处理
        String accessToken = AccessTokenUtil.getToken();

        //获取用户信息
        DingTalkClient client = new DefaultDingTalkClient(URLConstant.URL_GET_USER_INFO);
        OapiUserGetuserinfoRequest request = new OapiUserGetuserinfoRequest();
        request.setCode(requestAuthCode);
        request.setHttpMethod("GET");

        OapiUserGetuserinfoResponse response;
        try {
            response = client.execute(request, accessToken);
        } catch (ApiException e) {
            e.printStackTrace();
            return null;
        }
        //3.查询得到当前用户的userId
        // 获得到userId之后应用应该处理应用自身的登录会话管理（session）,避免后续的业务交互（前端到应用服务端）每次都要重新获取用户身份，提升用户体验
        String userId = response.getUserid();

        String userName = getUserName(accessToken, userId);
        System.out.println(userName);
        //返回结果
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("userId", userId);
        resultMap.put("userName", userName);
        ResponseBean serviceResult = ResponseBean.success(resultMap);
        return serviceResult;
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseBean saveMail(@RequestParam(value = "userId") String userid, @RequestParam(value = "title") String title,@RequestParam(value = "content") String content) {

        ZjlMail zjlMail = new ZjlMail();
        String id = UuidUtils.generateUUID();
        zjlMail.setId(id);
        zjlMail.setUserid(userid);
        zjlMail.setTitle(title);
        zjlMail.setContent(content);
        zjlMail.setCreateTime(new Date());
        zjlMail.setStatus("0");
        String dbrecord = this.createDB(id,title,content);
        zjlMail.setDbrecord(dbrecord);
        zjlMailService.SaveMail(zjlMail);
        //返回结果
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("userId", userid);
        ResponseBean serviceResult = ResponseBean.success(resultMap);
        return serviceResult;
    }
    @PostMapping("/getUserAllMail")
    @ResponseBody
    public ResponseBean getUserAllMail(@RequestParam(value = "userId") String userid) {
        ResponseBean serviceResult = new ResponseBean();
        if (userid.equals(ZJL_USERID)){
            serviceResult = ResponseBean.success(zjlMailService.getAllMail());
        }else {
            serviceResult = ResponseBean.success(zjlMailService.getUserAllMail(userid));
        }

        return serviceResult;
    }
    @PostMapping("/getUserSearchMail")
    @ResponseBody
    public ResponseBean getUserSearchMail(@RequestParam(value = "userId") String userid,@RequestParam(value = "title") String title) {
        ResponseBean serviceResult = new ResponseBean();
        if (userid.equals(ZJL_USERID)){
            serviceResult = ResponseBean.success(zjlMailService.getUserSearchMail(title));
        }else {
            serviceResult = ResponseBean.success(zjlMailService.getUserSearchMail(userid,title));
        }

        return serviceResult;
    }

    @PostMapping("/getMailById")
    @ResponseBody
    public ResponseBean getMailById(@RequestParam(value = "id") String id) {
        ZjlMail mailById = zjlMailService.getMailById(id);
        ResponseBean serviceResult = ResponseBean.success(mailById);
        return serviceResult;
    }
    @PostMapping("/replyMail")
    @ResponseBody
    public ResponseBean replyMail(@RequestParam(value = "id") String id,@RequestParam(value = "reply") String reply) {
        zjlMailService.replyMail(id,reply);
        ZjlMail zjlMail = zjlMailService.getMailById(id);
        String dbrecord = zjlMail.getDbrecord();
        this.completeDB(dbrecord);
        ResponseBean serviceResult = ResponseBean.success();
        return serviceResult;
    }








    /**
     * 获取用户姓名
     *
     * @param accessToken
     * @param userId
     * @return
     */
    private String getUserName(String accessToken, String userId) {
        try {
            DingTalkClient client = new DefaultDingTalkClient(URLConstant.URL_USER_GET);
            OapiUserGetRequest request = new OapiUserGetRequest();
            request.setUserid(userId);
            request.setHttpMethod("GET");
            OapiUserGetResponse response = client.execute(request, accessToken);
            return response.getName();
        } catch (ApiException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 生成代办
     *
     * @return
     */
    private String createDB(String id,String title,String content) {
        try {
            String accessToken = AccessTokenUtil.getToken();

            DingTalkClient client = new DefaultDingTalkClient(URLConstant.URL_DB_SEND);
            OapiWorkrecordAddRequest req = new OapiWorkrecordAddRequest();
            req.setUserid(ZJL_USERID);
            req.setCreateTime(System.currentTimeMillis()/1000L);
            req.setTitle("总经理信箱");
            req.setUrl("http://119.41.236.43:8990/zjlmail/approve?id="+id);
            req.setPcUrl("http://119.41.236.43:8990/zjlmail/approve?id="+id);
            req.setOriginatorUserId("manager7078");
            req.setSourceName("总经理信箱");
            req.setPcOpenType(2L);
            req.setBizId(id);
            List<FormItemVo> list2 = new ArrayList<FormItemVo>();
            FormItemVo obj3 = new FormItemVo();
            list2.add(obj3);
            obj3.setTitle(title);
            if(content.length()>20){
                content = content.substring(0,20)+"...";
            }
            obj3.setContent(content);
            req.setFormItemList(list2);

            OapiWorkrecordAddResponse rsp = client.execute(req, accessToken);
            return rsp.getRecordId();
        } catch (ApiException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 完成代办
     *
     * @return
     */
    private void completeDB(String recordid) {
        try {
            String accessToken = AccessTokenUtil.getToken();
            DingTalkClient client = new DefaultDingTalkClient(URLConstant.URL_DB_COMPLETE);
            OapiWorkrecordUpdateRequest req = new OapiWorkrecordUpdateRequest();
            req.setUserid(ZJL_USERID);
            req.setRecordId(recordid);
            OapiWorkrecordUpdateResponse rsp = client.execute(req, accessToken);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}


