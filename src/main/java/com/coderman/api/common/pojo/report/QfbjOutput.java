package com.coderman.api.common.pojo.report;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-12-07
 */
@Table(name = "qfbj_output")
public class QfbjOutput implements Serializable {

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
     * 备注
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
     * 销售日期
     */
    @ExcelProperty("销售日期")
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
     * 单据附加说明
     */
    @ExcelProperty("单据附加说明")
    private String tG;

    /**
     * 单据类型
     */
    @ExcelProperty("单据类型")
    private String tH;

    /**
     * 单据行号
     */
    @ExcelProperty("单据行号")
    private String tI;

    /**
     * 科室
     */
    @ExcelProperty("科室")
    private String tJ;

    /**
     * 病人姓名
     */
    @ExcelProperty("病人姓名")
    private String tK;

    /**
     * 病人年龄
     */
    @ExcelProperty("病人年龄")
    private String tL;

    /**
     * 病人性别
     */
    @ExcelProperty("病人性别")
    private String tM;

    /**
     * 病人身份证
     */
    @ExcelProperty("病人身份证")
    private String tN;

    /**
     * 手术名称
     */
    @ExcelProperty("手术名称")
    private String tO;

    /**
     * 手术时间
     */
    @ExcelProperty("手术时间")
    private String tP;

    /**
     * 手术医生
     */
    @ExcelProperty("手术医生")
    private String tQ;

    /**
     * 商品编号
     */
    @ExcelProperty("商品编号")
    private String tR;

    /**
     * 商品名称
     */
    @ExcelProperty("商品名称")
    private String tS;

    /**
     * 基本单位
     */
    @ExcelProperty("基本单位")
    private String tT;

    /**
     * 规格
     */
    @ExcelProperty("规格")
    private String tU;

    /**
     * 型号
     */
    @ExcelProperty("型号")
    private String tV;

    /**
     * 生产厂商
     */
    @ExcelProperty("生产厂商")
    private String tW;

    /**
     * 商品条码
     */
    @ExcelProperty("商品条码")
    private String tX;

    /**
     * 厂商编号
     */
    @ExcelProperty("厂商编号")
    private String tY;

    /**
     * 厂商全名
     */
    @ExcelProperty("厂商全名")
    private String tZ;

    /**
     * 生产许可证编号
     */
    @ExcelProperty("生产许可证编号")
    private String tAa;

