package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.entity.GoodsType;

@Controller
@RequestMapping("type")
public class BackGoodsTypeController {
	/**
	 * 获取商品分类信息
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public String getUsersList(Model model) {
		List<GoodsType> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			GoodsType goodType = new GoodsType(i, "goodstype_desc" + i, "goodstype_create" + i,
					"goodstype_modified" + i);
			list.add(goodType);
		}
		model.addAttribute("list", list);
		model.addAttribute("size", list.size());
		return "/Back/goods-type";
	}

	/**
	 * 请求显示(修改/添加)分类页面
	 * 
	 * @param user_id
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "askAdd", method = RequestMethod.GET)
	public String showEditUser(
			@RequestParam(value = "goodstype_id", required = false, defaultValue = "0") int goodstype_id,
			HttpServletRequest request, Model model) {
		// 如果这边没有传递传输过来,说明是注册界面,不需要提供参数
		// 否则如果界面传过来一个用户ID,要把该用户的数据都提交给页面,看页面怎么做处理
		if (goodstype_id != 0) {
			GoodsType goodType = new GoodsType(goodstype_id, "goodstype_desc" + goodstype_id,
					"goodstype_create" + goodstype_id, "goodstype_modified" + goodstype_id);
			model.addAttribute("goodType", goodType);
			model.addAttribute("actionSrc", request.getContextPath() + "/type/updateGoodsType");
			model.addAttribute("type", "PUT");
		} else {
			model.addAttribute("type", "POST");
			model.addAttribute("actionSrc", request.getContextPath() + "/type/addGoodsType");
		}
		return "/Back/goods-type-add";
	}
	/**
	 * 添加商品类型
	 * @param goodsType
	 * @return
	 */
	@RequestMapping(value = "addGoodsType", method = RequestMethod.POST)
	@ResponseBody
	public boolean registerUser(@RequestBody GoodsType goodsType) {
		System.out.println("addGoodsType:\n" + goodsType);
		return false;
	}
	/**
	 * 更新商品类型
	 * @param goodsType
	 * @return
	 */
	@RequestMapping(value = "updateGoodsType", method = RequestMethod.PUT)
	@ResponseBody
	public boolean updatePwd(@RequestBody GoodsType goodsType) {
		System.out.println("updateGoodsType:\n" + goodsType);
		return true;
	}
	/**
	 * 删除商品类型
	 * @param goodstype_id
	 * @return
	 */
	@RequestMapping(value = "deleteGoodstype/{goodstype_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteUser(@PathVariable(value = "goodstype_id") int goodstype_id) {
		if (goodstype_id == 0)
			return false;
		System.out.println("deleteGoodstype:\n" + goodstype_id);
		return false;
	}
}
