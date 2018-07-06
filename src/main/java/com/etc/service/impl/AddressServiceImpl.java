package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.AddressDao;
import com.etc.entity.ShoppingAddress;
import com.etc.service.AddressService;

@Service(value="addressService")
public class AddressServiceImpl implements AddressService {
	
	@Resource(name="addressDao")
	private AddressDao addressDao;
	
	/**
	 * ÐÂÔö×¡Ö·
	 */
	@Override
	public boolean addAddress(ShoppingAddress address) {
		// TODO Auto-generated method stub
		return addressDao.addAddress(address);
	}
	
	@Override
	public List<ShoppingAddress> getAddress(int user_id) {
		// TODO Auto-generated method stub
		return addressDao.getAddress(user_id);
	}
	
	@Override
	public boolean updateAddress(ShoppingAddress address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAddress(int address_id) {
		// TODO Auto-generated method stub
		return false;
	}
}
