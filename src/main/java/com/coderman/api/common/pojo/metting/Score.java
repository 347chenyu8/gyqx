package com.coderman.api.common.pojo.metting;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "m_score")
public class Score {
    @Id
    private Long id;

    private Long mettingid;

    private Long groupid;

    private BigDecimal turns1;

    private BigDecimal turns2;

    private BigDecimal turns3;

    private BigDecimal turns4;

    private BigDecimal turns5;

    private BigDecimal totle;


}