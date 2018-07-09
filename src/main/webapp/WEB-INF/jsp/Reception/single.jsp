 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Single</title>
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
<!--flex slider-->
<script defer src="${pageContext.request.contextPath}/static/Assets/js/jquery.flexslider.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/Assets/css/flexslider.css" type="text/css" media="screen" />
<script>
	// Can also be used with $(document).ready()
	$(window).load(function() {
	  $('.flexslider').flexslider({
		animation: "slide",
		controlNav: "thumbnails"
	  });
	});
</script>
<!--flex slider-->

<script src="${pageContext.request.contextPath}/static/Assets/js/imagezoom.js"></script>
<!-- //js --> 

</head>
<body>
<div class="header-top-w3layouts">
	<div class="container">
		<div class="col-md-6 logo-w3">
			<a href="${pageContext.request.contextPath}/api/query"><img src="${pageContext.request.contextPath}/static/Assets/images/logo2.png" alt=" " /><h1>喬治拍卖</span></h1></a>
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
						<li class=" active"><a href="${pageContext.request.contextPath}/api/query" class="hyper "><span>首页</span></a></li>	
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
											<a href=""><img src="${pageContext.request.contextPath}/static/Assets/images/menu1.jpg" class="img-responsive" alt=""></a>
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
											<a href=""><img src="${pageContext.request.contextPath}/static/Assets/images/menu2.jpg" class="img-responsive" alt=""></a>
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
											<a href=""><img src="${pageContext.request.contextPath}/static/Assets/images/menu3.jpg" class="img-responsive" alt=""></a>
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
												<li><a href="javascript:selectFunction(${goods.user_id})"><i class="fa fa-angle-right" aria-hidden="true"></i>竞拍记录</a></li>
												<li><a href="unpaid_order.html"><i class="fa fa-angle-right" aria-hidden="true"></i>未付款订单</a></li>
												<li><a href="unfinished_order.html"><i class="fa fa-angle-right" aria-hidden="true"></i>未完成订单</a></li>
												<li><a href="completed_order.html"><i class="fa fa-angle-right" aria-hidden="true"></i>已完成订单</a></li>
										
											</ul>
											
										</div>
										
										<div class="col-sm-4 w3l">
											<a href=""><img src="${pageContext.request.contextPath}/static/Assets/images/menu4.jpg" class="img-responsive" alt=""></a>
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
				<input type="search" name="Search" placeholder="搜索商品..." required="">
				<button type="submit" class="btn btn-default search" aria-label="Left Align">
					<i class="fa fa-search" aria-hidden="true"> </i>
				</button>
			</form>
		</div>
		<div class="col-md-1 cart-wthree">
			<div class="cart"> 
				<!-- <form action="#" method="post" class="last"> 
					<input type="hidden" name="cmd" value="_cart" />
					<input type="hidden" name="display" value="1" />
					<button class="w3view-cart" type="submit" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button>
				</form>   -->
				<a href="javascript:selectFunction(${goods.user_id})"><button class="w3view-cart" type="button" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button></a>
				
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<div class="products">	 
		<div class="container">  
			<div class="single-page">
				<div class="single-page-row" id="detail-21">
					<div class="col-md-6 single-top-left">	
						<div class="flexslider">
							<ul class="slides">
							 <c:if test="${goods!=null }">
            	            <c:forEach items="${goods.goodsImg}" var="gg">
										<li data-thumb="${pageContext.request.contextPath}/static/Assets/images/GoodsImg/${gg.goodsimg_src}">
									<div class="thumb-image detail_images"> <img src="${pageContext.request.contextPath}/static/Assets/images/GoodsImg/${gg.goodsimg_src}" data-imagezoom="true" class="img-responsive" alt=""> </div>
								</li>
									</c:forEach>
                              </c:if>
								<%-- <li data-thumb="${pageContext.request.contextPath}/static/Assets/images/a10563633_1.jpg">
									<div class="thumb-image detail_images"> <img src="${pageContext.request.contextPath}/static/Assets/images/a10563633_1.jpg" data-imagezoom="true" class="img-responsive" alt=""> </div>
								</li>
								<li data-thumb="${pageContext.request.contextPath}/static/Assets/images/a10563633_2.jpg">
									 <div class="thumb-image"> <img src="${pageContext.request.contextPath}/static/Assets/images/a10563633_2.jpg" data-imagezoom="true" class="img-responsive" alt=""> </div>
								</li>
								<li data-thumb="${pageContext.request.contextPath}/static/Assets/images/a10563633_6.jpg">
								   <div class="thumb-image"> <img src="${pageContext.request.contextPath}/static/Assets/images/a10563633_6.jpg" data-imagezoom="true" class="img-responsive" alt=""> </div>
								</li>  --%>
								
							</ul>
						</div>
					</div>
					<div class="col-md-6 single-top-right">
						<h3 class="item_name"><!-- 清同治（官） 粉彩龙凤玉壶春瓶 -->${goods.goods_name }</h3>
						
						<!--拍品开拍时间等信息 -->
						<div class="itemTimeRowCls">
            	<div class="notBeginPaiDivCls">竞拍中</div>
            	<!-- <div class="juKaiPaiDivCls">距结束<span id="timeTitleSpan"></span>： <span id="toDay" class="djsSpanFontCls"></span> 天 <span id="toHour" class="djsSpanFontCls"></span> 时 <span id="toMinute" class="djsSpanFontCls"></span> 分 <span id="toSecond" class="djsSpanFontCls"></span> 秒</div>
            	<div class="guanZhuWeiGuanDivCls">
                	
                </div>
                <div class="juKaiPaiDivCls">开始时间：<span id="startTime"></span></div>
                <div class="juKaiPaiDivCls">结束时间：<span id="endTime"></span></div> -->
                <form name="clock">
									<!-- [Step2]: 这里可以更该页面上显示的提示信息 -->
									距离 2018 年 7 月 4 日结束，您将还有 <br>
									<!-- [Step3]: 这里可以改变时间的列长度 -->
									
										<span id="LeftTime"></span>
									
										
								</form>
            </div>
						
        	
         	<!--出价信息 -->
        	<div class="offerInfoRowCls">
            	<div class="floatLeft offerInfoColumnCls">当前价<span id="underRsrvPrice" style="display:none;color:red" onclick="doUnderRsrvPrice()">(未达保留价)</span></div>
            	<div class="floatLeft offerInfoColumnCls">起拍价</div>
            	<div class="floatLeft offerInfoColumnCls">最低加价</div>
            	
            	<div class="floatLeft offerCurrentPriceValInfoColumnCls" id="goodsId" style="display: none"  name="goods_id" >${goods.goods_id }</div> 
            	<div class="floatLeft offerCurrentPriceValInfoColumnCls" id="currentPrice">${goods.goods_currentprice }</div>
            	<div class="floatLeft offerValInfoColumnCls" id="startPrice">${goods.goods_minprice }</div>
            	<div class="floatLeft offerValInfoColumnCls" id="incrPrice">${goods.goods_minpremium }</div>
            	
            </div>
            
            <!--出价信息 -->

						<form action="updateGoods" method="post">
							<div class="myOfferInfoRowCls defaultHide" id="myBidBandDiv">
								<div class="floatLeft priceLabelDivCls">竞买价：</div>
								<%-- <div class="floatLeft priceLabelDivCls">${goods.goodsImg.goodsimg_src }</div> --%>

								<div class="floatLeft">
									<div class="priceDivCls">
										<!--<div class="floatLeft priceContentCls" id="selfPrice" >&nbsp;</div>-->
										<input type="text" class="offerCurrentPriceValInfoColumnCls"
											name="goods_id" id="goods_id" value="${goods.goods_id }"
											style="display: none" /> <input type="text"
											class="offerCurrentPriceValInfoColumnCls" name="user_id"
											id="user_id" value="${goods.user_id }" style="display: none" />
										<input type="text" class="offerCurrentPriceValInfoColumnCls"
											name="good_state" id="good_state"
											value="${goods.good_state }" style="display: none" /> <input
											type="text" class="offerCurrentPriceValInfoColumnCls"
											name="goods_modified" id="goods_modified"
											value="${goods.goods_modified }" style="display: none" /> <input
											type="text" readonly="readonly"
											class="floatLeft priceContentCls" id="selfPrice"
											name="goods_currentprice"
											value="${goods.goods_currentprice +goods.goods_minpremium } " />
									</div>
								</div>
							</div>
							<input type="submit" class="w3ls-cart" id="sub" value="确认出价" />
						</form>

						<!-- 当倒计时结束的时候修改状态 -->
					<form  >
					<input type="text"  class="offerCurrentPriceValInfoColumnCls goods_id" name="goods_id" id="goods_id"  value="${goods.goods_id }" style="display: none"/>
					<input type="text"  class="offerCurrentPriceValInfoColumnCls good_state" name="good_state" id="good_state"  value="${goods.good_state +1 }" style="display: none"/>	
						<input type="button" class="w3ls-cart" id="btn" value="确认出价"  style="display: none"/>
					</form>
					</div>
				   <div class="clearfix"> </div>  
				</div>
			</div> 
				
			<!-- collapse-tabs -->
			<div class="collpse tabs">
				
				<div class="panel-group collpse" id="accordion" role="tablist" aria-multiselectable="true">
					<div class="panel panel-default">
						<div class="panel-heading" role="tab" id="headingOne">
							<h4 class="panel-title">
								<a class="pa_italic" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
									<i class="fa fa-file-text-o fa-icon" aria-hidden="true"></i> 商品描述 <span class="fa fa-angle-down fa-arrow" aria-hidden="true"></span> <i class="fa fa-angle-up fa-arrow" aria-hidden="true"></i>
								</a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
							<div class="panel-body">
			<!-- 					款识：大清同治年制<br/>
