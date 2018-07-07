package com.etc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
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
import com.etc.service.GoodsTypeService;

@Controller
@RequestMapping("type")
public class BackGoodsTypeController {
	@Resource(name="goodsTypeService")
	private GoodsTypeService gts;
	/**
	 * ��ȡ��Ʒ������Ϣ
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "getList", method = RequestMethod.GET)
	public String getUsersList(Model model) {
		List<GoodsType> list = gts.queryAllGoodsType();
		model.addAttribute("list", list);
		model.addAttribute("size", list.size());
		return "/Back/goods-type";
	}

	/**
	 * ������ʾ(�޸�/���)����ҳ��
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
		// ������û�д��ݴ������,˵����ע�����,����Ҫ�ṩ����
		// ����������洫����һ���û�ID,Ҫ�Ѹ��û������ݶ��ύ��ҳ��,��ҳ����ô������
		if (goodstype_id != 0) {
			GoodsType goodType = gts.queryGoodsTypeById(goodstype_id);
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
	 * �����Ʒ����
	 * @param goodsType
	 * @return
	 */
	@RequestMapping(value = "addGoodsType", method = RequestMethod.POST)
	@ResponseBody
	public boolean registerUser(@RequestBody GoodsType goodsType) {
		return gts.addGoodsType(goodsType);
	}
	/**
	 * ������Ʒ����
	 * @param goodsType
	 * @return
	 */
	@RequestMapping(value = "updateGoodsType", method = RequestMethod.PUT)
	@ResponseBody
	public boolean updatePwd(@RequestBody GoodsType goodsType) {
		return gts.updateTypeById(goodsType);
	}
	/**
	 * ɾ����Ʒ����
	 * @param goodstype_id
	 * @return
	 */
	@RequestMapping(value = "deleteGoodstype/{goodstype_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteUser(@PathVariable(value = "goodstype_id") int goodstype_id) {
		if (goodstype_id == 0)
			return false;
		return gts.delGoodsTypeById(goodstype_id);
	}
}
