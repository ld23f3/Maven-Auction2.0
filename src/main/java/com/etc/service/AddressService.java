package com.etc.service;

import java.util.List;

import com.etc.entity.ShoppingAddress;

public interface AddressService {
	/**
	 * ��ӵ�ַ
	 * @param address
	 * @return True��ӳɹ� False���ʧ��
	 */
	public boolean addAddress(ShoppingAddress address);
	
	/**
	 * ��ѯ��ַ
	 * @param shoppingAddress
	 * @return
	 */
	public List<ShoppingAddress> getAddress(int user_id);
	
	/**
	 * ���µ�ַ
	 * @param address
	 * @return True���³ɹ� False����ʧ��
	 */
	public boolean updateAddress(ShoppingAddress address);
	
	/**
	 * �h����ַ
	 * @param address_id
	 * @return True�h���ɹ�  False�h��ʧ��
	 */
	public boolean deleteAddress(int address_id);
}
