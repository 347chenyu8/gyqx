package com.coderman.api.common.pojo.report;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-12-08
 */
public class QfbjInput implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ExcelIgnore
    private Long id;

    /**
     * 是否清洗
     */
    @ExcelIgnore
    private String rinse;

    /**
     * 导入时间
     */
    @ExcelIgnore
    private Date inputTime;

    /**
     * 备注1
     */
    @ExcelIgnore
    private String remake;

    /**
     * 系统类别：0:达沃斯,1:维健,2:思高,3:智合健
     */
    @ExcelIgnore
    private String type;

    /**
     * 行号
     */
    @ExcelProperty("行号")
    private String tA;

    /**
     * 采购日期
     */
    @ExcelProperty("采购日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tB;

    /**
     * 单位编号
     */
    @ExcelProperty("单位编号")
    private String tC;

    /**
     * 单位全名
     */
    @ExcelProperty("单位全名")
    private String tD;

    /**
     * 单据编号
     */
    @ExcelProperty("单据编号")
    private String tE;

    /**
     * 单据摘要
     */
    @ExcelProperty("单据摘要")
    private String tF;

    /**
     * 单据类型
     */
    @ExcelProperty("单据类型")
    private String tG;

    /**
     * 单据行号
     */
    @ExcelProperty("单据行号")
    private String tH;

    /**
     * 商品编号
     */
    @ExcelProperty("商品编号")
    private String tI;

    /**
     * 商品名称
     */
    @ExcelProperty("商品名称")
    private String tJ;

    /**
     * 基本单位
     */
    @ExcelProperty("基本单位")
    private String tK;

    /**
     * 规格
     */
    @ExcelProperty("规格")
    private String tL;

    /**
     * 型号
     */
    @ExcelProperty("型号")
    private String tM;

    /**
     * 生产厂商
     */
    @ExcelProperty("生产厂商")
    private String tN;

    /**
     * 商品条码
     */
    @ExcelProperty("商品条码")
    private String tO;

    /**
     * 厂商编号
     */
    @ExcelProperty("厂商编号")
    private String tP;

    /**
     * 厂商全名
     */
    @ExcelProperty("厂商全名")
    private String tQ;

    /**
     * 生产许可证编号
     */
    @ExcelProperty("生产许可证编号")
    private String tR;

    /**
     * 采购员
     */
    @ExcelProperty("采购员")
    private String tS;

    /**
     * 职员编号
     */
    @ExcelProperty("职员编号")
    private String tT;

    /**
     * 职员全名
     */
    @ExcelProperty("职员全名")
    private String tU;

    /**
     * 部门编号
     */
    @ExcelProperty("部门编号")
    private String tV;

    /**
     * 部门名称
     */
    @ExcelProperty("部门名称")
    private String tW;

    /**
     * 制单人
     */
    @ExcelProperty("制单人")
    private String tX;

    /**
     * 仓库编号
     */
    @ExcelProperty("仓库编号")
    private String tY;

    /**
     * 仓库全名
     */
    @ExcelProperty("仓库全名")
    private String tZ;

    /**
     * 批号
     */
    @ExcelProperty("批号")
    private String tAa;

    /**
     * 生产日期
     */
    @ExcelProperty("生产日期")
    private String tAb;

    /**
     * 有效期至
     */
    @ExcelProperty("有效期至")
    private String tAc;

    /**
     * 灭菌批号
     */
    @ExcelProperty("灭菌批号")
    private String tAd;

    /**
     * 检验报告号
     */
    @ExcelProperty("检验报告号")
    private String tAe;

    /**
     * 注册证号
     */
    @ExcelProperty("注册证号")
    private String tAf;

    /**
     * 采购数量
     */
    @ExcelProperty("采购数量")
    private BigDecimal tAg;

    /**
     * 采购单价
     */
    @ExcelProperty("采购单价")
    private BigDecimal tAh;

    /**
     * 折扣
     */
    @ExcelProperty("折扣")
    private BigDecimal tAi;

    /**
     * 折后单价
     */
    @ExcelProperty("折后单价")
    private BigDecimal tAj;

    /**
     * 进货金额
     */
    @ExcelProperty("进货金额")
    private BigDecimal tAk;

    /**
     * 税率
     */
    @ExcelProperty("税率")
    private BigDecimal tAl;

    /**
     * 含税单价
     */
    @ExcelProperty("含税单价")
    private BigDecimal tAm;

    /**
     * 含税金额
     */
    @ExcelProperty("含税金额")
    private BigDecimal tAn;

    /**
     * 是否代销
     */
    @ExcelProperty("是否代销")
    private String tAo;

    /**
     * 备注
     */
    @ExcelProperty("备注")
    private String tAp;

    /**
     * 发票号
     */
    @ExcelProperty("发票号")
    private String tAq;

    /**
     * 发票日期
     */
    @ExcelProperty("发票日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tAr;

    /**
     * 付款日期
     */
    @ExcelProperty("付款日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tAs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRinse() {
        return rinse;
    }

    public void setRinse(String rinse) {
        this.rinse = rinse;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String gettA() {
        return tA;
    }

    public void settA(String tA) {
        this.tA = tA;
    }

    public String gettB() {
        return tB;
    }

    public void settB(String tB) {
        this.tB = tB;
    }

    public String gettC() {
        return tC;
    }

    public void settC(String tC) {
        this.tC = tC;
    }

    public String gettD() {
        return tD;
    }

    public void settD(String tD) {
        this.tD = tD;
    }

    public String gettE() {
        return tE;
    }

    public void settE(String tE) {
        this.tE = tE;
    }

    public String gettF() {
        return tF;
    }

    public void settF(String tF) {
        this.tF = tF;
    }

    public String gettG() {
        return tG;
    }

    public void settG(String tG) {
        this.tG = tG;
    }

    public String gettH() {
        return tH;
    }

    public void settH(String tH) {
        this.tH = tH;
    }

    public String gettI() {
        return tI;
    }

    public void settI(String tI) {
        this.tI = tI;
    }

    public String gettJ() {
        return tJ;
    }

    public void settJ(String tJ) {
        this.tJ = tJ;
    }

    public String gettK() {
        return tK;
    }

    public void settK(String tK) {
        this.tK = tK;
    }

    public String gettL() {
        return tL;
    }

    public void settL(String tL) {
        this.tL = tL;
    }

    public String gettM() {
        return tM;
    }

    public void settM(String tM) {
        this.tM = tM;
    }

    public String gettN() {
        return tN;
    }

    public void settN(String tN) {
        this.tN = tN;
    }

    public String gettO() {
        return tO;
    }

    public void settO(String tO) {
        this.tO = tO;
    }

    public String gettP() {
        return tP;
    }

    public void settP(String tP) {
        this.tP = tP;
    }

    public String gettQ() {
        return tQ;
    }

    public void settQ(String tQ) {
        this.tQ = tQ;
    }

    public String gettR() {
        return tR;
    }

    public void settR(String tR) {
        this.tR = tR;
    }

    public String gettS() {
        return tS;
    }

    public void settS(String tS) {
        this.tS = tS;
    }

    public String gettT() {
        return tT;
    }

    public void settT(String tT) {
        this.tT = tT;
    }

    public String gettU() {
        return tU;
    }

    public void settU(String tU) {
        this.tU = tU;
    }

    public String gettV() {
        return tV;
    }

    public void settV(String tV) {
        this.tV = tV;
    }

    public String gettW() {
        return tW;
    }

    public void settW(String tW) {
        this.tW = tW;
    }

    public String gettX() {
        return tX;
    }

    public void settX(String tX) {
        this.tX = tX;
    }

    public String gettY() {
        return tY;
    }

    public void settY(String tY) {
        this.tY = tY;
    }

    public String gettZ() {
        return tZ;
    }

    public void settZ(String tZ) {
        this.tZ = tZ;
    }

    public String gettAa() {
        return tAa;
    }

    public void settAa(String tAa) {
        this.tAa = tAa;
    }

    public String gettAb() {
        return tAb;
    }

    public void settAb(String tAb) {
        this.tAb = tAb;
    }

    public String gettAc() {
        return tAc;
    }

    public void settAc(String tAc) {
        this.tAc = tAc;
    }

    public String gettAd() {
        return tAd;
    }

    public void settAd(String tAd) {
        this.tAd = tAd;
    }

    public String gettAe() {
        return tAe;
    }

    public void settAe(String tAe) {
        this.tAe = tAe;
    }

    public String gettAf() {
        return tAf;
    }

    public void settAf(String tAf) {
        this.tAf = tAf;
    }

    public BigDecimal gettAg() {
        return tAg;
    }

    public void settAg(BigDecimal tAg) {
        this.tAg = tAg;
    }

    public BigDecimal gettAh() {
        return tAh;
    }

    public void settAh(BigDecimal tAh) {
        this.tAh = tAh;
    }

    public BigDecimal gettAi() {
        return tAi;
    }

    public void settAi(BigDecimal tAi) {
        this.tAi = tAi;
    }

    public BigDecimal gettAj() {
        return tAj;
    }

    public void settAj(BigDecimal tAj) {
        this.tAj = tAj;
    }

    public BigDecimal gettAk() {
        return tAk;
    }

    public void settAk(BigDecimal tAk) {
        this.tAk = tAk;
    }

    public BigDecimal gettAl() {
        return tAl;
    }

    public void settAl(BigDecimal tAl) {
        this.tAl = tAl;
    }

    public BigDecimal gettAm() {
        return tAm;
    }

    public void settAm(BigDecimal tAm) {
        this.tAm = tAm;
    }

    public BigDecimal gettAn() {
        return tAn;
    }

    public void settAn(BigDecimal tAn) {
        this.tAn = tAn;
    }

    public String gettAo() {
        return tAo;
    }

    public void settAo(String tAo) {
        this.tAo = tAo;
    }

    public String gettAp() {
        return tAp;
    }

    public void settAp(String tAp) {
        this.tAp = tAp;
    }

    public String gettAq() {
        return tAq;
    }

    public void settAq(String tAq) {
        this.tAq = tAq;
    }

    public String gettAr() {
        return tAr;
    }

    public void settAr(String tAr) {
        this.tAr = tAr;
    }

    public String gettAs() {
        return tAs;
    }

    public void settAs(String tAs) {
        this.tAs = tAs;
    }
}
