<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="common/taglib.jsp"%>
<%
	//response.sendRedirect(ctx+"/register.jsp");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${ctx}/js/init.js"></script>
<script type="text/javascript">
</script>
<title>lept</title>
</head>
<body>
	<div id="mainpanel" class="easyui-layout" data-options="fit:true">
		<div data-options="region:'north'"
			style="height: 15%;background:#87ceeb"><%-- url(${ctx}/images/common/top.jpg) --%>
			<div style="float: left;padding-left: 20px">
				<h2>Basic Layout</h2>
				<p>The layout contains north,south,west,east and center regions.</p>
			</div>
			<div style="position: absolute;bottom: 0;right: 5px">
				您好！<a href="javascript:void(0)" id="mb" class="easyui-menubutton"
					data-options="menu:'#user'">管理员</a>&nbsp|&nbsp
				<a href="javascript:void(0)" id="mb" class="easyui-menubutton"
					data-options="menu:'#mm'">页面风格</a>
				<div id="user" style="width: 150px;">
					<div >退出登录</div>
					<div >修改密码</div>
					<div >修改信息</div>
				</div>
				<div id="mm" style="width: 150px;">
					<div onclick="changeUI('black')">black</div>
					<div onclick="changeUI('bootstrap')">bootstrap</div>
					<div onclick="changeUI('cupertino')">cupertino</div>
					<div onclick="changeUI('dark-hive')">dark-hive</div>
					<div onclick="changeUI('default')">default</div>
					<div onclick="changeUI('gray')">gray</div>
					<div onclick="changeUI('metro')">metro</div>
					<div onclick="changeUI('pepper-grinder')">pepper-grinder</div>
					<div onclick="changeUI('sunny')">sunny</div>
				</div>
			</div>
		</div>
		<!-- 		<div data-options="region:'south',split:true" style="height: 50px;"></div> -->
		<div data-options="region:'east',split:true,collapsed:true"
			title="East" style="width: 20%;"></div>
		<div data-options="region:'west',split:true" title="导航菜单"
			style="width: 20%;">
			<div class="easyui-accordion">
				<div title="About" data-options="iconCls:'icon-ok'"
					style="overflow: auto;">
					<div style="background: #e0ecff;padding: 6px;margin-left: 20px;border-left: 1px solid #95b8e7;border-bottom: 1px solid #95b8e7">
						asdf
					</div>
					<button onclick="aa()">aaaaa</button>
				</div>
				<div title="Help" data-options="iconCls:'icon-help'"
					style="padding: 10px;"></div>
				<div title="TreeMenu" data-options="iconCls:'icon-search'"
					style="padding: 10px;">
					<ul class="easyui-tree">
						<li><span>Foods</span>
							<ul>
								<li><span>Fruits</span>
									<ul>
										<li>apple</li>
										<li>orange</li>
									</ul></li>
								<li><span>Vegetables</span>
									<ul>
										<li>tomato</li>
										<li>carrot</li>
										<li>cabbage</li>
										<li>potato</li>
										<li>lettuce</li>
									</ul></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</div>
		<div data-options="region:'center'" style="border: 0px">
			<div id="main-center" class="easyui-panel" style="border: 0px"
				fit="true"></div>
		</div>
	</div>
</body>
</html>