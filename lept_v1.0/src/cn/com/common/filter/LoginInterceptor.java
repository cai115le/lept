package cn.com.common.filter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * @ProjectName: lept_v1.0
 * @Description: action过滤器
 * @Copyright: Copyright (c) 2016
 * @FileName:  LoginInterceptor.java
 * @Create DateTime: 2016年8月1日 下午2:35:09
 * @Version: V1.0
 * @author 蔡伟乐
 * @Others: 
 */
public class LoginInterceptor extends MethodFilterInterceptor{

	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invoker) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ssssssssssss");
		
		return invoker.invoke();
	}

}
