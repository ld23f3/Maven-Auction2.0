package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.bean.entity.GoodsBean;

@Repository(value = "myGoodsDao")
public interface MyGoodsDao {
	/**
	 * �����Ñ���̖��ԃ
	 * @param user_id
	 * �Ñ���̖
	 * @return
	 */
	public List<GoodsBean> queryGoodsByUserId(int user_id);
	
	/**
	 * ������Ʒ��Ų�ѯ
	 * @param goods_id
	 * @return
	 */
	public List<GoodsBean> queryGoodsByGoodsId(int goods_id);
	


}
