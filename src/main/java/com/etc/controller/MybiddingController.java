package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.druid.stat.TableStat.Mode;
import com.etc.dao.MybiddingDao;
import com.etc.entity.Goods;
import com.etc.entity.Mybidding;
import com.etc.service.MybiddingService;

@Controller
public class MybiddingController {
	@Resource(name="mybiddingService")
	private  MybiddingService mybiddingService;
	//得到竞拍记录
	@RequestMapping(value="/mybidding")	
	public String queryMybidding(int user_id,Model model) {
	List <Mybidding>list=mybiddingService.queryMybidding(user_id);
	model.addAttribute("list", list);
	
	System.out.println(list);
		return "/Reception/record";
		
	}
	
	//通过id显示goods页面（参加拍卖的页面）,设置一个默认值@requestparam
	@RequestMapping(value="/single")
	public String showSingle(@RequestParam(value="goodsId",required=false,defaultValue="1")Integer goodsId,Model model) {
	Goods	goods=mybiddingService.queryByGoodsId(goodsId);
	model.addAttribute("goods", goods);
		return "/Reception/single";
	}
	
	
	//修改goods当前价格
	@RequestMapping(value="/updateGoods")
	public String updateGoods(Goods goods) {
		mybiddingService.updateGoods(goods);
		System.out.println("商品编号"+goods.getGoods_id()+"当前价格"+goods.getGoods_currentprice()+"状态"+goods.getGood_state());
		return "redirect:single";
		
		
	}
	
	//当倒计时结束的时候修改商品的状态
	@RequestMapping(value="/uddateGoodsState")
	public String updateGoodsState(Goods goods) {
		mybiddingService.updateGoodsState(goods);
		System.out.println("修改后的状态"+goods.getGood_state());
		return   "redirect:single";
		
	}
	
	
	
}
