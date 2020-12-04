package com.coderman.api.system.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/3/7 19:41
 * @Version 1.0
 **/
@Data
public class PageVO<T> {
    private long total;

    private List<T> rows=new ArrayList<>();

    public PageVO(long total, List<T> data) {
        this.total = total;
        this.rows = data;
    }
}
