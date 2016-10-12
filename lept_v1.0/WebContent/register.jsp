<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'register.jsp' starting page</title>
	</head>

	<body>
		<s:form action="register!regist.do">
			<s:textfield name="username" label="用户名" />
			<s:password name="password" label="密码" />
			<s:submit value="注册" />
		</s:form>
		<form action="register!regist.do">
			<input type="text" name="username" />
			<input  type="password" name = "password"/>
			<input type="submit" value="提交" />
		</form>
	</body>
</html>
