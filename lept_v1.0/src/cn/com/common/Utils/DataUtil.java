package cn.com.common.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @ProjectName: lept_v1.0
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @FileName:  DataUtil.java
 * @Create DateTime: 2016年8月19日 下午2:37:44
 * @Version: V1.0
 * @author 蔡伟乐
 * @Others: 
 */
public class DataUtil {
	
	/**
	 * @title: formatString
	 * @description: TODO 将指定的数据格式化为字符串
	 * @param obj
	 * @return
	 * @throw 
	 * @date 2016年8月19日 下午2:41:37 创建  蔡伟乐
	 */
	public static String formatString(Object obj){
		if(obj!=null){
			return obj.toString().trim();
		}
		return null;
	}
	/**
	 * @title: formatInteger
	 * @description: TODO 将指定的object格式化为数字
	 * @param obj
	 * @return
	 * @throw 
	 * @date 2016年8月19日 下午2:52:09 创建  蔡伟乐
	 */
	public static Integer formatInteger(Object obj) {
		if (null != obj) {
			return Integer.valueOf(obj + "");
		}
		return 0;
	}
	/**
	 * @title: formatDouble
	 * @description: TODO 将指定的数据格式化为double
	 * @param obj
	 * @return
	 * @throw 
	 * @date 2016年8月19日 下午2:42:51 创建  蔡伟乐
	 */
	public static Double formatDouble(Object obj){
		if(obj!=null){
			return Double.valueOf(obj.toString());
		}
		return null;
	}
	/**
	 * @title: formatFloat
	 * @description: TODO 将指定的数据格式化为Float
	 * @param obj
	 * @return
	 * @throw 
	 * @date 2016年8月19日 下午2:43:22 创建  蔡伟乐
	 */
	public static Float formatFloat(Object obj){
		if(obj!=null){
			return Float.parseFloat(obj.toString());
		}
		return null;
	}
	
	/**
	 * @title: toDate
	 * @description: TODO 将指定的格式的字符串格式化为日期
	 * @param obj 日期字符串
	 * @param format 字符串日期格式
	 * @return
	 * @throw 
	 * @date 2016年8月19日 下午2:46:14 创建  蔡伟乐
	 */
	public static synchronized Date toDate(Object obj,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.US);
		if(null!=obj&&!"".equals(obj)){
			try {
				return sdf.parse(obj+"");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * @title: formatDate
	 * @description: TODO 格式化日期
	 * @param date
	 * @param format 日期格式
	 * @return
	 * @throw 
	 * @date 2016年8月19日 下午2:51:25 创建  蔡伟乐
	 */
	public static String formatDate(Date date,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if(date!=null){
			return sdf.format(date);
		}
		return null;
	}
	/**
	 * @title: formatDate
	 * @description: TODO 格式化日期，默认 yyyy-MM-dd HH:mm:ss
	 * @param date 
	 * @return
	 * @throw 
	 * @date 2016年8月19日 下午2:51:25 创建  蔡伟乐
	 */
	public static String formatDate(Date date){
		String format = "yyyy-MM-dd HH:mm:ss";
		return formatDate(date,format);
	}
}
