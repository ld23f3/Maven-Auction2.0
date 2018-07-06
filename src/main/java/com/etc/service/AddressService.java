package com.etc.service;

import java.util.List;

import com.etc.entity.ShoppingAddress;

public interface AddressService {
	/**
	 * 添加地址
	 * @param address
	 * @return True添加成功 False添加失敗
	 */
	public boolean addAddress(ShoppingAddress address);
	
	/**
	 * 查询地址
	 * @param shoppingAddress
	 * @return
	 */
	public List<ShoppingAddress> getAddress(int user_id);
	
	/**
	 * 更新地址
	 * @param address
	 * @return True更新成功 False更新失敗
	 */
	public boolean updateAddress(ShoppingAddress address);
	
	/**
	 * 刪除地址
	 * @param address_id
	 * @return True刪除成功  False刪除失敗
	 */
	public boolean deleteAddress(int address_id);
}
