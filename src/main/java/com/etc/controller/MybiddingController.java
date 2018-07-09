package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.entity.Goods;
import com.etc.entity.Mybidding;
import com.etc.entity.Users;
import com.etc.service.MybiddingService;

@Controller
@RequestMapping(value = { "api", "" })
public class MybiddingController {
	@Resource(name = "mybiddingService")
	private MybiddingService mybiddingService;

	// 得到竞拍记录
	@RequestMapping(value = { "/mybidding", "record.html" })
	public String queryMybidding(Model model, HttpSession session) {
		Users user = (Users) session.getAttribute("user");
		int user_id = user.getUser_id();
		List<Mybidding> list = mybiddingService.queryMybidding(user_id);
		model.addAttribute("list", list);

		System.out.println(list);
		return "/Reception/record";

	}

	// 通过id显示goods页面（参加拍卖的页面）,设置一个默认值@requestparam
	@RequestMapping(value = "/single")
	public String showSingle(@RequestParam(value = "goodsId", required = false, defaultValue = "1") Integer goodsId,
			Model model) {
		Goods goods = mybiddingService.queryByGoodsId(goodsId);
		goods.getGoodsImg().forEach(System.out::println);
		model.addAttribute("goods", goods);
		return "/Reception/single";
	}

	// 修改goods当前价格
	@RequestMapping(value = "/updateGoods")
	public String updateGoods(Goods goods,HttpSession session) {
		Users user = (Users)session.getAttribute("user");
		mybiddingService.updateGoods(goods,user);
		System.out.println(
				"商品编号" + goods.getGoods_id() + "当前价格" + goods.getGoods_currentprice() + "状态" + goods.getGood_state());
		return "redirect:single?goodsId="+goods.getGoods_id();

	}

	// 当倒计时结束的时候修改商品的状态
	@RequestMapping(value = "/uddateGoodsState")
	@ResponseBody
	public boolean updateGoodsState(@RequestBody Goods goods) {
		System.out.println("修改后的状态" + goods.getGood_state() + "商品的id" + goods.getGoods_id());
		return mybiddingService.updateGoodsState(goods);

	}

}
