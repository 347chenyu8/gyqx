package com.coderman.api.common.pojo.report;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

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
 * @author chenyu
 * @since 2020-12-07
 */
@Table(name = "jde_input")
public class JdeInput implements Serializable {

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
     * 定单 号
     */
    @ExcelProperty(index = 0)
    private String tA;

    /**
     * 定单 类型
     */
    @ExcelProperty(index = 1)
    private String tB;

    /**
     * 定单 公司
     */
    @ExcelProperty(index = 2)
    private String tC;

    /**
     * 公司描述
     */
    @ExcelProperty(index = 3)
    private String tD;

    /**
     * 行 类型
     */
    @ExcelProperty(index = 4)
    private String tE;

    /**
     * 项目号
     */
    @ExcelProperty(index = 5)
    private String tF;

    /**
     * 项目名称
     */
    @ExcelProperty(index = 6)
    private String tG;

    /**
     * 商品编码
     */
    @ExcelProperty(index = 7)
    private String tH;

    /**
     * 厂家物料编码
     */
    @ExcelProperty(index = 8)
    private String tI;

    /**
     * 商品名称
     */
    @ExcelProperty(index = 9)
    private String tJ;

    /**
     * 通用名
     */
    @ExcelProperty(index = 10)
    private String tK;

    /**
     * 规格型号
     */
    @ExcelProperty(index = 11)
    private String tL;

    /**
     * 注册证号或备案凭证号
     */
    @ExcelProperty(index = 12)
    private String tM;

    /**
     * 生产批号
     */
    @ExcelProperty(index = 13)
    private String tN;

    /**
     * 计量单位
     */
    @ExcelProperty(index = 14)
    private String tO;

    /**
     * 计量单位中文描述
     */
    @ExcelProperty(index = 15)
    private String tP;

    /**
     * 经营 单位
     */
    @ExcelProperty(index = 16)
    private String tQ;

    /**
     * 经营单位 描述
     */
    @ExcelProperty(index = 17)
    private String tR;

    /**
     * 发运至 地址号
     */
    @ExcelProperty(index = 18)
    private String tS;

    /**
     * 定购 数量
     */
    @ExcelProperty(index = 19)
    private BigDecimal tT;

    /**
     * 单价
     */
    @ExcelProperty(index = 20)
    private BigDecimal tU;

    /**
     * 金额
     */
    @ExcelProperty(index = 21)
    private BigDecimal tV;

    /**
     * 含税单价
     */
    @ExcelProperty(index = 22)
    private BigDecimal tW;

    /**
     * 含税总价
     */
    @ExcelProperty(index = 23)
    private BigDecimal tX;

    /**
     * 已收数量
     */
    @ExcelProperty(index = 24)
    private BigDecimal tY;

    /**
     * 已收金额
     */
    @ExcelProperty(index = 25)
    private BigDecimal tZ;

    /**
     * 货币 码
     */
    @ExcelProperty(index = 26)
    private String tAa;

    /**
     * 汇 率
     */
    @ExcelProperty(index = 27)
    private String tAb;

    /**
     * 上一 状态
     */
    @ExcelProperty(index = 28)
    private String tAc;

    /**
     * 上一状态描述
     */
    @ExcelProperty(index = 29)
    private String tAd;

    /**
     * 下一 状态
     */
    @ExcelProperty(index = 30)
    private String tAe;

    /**
     * 下一状态描述
     */
    @ExcelProperty(index = 31)
    private String tAf;

    /**
     * 供应商
     */
    @ExcelProperty(index = 32)
    private String tAg;

    /**
     * 供货企业名称
     */
    @ExcelProperty(index = 33)
    private String tAh;

    /**
     * 购货日期
     */
    @ExcelProperty(index = 34)
    @DateTimeFormat("yyyy-MM-dd")
    private String tAi;

    /**
     * 供货企业地址
     */
    @ExcelProperty(index = 35)
    private String tAj;

    /**
     * 供应商仓库地址
     */
    @ExcelProperty(index = 36)
    private String tAk;

    /**
     * 供货企业联系方式
     */
    @ExcelProperty(index = 37)
    private String tAl;

