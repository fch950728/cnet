package com.cnet.mapper;

import org.apache.ibatis.annotations.Insert;

import com.cnet.core.domain.BrndOprtGrp;
import com.cnet.core.domain.CmdtyInfo;
import com.cnet.core.domain.ConferrenceMainTable;
import com.cnet.core.domain.PayInfo;
import com.cnet.core.domain.RtlOprtGrp;

/**
 * 数据持久层接口
 * @author zodiac
 * @version 1.0
 *
 */
public interface GraphMapper {

	// 该注解将SQL方法自动注入到对应的接口方法中去，告诉springboot这个方法执行的对应的SQL语句
	@Insert(" insert into conferrencemaintable(\r\n" + 
			"        			unnSocCrCd,	\r\n" + 
			"        			estbYrLmt,	\r\n" + 
			"        			bsnLcnsTrm,	\r\n" + 
			"        			yrOprgIncm,	\r\n" + 
			"        			empePNum,	\r\n" + 
			"        			stgNm,	\r\n" + 
			"        			stgid,	\r\n" + 
			"        			stgAdr,	\r\n" + 
			"        			entrStgNum,	\r\n" + 
			"        			lvStgNum,	\r\n" + 
			"        			quitStgNum,	\r\n" + 
			"        			cntoutNum,	\r\n" + 
			"        			bgnofprdTotNum,	\r\n" + 
			"        			eopTotNum,	\r\n" + 
			"        			alipayOpnSt,	\r\n" + 
			"        			alipayAccSt,	\r\n" + 
			"        			alipayAccno,	\r\n" + 
			"        			alipayWrntBal,	\r\n" + 
			"        			cxtOpnInd,	\r\n" + 
			"        			cxtOpnDt,	\r\n" + 
			"        			prvdGrd,	\r\n" + 
			"        			crGrd,\r\n" + 
			"        			txnMedal,	\r\n" + 
			"        			qualifiedMerchantInd,	\r\n" + 
			"        			cetInd,	\r\n" + 
			"        			depthCtfnInd,	\r\n" + 
			"        			entpCtfnInd,	\r\n" + 
			"        			lglpsnCtfnInd,	\r\n" + 
			"        			adrCtfnInd,	\r\n" + 
			"        			bscChkInd,	\r\n" + 
			"        			rjctRsn,	\r\n" + 
			"        			merchantId,	\r\n" + 
			"        			merchantInfCrtMo,	\r\n" + 
			"        			entrInd,	\r\n" + 
			"        			rtlCtrTp,	\r\n" + 
			"        			rtlCtrId,	\r\n" + 
			"        			rtlCtrSt,	\r\n" + 
			"        			rtlCtrEffTm,	\r\n" + 
			"        			rtlCtrExpTm,	\r\n" + 
			"        			rctlyLogInInd,	\r\n" + 
			"        			merchantRl,	\r\n" + 
			"        			merchantHier,	\r\n" + 
			"        			rtgTm,\r\n" + 
			"        			rghtNm,	\r\n" + 
			"        			rghtCntnt,	\r\n" + 
			"        			rskCntlMeans1,	\r\n" + 
			"        			rskCntlMeans2,	\r\n" + 
			"        			rskCntlMeans3,	\r\n" + 
			"        			rskCntlMeans4,	\r\n" + 
			"        			prpslCrline\r\n" + 
			"        )values(\r\n" + 
			"        			#{unnSocCrCd},	\r\n" + 
			"        			#{estbYrLmt},	\r\n" + 
			"        			#{bsnLcnsTrm},	\r\n" + 
			"        			#{yrOprgIncm},	\r\n" + 
			"        			#{empePNum},	\r\n" + 
			"        			#{stgNm},	\r\n" + 
			"        			#{stgid},	\r\n" + 
			"        			#{stgAdr},	\r\n" + 
			"        			#{entrStgNum},	\r\n" + 
			"        			#{lvStgNum},	\r\n" + 
			"        			#{quitStgNum},	\r\n" + 
			"        			#{cntoutNum},	\r\n" + 
			"        			#{bgnofprdTotNum},	\r\n" + 
			"        			#{eopTotNum},	\r\n" + 
			"        			#{alipayOpnSt},	\r\n" + 
			"        			#{alipayAccSt},	\r\n" + 
			"        			#{alipayAccno},	\r\n" + 
			"        			#{alipayWrntBal},	\r\n" + 
			"        			#{cxtOpnInd},	\r\n" + 
			"        			#{cxtOpnDt},	\r\n" + 
			"        			#{prvdGrd},	\r\n" + 
			"        			#{crGrd},\r\n" + 
			"        			#{txnMedal},	\r\n" + 
			"        			#{qualifiedMerchantInd},	\r\n" + 
			"        			#{cetInd},	\r\n" + 
			"        			#{depthCtfnInd},	\r\n" + 
			"        			#{entpCtfnInd},	\r\n" + 
			"        			#{lglpsnCtfnInd},	\r\n" + 
			"        			#{adrCtfnInd},	\r\n" + 
			"        			#{bscChkInd},	\r\n" + 
			"        			#{rjctRsn},	\r\n" + 
			"        			#{merchantId},	\r\n" + 
			"        			#{merchantInfCrtMo},	\r\n" + 
			"        			#{entrInd},	\r\n" + 
			"        			#{rtlCtrTp},	\r\n" + 
			"        			#{rtlCtrId},	\r\n" + 
			"        			#{rtlCtrSt},	\r\n" + 
			"        			#{rtlCtrEffTm},	\r\n" + 
			"        			#{rtlCtrExpTm},	\r\n" + 
			"        			#{rctlyLogInInd},	\r\n" + 
			"        			#{merchantRl},	\r\n" + 
			"        			#{merchantHier},	\r\n" + 
			"        			#{rtgTm},\r\n" + 
			"        			#{rghtNm},	\r\n" + 
			"        			#{rghtCntnt},	\r\n" + 
			"        			#{rskCntlMeans1},	\r\n" + 
			"        			#{rskCntlMeans2},	\r\n" + 
			"        			#{rskCntlMeans3},	\r\n" + 
			"        			#{rskCntlMeans4},	\r\n" + 
			"        			#{prpslCrline}\r\n" + 
			"        )")
    public int addConferrenceMainTable(ConferrenceMainTable conferrenceMainTable);
    
