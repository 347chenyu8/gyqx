package com.coderman.api.common.pojo.metting;

import java.util.Date;

public class Check {
    private Long id;

    private Long mettingid;

    private Long userid;

    private Date check;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMettingid() {
        return mettingid;
    }

    public void setMettingid(Long mettingid) {
        this.mettingid = mettingid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getCheck() {
        return check;
    }

    public void setCheck(Date check) {
        this.check = check;
    }
}