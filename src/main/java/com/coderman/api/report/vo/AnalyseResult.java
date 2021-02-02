package com.coderman.api.report.vo;

import com.coderman.api.report.pojo.ReportOutput;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName com.coderman.api.report.vo
 * @Author chenyu
 * @Date 2021-02-01 9:02
 **/
@Data
public class AnalyseResult {
    int count;//处理数量
    int successCount;//成功数量
    int failedCount;//失败数量
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    Date beginTime;//数据最小日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    Date endTime;//数据最大日期
    List<ReportOutput> succesData;//失败数据
    List<ReportOutput> failedData;//失败数据
}
