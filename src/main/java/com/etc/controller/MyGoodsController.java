//package com.etc.controller;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpSession;
//import javax.swing.Spring;
//
//import org.apache.catalina.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.etc.bean.entity.GoodsBean;
//import com.etc.entity.Users;
//import com.etc.service.MyGoodsService;
//
//@Controller
//@RequestMapping(value="/api")
//public class MyGoodsController {
//
//	@Resource(name="myGoodsService")
//	private MyGoodsService myGoodsService;
//	
//	@RequestMapping(value="goods", method = RequestMethod.GET)
//	public String queryGoodsByUserId(Model model ,HttpSession httpSession) {
//		
//		Users users = (Users)httpSession.getAttribute("user");
//		System.out.println("users"+users);
//		int user_id = users.getUser_id();
//		System.out.println("user_id"+user_id);
//		List<GoodsBean> mygoods = myGoodsService.queryGoodsByUserId(user_id);
//		
//		model.addAttribute("mygoods", mygoods);
//		
//		mygoods.forEach(System.out::println);
//		
//		return "Reception/mygoods";
//		
//	}
//	@RequestMapping(value="goodsInfo/{goods_id}", method = RequestMethod.GET)
//	public String queryGoodsByGoodsId(@PathVariable(value="goods_id") int goodsId ,Model model) {
//		
//		
//		System.out.println("goodsInfo:\n" + goodsId);
//		
//		List<GoodsBean> goodsInfo = myGoodsService.queryGoodsByGoodsId(goodsId);
//		
//		model.addAttribute("goodsInfo", goodsInfo);
//
//		goodsInfo.forEach(System.out::println);
//		return "Reception/goodsInfo";
//	}
//	
//}
