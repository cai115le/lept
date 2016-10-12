package cn.com.lept.test.test;

import java.util.Date;
import java.util.Map;

import net.sf.json.JSONObject;
import cn.com.common.Utils.BeanMapUtil;
import cn.com.common.Utils.DataUtil;
import cn.com.lept.test.model.User;

/**
 * @ProjectName: lept_v1.0
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @FileName:  Test.java
 * @Create DateTime: 2016年8月19日 下午3:35:03
 * @Version: V1.0
 * @author 蔡伟乐
 * @Others: 
 */
@SuppressWarnings("rawtypes")
public class Test {
	@org.junit.Test
	public void datautil(){
		Date str1 = DataUtil.toDate("Fri Aug 19 15:14:41 CST 2016", "EEE MMM dd HH:mm:ss z yyyy");
		System.out.println(str1);
		Date str2 = DataUtil.toDate("19/03/2016 15:45:26", "dd/MM/yyyy hh:mm:ss");
		System.out.println(str2);
		String str3 = DataUtil.formatDate(new Date());
		System.out.println(str3);
		System.out.println(DataUtil.formatDouble("41648.1266"));
		System.out.println(DataUtil.formatFloat("1221.312565"));
		System.out.println(DataUtil.formatInteger("5146156"));
	}
	
	@org.junit.Test
	public void BeanMapUtil() {
		User u = new User();
		u.setId(2);
		u.setName("jack");
		u.setAge(16);
		JSONObject o = JSONObject.fromObject(u);
		System.out.println(o);
		Map map = BeanMapUtil.convertBean(u);
		System.out.println(map);
	}
}
