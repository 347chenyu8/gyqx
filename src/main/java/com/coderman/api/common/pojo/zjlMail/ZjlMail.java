package com.coderman.api.common.pojo.zjlMail;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenyu
 * @since 2021-01-06
 */
@Data
@Table(name = "zjl_mail")
public class ZjlMail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String userid;

    private String title;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private String reply;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date replyTime;

    private String status;

    private String dbrecord;
}
