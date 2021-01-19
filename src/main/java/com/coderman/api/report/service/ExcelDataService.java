package com.coderman.api.report.service;


import java.text.ParseException;
import java.util.List;


public interface ExcelDataService {
    /**
     * jdeinput 持久化到数据库
     */
    void save(List<Object> list);

    /**
     * jdeinput 持久化到数据库
     */
    void updateReportTime();


}
