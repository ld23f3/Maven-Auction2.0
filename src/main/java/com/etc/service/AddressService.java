package com.etc.service;

import java.util.List;

import com.etc.entity.ShoppingAddress;

public interface AddressService {
	/**
	 * ������ַ
	 * @param users
	 * @return
	 */
	public boolean addAddress(ShoppingAddress shoppingAddress);
	
	/**
	 * ��ѯ��ַ
	 * @param shoppingAddress
	 * @return
	 */
	public List<ShoppingAddress> getAddress(int user_id);
}
