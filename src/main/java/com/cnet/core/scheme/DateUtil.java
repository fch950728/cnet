package com.cnet.core.scheme;




import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * @author ccb.zr
 *
 */
public class DateUtil {

	
	/**
	 * 
	 * 获取当前时间
	 * @return 时间输出格式 yyyyMMdd
	 */
	public static String getCurrDateStr() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date currentTimeNow = new Date();
		String currentDate = formatter.format(currentTimeNow);
		return currentDate;
	} 
	
	/**
	 * 
	 * ��ȡǰһ��ʱ���������
	 * @return ��ʽ�����������ʾyyyyMMdd
	 */
	public static String getBeforeDateStr() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date currentTimeNow = new Date();
		long beforeTime = currentTimeNow.getTime()-(3600 * 24 * 1000);
		Date beforeDt = new Date(beforeTime);
		String beforeDtStr = formatter.format(beforeDt);
		return beforeDtStr;
	} 
	
	/**
	 * 
	 * ��ȡ��ǰʱ���������
	 * @return ��ʽ�����������ʾyyyy-MM-dd
	 * @return
	 */
	public static String getCurrDateStr2() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date currentTimeNow = new Date();
		String currentDate = formatter.format(currentTimeNow);
		return currentDate;
	}
	
	/**
	 * 
	 * ��ȡ��ǰʱ���������ʱ�������
	 * @return ��ʽ�����������ʾyyyyMMddHHmmss
	 * @return
	 */
	public static String getCurrTimeStr() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		Date currentTimeNow = new Date();
		String currentTime = formatter.format(currentTimeNow);
		return currentTime;
	} 
	
	/**
	 * �����������������
	 * @param sd
	 *            ��ʼ���ڣ���ʽyyyy-MM-dd
	 * @param ed
	 *            ��ֹ���ڣ���ʽyyyy-MM-dd
	 * @return ���������������
	 */
	public static long getIntervalDays(String sd, String ed) {
		return ((java.sql.Date.valueOf(ed)).getTime() - (java.sql.Date
				.valueOf(sd)).getTime())
				/ (3600 * 24 * 1000);
	}

	/**
	 * ��ʼ����yyyy-MM����ֹ��yyyy-MM֮���ȵ�������
	 * @param beginMonth
	 *            ��ʽΪyyyy-MM
	 * @param endMonth
	 *            ��ʽΪyyyy-MM
	 * @return ������
	 */
	public static int getInterval(String beginMonth, String endMonth) {
		int intBeginYear = Integer.parseInt(beginMonth.substring(0, 4));
		int intBeginMonth = Integer.parseInt(beginMonth.substring(beginMonth
				.indexOf("-") + 1));
		int intEndYear = Integer.parseInt(endMonth.substring(0, 4));
		int intEndMonth = Integer.parseInt(endMonth.substring(endMonth
				.indexOf("-") + 1));
		return ((intEndYear - intBeginYear) * 12)
				+ (intEndMonth - intBeginMonth) + 1;
	}
	
	/**
	 * ��ʽ��������ʾ��ʽ
	 * 
	 * @param sdate
	 *            ԭʼ���ڸ�ʽ s - ��ʾ "yyyy-mm-dd" ��ʽ�����ڵ� String ����
	 * @param format
	 *            ��ʽ�������ڸ�ʽ
	 * @return ��ʽ�����������ʾ
	 */
	public static String dateFormat(String sdate, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		java.sql.Date date = java.sql.Date.valueOf(sdate);
		String dateString = formatter.format(date);
		return dateString;
	}
	
	/**
	 * �ж�һ�������Ƿ��ڿ�ʼ���ںͽ�������֮�䡣
	 * 
	 * @param srcDate
	 *            Ŀ������ yyyy/MM/dd ���� yyyy-MM-dd
	 * @param startDate
	 *            ��ʼ���� yyyy/MM/dd ���� yyyy-MM-dd
	 * @param endDate
	 *            �������� yyyy/MM/dd ���� yyyy-MM-dd
	 * @return ���ڵ��ڿ�ʼ����С�ڵ��ڽ������ڣ���ô����true�����򷵻�false
	 */
	public static boolean isInStartEnd(String srcDate, String startDate,
			String endDate) {
		if (startDate.compareTo(srcDate) <= 0
				&& endDate.compareTo(srcDate) >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
