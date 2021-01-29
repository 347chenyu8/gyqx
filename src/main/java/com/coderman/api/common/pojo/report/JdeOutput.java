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
 * @since 2020-12-07
 */
public class JdeOutput implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ExcelIgnore
    private Long id;

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

    public BigDecimal gettS() {
        return tS;
    }

    public void settS(BigDecimal tS) {
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

    public String gettBg() {
        return tBg;
    }

    public void settBg(String tBg) {
        this.tBg = tBg;
    }

    public BigDecimal gettBh() {
        return tBh;
    }

    public void settBh(BigDecimal tBh) {
        this.tBh = tBh;
    }

    public BigDecimal gettBi() {
        return tBi;
    }

    public void settBi(BigDecimal tBi) {
        this.tBi = tBi;
    }

    public BigDecimal gettBj() {
        return tBj;
    }

    public void settBj(BigDecimal tBj) {
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

    public String gettBm() {
        return tBm;
    }

    public void settBm(String tBm) {
        this.tBm = tBm;
    }

    public String gettBn() {
        return tBn;
    }

    public void settBn(String tBn) {
        this.tBn = tBn;
    }

    public String gettBo() {
        return tBo;
    }

    public void settBo(String tBo) {
        this.tBo = tBo;
    }

    public String gettBp() {
        return tBp;
    }

    public void settBp(String tBp) {
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

    public BigDecimal gettCp() {
        return tCp;
    }

    public void settCp(BigDecimal tCp) {
        this.tCp = tCp;
    }

    public BigDecimal gettCq() {
        return tCq;
    }

    public void settCq(BigDecimal tCq) {
        this.tCq = tCq;
    }

    public BigDecimal gettCr() {
        return tCr;
    }

    public void settCr(BigDecimal tCr) {
        this.tCr = tCr;
    }

    public BigDecimal gettCs() {
        return tCs;
    }

    public void settCs(BigDecimal tCs) {
        this.tCs = tCs;
    }

    public BigDecimal gettCt() {
        return tCt;
    }

    public void settCt(BigDecimal tCt) {
        this.tCt = tCt;
    }

    public BigDecimal gettCu() {
        return tCu;
    }

    public void settCu(BigDecimal tCu) {
        this.tCu = tCu;
    }

    public BigDecimal gettCv() {
        return tCv;
    }

    public void settCv(BigDecimal tCv) {
        this.tCv = tCv;
    }

    public String gettCw() {
        return tCw;
    }

    public void settCw(String tCw) {
        this.tCw = tCw;
    }

    public String gettCx() {
        return tCx;
    }

    public void settCx(String tCx) {
        this.tCx = tCx;
    }

    public String gettCy() {
        return tCy;
    }

    public void settCy(String tCy) {
        this.tCy = tCy;
    }

    public String gettCz() {
        return tCz;
    }

    public void settCz(String tCz) {
        this.tCz = tCz;
    }

    public String gettDa() {
        return tDa;
    }

    public void settDa(String tDa) {
        this.tDa = tDa;
    }

    public String gettDb() {
        return tDb;
    }

    public void settDb(String tDb) {
        this.tDb = tDb;
    }

    public String gettDc() {
        return tDc;
    }

    public void settDc(String tDc) {
        this.tDc = tDc;
    }

    public String gettDd() {
        return tDd;
    }

    public void settDd(String tDd) {
        this.tDd = tDd;
    }

    public String gettDe() {
        return tDe;
    }

    public void settDe(String tDe) {
        this.tDe = tDe;
    }

    public String gettDf() {
        return tDf;
    }

    public void settDf(String tDf) {
        this.tDf = tDf;
    }

    public String gettDg() {
        return tDg;
    }

    public void settDg(String tDg) {
        this.tDg = tDg;
    }

    public String gettDh() {
        return tDh;
    }

    public void settDh(String tDh) {
        this.tDh = tDh;
    }

    public String gettDi() {
        return tDi;
    }

    public void settDi(String tDi) {
        this.tDi = tDi;
    }

    public String gettDj() {
        return tDj;
    }

    public void settDj(String tDj) {
        this.tDj = tDj;
    }

    public String gettDk() {
        return tDk;
    }

    public void settDk(String tDk) {
        this.tDk = tDk;
    }

    public String gettDl() {
        return tDl;
    }

    public void settDl(String tDl) {
        this.tDl = tDl;
    }

    public String gettDm() {
        return tDm;
    }

    public void settDm(String tDm) {
        this.tDm = tDm;
    }

    public String gettDn() {
        return tDn;
    }

    public void settDn(String tDn) {
        this.tDn = tDn;
    }

    public String gettDo() {
        return tDo;
    }

    public void settDo(String tDo) {
        this.tDo = tDo;
    }

    public String gettDp() {
        return tDp;
    }

    public void settDp(String tDp) {
        this.tDp = tDp;
    }

    public String gettDq() {
        return tDq;
    }

    public void settDq(String tDq) {
        this.tDq = tDq;
    }

    public String gettDr() {
        return tDr;
    }

    public void settDr(String tDr) {
        this.tDr = tDr;
    }

    public String gettDs() {
        return tDs;
    }

    public void settDs(String tDs) {
        this.tDs = tDs;
    }

    public String gettDt() {
        return tDt;
    }

    public void settDt(String tDt) {
        this.tDt = tDt;
    }

    public String gettDu() {
        return tDu;
    }

    public void settDu(String tDu) {
        this.tDu = tDu;
    }

    public String gettDv() {
        return tDv;
    }

    public void settDv(String tDv) {
        this.tDv = tDv;
    }

    public String gettDw() {
        return tDw;
    }

    public void settDw(String tDw) {
        this.tDw = tDw;
    }

    public String gettDx() {
        return tDx;
    }

    public void settDx(String tDx) {
        this.tDx = tDx;
    }

    public String gettDy() {
        return tDy;
    }

    public void settDy(String tDy) {
        this.tDy = tDy;
    }

    public String gettDz() {
        return tDz;
    }

    public void settDz(String tDz) {
        this.tDz = tDz;
    }

    public String gettEa() {
        return tEa;
    }

    public void settEa(String tEa) {
        this.tEa = tEa;
    }

    public String gettEb() {
        return tEb;
    }

    public void settEb(String tEb) {
        this.tEb = tEb;
    }

    public String gettEc() {
        return tEc;
    }

    public void settEc(String tEc) {
        this.tEc = tEc;
    }

    public String gettEd() {
        return tEd;
    }

    public void settEd(String tEd) {
        this.tEd = tEd;
    }

    public String gettEe() {
        return tEe;
    }

    public void settEe(String tEe) {
        this.tEe = tEe;
    }

    public String gettEf() {
        return tEf;
    }

    public void settEf(String tEf) {
        this.tEf = tEf;
    }

    public String gettEg() {
        return tEg;
    }

    public void settEg(String tEg) {
        this.tEg = tEg;
    }

    public String gettEh() {
        return tEh;
    }

    public void settEh(String tEh) {
        this.tEh = tEh;
    }

    public String gettEi() {
        return tEi;
    }

    public void settEi(String tEi) {
        this.tEi = tEi;
    }

    public String gettEj() {
        return tEj;
    }

    public void settEj(String tEj) {
        this.tEj = tEj;
    }

    public String gettEk() {
        return tEk;
    }

    public void settEk(String tEk) {
        this.tEk = tEk;
    }

    public String gettEl() {
        return tEl;
    }

    public void settEl(String tEl) {
        this.tEl = tEl;
    }

    public String gettEm() {
        return tEm;
    }

    public void settEm(String tEm) {
        this.tEm = tEm;
    }

    public String gettEn() {
        return tEn;
    }

    public void settEn(String tEn) {
        this.tEn = tEn;
    }

    public String gettEo() {
        return tEo;
    }

    public void settEo(String tEo) {
        this.tEo = tEo;
    }

    public BigDecimal gettEp() {
        return tEp;
    }

    public void settEp(BigDecimal tEp) {
        this.tEp = tEp;
    }

    public String gettEq() {
        return tEq;
    }

    public void settEq(String tEq) {
        this.tEq = tEq;
    }

    public String gettEr() {
        return tEr;
    }

    public void settEr(String tEr) {
        this.tEr = tEr;
    }

    public String gettEs() {
        return tEs;
    }

    public void settEs(String tEs) {
        this.tEs = tEs;
    }

    public String gettEt() {
        return tEt;
    }

    public void settEt(String tEt) {
        this.tEt = tEt;
    }

    public String gettEu() {
        return tEu;
    }

    public void settEu(String tEu) {
        this.tEu = tEu;
    }

    public String gettEv() {
        return tEv;
    }

    public void settEv(String tEv) {
        this.tEv = tEv;
    }

    public String gettEw() {
        return tEw;
    }

    public void settEw(String tEw) {
        this.tEw = tEw;
    }

    public String gettEx() {
        return tEx;
    }

    public void settEx(String tEx) {
        this.tEx = tEx;
    }

    public String gettEy() {
        return tEy;
    }

    public void settEy(String tEy) {
        this.tEy = tEy;
    }

    public String gettEz() {
        return tEz;
    }

    public void settEz(String tEz) {
        this.tEz = tEz;
    }

    public String gettFa() {
        return tFa;
    }

    public void settFa(String tFa) {
        this.tFa = tFa;
    }

    public String gettFb() {
        return tFb;
    }

    public void settFb(String tFb) {
        this.tFb = tFb;
    }

    public String gettFc() {
        return tFc;
    }

    public void settFc(String tFc) {
        this.tFc = tFc;
    }

    public String gettFd() {
        return tFd;
    }

    public void settFd(String tFd) {
        this.tFd = tFd;
    }

    public String gettFe() {
        return tFe;
    }

    public void settFe(String tFe) {
        this.tFe = tFe;
    }

    public String gettFf() {
        return tFf;
    }

    public void settFf(String tFf) {
        this.tFf = tFf;
    }

    public String gettFg() {
        return tFg;
    }

    public void settFg(String tFg) {
        this.tFg = tFg;
    }

    public String gettFh() {
        return tFh;
    }

    public void settFh(String tFh) {
        this.tFh = tFh;
    }

    public BigDecimal gettFi() {
        return tFi;
    }

    public void settFi(BigDecimal tFi) {
        this.tFi = tFi;
    }

    public String gettFj() {
        return tFj;
    }

    public void settFj(String tFj) {
        this.tFj = tFj;
    }

    public String gettFk() {
        return tFk;
    }

    public void settFk(String tFk) {
        this.tFk = tFk;
    }

    public String gettFl() {
        return tFl;
    }

    public void settFl(String tFl) {
        this.tFl = tFl;
    }

    public String gettFm() {
        return tFm;
    }

    public void settFm(String tFm) {
        this.tFm = tFm;
    }

    public String gettFn() {
        return tFn;
    }

    public void settFn(String tFn) {
        this.tFn = tFn;
    }

    public String gettFo() {
        return tFo;
    }

    public void settFo(String tFo) {
        this.tFo = tFo;
    }

    public String gettFp() {
        return tFp;
    }

    public void settFp(String tFp) {
        this.tFp = tFp;
    }

    public String gettFq() {
        return tFq;
    }

    public void settFq(String tFq) {
        this.tFq = tFq;
    }

    public String gettFr() {
        return tFr;
    }

    public void settFr(String tFr) {
        this.tFr = tFr;
    }

    public String gettFs() {
        return tFs;
    }

    public void settFs(String tFs) {
        this.tFs = tFs;
    }

    public String gettFt() {
        return tFt;
    }

    public void settFt(String tFt) {
        this.tFt = tFt;
    }

    public String gettFu() {
        return tFu;
    }

    public void settFu(String tFu) {
        this.tFu = tFu;
    }

    public String gettFv() {
        return tFv;
    }

    public void settFv(String tFv) {
        this.tFv = tFv;
    }

    public String gettFw() {
        return tFw;
    }

    public void settFw(String tFw) {
        this.tFw = tFw;
    }

    public String gettFx() {
        return tFx;
    }

    public void settFx(String tFx) {
        this.tFx = tFx;
    }

    public String gettFy() {
        return tFy;
    }

    public void settFy(String tFy) {
        this.tFy = tFy;
    }

    public String gettFz() {
        return tFz;
    }

    public void settFz(String tFz) {
        this.tFz = tFz;
    }

    public String gettGa() {
        return tGa;
    }

    public void settGa(String tGa) {
        this.tGa = tGa;
    }

    public String gettGb() {
        return tGb;
    }

    public void settGb(String tGb) {
        this.tGb = tGb;
    }

    public String gettGc() {
        return tGc;
    }

    public void settGc(String tGc) {
        this.tGc = tGc;
    }

    public String gettGd() {
        return tGd;
    }

    public void settGd(String tGd) {
        this.tGd = tGd;
    }

    public String gettGe() {
        return tGe;
    }

    public void settGe(String tGe) {
        this.tGe = tGe;
    }

    public String gettGf() {
        return tGf;
    }

    public void settGf(String tGf) {
        this.tGf = tGf;
    }

    public String gettGg() {
        return tGg;
    }

    public void settGg(String tGg) {
        this.tGg = tGg;
    }

    public String gettGh() {
        return tGh;
    }

    public void settGh(String tGh) {
        this.tGh = tGh;
    }

    public String gettGi() {
        return tGi;
    }

    public void settGi(String tGi) {
        this.tGi = tGi;
    }

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
     * 订单号
     */
    @ExcelProperty("订单号")
    private String tA;

    /**
     * 订单 类型
     */
    @ExcelProperty("订单 类型")
    private String tB;

    /**
     * 订单 公司
     */
    @ExcelProperty("订单 公司")
    private String tC;

    /**
     * 订单 公司名称
     */
    @ExcelProperty("订单 公司名称")
    private String tD;

    /**
     * 行号
     */
    @ExcelProperty("行号")
    private String tE;

    /**
     * 分部 场所
     */
    @ExcelProperty("分部 场所")
    private String tF;

    /**
     * 委托库
     */
    @ExcelProperty("委托库")
    private String tG;

    /**
     * 购货企业编码
     */
    @ExcelProperty("购货企业编码")
    private String tH;

    /**
     * 购货企业名称
     */
    @ExcelProperty("购货企业名称")
    private String tI;

    /**
     * 出库类型
     */
    @ExcelProperty("出库类型")
    private String tJ;

    /**
     * 出库类型描述
     */
    @ExcelProperty("出库类型描述")
    private String tK;

    /**
     * 商品编码
     */
    @ExcelProperty("商品编码")
    private String tL;

    /**
     * 商品名称
     */
    @ExcelProperty("商品名称")
    private String tM;

    /**
     * 厂家物料编码
     */
    @ExcelProperty("厂家物料编码")
    private String tN;

    /**
     * 规格/型号
     */
    @ExcelProperty("规格/型号")
    private String tO;

    /**
     * 生产批号或序列号
     */
    @ExcelProperty("生产批号或序列号")
    private String tP;

    /**
     * 生产批号 批次主文件
     */
    @ExcelProperty("生产批号 批次主文件")
    private String tQ;

    /**
     * 灭菌批号
     */
    @ExcelProperty("灭菌批号")
    private String tR;

    /**
     * 数量
     */
    @ExcelProperty("数量")
    private BigDecimal tS;

    /**
     * 已销售 数量
     */
    @ExcelProperty("已销售 数量")
    private BigDecimal tT;

    /**
     * 已还回 数量
     */
    @ExcelProperty("已还回 数量")
    private BigDecimal tU;

    /**
     * 计量 单位
     */
    @ExcelProperty("计量 单位")
    private String tV;

    /**
     * 计量 单位描述
     */
    @ExcelProperty("计量 单位描述")
    private String tW;

    /**
     * 销售不含税 单价
     */
    @ExcelProperty("销售不含税 单价")
    private BigDecimal tX;

    /**
     * 销售不含税 总价
     */
    @ExcelProperty("销售不含税 总价")
    private BigDecimal tY;

    /**
     * 订单日期
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty("订单日期")
    private String tZ;

    /**
     * OA合同 协议号
     */
    @ExcelProperty("OA合同 协议号")
    private String tAa;

    /**
     * OA采购合同 协议号
     */
    @ExcelProperty("OA采购合同 协议号")
    private String tAb;

    /**
     * 项目代码
     */
    @ExcelProperty("项目代码")
    private String tAc;

    /**
     * 项目名称
     */
    @ExcelProperty("项目名称")
    private String tAd;

    /**
     * 业态
     */
    @ExcelProperty("业态")
    private String tAe;

    /**
     * 业态 说明
     */
    @ExcelProperty("业态 说明")
    private String tAf;

    /**
     * 业务员
     */
    @ExcelProperty("业务员")
    private String tAg;

    /**
     * 业务员 姓名
     */
    @ExcelProperty("业务员 姓名")
    private String tAh;

    /**
     * 业务 承揽部门
     */
    @ExcelProperty("业务 承揽部门")
    private String tAi;

    /**
     * 业务承揽 部门名称
     */
    @ExcelProperty("业务承揽 部门名称")
    private String tAj;

    /**
     * 发运至 地址号
     */
    @ExcelProperty("发运至 地址号")
    private String tAk;

    /**
     * 发运至地址 名称
     */
    @ExcelProperty("发运至地址 名称")
    private String tAl;

    /**
     * 短 项目号
     */
    @ExcelProperty("短 项目号")
    private String tAm;

    /**
     * 第三项目 号
     */
    @ExcelProperty("第三项目 号")
    private String tAn;

    /**
     * 库位
     */
    @ExcelProperty("库位")
    private String tAo;

    /**
     * 批次 序列号
     */
    @ExcelProperty("批次 序列号")
    private String tAp;

    /**
     * 单据 公司
     */
    @ExcelProperty("单据 公司")
    private String tAq;

    /**
     * 原始 定单号
     */
    @ExcelProperty("原始 定单号")
    private String tAr;

    /**
     * 原始定单 类型
     */
    @ExcelProperty("原始定单 类型")
    private String tAs;

    /**
     * 原始 行号
     */
    @ExcelProperty("原始 行号")
    private String tAt;

    /**
     * 公司 键
     */
    @ExcelProperty("公司 键")
    private String tAu;

    /**
     * 相关 采购/销售单号
     */
    @ExcelProperty("相关 采购/销售单号")
    private String tAv;

    /**
     * 相关定单 类型
     */
    @ExcelProperty("相关定单 类型")
    private String tAw;

    /**
     * 相关 采购单/销售单行号
     */
    @ExcelProperty("相关 采购单/销售单行号")
    private String tAx;

    /**
     * 实际发运 日期
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty("实际发运 日期")
    private String tAy;

    /**
     * 总帐 日期
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty("总帐 日期")
    private String tAz;

    /**
     * 上一 状态
     */
    @ExcelProperty("上一 状态")
    private String tBa;

    /**
     * 上一状态 说明
     */
    @ExcelProperty("上一状态 说明")
    private String tBb;

    /**
     * 下一 状态
     */
    @ExcelProperty("下一 状态")
    private String tBc;

    /**
     * 下一状态 说明
     */
    @ExcelProperty("下一状态 说明")
    private String tBd;

    /**
     * 销售 码 3
     */
    @ExcelProperty("销售 码 3")
    private String tBe;

    /**
     * 销售 码 4
     */
    @ExcelProperty("销售 码 4")
    private String tBf;

    /**
     * 销售 码 5
     */
    @ExcelProperty("销售 码 5")
    private String tBg;

    /**
     * 发运 数量
     */
    @ExcelProperty("发运 数量")
    private BigDecimal tBh;

    /**
     * 销售含税 单价
     */
    @ExcelProperty("销售含税 单价")
    private BigDecimal tBi;

    /**
     * 销售含税 总价
     */
    @ExcelProperty("销售含税 总价")
    private BigDecimal tBj;

    /**
     * 退货价格
     */
    @ExcelProperty("退货价格")
    private BigDecimal tBk;

    /**
     * 退货金额
     */
    @ExcelProperty("退货金额")
    private BigDecimal tBl;

    /**
     * 复核打包号
     */
    @ExcelProperty("复核打包号")
    private String tBm;

    /**
     * 运单号
     */
    @ExcelProperty("运单号")
    private String tBn;

    /**
     * 购货者经营许可证号
     */
    @ExcelProperty("购货者经营许可证号")
    private String tBo;

    /**
     * 购货者备案凭证号
     */
    @ExcelProperty("购货者备案凭证号")
    private String tBp;

    /**
     * 医疗机构执业许可证
     */
    @ExcelProperty("医疗机构执业许可证")
    private String tBq;

    /**
     * JDE合同 编码
     */
    @ExcelProperty("JDE合同 编码")
    private String tBr;

    /**
     * 业务发生 部门
     */
    @ExcelProperty("业务发生 部门")
    private String tBs;

    /**
     * 业务发生 部门名称
     */
    @ExcelProperty("业务发生 部门名称")
    private String tBt;

    /**
     * 商品 性质
     */
    @ExcelProperty("商品 性质")
    private String tBu;

    /**
     * 商品性质 说明
     */
    @ExcelProperty("商品性质 说明")
    private String tBv;

    /**
     * 产品 大类
     */
    @ExcelProperty("产品 大类")
    private String tBw;

    /**
     * 产品大类 说明
     */
    @ExcelProperty("产品大类 说明")
    private String tBx;

    /**
     * 风险 等级
     */
    @ExcelProperty("风险 等级")
    private String tBy;

    /**
     * 风险等级 说明
     */
    @ExcelProperty("风险等级 说明")
    private String tBz;

    /**
     * 特殊 分类
     */
    @ExcelProperty("特殊 分类")
    private String tCa;

    /**
     * 特殊分类 说明
     */
    @ExcelProperty("特殊分类 说明")
    private String tCb;

    /**
     * 产品 分类
     */
    @ExcelProperty("产品 分类")
    private String tCc;

    /**
     * 产品分类 说明
     */
    @ExcelProperty("产品分类 说明")
    private String tCd;

    /**
     * 存储条件
     */
    @ExcelProperty("存储条件")
    private String tCe;

    /**
     * 存储条件 说明
     */
    @ExcelProperty("存储条件 说明")
    private String tCf;

    /**
     * 生产 厂家
     */
    @ExcelProperty("生产 厂家")
    private String tCg;

    /**
     * 生产厂家 名称
     */
    @ExcelProperty("生产厂家 名称")
    private String tCh;

    /**
     * 生产企业许可证或备案凭证号
     */
    @ExcelProperty("生产企业许可证或备案凭证号")
    private String tCi;

    /**
     * 生产日期
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty("生产日期")
    private String tCj;

    /**
     * 有效期/ 失效日期
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty("有效期/ 失效日期")
    private String tCk;

    /**
     * 灭菌 失效日期
     */
    @DateTimeFormat("yyyy-MM-dd")
    @ExcelProperty("灭菌 失效日期")
    private String tCl;

    /**
     * 购货企业经营地址
     */
    @ExcelProperty("购货企业经营地址")
    private String tCm;

    /**
     * 购货企业联系方式
     */
    @ExcelProperty("购货企业联系方式")
    private String tCn;

    /**
     * 序列号
     */
    @ExcelProperty("序列号")
    private String tCo;

    /**
     * 单位成本
     */
    @ExcelProperty("单位成本")
    private BigDecimal tCp;

    /**
     * 总 成本
     */
    @ExcelProperty("总 成本")
    private BigDecimal tCq;

    /**
     * 采购含税 单价
     */
    @ExcelProperty("采购含税 单价")
    private BigDecimal tCr;

    /**
     * 采购含税 总价
     */
    @ExcelProperty("采购含税 总价")
    private BigDecimal tCs;

    /**
     * 毛利
     */
    @ExcelProperty("毛利")
    private BigDecimal tCt;

    /**
     * 毛利率
     */
    @ExcelProperty("毛利率")
    private BigDecimal tCu;

    /**
     * 税额
     */
    @ExcelProperty("税额")
    private BigDecimal tCv;

    /**
     * 开票申请 单号
     */
    @ExcelProperty("开票申请 单号")
    private String tCw;

    /**
     * 收货地址
     */
    @ExcelProperty("收货地址")
    private String tCx;

    /**
     * 地址名称
     */
    @ExcelProperty("地址名称")
    private String tCy;

    /**
     * 收货联系人
     */
    @ExcelProperty("收货联系人")
    private String tCz;

    /**
     * 收货联系人联系方式
     */
    @ExcelProperty("收货联系人联系方式")
    private String tDa;

    /**
     * 发运方式
     */
    @ExcelProperty("发运方式")
    private String tDb;

    /**
     * 销售备注
     */
    @ExcelProperty("销售备注")
    private String tDc;

    /**
     * 货币码
     */
    @ExcelProperty("货币码")
    private String tDd;

    /**
     * 汇率
     */
    @ExcelProperty("汇率")
    private String tDe;

    /**
     * 取消 日期
     */
    @ExcelProperty("取消 日期")
    private String tDf;

    /**
     * 采购员 编码
     */
    @ExcelProperty("采购员 编码")
    private String tDg;

    /**
     * 采购员 姓名
     */
    @ExcelProperty("采购员 姓名")
    private String tDh;

    /**
     * 计税 Y/N
     */
    @ExcelProperty("计税 Y/N")
    private String tDi;

    /**
     * 税码 说明
     */
    @ExcelProperty("税码 说明")
    private String tDj;

    /**
     * 税率 税区
     */
    @ExcelProperty("税率 税区")
    private String tDk;

    /**
     * 供应商 编码
     */
    @ExcelProperty("供应商 编码")
    private String tDl;

    /**
     * 供应商名称
     */
    @ExcelProperty("供应商名称")
    private String tDm;

    /**
     * 进口/国产/港澳台
     */
    @ExcelProperty("进口/国产/港澳台")
    private String tDn;

    /**
     * 进口/国产/港澳台
     */
    @ExcelProperty("进口/国产/港澳台")
    private String tDo;

    /**
     * 进口/合资/国产
     */
    @ExcelProperty("进口/合资/国产")
    private String tDp;

    /**
     * 进口/合资/国产
     */
    @ExcelProperty("进口/合资/国产")
    private String tDq;

    /**
     * 存储条件
     */
    @ExcelProperty("存储条件")
    private String tDr;

    /**
     * 注册证号或备案凭证号
     */
    @ExcelProperty("注册证号或备案凭证号")
    private String tDs;

    /**
     * 国家 （地区）
     */
    @ExcelProperty("国家 （地区）")
    private String tDt;

    /**
     * Ctry
     */
    @ExcelProperty("Ctry")
    private String tDu;

    /**
     * 省（州）
     */
    @ExcelProperty("省（州）")
    private String tDv;

    /**
     * ST
     */
    @ExcelProperty("ST")
    private String tDw;

    /**
     * 客商 类别
     */
    @ExcelProperty("客商 类别")
    private String tDx;

    /**
     * 客商 类别
     */
    @ExcelProperty("客商 类别")
    private String tDy;

    /**
     * 单位 性质
     */
    @ExcelProperty("单位 性质")
    private String tDz;

    /**
     * 单位性质
     */
    @ExcelProperty("单位性质")
    private String tEa;

    /**
     * 是否生产商
     */
    @ExcelProperty("是否生产商")
    private String tEb;

    /**
     * 是否经销商
     */
    @ExcelProperty("是否经销商")
    private String tEc;

    /**
     * 是否进口商
     */
    @ExcelProperty("是否进口商")
    private String tEd;

    /**
     * 是否医院
     */
    @ExcelProperty("是否医院")
    private String tEe;

    /**
     * 医院是否公立
     */
    @ExcelProperty("医院是否公立")
    private String tEf;

    /**
     * 是否个人
     */
    @ExcelProperty("是否个人")
    private String tEg;

    /**
     * 是否其他
     */
    @ExcelProperty("是否其他")
    private String tEh;

    /**
     * 医院大类
     */
    @ExcelProperty("医院大类")
    private String tEi;

    /**
     * 医院大类说明
     */
    @ExcelProperty("医院大类说明")
    private String tEj;

    /**
     * 医院小类
     */
    @ExcelProperty("医院小类")
    private String tEk;

    /**
     * 医院小类说明
     */
    @ExcelProperty(" 医院小类说明")
    private String tEl;

    /**
     * 上一次 打印日期
     */
    @ExcelProperty("上一次 打印日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tEm;

    /**
     * 上一次 打印时间
     */
    @ExcelProperty("上一次 打印时间")
    @DateTimeFormat("yyyy-MM-dd")
    private String tEn;

    /**
     * 上一次 打印人
     */
    @ExcelProperty("上一次 打印人")
    private String tEo;

    /**
     * 打印次数
     */
    @ExcelProperty("打印次数")
    private BigDecimal tEp;

    /**
     * 产品线
     */
    @ExcelProperty("产品线")
    private String tEq;

    /**
     * 产品线 名称
     */
    @ExcelProperty("产品线 名称")
    private String tEr;

    /**
     * 医疗级别
     */
    @ExcelProperty("医疗级别")
    private String tEs;

    /**
     * 医疗级别1
     */
    @ExcelProperty("医疗级别1")
    private String tEt;

    /**
     * 购货企业经营地址
     */
    @ExcelProperty("购货企业经营地址")
    private String tEu;

    /**
     * 购货企业联系电话
     */
    @ExcelProperty("购货企业联系电话")
    private String tEv;

    /**
     * 高值/普耗
     */
    @ExcelProperty("高值/普耗")
    private String tEw;

    /**
     * 采购单号
     */
    @ExcelProperty("采购单号")
    private String tEx;

    /**
     * 采购单类型
     */
    @ExcelProperty("采购单类型")
    private String tEy;

    /**
     * 促销折扣
     */
    @ExcelProperty("促销折扣")
    private String tEz;

    /**
     * 招标折扣
     */
    @ExcelProperty("招标折扣")
    private String tFa;

    /**
     * 销量折扣
     */
    @ExcelProperty("销量折扣")
    private String tFb;

    /**
     * 其他折扣1
     */
    @ExcelProperty("其他折扣1")
    private String tFc;

    /**
     * 其他折扣2
     */
    @ExcelProperty("其他折扣2")
    private String tFd;

    /**
     * 其他折扣3
     */
    @ExcelProperty("其他折扣3")
    private String tFe;

    /**
     * 原价
     */
    @ExcelProperty("原价")
    private String tFf;

    /**
     * 开票日期
     */
    @ExcelProperty("开票日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String tFg;

    /**
     * 金税发票号
     */
    @ExcelProperty("金税发票号")
    private String tFh;

    /**
     * 发票金额
     */
    @ExcelProperty("发票金额")
    private BigDecimal tFi;

    /**
     * Commodity Name
     */
    @ExcelProperty("Commodity Name")
    private String tFj;

    /**
     * 采购项目代码
     */
    @ExcelProperty("采购项目代码")
    private String tFk;

    /**
     * 采购项目名称
     */
    @ExcelProperty("采购项目名称")
    private String tFl;

    /**
     * 商品分类
     */
    @ExcelProperty("商品分类")
    private String tFm;

    /**
     * 备注
     */
    @ExcelProperty("备注")
    private String tFn;

    /**
     * 产品追溯码
     */
    @ExcelProperty("产品追溯码")
    private String tFo;

    /**
     * 批号效期码
     */
    @ExcelProperty("批号效期码")
    private String tFp;

    /**
     * SPD采购单号
     */
    @ExcelProperty("SPD采购单号")
    private String tFq;

    /**
     * SPD采购单行号
     */
    @ExcelProperty("SPD采购单行号")
    private String tFr;

    /**
     * 是否已签收
     */
    @ExcelProperty("是否已签收")
    private String tFs;

    /**
     * 签收人
     */
    @ExcelProperty("签收人")
    private String tFt;

    /**
     * 签收时间
     */
    @ExcelProperty("签收时间")
    private String tFu;

    /**
     * 单据公司
     */
    @ExcelProperty("单据公司")
    private String tFv;

    /**
     * 单据类型
     */
    @ExcelProperty("单据类型")
    private String tFw;

    /**
     * 单据号
     */
    @ExcelProperty("单据号")
    private String tFx;

    /**
     * 行 类型
     */
    @ExcelProperty("行 类型")
    private String tFy;

    /**
     * 总账级
     */
    @ExcelProperty("总账级")
    private String tFz;

    /**
     * 制单员
     */
    @ExcelProperty("制单员")
    private String tGa;

    /**
     * 制单员 名称
     */
    @ExcelProperty("制单员 名称")
    private String tGb;

    /**
     * 新风险等级
     */
    @ExcelProperty("新风险等级")
    private String tGc;

    /**
     * 新风险等级说明
     */
    @ExcelProperty("新风险等级说明")
    private String tGd;

    /**
     * 新产品分类
     */
    @ExcelProperty("新产品分类")
    private String tGe;

    /**
     * 新产品分类说明
     */
    @ExcelProperty("新产品分类说明")
    private String tGf;

    /**
     * 退货原因
     */
    @ExcelProperty("退货原因")
    private String tGg;

    /**
     * 退货原因说明
     */
    @ExcelProperty("退货原因说明")
    private String tGh;

    /**
     * 退货原因详情描述
     */
    @ExcelProperty("退货原因详情描述")
    private String tGi;


}
