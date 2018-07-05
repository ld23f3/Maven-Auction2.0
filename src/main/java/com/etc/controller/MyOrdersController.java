package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.bean.entity.OrderBean;
import com.etc.service.MyOrdersService;

@Controller
@RequestMapping(value="/api")
public class MyOrdersController {
	
	@Resource(name="myOrdersService")
	private MyOrdersService myOrdersService;
	
	@RequestMapping(value="orders", method = RequestMethod.GET)
	public String queryOrdersByUserId(Model model) {
		
		int user_id =7;
		
		List<OrderBean> myorders = myOrdersService.queryOrderByUserId(user_id);
		
		model.addAttribute("myorders", myorders);
		
		myorders.forEach(System.out::println);
		
		return "Reception/myorders";
	}
	
	

}
