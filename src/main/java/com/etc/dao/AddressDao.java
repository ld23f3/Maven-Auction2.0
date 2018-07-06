package com.etc.dao;

import java.util.List;

import javax.annotation.Resource;

import com.etc.entity.ShoppingAddress;

@Resource(name="addressDao")
public interface AddressDao {
	/**
	 * ��ӵ�ַ
	 * @param address
	 * @return True��ӳɹ� False���ʧ��
	 */
	public boolean addAddress(ShoppingAddress address);	
	
	/**
	 * ��ȡ�ջ���ַ
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
