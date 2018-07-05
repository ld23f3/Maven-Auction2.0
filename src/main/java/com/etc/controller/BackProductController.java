package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.Goods;

@Controller
@RequestMapping("goods")
public class BackProductController {
	/**
	 * 获取指定类型产品的列表 (上架,审核之类的)
	 * 
	 * @param mav
	 *            本操作该返回的视图以及数据
	 * @return
	 */
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public ModelAndView getGoodsList(
			@RequestParam(value = "good_state", required = false, defaultValue = "0") int good_state,
			ModelAndView mav) {
		List<Goods> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Goods good = new Goods(i, "goods_name" + i, 100, 200, 300, 1, "goods_desc", good_state, 1, 50, 3, 1000,
					"goods_create" + i, "goods_modified" + i);
			list.add(good);
		}
		mav.addObject("list", list);
		mav.addObject("size", list.size());
		mav.setViewName("/Back/goods-list");
		return mav;
	}
}
