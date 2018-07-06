package com.etc.service.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.UserDao;
import com.etc.entity.Users;
import com.etc.service.UserService;
import com.etc.util.PageData;

@Service(value="usersService")
public class UserServiceImpl implements UserService {
	
	//Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Resource(name="usersDao")
	private UserDao userDao;
	
	/**
	 * 用户注册
	 */
	@Override
	public boolean addUser(Users users) {

		return userDao.addUser(users);
	}
	/**
	 * 账号验证
	 */
	public boolean validation(String userAcc) {
	
		Users user = userDao.validation(userAcc);
		if (user!=null) {
			return true;
		}
		return false;
	}
	/**
	 * 登陆
	 */
	public Users login(Users users) {
		
		return userDao.login(users);
		
	}
	/**
	 * 完善个人信息
	 */
	public boolean contact(Users users) {
		return userDao.contact(users);
	}
	
	@Override
	public boolean updateUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param) {
		// TODO Auto-generated method stub
		return userDao.queryUsers(page, pageSize, null);
	}
	
	@Override
	public Users queryUsersById(int user_id) {
		// TODO Auto-generated method stub
		return userDao.queryUsersById(user_id);
	}

	@Override
	public List<Users> queryUsersByName(String user_realName) {
		// TODO Auto-generated method stub
		return userDao.queryUsersByName(user_realName);
	}

	@Override
	public PageData<Users> queryUserByState(Integer page, Integer pageSize,int user_state) {
		// TODO Auto-generated method stub
		return userDao.queryUserByState(page, pageSize, user_state);
	}
}
