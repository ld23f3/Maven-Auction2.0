package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.bean.entity.OrderBean;

@Repository(value = "myOrdersDao")
public interface MyOrdersDao {
	
	/**
	 * 依據用戶編號->查詢所屬訂單
	 * 
	 * @param user_id
	 *            用戶編號
	 * @return List
	 */
	public List<OrderBean> queryOrderByUserId(int user_id);

}
