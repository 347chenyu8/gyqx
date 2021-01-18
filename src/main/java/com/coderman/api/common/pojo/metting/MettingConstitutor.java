package com.coderman.api.common.pojo.metting;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "m_metting_constitutor")
public class MettingConstitutor {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    private Long metting_id;
    private Long user_id;

}