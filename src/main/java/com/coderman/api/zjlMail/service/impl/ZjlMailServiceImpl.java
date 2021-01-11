package com.coderman.api.zjlMail.service.impl;

import com.coderman.api.common.pojo.metting.Group;
import com.coderman.api.common.pojo.metting.Metting;
import com.coderman.api.common.pojo.zjlMail.ZjlMail;
import com.coderman.api.metting.mapper.ScoreMapper;
import com.coderman.api.zjlMail.mapper.ZjlMailMapper;
import com.coderman.api.zjlMail.service.ZjlMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenyu
 * @since 2021-01-06
 */
@Service
public class ZjlMailServiceImpl implements ZjlMailService {
    @Autowired
    ZjlMailMapper zjlMailMapper;


    @Override
    public void SaveMail(ZjlMail zjlMail){
        zjlMailMapper.insert(zjlMail);
    }


    @Override
    public List<ZjlMail> getUserAllMail(String userid){
        Example o = new Example(ZjlMail.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("create_time desc");
        //查询isdelete不等于1的数据
        criteria.andEqualTo("userid",userid);
        List<ZjlMail> groupList = zjlMailMapper.selectByExample(o);
        return  groupList;
    }
    @Override
    public List<ZjlMail> getAllMail(){
        Example o = new Example(ZjlMail.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("create_time desc");
        List<ZjlMail> groupList = zjlMailMapper.selectByExample(o);
        return  groupList;
    }

    @Override
    public ZjlMail getMailById(String id){
//        ZjlMail zjlMail = new ZjlMail();
//        zjlMail.setId(id);
        return  zjlMailMapper.selectByPrimaryKey(id);
    }
    @Override
    public void replyMail(String id,String reply){
        ZjlMail zjlMail = new ZjlMail();
        zjlMail.setReply(reply);
        zjlMail.setReplyTime(new Date());
        zjlMail.setStatus("1");
        Example o = new Example(ZjlMail.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("id",id);
        zjlMailMapper.updateByExampleSelective(zjlMail,o);
    }

    /**
     * 根据标题模糊查找
     * @param
     * @return
     */

    @Override
    public List<ZjlMail> getUserSearchMail(String userid,String title){
        Example o = new Example(ZjlMail.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("create_time desc");
        //查询isdelete不等于1的数据
        criteria.andEqualTo("userid",userid);
        criteria.andLike("title",title);
        List<ZjlMail> groupList = zjlMailMapper.selectByExample(o);
        return  groupList;
    }
    /**
     * 根据标题模糊查找
     * @param
     * @return
     */
    @Override
    public List<ZjlMail> getUserSearchMail(String title){
        Example o = new Example(ZjlMail.class);
        Example.Criteria criteria = o.createCriteria();
        o.setOrderByClause("create_time desc");
        //查询isdelete不等于1的数据
        criteria.andLike("title","%"+title+"%");
        List<ZjlMail> groupList = zjlMailMapper.selectByExample(o);
        return  groupList;
    }
}
