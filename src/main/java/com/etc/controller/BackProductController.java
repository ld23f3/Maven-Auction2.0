package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.etc.bean.entity.GoodsBean;
import com.etc.entity.Goods;
import com.etc.service.GoodsService;

@Controller
@RequestMapping("goods")
public class BackProductController {
	@Resource(name = "goodsService")
	private GoodsService gs;

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
		List<GoodsBean> list = gs.queryGoodsBeanByGoodtate(good_state);
		mav.addObject("list", list);
		mav.addObject("size", list.size());
		// 商品竞拍情况（0未竞拍1正在竞拍2已出售 3流标）
		if (good_state == 1) {
			/// 这边显示的是出售中的商品
			mav.setViewName("/Back/goods-list");
		} else if (good_state == 2) {
			/// 这边显示已售出的商品
			mav.setViewName("/Back/goods-list-sellOut");
		} else if (good_state == 3) {
			/// 这边显示下架的商品
			mav.setViewName("/Back/goods-list-sellDown");
		} else {
			/// 这边显示待审核的商品
			mav.setViewName("/Back/goods-list-check");
		}
		return mav;
	}

	/**
	 * 下架商品 （0待审核1正在竞拍2已出售 3下架）
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

		return gs.updateGoodsState(goods_id, 3);
	}

	/**
	 * 上架商品 （0待审核1正在竞拍2已出售 3下架）
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
		return gs.updateGoodsState(goods_id, 1);
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
		// 有表关联,不直接写删除了.随便修改个状态码,查不到就当做是删除了
		return gs.updateGoodsState(goods_id, 5);
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
		// 有表关联,不直接写删除了.随便修改个状态码,查不到就当做是删除了
		return gs.batchSetGoodsState(list, 5);
	}

	/**
	 * 批量下架商品 （0待审核1正在竞拍2已出售 3下架）
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "downCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean downCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("批量下架商品:" + list);
		return gs.batchSetGoodsState(list, 3);
	}

	/**
	 * 批量上架商品 （0待审核1正在竞拍2已出售 3下架）
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "upCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean upCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("批量上架商品:" + list);
		return gs.batchSetGoodsState(list, 1);
	}
}
