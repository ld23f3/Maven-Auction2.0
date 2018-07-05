package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.entity.GoodsType;

@Controller
@RequestMapping("type")
public class BackGoodsTypeController {
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public String getUsersList(Model model) {
		List<GoodsType> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			GoodsType goodType = new GoodsType(i, "goodstype_desc" + i, "goodstype_create" + i,
					"goodstype_modified" + i);
			list.add(goodType);
		}
		model.addAttribute("list", list);
		model.addAttribute("size", list.size());
		return "/Back/goods-type";
	}
}
