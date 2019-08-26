package com.cnet.core.domain;

/**
* 采购信息表
* @author zodiac
* @version 1.0
* @since 1.0
*/
public class PayInfo {

   private double purchaseAmt;
   private int purchaseRfndNum;
   private int purchaseNum;
   private int saleRwrd;
   private int purchaseRfndAmt;
   private String unnSocCrCd;
   private String lvl1CgyId;
   private String lvl2CgyId; 
   private int month;
   
   
   public void setPurchaseAmt(double purchaseAmt) {
        this.purchaseAmt = purchaseAmt;
    }
    public double getPurchaseAmt() {
        return purchaseAmt;
    }

   public void setPurchaseRfndNum(int purchaseRfndNum) {
        this.purchaseRfndNum = purchaseRfndNum;
    }
    public int getPurchaseRfndNum() {
        return purchaseRfndNum;
    }

   public void setPurchaseNum(int purchaseNum) {
        this.purchaseNum = purchaseNum;
    }
    public int getPurchaseNum() {
        return purchaseNum;
    }

   public void setSaleRwrd(int saleRwrd) {
        this.saleRwrd = saleRwrd;
    }
    public int getSaleRwrd() {
        return saleRwrd;
    }

   public void setPurchaseRfndAmt(int purchaseRfndAmt) {
        this.purchaseRfndAmt = purchaseRfndAmt;
    }
    public int getPurchaseRfndAmt() {
        return purchaseRfndAmt;
    }
	public String getUnnSocCrCd() {
		return unnSocCrCd;
	}
	public void setUnnSocCrCd(String unnSocCrCd) {
		this.unnSocCrCd = unnSocCrCd;
	}
	public String getLvl1CgyId() {
		return lvl1CgyId;
	}
	public void setLvl1CgyId(String lvl1CgyId) {
		this.lvl1CgyId = lvl1CgyId;
	}
	public String getLvl2CgyId() {
		return lvl2CgyId;
	}
	public void setLvl2CgyId(String lvl2CgyId) {
		this.lvl2CgyId = lvl2CgyId;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
    
//    @Override
//    public String toString() {
//   	 return " [purchaseAmt=" + purchaseAmt + "]" ;
//    }

}