    /**
     * 收货日期
     */
    @ExcelProperty(index = 38)
    @DateTimeFormat("yyyy-MM-dd")
    private String tAm;

    /**
     * 取消 日期
     */
    @ExcelProperty(index = 39)
    @DateTimeFormat("yyyy-MM-dd")
    private String tAn;

    /**
     * 协议/合同号
     */
    @ExcelProperty(index = 40)
    private String tAo;

    /**
     * OA合同协议号
     */
    @ExcelProperty(index = 41)
    private String tAp;

    /**
     * 业务发生部门
     */
    @ExcelProperty(index = 42)
    private String tAq;

    /**
     * 业务发生部门 描述
     */
    @ExcelProperty(index = 43)
    private String tAr;

    /**
     * 业务承揽部门
     */
    @ExcelProperty(index = 44)
    private String tAs;

    /**
     * 业务承揽部门描述
     */
    @ExcelProperty(index = 45)
    private String tAt;

    /**
     * 分部场所
     */
    @ExcelProperty(index = 46)
    private String tAu;

    /**
     * 分部场所 描述
     */
    @ExcelProperty(index = 47)
    private String tAv;

    /**
     * 业务员
     */
    @ExcelProperty(index = 48)
    private String tAw;

    /**
     * 业务员姓名
     */
    @ExcelProperty(index = 49)
    private String tAx;

    /**
     * 制单员
     */
    @ExcelProperty(index = 50)
    private String tAy;

    /**
     * 制单员 名称
     */
    @ExcelProperty(index = 51)
    private String tAz;

    /**
     * 生产 厂家
     */
    @ExcelProperty(index = 52)
    private String tBa;

    /**
     * 生产厂家名称
     */
    @ExcelProperty(index = 53)
    private String tBb;

    /**
     * 境外厂家中文名称
     */
    @ExcelProperty(index = 54)
    private String tBc;

    /**
     * 计税 Y/N
     */
    @ExcelProperty(index = 55)
    private String tBd;

    /**
     * 税 说明码
     */
    @ExcelProperty(index = 56)
    private String tBe;

    /**
     * 税率/ 税区
     */
    @ExcelProperty(index = 57)
    private String tBf;

    /**
     * 税额
     */
    @ExcelProperty(index = 58)
    private BigDecimal tBg;

    /**
     * 存储条件
     */
    @ExcelProperty(index = 59)
    private String tBh;

    /**
     * 发票 日期
     */
    @ExcelProperty(index = 60)
    @DateTimeFormat("yyyy-MM-dd")
    private String tBi;

    /**
     * 产品线
     */
    @ExcelProperty(index = 61)
    private String tBj;

    /**
     * 产品线 名称
     */
    @ExcelProperty(index = 62)
    private String tBk;

    /**
     * 客商 类别
     */
    @ExcelProperty(index = 63)
    private String tBl;

    /**
     * 客商 类别
     */
    @ExcelProperty(index = 64)
    private String tBm;

    /**
     * 收货数量
     */
    @ExcelProperty(index = 65)
    private BigDecimal tBn;

    /**
     * 验收数量
     */
    @ExcelProperty(index = 66)
    private BigDecimal tBo;

    /**
     * 入库数量
     */
    @ExcelProperty(index = 67)
    private BigDecimal tBp;

    /**
     * 批次/序列
     */
    @ExcelProperty(index = 68)
    private String tBq;

    /**
     * 库位
     */
    @ExcelProperty(index = 69)
    private String tBr;

    /**
     * 行号
     */
    @ExcelProperty(index = 70)
    private String tBs;

    /**
     * 原始订单号
     */
    @ExcelProperty(index = 71)
    private String tBt;

    /**
     * 原始订单类型
     */
    @ExcelProperty(index = 72)
    private String tBu;

    /**
     * 原始行号
     */
    @ExcelProperty(index = 73)
    private String tBv;

    /**
     * 备注
     */
    @ExcelProperty(index = 74)
    private String tBw;

    /**
     * 成本规则
     */
    @ExcelProperty(index = 75)
    private String tBx;

    /**
     * 成本规则描述
     */
    @ExcelProperty(index = 76)
    private String tBy;

    /**
     * 商品分类
     */
    @ExcelProperty(index = 77)
    private String tBz;

