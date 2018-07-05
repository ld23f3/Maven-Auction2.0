package com.etc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.entity.ShoppingAddress;
import com.etc.entity.Users;
import com.etc.service.AddressService;

@Controller
@RequestMapping("/api")
public class AddressController {
	
	@Resource(name="addressService")
	private AddressService addressService;
	/**
	 * ��ת��  ������ַҳ��
	 * @return
	 */
	@RequestMapping(value = "/addAddress", method = RequestMethod.GET)
	public String showAddAddress() {
		// System.out.println("showRegister");
		return "/Reception/front-addAddress";
	}
	
	/**
	 * ��ת���ҵĵ�ַҳ��
	 * @return
	 *//*
	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public String showAddress() {
		// System.out.println("showRegister");
		return "/Reception/front-address";
	}*/
	
	/**
	 * ������ַҳ�湦��ʵ��
	 * @param shoppingaddress
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/addAddress", method=RequestMethod.POST)
	public String addAddress(ShoppingAddress shoppingaddress,HttpSession session) {
		Date date = new Date();
		// ת����ʱ���ʽ12Сʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// �õ���д����Ϣ
		
		String consignee_name = shoppingaddress.getConsignee_name();
		String consignee_tel = shoppingaddress.getConsignee_tel();
		String consignee_address = shoppingaddress.getConsignee_address();
		String address_create = sdf.format(date);
		Users user =(Users) session.getAttribute("user");
		
		ShoppingAddress shoppingAddress = new ShoppingAddress();
		shoppingAddress.setConsignee_name(consignee_name);
		shoppingAddress.setConsignee_tel(consignee_tel);
		shoppingAddress.setConsignee_address(consignee_address);
		shoppingAddress.setAddress_create(address_create);
		shoppingAddress.setUser_id(user.getUser_id());
		
		boolean flag = addressService.addAddress(shoppingAddress);
		
		if(flag) {
			return "Reception/front-address";
		}
		return null;
	}
	
	/**
	 * �ҵĵ�ַҳ��ʵ��
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/address")
	public String getAddress(HttpSession session,Model model){

		Users user = (Users)session.getAttribute("user");
		int user_id = user.getUser_id();
		List<ShoppingAddress> ShopList =  addressService.getAddress(user_id);
		model.addAttribute("ShopList", ShopList);
		System.out.println(ShopList.toString());
		return "Reception/front-address";
	}
}
