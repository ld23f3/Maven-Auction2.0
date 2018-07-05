package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
		System.out.println(good_state);
		// 商品竞拍情况（0未竞拍1正在竞拍2已出售 3流标）
		if (good_state == 1) {
			/// 这边显示的是正常的会员
			mav.setViewName("/Back/goods-list");
		} else if (good_state == 2) {
			/// 这边显示被停权的会员
			mav.setViewName("/Back/goods-list-sellOut");
		} else if (good_state == 3) {
			/// 这边显示被停权的会员
			mav.setViewName("/Back/goods-list-sellDown");
		} else {
			mav.setViewName("/Back/goods-list-check");
		}
		return mav;
	}

	/**
	 * 下架商品
	 * 
	 * @param goods_id
	 * @return
	 */
	@RequestMapping(value = "downGood/{goods_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean stopGood(@PathVariable(value = "goods_id") int goods_id) {
		System.out.println("下架商品" + goods_id);
		if (goods_id == 0) {
			return false;
		}
		return true;
	}

	/**
	 * 上架商品
	 * 
	 * @param goods_id
	 * @return
	 */
	@RequestMapping(value = "upGood/{goods_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean activeGood(@PathVariable(value = "goods_id") int goods_id) {
		System.out.println("上架商品");
		if (goods_id == 0)
			return false;
		return true;
	}

	/**
	 * 删除商品
	 * 
	 * @param goods_id
	 * @return
	 */
	@RequestMapping(value = "deleteGood/{goods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteGood(@PathVariable(value = "goods_id") int goods_id) {
		if (goods_id == 0)
			return false;
		System.out.println("删除商品:" + goods_id);
		return true;
	}

	/**
	 * 批量删除商品
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "deleteCheckGoods", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("批量删除商品:" + list);
		return true;
	}
	/**
	 * 批量下架商品
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "downCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean downCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("批量下架商品:" + list);
		return true;
	}
	/**
	 * 批量上架商品
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "upCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean upCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("批量上架商品:" + list);
		return true;
	}
}
