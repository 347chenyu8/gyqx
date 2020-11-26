package com.coderman.api.common.pojo.metting;

import java.math.BigDecimal;

public class Score {
    private Long id;

    private Long mettingid;

    private Long groupid;

    private BigDecimal turns1;

    private BigDecimal turns2;

    private BigDecimal turns3;

    private BigDecimal turns4;

    private BigDecimal turns5;

    private BigDecimal totle;

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

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public BigDecimal getTurns1() {
        return turns1;
    }

    public void setTurns1(BigDecimal turns1) {
        this.turns1 = turns1;
    }

    public BigDecimal getTurns2() {
        return turns2;
    }

    public void setTurns2(BigDecimal turns2) {
        this.turns2 = turns2;
    }

    public BigDecimal getTurns3() {
        return turns3;
    }

    public void setTurns3(BigDecimal turns3) {
        this.turns3 = turns3;
    }

    public BigDecimal getTurns4() {
        return turns4;
    }

    public void setTurns4(BigDecimal turns4) {
        this.turns4 = turns4;
    }

    public BigDecimal getTurns5() {
        return turns5;
    }

    public void setTurns5(BigDecimal turns5) {
        this.turns5 = turns5;
    }

    public BigDecimal getTotle() {
        return totle;
    }

    public void setTotle(BigDecimal totle) {
        this.totle = totle;
    }
}