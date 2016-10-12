package cn.com.common.Utils;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: lept_v1.0
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @FileName:  UserUtil.java
 * @Create DateTime: 2016年8月19日 下午3:59:39
 * @Version: V1.0
 * @author 蔡伟乐
 * @Others: 
 */
public class UserUtil {
	@Autowired
	private HttpSession session;
	
	public HttpSession getSession(){
		return session;
	}
}
