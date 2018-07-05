package com.etc.dao;

import java.util.List;

import javax.annotation.Resource;

import com.etc.entity.ShoppingAddress;

@Resource(name="addressDao")
public interface AddressDao {
	/**
	 * �����ջ���ַ
	 * @param shoppingAddress
	 * @return
	 */
	public boolean addAddress(ShoppingAddress shoppingAddress);	
	
	/**
	 * ��ȡ�ջ���ַ
	 * @param shoppingAddress
	 * @return
	 */
	public List<ShoppingAddress> getAddress(int user_id);
	
	
}
