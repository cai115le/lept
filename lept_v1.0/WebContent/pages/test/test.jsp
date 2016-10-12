<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="easyui-layout"  data-options="fit:true">
		<div data-options="region:'north'" style="height: 150px" title="test">
			<h2>Basic Layout</h2>
			<p>The layout contains north,south,west,east and center regions.</p>
		</div>
		<div id="main-center" data-options="region:'center'">
			<table class="easyui-datagrid"
				data-options="url:'${ctx}/js/data/datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
				<thead>
					<tr>
						<th data-options="field:'itemid'" width="80">Item ID</th>
						<th data-options="field:'productid'" width="100">Product ID</th>
						<th data-options="field:'listprice',align:'right'" width="80">List
							Price</th>
						<th data-options="field:'unitcost',align:'right'" width="80">Unit
							Cost</th>
						<th data-options="field:'attr1'" width="150">Attribute</th>
						<th data-options="field:'status',align:'center'" width="60">Status</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</body>
</html>