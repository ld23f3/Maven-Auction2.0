package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.bean.entity.OrderBean;

@Repository(value = "myOrdersDao")
public interface MyOrdersDao {
	
	/**
	 * �����Ñ���̖->��ԃ����ӆ��
	 * 
	 * @param user_id
	 *            �Ñ���̖
	 * @return List
	 */
	public List<OrderBean> queryOrderByUserId(int user_id);

}
