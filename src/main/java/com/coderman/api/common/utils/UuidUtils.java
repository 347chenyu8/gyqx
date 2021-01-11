package com.coderman.api.common.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.UUID;

/**
 * @ClassName com.coderman.api.common.utils
 * @Author chenyu
 * @Date 2021-01-06 11:28
 **/
public class UuidUtils {
    /**
     * 密码加密
     * @return
     */
    public static String generateUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }
}
