package com.cnet.core.domain;

import java.util.List;

/**
* 零售通信息表
* @author zodiac
* @version 1.0
* @since 1.0
*/
public class RtlOprtGrp {

   private String brndNm;
   private int oprnCptlTvrCnt;
   private String brndid;
   private List<CmdtyInfo> cmdtyInfo;
   private String lvl1CgyId;
   private String lvl2CgyNm;
   private String lvl1CgyNm;
   private String lvl2CgyId;
   private String unnSocCrCd;
   
   public void setBrndNm(String brndNm) {
        this.brndNm = brndNm;
    }
    public String getBrndNm() {
        return brndNm;
    }

   public void setOprnCptlTvrCnt(int oprnCptlTvrCnt) {
        this.oprnCptlTvrCnt = oprnCptlTvrCnt;
    }
    public int getOprnCptlTvrCnt() {
        return oprnCptlTvrCnt;
    }

   public void setBrndid(String brndid) {
        this.brndid = brndid;
    }
    public String getBrndid() {
        return brndid;
    }

   public void setCmdtyInfo(List<CmdtyInfo> cmdtyInfo) {
        this.cmdtyInfo = cmdtyInfo;
    }
    public List<CmdtyInfo> getCmdtyInfo() {
        return cmdtyInfo;
    }

   public void setLvl1CgyId(String lvl1CgyId) {
        this.lvl1CgyId = lvl1CgyId;
    }
    public String getLvl1CgyId() {
        return lvl1CgyId;
    }

   public void setLvl2CgyNm(String lvl2CgyNm) {
        this.lvl2CgyNm = lvl2CgyNm;
    }
    public String getLvl2CgyNm() {
        return lvl2CgyNm;
    }

   public void setLvl1CgyNm(String lvl1CgyNm) {
        this.lvl1CgyNm = lvl1CgyNm;
    }
    public String getLvl1CgyNm() {
        return lvl1CgyNm;
    }

   public void setLvl2CgyId(String lvl2CgyId) {
        this.lvl2CgyId = lvl2CgyId;
    }
    public String getLvl2CgyId() {
        return lvl2CgyId;
    }
	public String getUnnSocCrCd() {
		return unnSocCrCd;
	}
	public void setUnnSocCrCd(String unnSocCrCd) {
		this.unnSocCrCd = unnSocCrCd;
	}

}