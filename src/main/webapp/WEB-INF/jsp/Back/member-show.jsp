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
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
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
<title>用户查看</title>
</head>
<body>
	<div class="cl pd-20" style="background-color: #5bacb6">
		<img class="avatar size-XL l"
			src="${pageContext.request.contextPath}/static/h-ui/images/ucnter/avatar-default.jpg">
		<dl style="margin-left: 80px; color: #fff">
			<dt>
				<span class="f-18">${user.user_realname }</span> <span class="pl-10 f-12">余额：${user.user_balance}</span>
			</dt>
			<dd class="pt-10 f-12" style="margin-left: 0">这家伙很懒，什么也没有留下</dd>
		</dl>
	</div>
	<div class="pd-20">
		<table class="table">
			<tbody>
				<tr>
					<th class="text-r">手机：</th>
					<td>${user.user_tel }</td>
				</tr>
				<tr>
					<th class="text-r">邮箱：</th>
					<td>${user.user_email }</td>
				</tr>
				<tr>
					<th class="text-r">地址：</th>
					<td>${user.user_address }</td>
				</tr>
				<tr>
					<th class="text-r">注册时间：</th>
					<td>${user.user_create }</td>
				</tr>
				<tr>
					<th class="text-r">状态：</th>
					<td>${user.user_state == 0?"正常":"禁用"}</td>
				</tr>
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
</body>
</html>