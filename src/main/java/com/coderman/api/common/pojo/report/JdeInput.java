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
    @ExcelProperty("定单 号")
    private String tA;

    /**
     * 定单 类型
     */
    @ExcelProperty("定单 类型")
    private String tB;

    /**
     * 定单 公司
     */
    @ExcelProperty("定单 公司")
    private String tC;

    /**
     * 公司描述
     */
    @ExcelProperty("公司描述")
    private String tD;

    /**
     * 行 类型
     */
    @ExcelProperty("行 类型")
    private String tE;

    /**
     * 项目号
     */
    @ExcelProperty("项目号")
    private String tF;

    /**
     * 项目名称
     */
    @ExcelProperty("项目名称")
    private String tG;

    /**
     * 商品编码
     */
    @ExcelProperty("商品编码")
    private String tH;

    /**
     * 厂家物料编码
     */
    @ExcelProperty("厂家物料编码")
    private String tI;

    /**
     * 商品名称
     */
    @ExcelProperty("商品名称")
    private String tJ;

    /**
     * 通用名
     */
    @ExcelProperty("通用名")
    private String tK;

    /**
     * 规格型号
     */
    @ExcelProperty("规格型号")
    private String tL;

    /**
     * 注册证号或备案凭证号
     */
    @ExcelProperty("注册证号或备案凭证号")
    private String tM;

    /**
     * 生产批号
     */
    @ExcelProperty("生产批号")
    private String tN;

    /**
     * 计量单位
     */
    @ExcelProperty("计量单位")
    private String tO;

    /**
     * 计量单位中文描述
     */
    @ExcelProperty("计量单位中文描述")
    private String tP;

    /**
     * 经营 单位
     */
    @ExcelProperty("经营 单位")
    private String tQ;

    /**
     * 经营单位 描述
     */
    @ExcelProperty("经营单位 描述")
    private String tR;

    /**
     * 发运至 地址号
     */
    @ExcelProperty("发运至 地址号")
    private String tS;

    /**
     * 定购 数量
     */
    @ExcelProperty("定购 数量")
    private BigDecimal tT;

    /**
     * 单价
     */
    @ExcelProperty("单价")
    private BigDecimal tU;

    /**
     * 金额
     */
    @ExcelProperty("金额")
    private BigDecimal tV;

    /**
     * 含税单价
     */
    @ExcelProperty("含税单价")
    private BigDecimal tW;

    /**
     * 含税总价
     */
    @ExcelProperty("含税总价")
    private BigDecimal tX;

    /**
     * 已收数量
     */
    @ExcelProperty("已收数量")
    private BigDecimal tY;

    /**
     * 已收金额
     */
    @ExcelProperty("已收金额")
    private BigDecimal tZ;

    /**
     * 货币 码
     */
    @ExcelProperty("货币 码")
    private String tAa;

    /**
     * 汇 率
     */
    @ExcelProperty("汇 率")
    private String tAb;

    /**
     * 上一 状态
     */
    @ExcelProperty("上一 状态")
    private String tAc;

    /**
     * 上一状态描述
     */
    @ExcelProperty("上一状态描述")
    private String tAd;

    /**
     * 下一 状态
     */
    @ExcelProperty("下一 状态")
    private String tAe;

    /**
     * 下一状态描述
     */
    @ExcelProperty("下一状态描述")
    private String tAf;

    /**
     * 供应商
     */
    @ExcelProperty("供应商")
    private String tAg;

    /**
     * 供货企业名称
     */
    @ExcelProperty("供货企业名称")
    private String tAh;

    /**
     * 购货日期
     */
    @ExcelProperty("购货日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tAi;

    /**
     * 供货企业地址
     */
    @ExcelProperty("供货企业地址")
    private String tAj;

    /**
     * 供应商仓库地址
     */
    @ExcelProperty("供应商仓库地址")
    private String tAk;

    /**
     * 供货企业联系方式
     */
    @ExcelProperty("供货企业联系方式")
    private String tAl;

    /**
     * 收货日期
     */
    @ExcelProperty("收货日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tAm;

    /**
     * 取消 日期
     */
    @ExcelProperty("取消 日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tAn;

    /**
     * 协议/合同号
     */
    @ExcelProperty("协议/合同号")
    private String tAo;

    /**
     * OA合同协议号
     */
    @ExcelProperty("OA合同协议号")
    private String tAp;

    /**
     * 业务发生部门
     */
    @ExcelProperty("业务发生部门")
    private String tAq;

    /**
     * 业务发生部门 描述
     */
    @ExcelProperty("业务发生部门 描述")
    private String tAr;

    /**
     * 业务承揽部门
     */
    @ExcelProperty("业务承揽部门")
    private String tAs;

    /**
     * 业务承揽部门描述
     */
    @ExcelProperty("业务承揽部门描述")
    private String tAt;

    /**
     * 分部场所
     */
    @ExcelProperty("分部场所")
    private String tAu;

    /**
     * 分部场所 描述
     */
    @ExcelProperty("分部场所 描述")
    private String tAv;

    /**
     * 业务员
     */
    @ExcelProperty("业务员")
    private String tAw;

    /**
     * 业务员姓名
     */
    @ExcelProperty("业务员姓名")
    private String tAx;

    /**
     * 制单员
     */
    @ExcelProperty("制单员")
    private String tAy;

    /**
     * 制单员 名称
     */
    @ExcelProperty("制单员 名称")
    private String tAz;

    /**
     * 生产 厂家
     */
    @ExcelProperty("生产 厂家")
    private String tBa;

    /**
     * 生产厂家名称
     */
    @ExcelProperty("生产厂家名称")
    private String tBb;

    /**
     * 境外厂家中文名称
     */
    @ExcelProperty("境外厂家中文名称")
    private String tBc;

    /**
     * 计税 Y/N
     */
    @ExcelProperty("计税 Y/N")
    private String tBd;

    /**
     * 税 说明码
     */
    @ExcelProperty("税 说明码")
    private String tBe;

    /**
     * 税率/ 税区
     */
    @ExcelProperty("税率/ 税区")
    private String tBf;

    /**
     * 税额
     */
    @ExcelProperty("税额")
    private BigDecimal tBg;

    /**
     * 存储条件
     */
    @ExcelProperty("存储条件")
    private String tBh;

    /**
     * 发票 日期
     */
    @ExcelProperty("发票 日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tBi;

    /**
     * 产品线
     */
    @ExcelProperty("产品线")
    private String tBj;

    /**
     * 产品线 名称
     */
    @ExcelProperty("产品线 名称")
    private String tBk;

    /**
     * 客商 类别
     */
    @ExcelProperty("客商 类别")
    private String tBl;

    /**
     * 客商 类别
     */
    @ExcelProperty("客商 类别")
    private String tBm;

    /**
     * 收货数量
     */
    @ExcelProperty("收货数量")
    private BigDecimal tBn;

    /**
     * 验收数量
     */
    @ExcelProperty("验收数量")
    private BigDecimal tBo;

    /**
     * 入库数量
     */
    @ExcelProperty("入库数量")
    private BigDecimal tBp;

    /**
     * 批次/序列
     */
    @ExcelProperty("批次/序列")
    private String tBq;

    /**
     * 库位
     */
    @ExcelProperty("库位")
    private String tBr;

    /**
     * 行号
     */
    @ExcelProperty("行号")
    private String tBs;

    /**
     * 原始订单号
     */
    @ExcelProperty("原始订单号")
    private String tBt;

    /**
     * 原始订单类型
     */
    @ExcelProperty("原始订单类型")
    private String tBu;

    /**
     * 原始行号
     */
    @ExcelProperty("原始行号")
    private String tBv;

    /**
     * 备注
     */
    @ExcelProperty("备注")
    private String tBw;

    /**
     * 成本规则
     */
    @ExcelProperty("成本规则")
    private String tBx;

    /**
     * 成本规则描述
     */
    @ExcelProperty("成本规则描述")
    private String tBy;

    /**
     * 商品分类
     */
    @ExcelProperty("商品分类")
    private String tBz;

    /**
     * 供应商销售单
     */
    @ExcelProperty("供应商销售单")
    private String tCa;

    /**
     * 平台类型
     */
    @ExcelProperty("平台类型")
    private String tCb;

    /**
     * 平台订单号
     */
    @ExcelProperty("平台订单号")
    private String tCc;

    /**
     * 平台行号
     */
    @ExcelProperty("平台行号")
    private String tCd;

    /**
     * 关联客商号
     */
    @ExcelProperty("关联客商号")
    private String tCe;

    /**
     * 关联客商 名称
     */
    @ExcelProperty("关联客商 名称")
    private String tCf;

    /**
     * 商品性质
     */
    @ExcelProperty("商品性质")
    private String tCg;

    /**
     * 商品性质说明
     */
    @ExcelProperty("商品性质说明")
    private String tCh;

    /**
     * 风险等级
     */
    @ExcelProperty("风险等级")
    private String tCi;

    /**
     * 风险等级说明
     */
    @ExcelProperty("风险等级说明")
    private String tCj;

    /**
     * 产品分类
     */
    @ExcelProperty("产品分类")
    private String tCk;

    /**
     * 产品分类说明
     */
    @ExcelProperty("产品分类说明")
    private String tCl;

    /**
     * 新风险等级
     */
    @ExcelProperty("新风险等级")
    private String tCm;

    /**
     * 新风险等级说明
     */
    @ExcelProperty("新风险等级说明")
    private String tCn;

    /**
     * 新产品分类
     */
    @ExcelProperty("新产品分类")
    private String tCo;

    /**
     * 新产品分类说明
     */
    @ExcelProperty("新产品分类说明")
    private String tCp;

    /**
     * 退货原因
     */
    @ExcelProperty("退货原因")
    private String tCq;

    /**
     * 退货原因说明
     */
    @ExcelProperty("退货原因说明")
    private String tCr;

    /**
     * 退货原因详细描述
     */
    @ExcelProperty("退货原因详细描述")
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
