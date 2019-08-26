package com.cnet.core.domain;

/**
* 商品销售信息表
* @author zodiac
* @version 1.0
* @since 1.0
*/
public class CmdtyInfo {

   private int cmdtyRfndNum;
   private int cmdtySaleNum;
   private int accentramt;
   private int alrdyCvrSmlNum;
   private int cplnRate;
   private int cmdtyRfndAmt;
   private int cmdtyCmsn;
   private int lgstcCmsn;
   private int cmdtySaleAmt;
   private int marketNum;
   private String unnSocCrCd;
   private String lvl1CgyId;
   private String lvl2CgyId;   
   private int month;
   
   public void setCmdtyRfndNum(int cmdtyRfndNum) {
        this.cmdtyRfndNum = cmdtyRfndNum;
    }
    public int getCmdtyRfndNum() {
        return cmdtyRfndNum;
    }

   public void setCmdtySaleNum(int cmdtySaleNum) {
        this.cmdtySaleNum = cmdtySaleNum;
    }
    public int getCmdtySaleNum() {
        return cmdtySaleNum;
    }

   public void setAccentramt(int accentramt) {
        this.accentramt = accentramt;
    }
    public int getAccentramt() {
        return accentramt;
    }

   public void setAlrdyCvrSmlNum(int alrdyCvrSmlNum) {
        this.alrdyCvrSmlNum = alrdyCvrSmlNum;
    }
    public int getAlrdyCvrSmlNum() {
        return alrdyCvrSmlNum;
    }

   public void setCplnRate(int cplnRate) {
        this.cplnRate = cplnRate;
    }
    public int getCplnRate() {
        return cplnRate;
    }

   public void setCmdtyRfndAmt(int cmdtyRfndAmt) {
        this.cmdtyRfndAmt = cmdtyRfndAmt;
    }
    public int getCmdtyRfndAmt() {
        return cmdtyRfndAmt;
    }

   public void setCmdtyCmsn(int cmdtyCmsn) {
        this.cmdtyCmsn = cmdtyCmsn;
    }
    public int getCmdtyCmsn() {
        return cmdtyCmsn;
    }

   public void setLgstcCmsn(int lgstcCmsn) {
        this.lgstcCmsn = lgstcCmsn;
    }
    public int getLgstcCmsn() {
        return lgstcCmsn;
    }

   public void setCmdtySaleAmt(int cmdtySaleAmt) {
        this.cmdtySaleAmt = cmdtySaleAmt;
    }
    public int getCmdtySaleAmt() {
        return cmdtySaleAmt;
    }

   public void setMarketNum(int marketNum) {
        this.marketNum = marketNum;
    }
    public int getMarketNum() {
        return marketNum;
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

	
}