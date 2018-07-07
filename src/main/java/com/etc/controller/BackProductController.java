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
		List<GoodsBean> list = gs.queryGoodsBeanByGoodtate(good_state);
		mav.addObject("list", list);
		mav.addObject("size", list.size());
		// ��Ʒ���������0δ����1���ھ���2�ѳ��� 3���꣩
		if (good_state == 1) {
			/// �����ʾ���ǳ����е���Ʒ
			mav.setViewName("/Back/goods-list");
		} else if (good_state == 2) {
			/// �����ʾ���۳�����Ʒ
			mav.setViewName("/Back/goods-list-sellOut");
		} else if (good_state == 3) {
			/// �����ʾ�¼ܵ���Ʒ
			mav.setViewName("/Back/goods-list-sellDown");
		} else {
			/// �����ʾ����˵���Ʒ
			mav.setViewName("/Back/goods-list-check");
		}
		return mav;
	}

	/**
	 * �¼���Ʒ ��0�����1���ھ���2�ѳ��� 3�¼ܣ�
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

		return gs.updateGoodsState(goods_id, 3);
	}

	/**
	 * �ϼ���Ʒ ��0�����1���ھ���2�ѳ��� 3�¼ܣ�
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
		return gs.updateGoodsState(goods_id, 1);
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
		// �б����,��ֱ��дɾ����.����޸ĸ�״̬��,�鲻���͵�����ɾ����
		return gs.updateGoodsState(goods_id, 5);
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
		// �б����,��ֱ��дɾ����.����޸ĸ�״̬��,�鲻���͵�����ɾ����
		return gs.batchSetGoodsState(list, 5);
	}

	/**
	 * �����¼���Ʒ ��0�����1���ھ���2�ѳ��� 3�¼ܣ�
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "downCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean downCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("�����¼���Ʒ:" + list);
		return gs.batchSetGoodsState(list, 3);
	}

	/**
	 * �����ϼ���Ʒ ��0�����1���ھ���2�ѳ��� 3�¼ܣ�
	 * 
	 * @param list
	 * @return
	 */
	@RequestMapping(value = "upCheckGoods", method = RequestMethod.PUT)
	@ResponseBody
	public boolean upCheckGoods(@RequestBody List<Integer> list) {
		System.out.println("�����ϼ���Ʒ:" + list);
		return gs.batchSetGoodsState(list, 1);
	}
}
