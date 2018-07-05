package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.bean.entity.GoodsBean;

@Repository(value = "myGoodsDao")
public interface MyGoodsDao {
	/**
	 * 依據用戶編號查詢
	 * @param user_id
	 * 用戶編號
	 * @return
	 */
	public List<GoodsBean> queryGoodsByUserId(int user_id);
	
	/**
	 * 根据商品编号查询
	 * @param goods_id
	 * @return
	 */
	public List<GoodsBean> queryGoodsByGoodsId(int goods_id);
	


}
