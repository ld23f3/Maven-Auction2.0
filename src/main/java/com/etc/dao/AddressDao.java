package com.etc.dao;

import java.util.List;

import javax.annotation.Resource;

import com.etc.entity.ShoppingAddress;

@Resource(name="addressDao")
public interface AddressDao {
	/**
	 * 新增收货地址
	 * @param shoppingAddress
	 * @return
	 */
	public boolean addAddress(ShoppingAddress shoppingAddress);	
	
	/**
	 * 获取收货地址
	 * @param shoppingAddress
	 * @return
	 */
	public List<ShoppingAddress> getAddress(int user_id);
	
	
}
