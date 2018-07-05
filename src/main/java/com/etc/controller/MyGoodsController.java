package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.bean.entity.GoodsBean;
import com.etc.service.MyGoodsService;

@Controller
@RequestMapping(value="/api")
public class MyGoodsController {

	@Resource(name="myGoodsService")
	private MyGoodsService myGoodsService;
	
	@RequestMapping(value="goods", method = RequestMethod.GET)
	public String queryGoodsByUserId(Model model) {
		
		int user_id =7;
		List<GoodsBean> mygoods = myGoodsService.queryGoodsByUserId(user_id);
		
		model.addAttribute("mygoods", mygoods);
		
		mygoods.forEach(System.out::println);
		
		return "Reception/mygoods";
		
	}
	@RequestMapping(value="goodsInfo", method = RequestMethod.GET)
	@ResponseBody
	public String queryGoodsByGoodsId(@PathVariable(value="{goods_id}") int goodsId ,Model model) {
		
		
		System.out.println(goodsId);
		
		List<GoodsBean> goodsInfo = myGoodsService.queryGoodsByGoodsId(goodsId);
		
		model.addAttribute("goodsInfo", goodsInfo);

		goodsInfo.forEach(System.out::println);
		return "Reception/goodsInfo";
	}
	
}
