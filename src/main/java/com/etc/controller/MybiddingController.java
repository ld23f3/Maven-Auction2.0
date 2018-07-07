package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("goods", goods);
		return "/Reception/single";
	}

	// �޸�goods��ǰ�۸�
	@RequestMapping(value = "/updateGoods")
	public String updateGoods(Goods goods) {
		mybiddingService.updateGoods(goods);
		System.out.println(
				"��Ʒ���" + goods.getGoods_id() + "��ǰ�۸�" + goods.getGoods_currentprice() + "״̬" + goods.getGood_state());
		return "redirect:single";

	}

	// ������ʱ������ʱ���޸���Ʒ��״̬
	@RequestMapping(value = "/uddateGoodsState")
	public String updateGoodsState(Goods goods) {
		mybiddingService.updateGoodsState(goods);
		System.out.println("�޸ĺ��״̬" + goods.getGood_state());
		return "redirect:single";

	}

}
