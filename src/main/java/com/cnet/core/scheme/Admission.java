package com.cnet.core.scheme;

import org.apache.log4j.Logger;

import com.cnet.core.domain.ConferrenceMainTable;


/**
 * 准入判断方法类
 * @author ccb.zr
 * @version 1.0
 * @since 1.0
 *
 */
public class Admission {
	
	private static Logger log = Logger.getLogger(Admission.class);
	/**
	 * 准入判断方法
	 * @param table1
	 * @return
	 */
	public static boolean admission(ConferrenceMainTable table1, StringBuilder html) {
		
		
		if(Integer.parseInt(DateUtil.getCurrDateStr()) - Integer.parseInt(table1.getEstbYrLmt())<20000) {//获取当前日期减去传入日期
			log.info("拒绝!"+"原因:成立年限不满足");
			html.append("拒绝!"+"原因:成立年限不满足");
			html.append("\n");
			return false;
		}
		
		if((Integer.parseInt(table1.getEmpePNum())>=20)&&(table1.getYrOprgIncm()>=50000000)) {//类型转换
			log.info("拒绝!"+"原因:四部委规模不满足");
			html.append("拒绝!"+"原因:四部委规模不满足");
			html.append("\n");
			return false;
		}
//		报文中没有芝麻信用内容
		if(Integer.parseInt(DateUtil.getCurrDateStr())>Integer.parseInt(table1.getBsnLcnsTrm())) {//若贷款申请日在营业期限之后，则不准入
			log.info("拒绝!"+"原因:贷款申请日在营业期限之后");
			html.append("拒绝!"+"原因:贷款申请日在营业期限之后");
			html.append("\n");
			return false;
		}
		if(table1.getBscChkInd()=="Y") {
			log.info("拒绝!"+"原因:初审意见不满足");
			html.append("拒绝!"+"原因:初审意见不满足");
			html.append("\n");
			return false;
		}
		if((table1.getCpyTotGrdGrp().get(0).getCpyTotGrd()>=0) && (table1.getCpyTotGrdGrp().get(0).getCpyTotGrd()<=20)) {
			log.info("拒绝!"+"原因:能力总分不满足");
			html.append("拒绝!"+"原因:能力总分不满足");
			html.append("\n");
			return false;
		}
		if(table1.getRskCntlMeans3()=="N") {
			log.info("拒绝!"+"原因:风控准入不满足");
			html.append("拒绝!"+"原因:风控准入不满足");
			html.append("\n");
			return false;
		}
		if(table1.getBrndOprtGrp().get(0).getPayInfo().size()<13) {
			log.info("拒绝!"+"原因:品牌商交易采购信息组没有超过12个月的信息");
			html.append("拒绝!"+"原因:品牌商交易采购信息组没有超过12个月的信息");
			html.append("\n");
			return false;
		}
		
		return true;
	}
}
