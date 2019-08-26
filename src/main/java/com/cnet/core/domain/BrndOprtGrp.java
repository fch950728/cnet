package com.cnet.core.domain;

import java.util.List;

/**
 * 品牌商信息表
 * @author zodiac
 * @version 1.0
 * @since 1.0
 * 
 */
public class BrndOprtGrp {

   private int oprnCptlTvrCnt;
   private String brndAhnAvldtStdt;
   private String brndAhnprty;
   private String merchantAccno;
   private String brndAhnFile;
   private String stgTp;
   private String lvl1CgyId;
   private String merchantDepbnkAccnm;
   private String lvl1CgyNm;
   private String merchantDpbkbkcd;
   private String merchantNm;
   private String brndAhnId;
   private String merchantId;
   private String brndAhnAvldtEddt;
   private String lvl2CgyNm;
   private String merchantDpbknm;
   private String lvl2CgyId;
   private List<PayInfo> payInfo;
   private String unnSocCrCd;
   private String zhimaCrGrd;
   
   public void setUnnSocCrCd(String unnSocCrCd)
   {
	   this.unnSocCrCd = unnSocCrCd;
   }
   public String getUnnSocCrCd() {
       return unnSocCrCd;
   }
   
   public void setOprnCptlTvrCnt(int oprnCptlTvrCnt) {
        this.oprnCptlTvrCnt = oprnCptlTvrCnt;
    }
    public int getOprnCptlTvrCnt() {
        return oprnCptlTvrCnt;
    }

   public void setBrndAhnAvldtStdt(String brndAhnAvldtStdt) {
        this.brndAhnAvldtStdt = brndAhnAvldtStdt;
    }
    public String getBrndAhnAvldtStdt() {
        return brndAhnAvldtStdt;
    }

   public void setBrndAhnprty(String brndAhnprty) {
        this.brndAhnprty = brndAhnprty;
    }
    public String getBrndAhnprty() {
        return brndAhnprty;
    }

   public void setMerchantAccno(String merchantAccno) {
        this.merchantAccno = merchantAccno;
    }
    public String getMerchantAccno() {
        return merchantAccno;
    }

   public void setBrndAhnFile(String brndAhnFile) {
        this.brndAhnFile = brndAhnFile;
    }
    public String getBrndAhnFile() {
        return brndAhnFile;
    }

   public void setStgTp(String stgTp) {
        this.stgTp = stgTp;
    }
    public String getStgTp() {
        return stgTp;
    }

   public void setLvl1CgyId(String lvl1CgyId) {
        this.lvl1CgyId = lvl1CgyId;
    }
    public String getLvl1CgyId() {
        return lvl1CgyId;
    }

   public void setMerchantDepbnkAccnm(String merchantDepbnkAccnm) {
        this.merchantDepbnkAccnm = merchantDepbnkAccnm;
    }
    public String getMerchantDepbnkAccnm() {
        return merchantDepbnkAccnm;
    }

   public void setLvl1CgyNm(String lvl1CgyNm) {
        this.lvl1CgyNm = lvl1CgyNm;
    }
    public String getLvl1CgyNm() {
        return lvl1CgyNm;
    }

   public void setMerchantDpbkbkcd(String merchantDpbkbkcd) {
        this.merchantDpbkbkcd = merchantDpbkbkcd;
    }
    public String getMerchantDpbkbkcd() {
        return merchantDpbkbkcd;
    }

   public void setMerchantNm(String merchantNm) {
        this.merchantNm = merchantNm;
    }
    public String getMerchantNm() {
        return merchantNm;
    }

   public void setBrndAhnId(String brndAhnId) {
        this.brndAhnId = brndAhnId;
    }
    public String getBrndAhnId() {
        return brndAhnId;
    }

   public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    public String getMerchantId() {
        return merchantId;
    }

   public void setBrndAhnAvldtEddt(String brndAhnAvldtEddt) {
        this.brndAhnAvldtEddt = brndAhnAvldtEddt;
    }
    public String getBrndAhnAvldtEddt() {
        return brndAhnAvldtEddt;
    }

   public void setLvl2CgyNm(String lvl2CgyNm) {
        this.lvl2CgyNm = lvl2CgyNm;
    }
    public String getLvl2CgyNm() {
        return lvl2CgyNm;
    }

   public void setMerchantDpbknm(String merchantDpbknm) {
        this.merchantDpbknm = merchantDpbknm;
    }
    public String getMerchantDpbknm() {
        return merchantDpbknm;
    }

   public void setLvl2CgyId(String lvl2CgyId) {
        this.lvl2CgyId = lvl2CgyId;
    }
    public String getLvl2CgyId() {
        return lvl2CgyId;
    }

   public void setPayInfo(List<PayInfo> payInfo) {
        this.payInfo = payInfo;
    }
    public List<PayInfo> getPayInfo() {
        return payInfo;
    }
	public String getZhimaCrGrd() {
		return zhimaCrGrd;
	}
	public void setZhimaCrGrd(String zhimaCrGrd) {
		this.zhimaCrGrd = zhimaCrGrd;
	}

//    @Override
//    public String toString() {
//   	 return " [unnSocCrCd=" + oprnCptlTvrCnt + ", payInfo=" + payInfo + "]" ;
//    }
}