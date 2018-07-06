<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>发布商品</title>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/static/Assets/css/bootstrap.min.css" rel="stylesheet" />
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
				<li>+18045403380</li>
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
												<li><a href="login.html"><i class="fa fa-angle-right" aria-hidden="true"></i>登录</a></li>
												<li><a href="contact.html"><i class="fa fa-angle-right" aria-hidden="true"></i>个人信息</a></li>
												<li><a href="address.html"><i class="fa fa-angle-right" aria-hidden="true"></i>收货地址</a></li>
										
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
				<input type="search" name="Search" placeholder="Search for a Product..." required="">
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
<div class="sub-banner">
</div>
<div class="contact">
	<div class="container">
		<h3>发布商品</h3>
		
		<div class="col-md-3 col-sm-3 contact-left">

			
			<div class="w3ls_dresses_grid_left_grid">
				<h3>商品管理</h3>
					<div class="w3ls_dresses_grid_left_grid_sub">
						<div class="ecommerce_dres-type">
							<ul>
								<li><a href="publish_goods.html">发布商品</a></li>
								<li><a href="mygoods.html">我的卖品</a></li>
								
							</ul>
						</div>
					</div>
			</div>
		</div>
		<div class="col-md-9 col-sm-9 contact-right">
			<form action="${pageContext.request.contextPath}/FileUpload"method="post" enctype="multipart/form-data">
				<input type="text" name="Gname" placeholder="商品名称" required=" ">
				<select class="" name="Gselect">
								<option>字画</option>
								<option>陶瓷</option>
								<option>玉石</option>
								<option>杂项</option>
				</select>
				<input type="text" name="Gemail" placeholder="起拍价格" required=" ">
				<input type="text" name="Gnumber" placeholder="最低加价" required=" ">
				<input type="text" name="Greal" placeholder="商品竞拍保证金" required=" ">
				<input type="text" name="Gday" placeholder="拍卖天数" required=" ">
			
			
			<table>
				<tr>
					
					<td><input type=file name="file" id="doc" multiple 
                    onchange="showImage(this.value);">
                   
               
                <div id="localImag">
                    <img id="preview" width=-1 height=-1 style="diplay:none" />
                </div></td>
				
			
				
				<td>   <input type=file name="file" id="doc1" 
                    onchange="showImage(this.value);">
               
                <div id="localImag1">
                    <img id="preview1" width=-1 height=-1 style="diplay:none" />
                </div></td>
                
                
                <td> <input type=file name="file" id="doc2"
                    onchange="showImage(this.value);">
               
                <div id="localImag2">
                    <img id="preview2" width=-1 height=-1 style="diplay:none" />
                </div></td>
				</tr>
			
            
        
                
                
               
                </table>    

				<textarea  name="Gress" placeholder="商品描述" required=" "></textarea>
				<input type="submit" value="添加商品" id="sub">
			</form>
		</div>
	</div>
</div>

<!-- newsletter -->
	<div class="newsletter">
		<div class="container">
			<div class="col-md-6 w3agile_newsletter_left">
				
				<p></p>
			</div>
			<div class="col-md-6 w3agile_newsletter_right">
				<form action="#" method="post">
					<input type="email" name="Email" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="submit" value="Subscribe"  />
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
				
				<li><a href="login.html">登录</a></li>
				<li><a href="register.html">注册</a></li>
				<li><a href="address.html">收货地址</a></li>
				
			</ul>
		</div>
		<div class="clearfix"></div>
		<p class="copy-right">Copyright &copy; 2018.Company name All rights reserved.More Templates <a href="http://www.index.com/" target="_blank" title="喬治拍卖">喬治拍卖</a>  >网页模板</a></p>
	</div>
</div>
	<!-- cart-js -->
	<script type="text/javascript">
    function showImage(tValue) {
    	if(tValue!=''){
    		
    		var len = tValue.length;
	        var str = tValue.substr(tValue.lastIndexOf("."),len);
	if(str=='.jpg'||str=='.JPG'||str=='.gif'||str=='.GIF'||str=='.png'||str=='.PNG'||str=='.bmp'||str=='.BMP'){
		 $("#sub").show();
		var docObj = document.getElementById("doc");
        var imgObjPreview = document.getElementById("preview");
        
        var docObj1 = document.getElementById("doc1");
        var imgObjPreview1 = document.getElementById("preview1");

        var docObj2 = document.getElementById("doc2");
        var imgObjPreview2 = document.getElementById("preview2");
          if (docObj.files && docObj.files[0] ) {
            //火狐下，直接设img属性  
            imgObjPreview.style.display = 'block';
            imgObjPreview.style.width = '200px';
            imgObjPreview.style.height = '200px';
            
             imgObjPreview1.style.display = 'block';
            imgObjPreview1.style.width = '200px';
            imgObjPreview1.style.height = '200px';
            
             imgObjPreview2.style.display = 'block';
            imgObjPreview2.style.width = '200px';
            imgObjPreview2.style.height = '200px';
            //imgObjPreview.src = docObj.files[0].getAsDataURL();  
            //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式  
            imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);
            imgObjPreview1.src = window.URL.createObjectURL(docObj1.files[0]);
            imgObjPreview2.src = window.URL.createObjectURL(docObj2.files[0]);
            docObj.select();
            docObj1.select();
            docObj2.select();
        } 
	}else{
		alert("上传格式错误");
		 $("#sub").hide();
		
	}

        
    }}

</script>

	

	
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