    /**
     * 供应商销售单
     */
    @ExcelProperty(index = 78)
    private String tCa;

    /**
     * 平台类型
     */
    @ExcelProperty(index = 79)
    private String tCb;

    /**
     * 平台订单号
     */
    @ExcelProperty(index = 80)
    private String tCc;

    /**
     * 平台行号
     */
    @ExcelProperty(index = 81)
    private String tCd;

    /**
     * 关联客商号
     */
    @ExcelProperty(index = 82)
    private String tCe;

    /**
     * 关联客商 名称
     */
    @ExcelProperty(index = 83)
    private String tCf;

    /**
     * 商品性质
     */
    @ExcelProperty(index = 84)
    private String tCg;

    /**
     * 商品性质说明
     */
    @ExcelProperty(index = 85)
    private String tCh;

    /**
     * 风险等级
     */
    @ExcelProperty(index = 86)
    private String tCi;

    /**
     * 风险等级说明
     */
    @ExcelProperty(index = 87)
    private String tCj;

    /**
     * 产品分类
     */
    @ExcelProperty(index = 88)
    private String tCk;

    /**
     * 产品分类说明
     */
    @ExcelProperty(index = 89)
    private String tCl;

    /**
     * 新风险等级
     */
    @ExcelProperty(index = 90)
    private String tCm;

    /**
     * 新风险等级说明
     */
    @ExcelProperty(index = 91)
    private String tCn;

    /**
     * 新产品分类
     */
    @ExcelProperty(index = 92)
    private String tCo;

    /**
     * 新产品分类说明
     */
    @ExcelProperty(index = 93)
    private String tCp;

    /**
     * 退货原因
     */
    @ExcelProperty(index = 94)
    private String tCq;

    /**
     * 退货原因说明
     */
    @ExcelProperty(index = 95)
    private String tCr;

    /**
     * 退货原因详细描述
     */
    @ExcelProperty(index = 96)
    private String tCs;

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

    public BigDecimal gettT() {
        return tT;
    }

    public void settT(BigDecimal tT) {
        this.tT = tT;
    }

    public BigDecimal gettU() {
        return tU;
    }

    public void settU(BigDecimal tU) {
        this.tU = tU;
    }

    public BigDecimal gettV() {
        return tV;
    }

    public void settV(BigDecimal tV) {
        this.tV = tV;
    }

    public BigDecimal gettW() {
        return tW;
    }

    public void settW(BigDecimal tW) {
        this.tW = tW;
    }

    public BigDecimal gettX() {
        return tX;
    }

    public void settX(BigDecimal tX) {
        this.tX = tX;
    }

    public BigDecimal gettY() {
        return tY;
    }

    public void settY(BigDecimal tY) {
        this.tY = tY;
    }

    public BigDecimal gettZ() {
        return tZ;
    }

