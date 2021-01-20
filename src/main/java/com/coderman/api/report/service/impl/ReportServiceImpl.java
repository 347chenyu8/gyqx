package com.coderman.api.report.service.impl;

import com.coderman.api.report.mapper.ReportGlMapper;
import com.coderman.api.report.mapper.ReportInputMapper;
import com.coderman.api.report.mapper.ReportOutputMapper;
import com.coderman.api.report.pojo.ReportGl;
import com.coderman.api.report.pojo.ReportInput;
import com.coderman.api.report.pojo.ReportOutput;
import com.coderman.api.report.service.ReportGlService;
import com.coderman.api.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author chenyu
 * @Date 2020/12/2 20:24
 * @Version 1.0
 **/
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportOutputMapper reportOutputMapper;
    @Autowired
    ReportInputMapper reportInputMapper;
    @Autowired
    ReportGlMapper reportGlMapper;

    @Override
    public void analyseData() {
        //1.关联采销数据
        //1.1查找智合健所有销售数据 未处理的销售
        Example o = new Example(ReportOutput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("system",'2');
        criteria.andEqualTo("origflag",'0');
        List<ReportOutput> reportOutputs = reportOutputMapper.selectByExample(o);
        //1.2逐条查找采购订单号
        for(ReportOutput item : reportOutputs ){
            Example gl = new Example(ReportGl.class);
            Example.Criteria glcriteria = gl.createCriteria();
            glcriteria.andEqualTo("saleorder",item.getOrderno());
            glcriteria.andEqualTo("saleorderline",item.getOrderline());
            List<ReportGl> reportGls = reportGlMapper.selectByExample(gl);
            if(reportGls.size() != 0){
                String buyOrder = reportGls.get(0).getBuyorder();
                String buyOrderline = reportGls.get(0).getBuyorderline();
                ReportInput inputByOrderAndLine = getInputByOrderAndLine(buyOrder, buyOrderline);
                String factoryname = inputByOrderAndLine.getFactoryname();
                int corpcode = insideCorp(factoryname);
                while (corpcode != -1){
                    //如果是国药器械
                    if(corpcode == 0){

                    }
                }

            }

        }
    }

    /**
     * 根据订单号和行号获取采购数据
     * @param order
     * @param line
     * @return
     */
    ReportInput getInputByOrderAndLine(String order,String line){
        Example o = new Example(ReportInput.class);
        Example.Criteria criteria = o.createCriteria();
        criteria.andEqualTo("orderno",order);
        criteria.andEqualTo("orderline",line);
        List<ReportInput> ReportInput = reportInputMapper.selectByExample(o);
        return  ReportInput.get(0);
    }

    /**
     * 判断企业名称是否是内部企业
     * @param factoryname
     * @return
     */
    int insideCorp(String factoryname){
        if(factoryname.equals("国药器械（海南）有限公司")){
            return 0;
        }else if(factoryname.equals("海南达沃斯科技有限公司")){
            return 1;
        }else{
            return -1;
        }
    }


}
