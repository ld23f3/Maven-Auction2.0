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
	 * �û�ע��
	 */
	@Override
	public boolean register(Users users) {

		return usersDao.register(users);
	}
	/**
	 * �˺���֤
	 */
	public boolean validation(String userAcc) {
	
		Users user = usersDao.validation(userAcc);
		if (user!=null) {
			return true;
		}
		return false;
	}
	/**
	 * ��½
	 */
	public Users login(Users users) {
		
		return usersDao.login(users);
		
	}
	/**
	 * ���Ƹ�����Ϣ
	 */
	public boolean contact(Users users) {
		return usersDao.contact(users);
	}
}
