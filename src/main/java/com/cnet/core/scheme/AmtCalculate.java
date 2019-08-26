package com.cnet.core.scheme;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnet.core.domain.BrndOprtGrp;
import com.cnet.core.domain.CmdtyInfo;
import com.cnet.core.domain.ConferrenceMainTable;
import com.cnet.core.domain.PayInfo;

/**
 * 准入后额度测算
 * @author ccb.zr
 * @version 1.0
 * @since 1.0
 */
public class AmtCalculate {
  private static Logger log = Logger.getLogger(AmtCalculate.class);

  public static void amtCalculate(ConferrenceMainTable table1, StringBuilder html) {
    double LastPurAmt=0;//去年采购金额
    double SameLastPurAmt=0;//去年同时期的采购金额
    double BeforLastPurAmt=0;//前年采购金额
    double LastPurAmtRate=0;//去年的采购增长率
    double LastRfndAmt=0;//去年的退款金额
    double LastRfndAmtRate=0;//去年的退款率
    double AmtNeed=0;//单一品类资金需求
    double SumAmtNeed=0;//所有品类资金需求

    double D21=0;
    double D22=0;
    double D23=0;
    double RtSaleRate=0;//零售通销售占比
    double RtSale11=0;//一个月所有品类零售通销售金额
    double RtSale1=0;//最少月数所有品类零售通销售金额
    double RtSale22=0;//一个月所有品类品牌商采购金额
    double RtSale2=0;//最少月数所有品类品牌商采购金额
    double D3=0;
    double a=0;//风控因子a
    double CreditAmt=0;
        
    /*
     * 调整系数a
     */
    //企业因子a1
    double D1=Integer.parseInt(table1.getMerchantHier());
    if(D1==1) {
      D1=1;
    }
    if(D1==2) {
      D1=0.8;
    }
    else
      D1=0.5;
    double a1=D1*0.3;//企业因子a1
    
    //风控因子a2
    if(table1.getRskCntlMeans1().equals("Y")) {
      D21=0.3;
    }
    if(table1.getRskCntlMeans4().equals("Y")) {
      D22=0.4;
    }
    if(table1.getRskCntlMeans2().equals("Y")) {
      D23=0.3;
    }
    double a2=(D21+D22+D23)*0.4;//风控因子a2
    
    //风控因子a3：零售通销售占比
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<table1.getBrndOprtGrp().size();i++) {//所有品类    
      arr.add(table1.getRtlOprtGrp().get(i).getCmdtyInfo().size());    
      }    
    Collections.sort(arr);
    
    //零售通最少月份销售金额
    for(int j=0;j<arr.get(0);j++) {//以零售通最小月份数为准
      for(int i=0;i<table1.getBrndOprtGrp().size();i++) {//一个月份数中所有品类相加    
        List<CmdtyInfo> m1=table1.getRtlOprtGrp().get(i).getCmdtyInfo();
        RtSale11+= m1.get(arr.get(0)-1-j).getCmdtySaleAmt();//一个月所有品类零售通销售金额
      }
      RtSale1+=RtSale11;//最少月份中所有品类零售通销售金额
    }  
    
    //品牌商最少月份采购金额
    for(int j=0;j<arr.get(0);j++) {//以零售通最小月份数为准
      for(int i=0;i<table1.getBrndOprtGrp().size();i++) {//一个月份数中所有品类相加    
        List<PayInfo> m2=table1.getBrndOprtGrp().get(i).getPayInfo();    
        RtSale22+= m2.get(arr.get(0)-1-j).getPurchaseAmt();//一个月所有品类品牌商采购金额
      }
      RtSale2+=RtSale22;//最少月份中所有品类品牌商采购金额
    }
    