注：关于“玉壶春瓶”的得名，传统上认为出自宋人“玉壶先春”之诗句，被认为是酒器，“玉壶春”在明代前应为酒名，如陆游《谢池春》中即有“玉壶春酒，约群仙同醉”之句，北宋词人张耒《复答迎郭侯犊车之句》有“玉壶春酒射朝霞，只看纤腰不看花”，均可为证。但也有学者认为，如今所说玉壶春瓶在宋代应称为胆瓶，做插花之用，南宋周去非《岭外代答巻八？花朩门？胆瓶蕉》中记载：“胆瓶蕉，一根唯一身，离地寸许，其身特大而其上渐小，至叶乃大开敷，长大翠緑，正如胆瓶中挿数枝蕉叶也。亭馆列植尤可爱玩，亦名象蹄蕉，言如象蹄然。”此拍品胎质细致，器型优美，外绘粉彩龙凤图，龙凤姿态矫健飘逸，布局严谨，绘制工细。
底书“大清同治年制”。 -->		
							${goods.goods_desc }
							
							</div>
						</div>
					</div>
					
					
					
				</div>
			</div>
			<!-- //collapse --> 
		</div>
	</div>
<!-- newsletter -->
	<div class="newsletter">
		<div class="container">
			<div class="col-md-6 w3agile_newsletter_left">
				
			</div>
			<div class="col-md-6 w3agile_newsletter_right">
				<!-- <form action="#" method="post">
					<input type="email" name="Email" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="submit" value="Subscribe" />
				</form> -->
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //newsletter -->
<div class="footer">
	<div class="container">
		<div class="col-md-3 footer-grids fgd1">
		<a href="${pageContext.request.contextPath}/api/query"><img src="${pageContext.request.contextPath}/static/Assets/images/logo2.png" alt=" " /><h3>喬治拍卖</span></h3></a>
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
				<li><a href="${pageContext.request.contextPath}/mybidding">竞拍记录</a></li>
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
		<p class="copy-right">Copyright &copy; 2018.Company name All rights reserved.More Templates <a href="${pageContext.request.contextPath}/api/query" target="_blank" title="喬治拍卖">喬治拍卖</a>  >网页模板</a></p>
	</div>
