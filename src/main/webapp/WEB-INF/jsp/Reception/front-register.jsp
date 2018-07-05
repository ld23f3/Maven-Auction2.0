<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
<title>用户注册</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- css -->
<link href="${pageContext.request.contextPath}/static/Assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/Assets/css/style.css" type="text/css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/Assets/css/font-awesome.min.css" type="text/css" media="all" />
<!--// css -->
<!-- font -->
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- //font -->
<script src="${pageContext.request.contextPath}/static/Assets/js/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/Assets/js/bootstrap.js"></script>
</head>
<body>
<div class="header-top-w3layouts">
	<div class="container">
		<div class="col-md-6 logo-w3">
			<a href="index.html"><img src="${pageContext.request.contextPath}/static/Assets/images/logo2.png" alt=" " /><h1>喬治拍卖</h1></a>
		</div>
		<div class="col-md-6 phone-w3l">
			<ul>
				<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span></li>
				<li>客服热线：18045403380</li>
			</ul>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<div class="header-bottom-w3ls">
	<div class="container">
		<div class="col-md-7 navigation-agileits">
			<nav class="navbar navbar-default">
				<div class="navbar-header nav_2">
					<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div> 
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav ">
						<li class=" active"><a href="index.html" class="hyper "><span>首页</span></a></li>	
						<li class="dropdown ">
							<a href="#" class="dropdown-toggle  hyper" data-toggle="dropdown" ><span>商品分类<b class="caret"></b></span></a>
								<ul class="dropdown-menu multi">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
			
												<li><a href="paper.html"><i class="fa fa-angle-right" aria-hidden="true"></i>字画</a></li>
												<li><a href="ceramics.html"><i class="fa fa-angle-right" aria-hidden="true"></i>陶瓷</a></li>
												<li><a href="jade.html"> <i class="fa fa-angle-right" aria-hidden="true"></i>玉石</a></li>
												<li><a href="sundry.html"><i class="fa fa-angle-right" aria-hidden="true"></i>杂项</a></li>
										
											</ul>
										
										</div>
									
										<div class="col-sm-4 w3l">
											<a href=""><img src="images/menu1.jpg" class="img-responsive" alt=""></a>
										</div>
										<div class="clearfix"></div>
									</div>	
								</ul>
						</li>
						<li class="dropdown">
								<a href="#" class="dropdown-toggle hyper" data-toggle="dropdown" ><span>个人中心<b class="caret"></b></span></a>
								<ul class="dropdown-menu multi multi1">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<li><a href="login"><i class="fa fa-angle-right" aria-hidden="true"></i>登录</a></li>
												<li><a href="contact"><i class="fa fa-angle-right" aria-hidden="true"></i>个人信息</a></li>
												<li><a href="address"><i class="fa fa-angle-right" aria-hidden="true"></i>收货地址</a></li>
										
											</ul>
											
										</div>
										
										<div class="col-sm-4 w3l">
											<a href=""><img src="images/menu2.jpg" class="img-responsive" alt=""></a>
										</div>
										<div class="clearfix"></div>
									</div>	
								</ul>
						</li>
						<li class="dropdown">
								<a href="#" class="dropdown-toggle hyper" data-toggle="dropdown" ><span>商品管理<b class="caret"></b></span></a>
								<ul class="dropdown-menu multi multi1">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<li><a href="publish_goods.html"><i class="fa fa-angle-right" aria-hidden="true"></i>发布商品</a></li>
												<li><a href="mygoods.html"><i class="fa fa-angle-right" aria-hidden="true"></i>查询发布商品</a></li>
										
											</ul>
											
										</div>
										
										<div class="col-sm-4 w3l">
											<a href=""><img src="images/menu3.jpg" class="img-responsive" alt=""></a>
										</div>
										<div class="clearfix"></div>
									</div>	
								</ul>
						</li>
						<li class="dropdown">
								<a href="#" class="dropdown-toggle hyper" data-toggle="dropdown" ><span>我的竞拍<b class="caret"></b></span></a>
								<ul class="dropdown-menu multi multi1">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<li><a href="record.html"><i class="fa fa-angle-right" aria-hidden="true"></i>竞拍记录</a></li>
												<li><a href="unpaid_order.html"><i class="fa fa-angle-right" aria-hidden="true"></i>未付款订单</a></li>
												<li><a href="unfinished_order.html"><i class="fa fa-angle-right" aria-hidden="true"></i>未完成订单</a></li>
												<li><a href="completed_order.html"><i class="fa fa-angle-right" aria-hidden="true"></i>已完成订单</a></li>
										
											</ul>
											
										</div>
										
										<div class="col-sm-4 w3l">
											<a href=""><img src="images/menu4.jpg" class="img-responsive" alt=""></a>
										</div>
										<div class="clearfix"></div>
									</div>	
								</ul>
						</li>
					</ul>
				</div>
			</nav>
		</div>
								<script>
				$(document).ready(function(){
					$(".dropdown").hover(            
						function() {
							$('.dropdown-menu', this).stop( true, true ).slideDown("fast");
							$(this).toggleClass('open');        
						},
						function() {
							$('.dropdown-menu', this).stop( true, true ).slideUp("fast");
							$(this).toggleClass('open');       
						}
					);
				});
				</script>
		<div class="col-md-4 search-agileinfo">
			<form action="#" method="post">
				<input type="search" name="search" placeholder="搜索您想要的拍卖品" required="">
				<button type="submit" class="btn btn-default search" aria-label="Left Align">
					<i class="fa fa-search" aria-hidden="true"> </i>
				</button>
			</form>
		</div>
		<div class="col-md-1 cart-wthree">
			<div class="cart"> 
				<form action="#" method="post" class="last"> 
					<input type="hidden" name="cmd" value="_cart" />
					<input type="hidden" name="display" value="1" />
					<button class="w3view-cart" type="submit" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button>
				</form>  
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
	<div class="login">
	
		<div class="main-agileits">
				<div class="form-w3agile">
					<h3>用户注册</h3>
					<form action="register" method="post">
						<div class="key">
							<i class="fa fa-user" aria-hidden="true"></i>
							<input  type="text" id="user_acc" name="user_acc" required=""  placeholder="账号">
							<div class="clearfix"></div>
							<script type="text/javascript" >
							  $(document).ready(function(){
								  $("#user_acc").blur(function(){
									  console.log($("#user_acc").val());
									  $.get("/Maven-Auction2.0/api/validation?user_Acc="+$("#user_acc").val(),function(data,status){
										  console.log(data);
										  if(data=="false"){
											  $("#check").html("可以注册");
										  }
										  if(data=="true"){
											  $("#check").html("该账号已存在");
										  }
									  })
								  })
								 
							  })
								
							</script>
							<div id="check"></div>
						</div>
						<div class="key">
							<i class="fa fa-lock" aria-hidden="true"></i>
							<input  type="text" name="user_tel" required="" placeholder="手机号码">
							<div class="clearfix"></div>
						</div>
						<div class="key">
							<i class="fa fa-envelope" aria-hidden="true"></i>
							<input  type="text"  name="user_email"  required=""  placeholder="电子邮箱">
							<div class="clearfix"></div>
						</div>
						<div class="key">
							<i class="fa fa-lock" aria-hidden="true"></i>
							<input  type="password"  name="user_pwd"  required="" placeholder="密码">
							<div class="clearfix"></div>
						</div>
						<div class="key">
							<i class="fa fa-lock" aria-hidden="true"></i>
							<input  type="password" name="confirm password" required="" placeholder="确认密码">
							<div class="clearfix"></div>
						</div>
						<input type="submit" value="注册">
					</form>
				</div>
			</div>
		</div>
		<!-- newsletter -->
	<div class="newsletter">
		<div class="container">
			<div class="col-md-6 w3agile_newsletter_left">

			</div>
			<div class="col-md-6 w3agile_newsletter_right">
				<form action="#" method="post">
					<input type="email" name="Email" value="电子邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="submit" value="搜索" />
				</form>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //newsletter -->
