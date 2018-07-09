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

	// �õ����ļ�¼
	@RequestMapping(value = { "/mybidding", "record.html" })
	public String queryMybidding(Model model, HttpSession session) {
		Users user = (Users) session.getAttribute("user");
		int user_id = user.getUser_id();
		List<Mybidding> list = mybiddingService.queryMybidding(user_id);
		model.addAttribute("list", list);

		System.out.println(list);
		return "/Reception/record";

	}

	// ͨ��id��ʾgoodsҳ�棨�μ�������ҳ�棩,����һ��Ĭ��ֵ@requestparam
	@RequestMapping(value = "/single")
	public String showSingle(@RequestParam(value = "goodsId", required = false, defaultValue = "1") Integer goodsId,
			Model model) {
		Goods goods = mybiddingService.queryByGoodsId(goodsId);
		goods.getGoodsImg().forEach(System.out::println);
		model.addAttribute("goods", goods);
		return "/Reception/single";
	}

	// �޸�goods��ǰ�۸�
	@RequestMapping(value = "/updateGoods")
	public String updateGoods(Goods goods,HttpSession session) {
		Users user = (Users)session.getAttribute("user");
		mybiddingService.updateGoods(goods,user);
		System.out.println(
				"��Ʒ���" + goods.getGoods_id() + "��ǰ�۸�" + goods.getGoods_currentprice() + "״̬" + goods.getGood_state());
		return "redirect:single?goodsId="+goods.getGoods_id();

	}

	// ������ʱ������ʱ���޸���Ʒ��״̬
	@RequestMapping(value = "/uddateGoodsState")
	@ResponseBody
	public boolean updateGoodsState(@RequestBody Goods goods) {
		System.out.println("�޸ĺ��״̬" + goods.getGood_state() + "��Ʒ��id" + goods.getGoods_id());
		return mybiddingService.updateGoodsState(goods);

	}

}
