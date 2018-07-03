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
<title>删除的用户</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
		用户中心 <span class="c-gray en">&gt;</span> 删除的用户<a
			class="btn btn-success radius r"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<div class="text-c">
			日期范围： <input type="text"
				onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })"
				id="datemin" class="input-text Wdate" style="width: 120px;">
			- <input type="text"
				onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })"
				id="datemax" class="input-text Wdate" style="width: 120px;">
			<input type="text" class="input-text" style="width: 250px"
				placeholder="输入会员名称、电话、邮箱" id="" name="">
			<button type="submit" class="btn btn-success radius" id="" name="">
				<i class="Hui-iconfont">&#xe665;</i> 搜用户
			</button>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"><a href="javascript:;" onclick="delAll()"
				class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
					批量删除</a> </span> <span class="r">共有数据：<strong>${ size }</strong> 条
			</span>
		</div>
		<div class="mt-20">
			<table
				class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="40">ID</th>
						<th width="80">姓名</th>
						<th width="100">账号</th>
						<th width="90">电话</th>
						<th width="150">邮箱</th>
						<th width="">地址</th>
						<th width="130">加入时间</th>
						<th width="70">用户状态</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${ list ne null }">
						<c:forEach items="${ list }" var="user">
							<tr class="text-c">
								<td><input type="checkbox" value="${user.user_id }" name=""
									class="check"></td>
								<td class="user_id">${user.user_id }</td>
								<td><u style="cursor: pointer" class="text-primary"
									onclick="member_show('${user.user_realname }','${pageContext.request.contextPath}/users/userInfo?user_id=${user.user_id}','${user.user_id}','360','400')">${user.user_realname }</u></td>
								<td>${user.user_acc }</td>
								<td>${user.user_tel }</td>
								<td>${user.user_email }</td>
								<td class="text-l">${user.user_address }</td>
								<td>${user.user_create }</td>
								<td class="td-status"><span
									class="label label-danger radius">停权中</span></td>
								<td class="td-manage"><a style="text-decoration: none"
									href="javascript:;"
									onClick="member_huanyuan(this,'${user.user_id}')" title="还原"><i
										class="Hui-iconfont">&#xe66b;</i></a> <a title="删除"
									href="javascript:;"
									onclick="member_del(this,'${user.user_id}')" class="ml-5"
									style="text-decoration: none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
							</tr>
						</c:forEach>
					</c:if>
				</tbody>
			</table>
		</div>
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
		src="${pageContext.request.contextPath}/static/lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.table-sort').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
				"bStateSave" : true,//状态保存
				"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 8, 9 ]
				} // 制定列不参与排序
				]
			});
		});
		/*用户-查看*/
		function member_show(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}
		/*用户-还原*/
		function member_huanyuan(obj, id) {
			layer
					.confirm(
							'确认要还原吗？',
							function(index) {
								$
										.ajax({
											type : 'PUT',
											url : '${pageContext.request.contextPath}/users/activeUser/'
													+ id,
											dataType : 'json',
											success : function(data) {
												if (data == true) {
													$(obj).remove();
													layer.msg('已启用!', {
														icon : 6,
														time : 1000
													});
												} else {
													layer.msg('操作失败,请检查网络!', {
														icon : 5,
														time : 1000
													});
												}

											},
											error : function(data) {
												console.log(data.msg);
											},
										});
							});
		}

		/*用户-删除*/
		function member_del(obj, id) {
			layer
					.confirm(
							'确认要删除吗？',
							function(index) {
								$
										.ajax({
											type : 'DELETE',
											url : '${pageContext.request.contextPath}/users/deleteUser/'
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
												}
											},
											error : function(data) {
												console.log(data.msg);
											},
										});
							});
		}
		function getCheck() {
			var list = new Array();
			$(".check").each(function() { //遍历table里的全部checkbox
				// 								allcheckbox += $(this).val() + ","; //获取所有checkbox的值
				if ($(this).prop("checked")) //如果被选中
				{
					list.push($(this).val());
				}

			});
			return list;
		}
		function delAll(argument) {
			var list = getCheck();
			alert(list);
			if (list.length > 0) {
				$.ajax({
					type : 'DELETE',
					url : '${pageContext.request.contextPath}/users/deleteCheckUser',
					dataType : 'json',
					contentType : "application/json",
					data : JSON.stringify(list),
					success : function(data) {
						if (data == true) {
							layer.msg('信息已提交!', {
								icon : 6,
								time : 1000
							});
						} else {
							layer.msg("操作失败,该用户已被注册!", {
								icon : 5,
								time : 2000
							});
						}
					},
					error : function(data) {
						console.log(data.msg);
					},
				});
			}
		}
	</script>
</body>
</html>