    if(RtSale2*0.05<=RtSale1) {
      D3=1;
    }
    if((RtSale2*0.01<=RtSale1)&&(RtSale2*0.05>RtSale1)) {
      D3=0.6;
    }
    if(RtSale2*0.01>RtSale1) {
      D3=0.3;
    }
//    RtSaleRate=RtSale1/RtSale2;//零售通销售占比
    
//    if((RtSaleRate>=0.05)&&(RtSaleRate<1)) {
//      D3=1;
//    }
//    if((RtSaleRate>=0.01)&&(RtSaleRate<0.05)) {
//      D3=0.6;
//    }
//    if((RtSaleRate>=0)&&(RtSaleRate<0.01)) {
//      D3=0.3;
//    }
    double a3=D3*0.3;//风控因子a3：零售通销售占比
    
    a=a1+a2+a3;//风控因子
    
    /*
     * 所有品类资金需求量
     */
    for(int i=0;i<table1.getBrndOprtGrp().size();i++) {//品牌种类getBrndOprtGrp().size()
      List<PayInfo> b=table1.getBrndOprtGrp().get(i).getPayInfo();//取出一品牌的采购信息
//      List<CmdtyInfo> m1=table1.getRtlOprtGrp().get(i).getCmdtyInfo();
      for(int j=0;j<b.size()-12;j++) {//去年同时期采购金额
        SameLastPurAmt+=b.get(b.size()-1-j).getPurchaseAmt();
      }
      for(int j=12;j<b.size();j++) {
        BeforLastPurAmt+=b.get(b.size()-1-j).getPurchaseAmt();//前年采购金额
      }
      
      
      LastPurAmtRate=(SameLastPurAmt-BeforLastPurAmt)/BeforLastPurAmt;//去年的采购增长率
      
      for(int j=0;j<12;j++) {
        LastPurAmt+=b.get(b.size()-1-j).getPurchaseAmt();//去年总的采购金额
      }
      
      for(int j=0;j<12;j++) {
        LastRfndAmt+=b.get(b.size()-1-j).getPurchaseRfndAmt();//去年的退款金额
      }
        LastRfndAmtRate=LastRfndAmt/LastPurAmt;//去年的退款率
        AmtNeed=SameLastPurAmt*(1+LastPurAmtRate)*(1-LastRfndAmtRate)/opNum(i,table1);//单一品类资金需求量=前一年采购成本*（1+前一年采购成本增长率）*（1-前一年退货率）/营运资金周转次数
        SumAmtNeed+=AmtNeed;//所有品类资金需求量
    }
    
    
    /*
     * 经销商授信额度
     */
    CreditAmt=SumAmtNeed*((1-0.2)*a);
    DecimalFormat df = new DecimalFormat("#.##");
    String CreditAmtstr = df.format(CreditAmt);
    log.info("授信额度："+CreditAmtstr);//授信额度
    html.append("授信额度："+CreditAmtstr);
    html.append("\n");

  }
  /*
   * 运营资金周转次数，默认8.1
   */
  public static double opNum(int t,ConferrenceMainTable table1){  
//    double sumn1=0;
    double avgn1=0;
    double sumn2=0;
    double avgn2=0;
    //零售通平均运营资金周转次数
    for(int i=0;i<table1.getRtlOprtGrp().size();i++) {
      double d2=table1.getRtlOprtGrp().get(i).getOprnCptlTvrCnt();//取出一品牌商运营资金周转天数
      double n2=8.1;
      if(d2!=0) {
        n2=365/d2;
      }
       
      sumn2+=n2;
    }
    avgn2=sumn2/table1.getRtlOprtGrp().size();//零售通平均运营资金周转次数
    
    //品牌商每一品类运营资金周转次数
      double d1=table1.getBrndOprtGrp().get(t).getOprnCptlTvrCnt();//取出一品牌商运营资金周转天数
      if(d1==0) {
        d1= 8.1;
      }
      avgn1=365/d1;
    
    //  运营资金周转次数:8.1,avgn1,avgn2三者取最大  
    //  max=(a>b?a:b)>c?(a>b?a:b):c;
    double opnum=(avgn1>avgn2?avgn1:avgn2)>8.1?(avgn1>avgn2?avgn1:avgn2):8.1;
    return opnum;
  }

}