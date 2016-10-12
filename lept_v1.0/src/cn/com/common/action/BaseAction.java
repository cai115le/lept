package cn.com.common.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ProjectName: lept_v1.0
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @FileName:  BaseAction.java
 * @Create DateTime: 2016年8月1日 下午12:01:07
 * @Version: V1.0
 * @author 蔡伟乐
 * @Others: 
 */
public class BaseAction extends ActionSupport implements  ServletRequestAware, ServletResponseAware, ServletContextAware {

	private static final long serialVersionUID = 1L;

	private HttpServletRequest request;

    private ServletContext servletContext;

    private HttpServletResponse response;
	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.servletContext = context;
	}
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public ServletContext getServletContext() {
		return servletContext;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	
}
