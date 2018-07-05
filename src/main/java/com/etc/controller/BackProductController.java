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
	 * ��ȡָ�����Ͳ�Ʒ���б� (�ϼ�,���֮���)
	 * 
	 * @param mav
	 *            �������÷��ص���ͼ�Լ�����
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
		// ��Ʒ���������0δ����1���ھ���2�ѳ��� 3���꣩
		if (good_state == 1) {
			/// �����ʾ���������Ļ�Ա
			mav.setViewName("/Back/goods-list");
		} else if (good_state == 2) {
			/// �����ʾ��ͣȨ�Ļ�Ա
			mav.setViewName("/Back/goods-list-sellOut");
		} else if (good_state == 3) {
			/// �����ʾ��ͣȨ�Ļ�Ա
			mav.setViewName("/Back/goods-list-sellDown");
		} else {
			mav.setViewName("/Back/goods-list-check");
		}
		return mav;
	}

	/**
	 * �¼���Ʒ
	 * 
	 * @param goods_id
	 * @return
	 */
	@RequestMapping(value = "downGood/{goods_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean stopGood(@PathVariable(value = "goods_id") int goods_id) {
		System.out.println("�¼���Ʒ" + goods_id);
		if (goods_id == 0) {
			return false;
		}
		return true;
	}

	/**
	 * �ϼ���Ʒ
	 * 
	 * @param goods_id
	 * @return
	 */
	@RequestMapping(value = "upGood/{goods_id}", method = RequestMethod.PUT)
	@ResponseBody
	public boolean activeGood(@PathVariable(value = "goods_id") int goods_id) {
		System.out.println("�ϼ���Ʒ");
		if (goods_id == 0)
			return false;
		return true;
	}

	/**
	 * ɾ����Ʒ
	 * 
	 * @param goods_id
	 * @return
	 */
	@RequestMapping(value = "deleteGood/{goods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteGood(@PathVariable(value = "goods_id") int goods_id) {
		if (goods_id == 0)
			return false;
		System.out.println("ɾ����Ʒ:" + goods_id);
		return true;
	}

	/**
	 * ����ɾ����Ʒ
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "deleteCheckGoods", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("����ɾ����Ʒ:" + list);
		return true;
	}
	/**
	 * �����¼���Ʒ
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "downCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean downCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("�����¼���Ʒ:" + list);
		return true;
	}
	/**
	 * �����ϼ���Ʒ
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "upCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean upCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("�����ϼ���Ʒ:" + list);
		return true;
	}
}
