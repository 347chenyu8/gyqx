package com.coderman.api.report.controller;

import com.alibaba.excel.EasyExcel;
import com.coderman.api.common.bean.ResponseBean;
import com.coderman.api.common.pojo.report.JdeInput;
import com.coderman.api.common.pojo.report.JdeOutput;
import com.coderman.api.common.pojo.report.QfbjInput;
import com.coderman.api.common.pojo.report.QfbjOutput;
import com.coderman.api.common.pojo.system.ImageAttachment;
import com.coderman.api.common.utils.JdeInputListener;
import com.coderman.api.report.service.*;
import com.coderman.api.system.service.UploadService;
import com.coderman.api.system.vo.ImageAttachmentVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 文件上传
 *
 * @Author chenyu
 * @Date 2020/3/18 10:29
 * @Version 1.0
 **/
@Slf4j
@Api(tags = "文件上传接口")
@RestController
@RequestMapping("/report")
public class ReportController {


    @Autowired
    private UploadService uploadService;

    @Autowired
    private JdeInputService jdeInputService;

    @Autowired
    private JdeOutputService jdeOutputService;

    @Autowired
    private DwsOutputService dwsOutputService;
    @Autowired
    private WjOutputService wjOutputService;
    @Autowired
    private SgOutputService sgOutputService;
    @Autowired
    private ZhjOutputService zhjOutputService;

    @Autowired
    private WjInputService wjInputService;
    @Autowired
    private SgInputService sgInputService;
    @Autowired
    private ZhjInputService zhjInputService;
    @Autowired
    private DwsInputService dwsInputService;




    /**
     * 上传 jde采购 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/jdeInput/")
    @Transactional
    public ResponseBean uploadJdeInputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), JdeInput.class, new JdeInputListener(jdeInputService)).sheet().doRead();
        return ResponseBean.success();
    }

    /**
     * 上传 jde销售 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/jdeOutput/")
    @Transactional
    public ResponseBean uploadJdeOutputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), JdeOutput.class, new JdeInputListener(jdeOutputService)).sheet().doRead();
        return ResponseBean.success();
    }
    /**
     * 上传 dws 采购 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/dwsInput/")
    @Transactional
    public ResponseBean uploadDwsInputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjInput.class, new JdeInputListener(dwsInputService)).sheet().doRead();
        return ResponseBean.success();
    }
    /**
     * 上传 dws销售 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/dwsOutput/")
    @Transactional
    public ResponseBean uploadDwsOutputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjOutput.class, new JdeInputListener(dwsOutputService)).sheet().doRead();
        return ResponseBean.success();
    }

    /**
     * 上传 维健采购 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/wjInput/")
    @Transactional
    public ResponseBean uploadWjInputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjInput.class, new JdeInputListener(wjInputService)).sheet().doRead();
        return ResponseBean.success();
    }

    /**
     * 上传 维健销售 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/wjOutput/")
    @Transactional
    public ResponseBean uploadWjOutputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjOutput.class, new JdeInputListener(wjOutputService)).sheet().doRead();
        return ResponseBean.success();
    }
    /**
     * 上传 思高采购 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/sgInput/")
    @Transactional
    public ResponseBean uploadSgInputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjInput.class, new JdeInputListener(sgInputService)).sheet().doRead();
        return ResponseBean.success();
    }
    /**
     * 上传 思高销售 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/sgOutput/")
    @Transactional
    public ResponseBean uploadSgOutputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjOutput.class, new JdeInputListener(sgOutputService)).sheet().doRead();
        return ResponseBean.success();
    }
    /**
     * 上传 思高采购 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/zhjInput/")
    @Transactional
    public ResponseBean uploadZhjInputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjInput.class, new JdeInputListener(zhjInputService)).sheet().doRead();
        return ResponseBean.success();
    }
    /**
     * 上传 智合健销售 Excel文件
     *
     * @param file
     * @return
     */
    @PostMapping("/zhjOutput/")
    @Transactional
    public ResponseBean uploadZhjOutputExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), QfbjOutput.class, new JdeInputListener(zhjOutputService)).sheet().doRead();
        return ResponseBean.success();
    }
}