    /**
     * 生产日期
     */
    @ExcelProperty("生产日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tAb;

    /**
     * 有效期至
     */
    @ExcelProperty("有效期至")
    @DateTimeFormat("yyyy-MM-dd")
    private String tAc;

    /**
     * 检验报告号
     */
    @ExcelProperty("检验报告号")
    private String tAd;

    /**
     * 注册证号
     */
    @ExcelProperty("注册证号")
    private String tAe;

    /**
     * 批号
     */
    @ExcelProperty("批号")
    private String tAf;

    /**
     * 采购员
     */
    @ExcelProperty("采购员")
    private String tAg;

    /**
     * 制单人
     */
    @ExcelProperty("制单人")
    private String tAh;

    /**
     * 经手人编号
     */
    @ExcelProperty("经手人编号")
    private String tAi;

    /**
     * 经手人全名
     */
    @ExcelProperty("经手人全名")
    private String tAj;

    /**
     * 部门编号
     */
    @ExcelProperty("部门编号")
    private String tAk;

    /**
     * 部门名称
     */
    @ExcelProperty("部门名称")
    private String tAl;

    /**
     * 仓库编号
     */
    @ExcelProperty("仓库编号")
    private String tAm;

    /**
     * 仓库全名
     */
    @ExcelProperty("仓库全名")
    private String tAn;

    /**
     * 供应商名称
     */
    @ExcelProperty("供应商名称")
    private String tAo;

    /**
     * 销售数量
     */
    @ExcelProperty("销售数量")
    private BigDecimal tAp;

    /**
     * 销售单价
     */
    @ExcelProperty("销售单价")
    private BigDecimal tAq;

    /**
     * 折扣
     */
    @ExcelProperty("折扣")
    private BigDecimal tAr;

    /**
     * 折后单价
     */
    @ExcelProperty("折后单价")
    private BigDecimal tAs;

    /**
     * 销售金额
     */
    @ExcelProperty("销售金额")
    private BigDecimal tAt;

    /**
     * 税率
     */
    @ExcelProperty("税率")
    private BigDecimal tAu;

    /**
     * 含税单价
     */
    @ExcelProperty("含税单价")
    private BigDecimal tAv;

    /**
     * 含税金额
     */
    @ExcelProperty("含税金额")
    private BigDecimal tAw;

    /**
     * 是否代销
     */
    @ExcelProperty("是否代销")
    private String tAx;

    /**
     * 成本单价
     */
    @ExcelProperty("成本单价")
    private BigDecimal tAy;

    /**
     * 成本金额
     */
    @ExcelProperty("成本金额")
    private BigDecimal tAz;

    /**
     * 货位编号
     */
    @ExcelProperty("货位编号")
    private String tBa;

    /**
     * 货位全名
     */
    @ExcelProperty("货位全名")
    private String tBb;

    /**
     * 利润
     */
    @ExcelProperty("利润")
    private BigDecimal tBc;

    /**
     * 备注
     */
    @ExcelProperty("备注")
    private String tBd;

    /**
     * 利润率
     */
    @ExcelProperty("利润率")
    @NumberFormat("#.##%")
    private String tBe;




    @ExcelProperty("发票号")
    private String tBf;

    @ExcelProperty("发票日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tBg;

    @ExcelProperty("发票备注")
    private String tBh;

    @ExcelProperty("已开数量")
    private BigDecimal tBi;

    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty("收款日期")
    private String tBj;

    @ExcelProperty("未结金额")
    private BigDecimal tBk;

    @ExcelProperty("已结金额")
    private BigDecimal tBl;


    @ExcelProperty("未结数量")
    private BigDecimal tBm;

    @ExcelProperty("已结数量")
    private BigDecimal tBn;

    @ExcelProperty("已开金额")
    private BigDecimal tBo;

    @ExcelProperty("灭菌批号")
    private String tBp;


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

    public String gettAg() {
        return tAg;
    }

    public void settAg(String tAg) {
        this.tAg = tAg;
    }

    public String gettAh() {
        return tAh;
    }

    public void settAh(String tAh) {
        this.tAh = tAh;
    }

    public String gettAi() {
        return tAi;
    }

    public void settAi(String tAi) {
        this.tAi = tAi;
    }

    public String gettAj() {
        return tAj;
    }

    public void settAj(String tAj) {
        this.tAj = tAj;
    }

    public String gettAk() {
        return tAk;
    }

    public void settAk(String tAk) {
        this.tAk = tAk;
    }

    public String gettAl() {
        return tAl;
    }

    public void settAl(String tAl) {
        this.tAl = tAl;
    }

    public String gettAm() {
        return tAm;
    }

    public void settAm(String tAm) {
        this.tAm = tAm;
    }

    public String gettAn() {
        return tAn;
    }

    public void settAn(String tAn) {
        this.tAn = tAn;
    }

    public String gettAo() {
        return tAo;
    }

    public void settAo(String tAo) {
        this.tAo = tAo;
    }

    public BigDecimal gettAp() {
        return tAp;
    }

    public void settAp(BigDecimal tAp) {
        this.tAp = tAp;
    }

    public BigDecimal gettAq() {
        return tAq;
    }

    public void settAq(BigDecimal tAq) {
        this.tAq = tAq;
    }

    public BigDecimal gettAr() {
        return tAr;
    }

    public void settAr(BigDecimal tAr) {
        this.tAr = tAr;
    }

    public BigDecimal gettAs() {
        return tAs;
    }

    public void settAs(BigDecimal tAs) {
        this.tAs = tAs;
    }

    public BigDecimal gettAt() {
        return tAt;
    }

    public void settAt(BigDecimal tAt) {
        this.tAt = tAt;
    }

    public BigDecimal gettAu() {
        return tAu;
    }

    public void settAu(BigDecimal tAu) {
        this.tAu = tAu;
    }

    public BigDecimal gettAv() {
        return tAv;
    }

    public void settAv(BigDecimal tAv) {
        this.tAv = tAv;
    }

    public BigDecimal gettAw() {
        return tAw;
    }

    public void settAw(BigDecimal tAw) {
        this.tAw = tAw;
    }

    public String gettAx() {
        return tAx;
    }

    public void settAx(String tAx) {
        this.tAx = tAx;
    }

    public BigDecimal gettAy() {
        return tAy;
    }

    public void settAy(BigDecimal tAy) {
        this.tAy = tAy;
    }

    public BigDecimal gettAz() {
        return tAz;
    }

    public void settAz(BigDecimal tAz) {
        this.tAz = tAz;
    }

    public String gettBa() {
        return tBa;
    }

    public void settBa(String tBa) {
        this.tBa = tBa;
    }

    public String gettBb() {
        return tBb;
    }

    public void settBb(String tBb) {
        this.tBb = tBb;
    }

    public BigDecimal gettBc() {
        return tBc;
    }

    public void settBc(BigDecimal tBc) {
        this.tBc = tBc;
    }

    public String gettBd() {
        return tBd;
    }

    public void settBd(String tBd) {
        this.tBd = tBd;
    }

    public String gettBe() {
        return tBe;
    }

    public void settBe(String tBe) {
        this.tBe = tBe;
    }

    public String gettBf() {
        return tBf;
    }

    public void settBf(String tBf) {
        this.tBf = tBf;
    }

    public String gettBg() {
        return tBg;
    }

    public void settBg(String tBg) {
        this.tBg = tBg;
    }

    public String gettBh() {
        return tBh;
    }

    public void settBh(String tBh) {
        this.tBh = tBh;
    }

    public BigDecimal gettBi() {
        return tBi;
    }

    public void settBi(BigDecimal tBi) {
        this.tBi = tBi;
    }

    public String gettBj() {
        return tBj;
    }

    public void settBj(String tBj) {
        this.tBj = tBj;
    }

    public BigDecimal gettBk() {
        return tBk;
    }

    public void settBk(BigDecimal tBk) {
        this.tBk = tBk;
    }

    public BigDecimal gettBl() {
        return tBl;
    }

    public void settBl(BigDecimal tBl) {
        this.tBl = tBl;
    }

    public BigDecimal gettBm() {
        return tBm;
    }

    public void settBm(BigDecimal tBm) {
        this.tBm = tBm;
    }

    public BigDecimal gettBn() {
        return tBn;
    }

    public void settBn(BigDecimal tBn) {
        this.tBn = tBn;
    }

    public BigDecimal gettBo() {
        return tBo;
    }

    public void settBo(BigDecimal tBo) {
        this.tBo = tBo;
    }

    public String gettBp() {
        return tBp;
    }

    public void settBp(String tBp) {
        this.tBp = tBp;
    }
}
