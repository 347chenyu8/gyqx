package com.coderman.api.common.config.dingding;

public class URLConstant {
    /**
     * 钉钉网关gettoken地址
     */
    public static final String URL_GET_TOKKEN = "https://oapi.dingtalk.com/gettoken";

    /**
     *获取用户在企业内userId的接口URL
     */
    public static final String URL_GET_USER_INFO = "https://oapi.dingtalk.com/user/getuserinfo";

    /**
     *获取用户姓名的接口url
     */
    public static final String URL_USER_GET = "https://oapi.dingtalk.com/user/get";

    /**
     *发起代办的接口URL
     */
    public static final String URL_DB_SEND = "https://oapi.dingtalk.com/topapi/workrecord/add";
    /**
     *完成代办的接口URL
     */
    public static final String URL_DB_COMPLETE = "https://oapi.dingtalk.com/topapi/workrecord/update";
}