    @Insert("insert into brndoprtgrp(\r\n" + 
			"        			unnSocCrCd,\r\n" + 
			"        			stgTp,	\r\n" + 
			"        			merchantNm,	\r\n" + 
			"        			merchantId,	\r\n" + 
			"        			brndAhnprty,	\r\n" + 
			"        			brndAhnId,	\r\n" + 
			"        			brndAhnFile,	\r\n" + 
			"        			brndAhnAvldtStdt,	\r\n" + 
			"        			brndAhnAvldtEddt,	\r\n" + 
			"        			merchantDepbnkAccnm,	\r\n" + 
			"        			merchantDpbknm,	\r\n" + 
			"        			merchantDpbkbkcd,	\r\n" + 
			"        			merchantAccno,	\r\n" + 
			"        			lvl1CgyId,	\r\n" + 
			"        			lvl1CgyNm,	\r\n" + 
			"        			lvl2CgyId,	\r\n" + 
			"        			lvl2CgyNm,	\r\n" + 
			"        			oprnCptlTvrCnt                  \r\n" + 
			"        )values(\r\n" + 
			"                    #{unnSocCrCd},\r\n" + 
			"        			#{stgTp},	\r\n" + 
			"        			#{merchantNm},	\r\n" + 
			"        			#{merchantId},	\r\n" + 
			"        			#{brndAhnprty},	\r\n" + 
			"        			#{brndAhnId},	\r\n" + 
			"        			#{brndAhnFile},	\r\n" + 
			"        			#{brndAhnAvldtStdt},	\r\n" + 
			"        			#{brndAhnAvldtEddt},	\r\n" + 
			"        			#{merchantDepbnkAccnm},	\r\n" + 
			"        			#{merchantDpbknm},	\r\n" + 
			"        			#{merchantDpbkbkcd},	\r\n" + 
			"        			#{merchantAccno},	\r\n" + 
			"        			#{lvl1CgyId},	\r\n" + 
			"        			#{lvl1CgyNm},	\r\n" + 
			"        			#{lvl2CgyId},	\r\n" + 
			"        			#{lvl2CgyNm},	\r\n" + 
			"        			#{oprnCptlTvrCnt}    \r\n" + 
			"        )")
    public int addBrndOprtGr(BrndOprtGrp brndOprtGr);
    
