package cn.com.common.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: lept_v1.0
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @FileName:  LoginFilter 
 * @Create DateTime: 2016年8月1日 上午11:31:15
 * @Version: V1.0
 * @author 蔡伟乐
 * @Others: 
 */
public class LoginFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain fc) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		String contextPath = request.getContextPath();
		String ctx = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+contextPath;
		String uri = request.getRequestURI();
		System.out.println("uri:"+uri);
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("utf-8");
		Object user=request.getSession().getAttribute("user");
		//取消过滤
		fc.doFilter(request, response);
		/*if(user==null){
			if(uri.indexOf("regist")<0&&uri.indexOf("login")<0){
				//防止iframe无法跳出
				PrintWriter out = response.getWriter();
				out.println("<html>");
		        out.println("<script>");
		        out.println("window.open ('"+ctx+"/common/login.jsp','_top')");
		        out.println("</script>");
		        out.println("</html>");
				//response.sendRedirect(ctx+"/common/login.jsp");
			}else{
				fc.doFilter(request, response);
			}
			
		}else{
			fc.doFilter(request, response);
		}*/
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
