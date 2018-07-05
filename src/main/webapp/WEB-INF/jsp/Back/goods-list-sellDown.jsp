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

<title>已下架的商品</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
		商品管理 <span class="c-gray en">&gt;</span> 已下架的商品 <a
			class="btn btn-success radius r"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"> <a href="javascript:;" onclick="batchControl('PUT','${pageContext.request.contextPath}/goods/upCheckGoods','发布')"
				class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i>
					批量发布</a></span> <span class="r">共有数据：<strong>${ size }</strong> 条
			</span>
		</div>
		<div class="mt-20">
			<table
				class="table table-border table-bordered table-bg table-hover table-sort">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="40">ID</th>
						<th width="70">名称</th>
						<th width="60">卖家</th>
						<th width="60">起拍价格</th>
						<th width="60">当前价格</th>
						<th width="60">商品类型</th>
						<th width="">商品描述</th>
						<th width="100">上架时间</th>
						<th width="80">商品状态</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${ list ne null }">
						<c:forEach items="${ list }" var="good">
							<tr class="text-c">
								<td><input type="checkbox" value="${ good.goods_id }"
									class="check"></td>
								<td>${ good.goods_id }</td>
								<td>${good.goods_name}</td>
								<td>${good.user_id }</td>
								<td>${good.goods_minprice }</td>
								<td>${good.goods_currentprice }</td>
								<td>${good.goods_typeid }</td>
								<td class="text-l">${good.goods_desc }</td>
								<td>${good.goods_create }</td>
								<td class="td-status"><span class="label label-info radius">已下架</span></td>
								<td class="td-manage"><a style="text-decoration: none"
									onClick="picture_start(this,'${ good.goods_id }')"
									href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>


								</td>
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
		$('.table-sort').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{
				"orderable" : false,
				"aTargets" : [ 0, 8 ]
			} // 制定列不参与排序
			]
		});

		/*图片-添加*/
		function picture_add(title, url) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}

		/*图片-查看*/
		function picture_show(title, url, id) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}

		/*图片-审核*/
		function picture_shenhe(obj, id) {
			layer
					.confirm(
							'审核文章？',
							{
								btn : [ '通过', '不通过' ],
								shade : false
							},
							function() {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a class="c-primary" onClick="picture_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-success radius">已发布</span>');
								$(obj).remove();
								layer.msg('已发布', {
									icon : 6,
									time : 1000
								});
							},
							function() {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a class="c-primary" onClick="picture_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-danger radius">未通过</span>');
								$(obj).remove();
								layer.msg('未通过', {
									icon : 5,
									time : 1000
								});
							});
		}

		/*图片-下架*/
		function picture_stop(obj, id) {
			layer
					.confirm(
							'确认要下架吗？',
							function(index) {
								$
										.ajax({
											type : 'PUT',
											url : '${pageContext.request.contextPath}/goods/downGood/'
													+ id,
											dataType : 'json',
											success : function(data) {
												if (data == true) {

													$(obj)
															.parents("tr")
															.find(".td-manage")
															.prepend(
																	'<a style="text-decoration:none" onClick="picture_start(this,'
																			+ id
																			+ ')" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
													$(obj)
															.parents("tr")
															.find(".td-status")
															.html(
																	'<span class="label label-defaunt radius">已下架</span>');
													$(obj).remove();
													layer.msg('已下架!', {
														icon : 5,
														time : 1000
													});
												} else {
													layer.msg('操作失败,请检查网络!', {
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

		/*图片-发布*/
		function picture_start(obj, id) {
			layer
					.confirm(
							'确认要发布吗？',
							function(index) {
								$
										.ajax({
											type : 'PUT',
											url : '${pageContext.request.contextPath}/goods/upGood/'
													+ id,
											dataType : 'json',
											success : function(data) {
												if (data == true) {
													$(obj)
															.parents("tr")
															.find(".td-manage")
															.prepend(
																	'<a style="text-decoration:none" onClick="picture_stop(this,'
																			+ id
																			+ ')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
													$(obj)
															.parents("tr")
															.find(".td-status")
															.html(
																	'<span class="label label-primary radius">竞拍中</span>');
													$(obj).remove();
													layer.msg('已发布!', {
														icon : 6,
														time : 1000
													});
												} else {
													layer.msg('操作失败,请检查网络!', {
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

		/*图片-申请上线*/
		function picture_shenqing(obj, id) {
			$(obj).parents("tr").find(".td-status").html(
					'<span class="label label-default radius">待审核</span>');
			$(obj).parents("tr").find(".td-manage").html("");
			layer.msg('已提交申请，耐心等待审核!', {
				icon : 1,
				time : 2000
			});
		}

		/*图片-编辑*/
		function picture_edit(title, url, id) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}

		/*图片-删除*/
		function picture_del(obj, id) {
			layer
					.confirm(
							'确认要删除吗？',
							function(index) {
								$
										.ajax({
											type : 'DELETE',
											url : '${pageContext.request.contextPath}/goods/deleteGood/'
													+ id,
											dataType : 'json',
											success : function(data) {
												if (data) {
													$(obj).parents("tr")
															.remove();
													layer.msg('已删除!', {
														icon : 1,
														time : 1000
													});
												} else {
													layer.msg('操作失败,请检查网络!', {
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
		function getCheck() {
			var list = new Array();
			$(".check").each(function() { //遍历table里的全部checkbox
				// allcheckbox += $(this).val() + ","; //获取所有checkbox的值
				if ($(this).prop("checked")) //如果被选中
				{
					list.push($(this).val());
				}

			});
			return list;
		}
		function batchControl(curType,curUrl,curControl) {
			var list = getCheck();
			if (list.length > 0) {
				layer
						.confirm(
								'确认要'+curControl+'所有选中商品吗？',
								function(index) {
									$
											.ajax({
												type : curType,
												url : curUrl,
												dataType : 'json',
												contentType : "application/json",
												data : JSON.stringify(list),
												success : function(data) {
													if (data == true) {
														$(".check")
																.each(
																		function() { //遍历table里的全部checkbox
																			// allcheckbox += $(this).val() + ","; //获取所有checkbox的值
																			if ($(
																					this)
																					.prop(
																							"checked")) //如果被选中
																			{
																				$(
																						this)
																						.parents(
																								"tr")
																						.remove();
																			}
																		});
														layer.msg('信息已提交!', {
															icon : 6,
															time : 1000
														});
													} else {
														layer
																.msg(
																		"操作失败,批量"+curControl+"中出了错!",
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
								})
			}
		}
	</script>
</body>
</html>