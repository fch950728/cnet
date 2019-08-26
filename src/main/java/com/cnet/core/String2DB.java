package com.cnet.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cnet.core.domain.BrndOprtGrp;
import com.cnet.core.domain.CmdtyInfo;
import com.cnet.core.domain.ConferrenceMainTable;
import com.cnet.core.domain.PayInfo;
import com.cnet.core.domain.RtlOprtGrp;
import com.cnet.core.scheme.Admission;
import com.cnet.core.scheme.AmtCalculate;
import com.cnet.service.GraphService;

import java.io.PrintWriter;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.Before;
//import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 数据处理、保存及额度测算类
 * @author zodiac
 * @version 1.0
 *
 */
public class String2DB {
	
	private static Logger log = Logger.getLogger(String2DB.class);
	
	//将str转换成JSONObjct格式
		public static String string2DB(String str, GraphService graphService, boolean savedata){
			
				// html文件是专门用来放置返回给客户端的页面的
				StringBuilder html = new StringBuilder();
				
				/**
				html.append("<html>\n");
				html.append("<head>\n");
				html.append("<title>准入判断及额度测算结果</title>\n");
				html.append("<meta content='text/html;charset=utf-8'/>\n");
				html.append("</head>\n");
				html.append("<body>\n");
				**/

			 
//				str = "{\"Data\":{\"Tpl_Vno\":\"1.0\",\"Entp_Sz_Cd\":\"40\",\"Urbn_Cd\":\"330100\",\"Chnl_TpCd\":\"5000\",\"EntNm\":\"成都市西格格玛贸易有限公司\",\"Txn_Chnl_ID\":\"500010\",\"Chnl_Id\":\"976\",\"App_Id\":\"2336762\",\"TermTp\":\"10\",\"Txn_Cd\":\"IFSPLnLmtEst\",\"Usr_ID\":\"ZF0028529040l\",\"Ln_CardNo_CD\":\"N\",\"Unn_Soc_Cr_Cd\":\"91510108MA6DDX5J8R\",\"CpCt_TpCd\":\"010100\",\"CrgSrcGrp\":[{\"Cr_Vrty_Cd_Dsc\":\"X15\",\"Aply_DItm_Cntnt\":\"{\\\"empePNum\\\":\\\"39\\\",\\\"prpslCrline\\\":1.058373816E7,\\\"bscChkInd\\\":\\\"N\\\",\\\"qualifiedMerchantInd\\\":\\\"N\\\",\\\"lglpsnCtfnInd\\\":\\\"N\\\",\\\"stgNm\\\":\\\"N\\\",\\\"rtlCtrExpTm\\\":\\\"19000101\\\",\\\"merchantId\\\":\\\"N\\\",\\\"eopTotNum\\\":0,\\\"rtlCtrId\\\":\\\"N\\\",\\\"cetInd\\\":\\\"N\\\",\\\"cntoutNum\\\":0,\\\"rghtCntnt\\\":\\\"N\\\",\\\"depthCtfnInd\\\":\\\"N\\\",\\\"alipayAccSt\\\":0,\\\"cpyModlGrp\\\":[{\\\"svcCpyScor\\\":-99.0,\\\"cmdtyCpyAvrgScor\\\":-99.0,\\\"cmdtyCpyScor\\\":-99.0,\\\"txnCpyAvrgScor\\\":-99.0,\\\"txnCpyScor\\\":-99.0,\\\"baseCpyScor\\\":-99.0,\\\"svcCpyAvrgScor\\\":-99.0,\\\"baseCpyAvrgScor\\\":-99.0}],\\\"adrCtfnInd\\\":\\\"N\\\",\\\"alipayWrntBal\\\":0.0,\\\"merchantHier\\\":\\\"4\\\",\\\"estbYrLmt\\\":\\\"20170704\\\",\\\"merchantRl\\\":\\\"N\\\",\\\"rskCntlMeans1\\\":\\\"Y\\\",\\\"txnMedal\\\":\\\"N\\\",\\\"alipayOpnSt\\\":0,\\\"rskCntlMeans2\\\":\\\"Y\\\",\\\"rskCntlMeans3\\\":\\\"Y\\\",\\\"quitStgNum\\\":0,\\\"rskCntlMeans4\\\":\\\"N\\\",\\\"cxtOpnDt\\\":\\\"19000101\\\",\\\"bsnLcnsTrm\\\":\\\"30181023\\\",\\\"crGrd\\\":\\\"N\\\",\\\"rtgTm\\\":\\\"19000101\\\",\\\"yrOprgIncm\\\":69332256.91,\\\"rghtNm\\\":\\\"N\\\",\\\"cpyTotGrdGrp\\\":[{\\\"cpyTotGrd\\\":-99.0}],\\\"stgid\\\":\\\"N\\\",\\\"rctlyLogInInd\\\":\\\"N\\\",\\\"entpCtfnInd\\\":\\\"N\\\",\\\"rtlCtrSt\\\":\\\"N\\\",\\\"brndOprtGrp\\\":[{\\\"oprnCptlTvrCnt\\\":45,\\\"brndAhnAvldtStdt\\\":\\\"19000101\\\",\\\"brndAhnprty\\\":\\\"蒙牛\\\",\\\"merchantAccno\\\":\\\"11014593480009\\\",\\\"brndAhnFile\\\":\\\"N\\\",\\\"stgTp\\\":\\\"1\\\",\\\"lvl1CgyId\\\":\\\"127234017\\\",\\\"merchantDepbnkAccnm\\\":\\\"蒙牛高科乳制品(北京)有限责任公司\\\",\\\"lvl1CgyNm\\\":\\\"饮料/乳品/水\\\",\\\"merchantDpbkbkcd\\\":\\\"307585005028\\\",\\\"merchantNm\\\":\\\"蒙牛乳业mn\\\",\\\"brndAhnId\\\":\\\"N\\\",\\\"merchantId\\\":\\\"3486083569\\\",\\\"brndAhnAvldtEddt\\\":\\\"19000101\\\",\\\"lvl2CgyNm\\\":\\\"N\\\",\\\"merchantDpbknm\\\":\\\"平安银行珠海分行营业部\\\",\\\"lvl2CgyId\\\":\\\"N\\\",\\\"payInfo\\\":[{\\\"purchaseAmt\\\":5026632.87,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":2918463.3,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":5447883.42,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":1302515.79,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":2347582.34,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":1902757.6,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":4360309.58,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":6988137.75,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":4901272.53,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":5167414.4,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":5771618.05,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":9168078.88,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":7572242.24,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":6408972.04,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":5010448.97,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":2809008.27,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":3872012.05,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":3254561.9,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":9872995.49,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":4027754.4,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":6724695.73,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":7846583.78,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":7792127.91,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0},{\\\"purchaseAmt\\\":4140854.13,\\\"purchaseRfndNum\\\":0,\\\"purchaseNum\\\":0,\\\"saleRwrd\\\":0.0,\\\"purchaseRfndAmt\\\":0.0}]}],\\\"entrInd\\\":\\\"N\\\",\\\"bgnofprdTotNum\\\":0,\\\"entrStgNum\\\":0,\\\"rtlCtrEffTm\\\":\\\"19000101\\\",\\\"rtlOprtGrp\\\":[{\\\"brndNm\\\":\\\"N\\\",\\\"oprnCptlTvrCnt\\\":0,\\\"brndid\\\":\\\"N\\\",\\\"cmdtyInfo\\\":[{\\\"cmdtyRfndNum\\\":0,\\\"cmdtySaleNum\\\":0,\\\"accentramt\\\":0.0,\\\"alrdyCvrSmlNum\\\":0,\\\"cplnRate\\\":0.0,\\\"cmdtyRfndAmt\\\":0.0,\\\"cmdtyCmsn\\\":0.0,\\\"lgstcCmsn\\\":0.0,\\\"cmdtySaleAmt\\\":0.0,\\\"marketNum\\\":0}],\\\"lvl1CgyId\\\":\\\"N\\\",\\\"lvl2CgyNm\\\":\\\"N\\\",\\\"lvl1CgyNm\\\":\\\"N\\\",\\\"lvl2CgyId\\\":\\\"N\\\"}],\\\"prvdGrd\\\":\\\"N\\\",\\\"stgAdr\\\":\\\"N\\\",\\\"alipayAccno\\\":\\\"N\\\",\\\"cxtOpnInd\\\":\\\"N\\\",\\\"rjctRsn\\\":\\\"[]\\\",\\\"merchantInfCrtMo\\\":\\\"19000101\\\",\\\"lvStgNum\\\":0,\\\"rtlCtrTp\\\":\\\"N\\\",\\\"unnSocCrCd\\\":\\\"91510108MA6DDX5J8R\\\"}\"}]}}\r\n" + 
//						"";
				
				// 将数据转化为JSON对象，并提取关键信息
				JSONObject json = JSON.parseObject(str);
				JSONObject data = json.getJSONObject("Data");
				JSONArray crgSrcGrp = data.getJSONArray("CrgSrcGrp");
				
				for(int i = 0; i < crgSrcGrp.size(); i++)
				{
					JSONObject info = crgSrcGrp.getJSONObject(i);
					JSONObject content = info.getJSONObject("Aply_DItm_Cntnt");

					// 将JSON对象信息抽取并转化到类实体中
					ConferrenceMainTable table1 = JSON.parseObject(content.toString(), ConferrenceMainTable.class);
					//增加子表的主键
					addTheMainKey(table1);

					
					/**
					 * 准入与额度测算
					 */
					if(Admission.admission(table1, html)==true) {
						AmtCalculate.amtCalculate(table1, html); 
					}
					
					if (savedata == true)
					{
						try {
							//　添加数据到数据库中
							int a=0;
							int b = 0;
							int c=0;
							int d=0;
							int e=0;
							a=graphService.addConferrenceMainTable(table1);
							for (BrndOprtGrp t : table1.getBrndOprtGrp())
							{
								b=graphService.addBrndOprtGr(t);
								for (PayInfo r : t.getPayInfo())
								{
									c=graphService.addPayInfo(r);
								}
							}
							
							for (RtlOprtGrp t : table1.getRtlOprtGrp())
							{
								d = graphService.addRtlOprtGrp(t);
								for (CmdtyInfo r : t.getCmdtyInfo())
								{
									e = graphService.addCmdtyInfo(r);
								}
							}
							
							System.out.println("主表："+a+";品牌商:"+b+";采购信息："+c+";零售通:"+d+"零售详情:"+e);
						} catch (Exception e) {
							log.info("数据有误，无法加入数据库");
							html.append("数据有误，无法加入数据库");
							html.append("\n");
						}
					}
				}
				
				/**
				html.append("</body>\n");
				html.append("</html>\n");
				**/
				
				return(html.toString());
			}

		/**
		 * 为子表增加主键
		 * @param table1
		 * @author zodiac
		 * @version 1.0
		 * @since 1.0
		 */
		private static void addTheMainKey(ConferrenceMainTable table1) {
			for (BrndOprtGrp a : table1.getBrndOprtGrp())
			{
				a.setUnnSocCrCd(table1.getUnnSocCrCd());
				int len = a.getPayInfo().size();
				for (PayInfo b : a.getPayInfo())
				{
					b.setMonth(len--);
					b.setUnnSocCrCd(a.getUnnSocCrCd());
					b.setLvl1CgyId(a.getLvl1CgyId());
					b.setLvl2CgyId(a.getLvl2CgyId());
				}
			}
			
			for (RtlOprtGrp a : table1.getRtlOprtGrp())
			{
				a.setUnnSocCrCd(table1.getUnnSocCrCd());
				int len = a.getCmdtyInfo().size();
				for (CmdtyInfo b : a.getCmdtyInfo())
				{
					b.setMonth(len--);
					b.setUnnSocCrCd(a.getUnnSocCrCd());
					b.setLvl1CgyId(a.getLvl1CgyId());
					b.setLvl2CgyId(a.getLvl2CgyId());
				}
			}
		}

}