</div>
	<!-- cart-js -->
	<script src="${pageContext.request.contextPath}/static/Assets/js/minicart.js"></script>
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
	
	
	<script>
   //倒计时效果js代码
   var sh;
   function checktime(i){
    if(i<10){
        i="0"+i;
 
    }
    else{i=i;}
    return i;
   }
   function freshTime(){
    var endtime=new Date('2018/07/10');
    var nowtime=new Date();
    var lefttime=parseInt(endtime.getTime()-nowtime.getTime());//这是毫秒，如果再/1000就是秒
    // 获取剩下的日、小时、分钟、秒钟
    // 一天有多少毫秒，一小时有多少毫秒，一分钟有多少毫秒，一秒钟有多少毫秒
    var dm=24*60*60*1000;
    var d=parseInt(lefttime/dm);
    var hm=60*60*1000;
    var h=parseInt((lefttime/hm)%24);
    var mm=60*1000;
    var m=parseInt((lefttime/mm)%60);
    var s=parseInt((lefttime/1000)%60);
    m=checktime(m);
    s=checktime(s);
    document.getElementById('LeftTime').innerHTML=d+"天"+h+"小时"+m+"分钟"+s+"秒";
    if (lefttime<0) {
    	clearTimeout(sh);
         document.getElementById('LeftTime').innerHTML="拍卖活动已经结束！";
        //location="http://www.baidu.com"; 
        //当满足条件时按钮消失
        document.getElementById("sub").style.display="none"
        //下面是满足条件不能提交
       // document.getElementById("sub").disabled="disabled"
	      
        	//使用ajax局部刷新
        	
    		

			$.ajax({
				url : "uddateGoodsState",
				type : "put", //修改操作  put方法
				contentType:"application/json",			
				data:JSON.stringify({"goods_id":$(".goods_id").val(),"good_state":$(".good_state").val()}), //拼接json格式的数据?
				success : function(result) {
					console.log(result);
				}

			});
       
       
	     
    }
    
   } 
   freshTime();
   var sh;
   sh=setInterval('freshTime()',1000)
   
   
   
   /*当满足条件按钮变成灰色*/
/* function submitForm () {
  	if ($("#LeftTime").val()<0) {
  		document.getElementById("sub").style.display="none"
  		
  	}
  } 
 */   
 /* 点击购物车的时候吧userid转到控制器 */
 function  selectFunction(user_id){
		/* alert("user_id:"+user_id) */
		location.href="${pageContext.request.contextPath}/api/record.html";
		
	}
 
 
 
   /* 当倒计时小于0的时候改变商品的状态 */
  /*  var ggs;
  function adc(){
	 if($("#LeftTime").val()<0){
		 
		 $(function(){
			ggs=2;
			 
			    $("#myForm").submit();
			});
		 
	 }
	 
	 
 }  */
 
 
</script>
	
	
</body>
</html>
    