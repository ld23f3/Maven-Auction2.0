<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark"
	href="${pageContext.request.contextPath}/static/favicon.ico">
<link rel="Shortcut Icon"
	href="${pageContext.request.contextPath}/static/favicon.ico" />
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
<!--/meta 作为公共模版分离出去-->

<title>添加用户 - H-ui.admin v3.1</title>
<meta name="keywords"
	content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description"
	content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
	<article class="page-container">
		<form action="${actionSrc}"
			class="form form-horizontal" id="form-member-add" method="POST">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>用户名：</label>

				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value="" placeholder="请输入用户名"
						id="user_acc" name="user_acc">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>密码：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="password" class="input-text" value=""
						placeholder="请输入密码" id="user_pwd" name="user_pwd">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>确认密码：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="password" class="input-text" value=""
						placeholder="请确认密码" id="usersecpwd" name="usersecpwd">
				</div>
			</div>

			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>真实姓名：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder="请输入您的姓名"
						name="user_realname" id="user_realname">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>身份证号码：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder="请输入您的身份证"
						name="user_cardid" id="user_cardid">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>所在地址：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder="请输入您的地址"
						name="user_address" id="user_address">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>手机：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" value=""
						placeholder="是输入11位手机号码" id="user_tel" name="user_tel">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>邮箱：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder="请输入邮箱地址"
						name="user_email" id="user_email" value="">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-3"><span
					class="c-red">*</span>权限：</label>
				<div class="formControls col-xs-8 col-sm-9 skin-minimal">
					<div class="radio-box">
						<input name="user_state" type="radio" id="state-1" value="0"
							checked> <label for="state-1">启用</label>
					</div>
					<div class="radio-box">
						<input type="radio" id="state-2" name="user_state" value="1">
						<label for="state-2">禁用</label>
					</div>
				</div>
			</div>
			<div>
				<input type="hidden" id="user_id" name="user_id" value="">
				<input type="hidden" id="user_balance" name="user_balance" value="">
				<input type="hidden" id="user_create" name="user_create" value="">
				<input type="hidden" id="user_modified" name="user_modified" value="">
			</div>

			<div class="row cl">
				<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
					<input class="btn btn-primary radius" type="submit" id="submit"
						value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
				</div>
			</div>
		</form>
	</article>

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
		src="${pageContext.request.contextPath}/static/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript">
		$(function() {
			if(${user != null}){
				$("#user_id").val("${user.user_id}");
				$("#user_acc").val("${user.user_acc}");
				$("#user_acc").attr("readonly","readonly");
				

				$("#user_pwd").val("${user.user_pwd}");
				$("#usersecpwd").val("${user.user_pwd}");
				var state = ${user.user_state} + 0;
				if( state == 0){
					$("#state-1").prop("checked",true);
					$("#state-2").prop("checked",false);
				}else{
					$("#state-1").prop("checked",false);
					$("#state-2").prop("checked",true);
				} 
				$("#user_balance").val("${user.user_balance}");
				$("#user_create").val("${user.user_create}");
				$("#user_modified").val("${user.user_modified}");
			};
			$("#user_email").val("492011200@qq.com");
			$("#user_tel").val("15259620412");
			$("#user_realname").val("林惠成");
			$("#user_cardid").val("350623199008205233");
			$("#user_address").val("厦门湖里");
			
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});
			$("#form-member-add").validate({
				rules : {
					user_acc : {
						required : true,
						minlength : 2,
						maxlength : 16
					},
					user_pwd : {
						required : true,
						minlength : 2,
						maxlength : 16
					},
					usersecpwd : {
						required : true,
						minlength : 2,
						maxlength : 16,
						equalTo : "#user_pwd"

					},
					user_realname : {
						required : true,
						isChinese : true
					},
					user_cardid : {
						required : true,
						isIdCardNo:true

					},
					user_address:{
						required : true
					},
					user_tel : {
						required : true,
						isMobile : true
					},
					user_email : {
						required : true,
						email : true
					},
					user_state : {
						required : true
					}

				},
				onkeyup : false,
				focusCleanup : true,
				success : "valid",
				submitHandler : function(form) {
					$.ajax({
						type : '${type}',
						url : '${actionSrc}',
						dataType : 'json',
						contentType:"application/json",
						data:JSON.stringify({"user_id":$("#user_id").val(),
							"user_acc":$("#user_acc").val(),
							"user_pwd":$("#user_pwd").val(),
							"user_email":$("#user_email").val(),
							"user_tel":$("#user_tel").val(), 
							"user_realname":$("#user_realname").val(), 
							"user_cardid":$("#user_cardid").val(), 
							"user_address":$("#user_address").val(), 
							"user_balance":$("#user_balance").val(), 
							"user_state":$(":checked").val(), 
							"user_create":$("#user_create").val(), 
							"user_modified":$("#user_modified").val()}), 
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
// 					$(form).ajaxSubmit();
// 					var index = parent.layer.getFrameIndex(window.name);
// 					parent.layer.close(index);
				}
			});
		});
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>