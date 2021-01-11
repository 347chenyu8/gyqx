package com.coderman.api.zjlMail.service;

import com.coderman.api.common.pojo.metting.Score;
import com.coderman.api.common.pojo.zjlMail.ZjlMail;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chenyu
 * @since 2021-01-06
 */
public interface ZjlMailService  {
    /**
     * 保存信件
     * @param zjlMail
     * @return
     */
    void SaveMail(ZjlMail zjlMail);

    /**
     * 获取用户所有信件
     * @param userid
     * @return
     */
    List<ZjlMail> getUserAllMail(String userid);
    /**
     * 获取所有信件
     * @param
     * @return
     */
    List<ZjlMail> getAllMail();
    /**
     * 根据标题模糊查找
     * @param
     * @return
     */
    List<ZjlMail> getUserSearchMail(String userid,String title);
    /**
     * 根据标题模糊查找
     * @param
     * @return
     */
    List<ZjlMail> getUserSearchMail(String title);
    /**
     * 根据信件ID获取信件
     * @param id
     * @return
     */
    ZjlMail getMailById(String id);
    /**
     * 根据信件ID修改信息反馈信息
     * @param id
     * @return
     */
    void replyMail(String id,String reply);


}
