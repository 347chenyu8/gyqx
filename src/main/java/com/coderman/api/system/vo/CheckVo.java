package com.coderman.api.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
public class CheckVo {
    private Long id;

    private Long mettingid;

    private Long userid;

    private Long groupid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date checkTime;

    private String name;

    private String gname;

    public boolean equals(Object obj) {
        CheckVo u = (CheckVo) obj;
        return userid.equals(u.userid);
    }

    public int hashCode() {
        Long in = userid;
        return in.hashCode();
     }
}