    public void settZ(BigDecimal tZ) {
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

    public String gettAt() {
        return tAt;
    }

    public void settAt(String tAt) {
        this.tAt = tAt;
    }

    public String gettAu() {
        return tAu;
    }

    public void settAu(String tAu) {
        this.tAu = tAu;
    }

    public String gettAv() {
        return tAv;
    }

    public void settAv(String tAv) {
        this.tAv = tAv;
    }

    public String gettAw() {
        return tAw;
    }

    public void settAw(String tAw) {
        this.tAw = tAw;
    }

    public String gettAx() {
        return tAx;
    }

    public void settAx(String tAx) {
        this.tAx = tAx;
    }

    public String gettAy() {
        return tAy;
    }

    public void settAy(String tAy) {
        this.tAy = tAy;
    }

    public String gettAz() {
        return tAz;
    }

    public void settAz(String tAz) {
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

    public String gettBc() {
        return tBc;
    }

    public void settBc(String tBc) {
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

    public BigDecimal gettBg() {
        return tBg;
    }

    public void settBg(BigDecimal tBg) {
        this.tBg = tBg;
    }

    public String gettBh() {
        return tBh;
    }

    public void settBh(String tBh) {
        this.tBh = tBh;
    }

    public String gettBi() {
        return tBi;
    }

    public void settBi(String tBi) {
        this.tBi = tBi;
    }

    public String gettBj() {
        return tBj;
    }

    public void settBj(String tBj) {
        this.tBj = tBj;
    }

    public String gettBk() {
        return tBk;
    }

    public void settBk(String tBk) {
        this.tBk = tBk;
    }

    public String gettBl() {
        return tBl;
    }

    public void settBl(String tBl) {
        this.tBl = tBl;
    }

    public String gettBm() {
        return tBm;
    }

    public void settBm(String tBm) {
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

    public BigDecimal gettBp() {
        return tBp;
    }

    public void settBp(BigDecimal tBp) {
        this.tBp = tBp;
    }

    public String gettBq() {
        return tBq;
    }

    public void settBq(String tBq) {
        this.tBq = tBq;
    }

    public String gettBr() {
        return tBr;
    }

    public void settBr(String tBr) {
        this.tBr = tBr;
    }

    public String gettBs() {
        return tBs;
    }

    public void settBs(String tBs) {
        this.tBs = tBs;
    }

    public String gettBt() {
        return tBt;
    }

    public void settBt(String tBt) {
        this.tBt = tBt;
    }

    public String gettBu() {
        return tBu;
    }

    public void settBu(String tBu) {
        this.tBu = tBu;
    }

    public String gettBv() {
        return tBv;
    }

    public void settBv(String tBv) {
        this.tBv = tBv;
    }

    public String gettBw() {
        return tBw;
    }

    public void settBw(String tBw) {
        this.tBw = tBw;
    }

    public String gettBx() {
        return tBx;
    }

    public void settBx(String tBx) {
        this.tBx = tBx;
    }

    public String gettBy() {
        return tBy;
    }

    public void settBy(String tBy) {
        this.tBy = tBy;
    }

    public String gettBz() {
        return tBz;
    }

    public void settBz(String tBz) {
        this.tBz = tBz;
    }

    public String gettCa() {
        return tCa;
    }

    public void settCa(String tCa) {
        this.tCa = tCa;
    }

    public String gettCb() {
        return tCb;
    }

    public void settCb(String tCb) {
        this.tCb = tCb;
    }

    public String gettCc() {
        return tCc;
    }

    public void settCc(String tCc) {
        this.tCc = tCc;
    }

    public String gettCd() {
        return tCd;
    }

    public void settCd(String tCd) {
        this.tCd = tCd;
    }

    public String gettCe() {
        return tCe;
    }

    public void settCe(String tCe) {
        this.tCe = tCe;
    }

    public String gettCf() {
        return tCf;
    }

    public void settCf(String tCf) {
        this.tCf = tCf;
    }

    public String gettCg() {
        return tCg;
    }

    public void settCg(String tCg) {
        this.tCg = tCg;
    }

    public String gettCh() {
        return tCh;
    }

    public void settCh(String tCh) {
        this.tCh = tCh;
    }

    public String gettCi() {
        return tCi;
    }

    public void settCi(String tCi) {
        this.tCi = tCi;
    }

    public String gettCj() {
        return tCj;
    }

    public void settCj(String tCj) {
        this.tCj = tCj;
    }

    public String gettCk() {
        return tCk;
    }

    public void settCk(String tCk) {
        this.tCk = tCk;
    }

    public String gettCl() {
        return tCl;
    }

    public void settCl(String tCl) {
        this.tCl = tCl;
    }

    public String gettCm() {
        return tCm;
    }

    public void settCm(String tCm) {
        this.tCm = tCm;
    }

    public String gettCn() {
        return tCn;
    }

    public void settCn(String tCn) {
        this.tCn = tCn;
    }

    public String gettCo() {
        return tCo;
    }

    public void settCo(String tCo) {
        this.tCo = tCo;
    }

    public String gettCp() {
        return tCp;
    }

    public void settCp(String tCp) {
        this.tCp = tCp;
    }

    public String gettCq() {
        return tCq;
    }

    public void settCq(String tCq) {
        this.tCq = tCq;
    }

    public String gettCr() {
        return tCr;
    }

    public void settCr(String tCr) {
        this.tCr = tCr;
    }

    public String gettCs() {
        return tCs;
    }

    public void settCs(String tCs) {
        this.tCs = tCs;
    }
}
