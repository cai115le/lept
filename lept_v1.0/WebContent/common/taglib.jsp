<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String contextPath = request.getContextPath();    
	String realPath = request.getSession().getServletContext().getRealPath("/");    
	String ctx = request.getScheme()+"://"+request.getServerName()+":"+
             	   request.getServerPort()+contextPath;
	String themeName = "default";
	Cookie[] cookies = request.getCookies();
	//以下代码根据个人情况自己写,原理就是找到指定名称的Cookie就将此名称的Cookie值赋值赋值给定义的变量
	if(cookies != null && cookies.length > 0) {
	    for(int i = 0; i < cookies.length; i++) {
	        if(cookies[i].getName().equals("themeName")) {
	            themeName = cookies[i].getValue();
	        }
	    }
	}
%>
<c:set var="ctx" value="<%=ctx%>"></c:set>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<%-- <script type="text/javascript" src="${ctx}/js/jquery-1.9.1/jquery.min.js" ></script> --%>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<%-- <link rel="stylesheet" href="${ctx}/js/bootstrap-3.3.5-dist/css/bootstrap.min.css"> --%>
<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<%-- <link rel="stylesheet" href="${ctx}/js/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css"> --%>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<%-- <script src="${ctx}/js/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script> --%>

<link id="easyuiTheme" rel="stylesheet" href="${ctx}/js/jquery-easyui-1.5/themes/default/easyui.css">
<link rel="stylesheet" href="${ctx}/js/jquery-easyui-1.5/themes/icon.css">
<script src="${ctx}/js/jquery-easyui-1.5/jquery.min.js"></script>
<script src="${ctx}/js/jquery-1.9.1/jquery.cookie.js"></script>
<script src="${ctx}/js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="${ctx}/js/jquery-easyui-1.5/easyloader.js"></script>
<script type="text/javascript">
	var href = location.href
	if(href!="${ctx}/index.jsp"){
		location.href = "${ctx}/index.jsp";
	}
</script>
