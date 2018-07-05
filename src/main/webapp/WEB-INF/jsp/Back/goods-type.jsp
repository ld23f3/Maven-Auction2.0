<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css"
	id="skin" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />

<title>分类管理</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
		管理员管理 <span class="c-gray en">&gt;</span> 分类管理 <a
			class="btn btn-success radius r"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<div class="cl pd-5 bg-1 bk-gray">
			<span class="l"><a class="btn btn-primary radius" href="javascript:;"
				onclick="admin_role_add('添加分类','${pageContext.request.contextPath}/type/askAdd','400','180')"><i
					class="Hui-iconfont">&#xe600;</i> 添加分类</a>
			</span> <span class="r">共有数据：<strong>${size}</strong> 条
			</span>
		</div>
		<table class="table table-border table-bordered table-hover table-bg">
			<thead>
				<tr>
					<th scope="col" colspan="6">分类管理</th>
				</tr>
				<tr class="text-c">
					<th width="40">ID</th>
					<th>类型描述</th>
					<th width="150">创建时间</th>
					<th width="150">更新时间</th>
					<th width="70">操作</th>
				</tr>
			</thead>
			<tbody>

				<c:if test="${ list ne null }">
					<c:forEach items="${ list }" var="goodType">
						<tr class="text-c">
							<td>${goodType.goodstype_id }</td>
							<td><a href="#">${goodType.goodstype_desc }</a></td>
							<td>${goodType.goodstype_create }</td>
							<td>${goodType.goodstype_modified }</td>
							<td class="f-14"><a title="编辑" href="javascript:;"
								onclick="admin_role_edit('分类编辑','${pageContext.request.contextPath}/type/askAdd','${goodType.goodstype_id }','400','180')"
								style="text-decoration: none"><i class="Hui-iconfont">&#xe6df;</i></a>
								<a title="删除" href="javascript:;"
								onclick="admin_role_del(this,'1')" class="ml-5"
								style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/layer/2.4/layer.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript">
		/*管理员-角色-添加*/
		function admin_role_add(title, url, w, h) {
			layer_show(title, url, w, h);
		}
		/*管理员-角色-编辑*/
		function admin_role_edit(title, url, id, w, h) {
			layer_show(title, url + "?goodstype_id=" + id, w, h);
		}
		/*管理员-角色-删除*/
		function admin_role_del(obj, id) {
			layer
					.confirm(
							'分类删除须谨慎，确认要删除吗？',
							function(index) {
								$
										.ajax({
											type : 'DELETE',
											url : '${pageContext.request.contextPath}/type/deleteGoodstype/'
													+ id,
											dataType : 'json',
											success : function(data) {
												if (data == true) {
													$(obj).parents("tr")
															.remove();
													layer.msg('已删除!', {
														icon : 1,
														time : 1000
													});
												} else {
													layer
															.msg(
																	'删除出错啦!请刷新页面,或检查是否可删除',
																	{
																		icon : 5,
																		time : 2000
																	});
												}
											},
											error : function(data) {
												console.log(data.msg);
											},
										});
							});
		}
	</script>
</body>
</html>