<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function toPage(){
		document.getElementById("pageIframe").src = "http://localhost:8080/lept_v1.0/success.jsp";
	}
</script>
</head>
<body>
	<form action="register!login.do" method="post">
		<input type="text" name="username" />
		<input type="text" name="password" />
		<input type="submit" value="提交">
	</form>
	<form action="register!login.do" method="post">
		<input type="text" name="user.name" />
		<input type="text" name="user.age" />
		<input type="submit" value="提交">
	</form>
	<s:form action="register!login.do">
		<s:textfield name="user.name" label="用户名" />
		<s:password name="user.age" label="密码" />
		<s:submit value="注册" />
	</s:form>
	<button onclick="toPage()">跳转</button>
	<iframe id="pageIframe">
	
	</iframe>
</body>
</html>