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
<script type="text/javascript">
	$(function() {
		setTimeout(aa, 100);
	})
	function aa() {
		$('#main-center').panel('refresh', 'pages/test/test.jsp')
	}
</script>
<title>lept</title>
</head>
<body>
	<div id="mainpanel" class="easyui-layout" data-options="fit:true">
		<div data-options="region:'north'" style="height: 15%">
			<h2>Basic Layout</h2>
			<p>The layout contains north,south,west,east and center regions.</p>
		</div>
		<!-- 		<div data-options="region:'south',split:true" style="height: 50px;"></div> -->
		<div data-options="region:'east',split:true,collapsed:true"
			title="East" style="width: 20%;"></div>
		<div data-options="region:'west',split:true" title="导航菜单"
			style="width: 20%;">
			<div class="easyui-accordion">
				<div title="About" data-options="iconCls:'icon-ok'"
					style="overflow: auto;">
					<button onclick="aa()">aaaaa</button>
				</div>
				<div title="Help" data-options="iconCls:'icon-help'"
					style="padding: 10px;">
				</div>
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