    @Insert(" insert into payinfo(\r\n" + 
    		"        			unnSocCrCd,	\r\n" + 
    		"        			lvl1CgyId,	\r\n" + 
    		"        			lvl2CgyId,	\r\n" + 
    		"        			purchaseAmt,	\r\n" + 
    		"        			purchaseNum,	\r\n" + 
    		"        			purchaseRfndAmt,	\r\n" + 
    		"        			purchaseRfndNum,	\r\n" + 
    		"        			saleRwrd,\r\n" + 
    		"        			month\r\n" + 
    		"\r\n" + 
    		"        )values(\r\n" + 
    		"                    #{unnSocCrCd},	\r\n" + 
    		"        			#{lvl1CgyId},	\r\n" + 
    		"        			#{lvl2CgyId},	\r\n" + 
    		"        			#{purchaseAmt},	\r\n" + 
    		"        			#{purchaseNum},	\r\n" + 
    		"        			#{purchaseRfndAmt},	\r\n" + 
    		"        			#{purchaseRfndNum},	\r\n" + 
    		"        			#{saleRwrd},\r\n" + 
    		"        			#{month}   \r\n" + 
    		"        )")
    public int addPayInfo(PayInfo payInfo);
    
    @Insert("insert into rtloprtgrp(\r\n" + 
    		"        			unnSocCrCd,	\r\n" + 
    		"        			brndNm,	\r\n" + 
    		"        			brndid,	\r\n" + 
    		"        			lvl1CgyId,	\r\n" + 
    		"        			lvl1CgyNm,	\r\n" + 
    		"        			lvl2CgyId,	\r\n" + 
    		"        			lvl2CgyNm,	\r\n" + 
    		"        			oprnCptlTvrCnt\r\n" + 
    		"        )values(\r\n" + 
    		"        			#{unnSocCrCd},	\r\n" + 
    		"        			#{brndNm},	\r\n" + 
    		"        			#{brndid},	\r\n" + 
    		"        			#{lvl1CgyId},	\r\n" + 
    		"        			#{lvl1CgyNm},	\r\n" + 
    		"        			#{lvl2CgyId},	\r\n" + 
    		"        			#{lvl2CgyNm},	\r\n" + 
    		"        			#{oprnCptlTvrCnt}\r\n" + 
    		"        )")
    public int addRtlOprtGrp(RtlOprtGrp rtlOprtGrp);
    
    @Insert("insert into cmdtyinfo(\r\n" + 
    		"        			unnSocCrCd,	\r\n" + 
    		"        			lvl1CgyId,	\r\n" + 
    		"        			lvl2CgyId,	\r\n" + 
    		"        			cmdtySaleAmt,	\r\n" + 
    		"        			cmdtySaleNum,	\r\n" + 
    		"        			cmdtyRfndAmt,	\r\n" + 
    		"        			cmdtyRfndNum,	\r\n" + 
    		"        			alrdyCvrSmlNum,	\r\n" + 
    		"        			marketNum,	\r\n" + 
    		"        			accentramt,	\r\n" + 
    		"        			cmdtyCmsn,	\r\n" + 
    		"        			lgstcCmsn,	\r\n" + 
    		"        			cplnRate,\r\n" + 
    		"        			month\r\n" + 
    		"        )values(\r\n" + 
    		"                    #{unnSocCrCd},	\r\n" + 
    		"        			#{lvl1CgyId},	\r\n" + 
    		"        			#{lvl2CgyId},	\r\n" + 
    		"        			#{cmdtySaleAmt},	\r\n" + 
    		"        			#{cmdtySaleNum},	\r\n" + 
    		"        			#{cmdtyRfndAmt},	\r\n" + 
    		"        			#{cmdtyRfndNum},	\r\n" + 
    		"        			#{alrdyCvrSmlNum},	\r\n" + 
    		"        			#{marketNum},	\r\n" + 
    		"        			#{accentramt},	\r\n" + 
    		"        			#{cmdtyCmsn},	\r\n" + 
    		"        			#{lgstcCmsn},	\r\n" + 
    		"        			#{cplnRate},\r\n" + 
    		"        			#{month}\r\n" + 
    		"        )")
    public int addCmdtyInfo(CmdtyInfo cmdtyInfo);
}