<div class="footer">
	<div class="container">
		<div class="col-md-3 footer-grids fgd1">
		<a href="index.html"><img src="${pageContext.request.contextPath}/static/Assets/images/logo2.png" alt=" " /><h3>喬治拍卖</span></h3></a>
		<ul>
			<li>地址：厦门市观日路2号</li>
			<li>邮编：350000</li>
			<li>电子邮箱：info@example.com</a></li>
			
			
		</ul>
		</div>
		<div class="col-md-3 footer-grids fgd2">
			<h4>商品</h4> 
			<ul>
				<li><a href="paper.html">字画</a></li>
				<li><a href="ceramics.html">陶瓷</a></li>
				<li><a href="jade.html">玉石</a></li>
				<li><a href="sundry.html">杂项</a></li>
			</ul>
		</div>
		<div class="col-md-3 footer-grids fgd3">
			<h4>我的</h4> 
			<ul>
				<li><a href="mygoods.html">我的发布</a></li>
				<li><a href="record.html">竞拍记录</a></li>
				<li><a href="unfinished_order.html">未完成订单</a></li>
				<li><a href="unpaid_order.html">已完成订单</a></li>
			</ul>
		</div>
		<div class="col-md-3 footer-grids fgd4">
			<h4>个人中心</h4> 
			<ul>
				
				<li><a href="login">登录</a></li>
				<li><a href="register">注册</a></li>
				<li><a href="address">收货地址</a></li>
				
			</ul>
		</div>
		<div class="clearfix"></div>
		<p class="copy-right">Copyright &copy; 2018.Company name All rights reserved.More Templates <a href="http://www.index.com/" target="_blank" title="喬治拍卖">喬治拍卖</a>  </a></p>
	</div>
</div>
	<!-- cart-js -->
	<script src="js/minicart.js"></script>
	<script>
        w3ls1.render();

        w3ls1.cart.on('w3sb1_checkout', function (evt) {
        	var items, len, i;

        	if (this.subtotal() > 0) {
        		items = this.items();

        		for (i = 0, len = items.length; i < len; i++) {
        			items[i].set('shipping', 0);
        			items[i].set('shipping2', 0);
        		}
        	}
        });
    </script>  
	<!-- //cart-js -->   
</body>
</html>