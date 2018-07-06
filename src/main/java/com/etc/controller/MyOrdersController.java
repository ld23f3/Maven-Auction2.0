//package com.etc.controller;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.etc.bean.entity.GoodsBean;
//import com.etc.bean.entity.OrderBean;
//import com.etc.entity.Users;
//import com.etc.service.MyOrdersService;
//
//@Controller
//@RequestMapping(value="/api")
//public class MyOrdersController {
//	
//	@Resource(name="myOrdersService")
//	private MyOrdersService myOrdersService;
//	
//	@RequestMapping(value="orders", method = RequestMethod.GET)
//	public String queryOrdersByUserId(Model model,HttpSession httpSession) {
//		
//		
//		Users users = (Users)httpSession.getAttribute("user");
//		System.out.println("users"+users);
//		int user_id = users.getUser_id();
//		System.out.println("user_id"+user_id);
//		List<OrderBean> myorders = myOrdersService.queryOrderByUserId(user_id);
//		
//		model.addAttribute("myorders", myorders);
//		
//		myorders.forEach(System.out::println);
//		
//		return "Reception/myorders";
//	}
//	
//	@RequestMapping(value="ordersInfo/{order_id}", method = RequestMethod.GET)
//	public String queryGoodsByGoodsId(@PathVariable(value="order_id") int orderId ,Model model) {
//		
//		
//		System.out.println("ordersInfo:\n" + orderId);
//		
//		List<OrderBean> ordersInfo = myOrdersService.queryOrderByOrderId(orderId);
//		
//		model.addAttribute("ordersInfo", ordersInfo);
//
//		ordersInfo.forEach(System.out::println);
//		return "Reception/ordersInfo";
//	}
//	
//	
//
//}
