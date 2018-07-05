package com.etc.service;

import java.util.List;

import com.etc.entity.ShoppingAddress;

public interface AddressService {
	/**
	 * 新增地址
	 * @param users
	 * @return
	 */
	public boolean addAddress(ShoppingAddress shoppingAddress);
	
	/**
	 * 查询地址
	 * @param shoppingAddress
	 * @return
	 */
	public List<ShoppingAddress> getAddress(int user_id);
}
