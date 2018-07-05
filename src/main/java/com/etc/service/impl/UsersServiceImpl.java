package com.etc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.UsersDao;
import com.etc.entity.Users;
import com.etc.service.UsersService;

@Service(value="usersService")
public class UsersServiceImpl implements UsersService {
	
	@Resource(name="usersDao")
	private UsersDao usersDao;
	
	/**
	 * 用户注册
	 */
	@Override
	public boolean register(Users users) {

		return usersDao.register(users);
	}
	/**
	 * 账号验证
	 */
	public boolean validation(String userAcc) {
	
		Users user = usersDao.validation(userAcc);
		if (user!=null) {
			return true;
		}
		return false;
	}
	/**
	 * 登陆
	 */
	public Users login(Users users) {
		
		return usersDao.login(users);
		
	}
	/**
	 * 完善个人信息
	 */
	public boolean contact(Users users) {
		return usersDao.contact(users);
	}
}
