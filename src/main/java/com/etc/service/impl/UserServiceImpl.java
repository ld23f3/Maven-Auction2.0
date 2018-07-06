package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.UserDao;
import com.etc.entity.Users;
import com.etc.service.UserService;
import com.etc.util.PageData;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	//Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Resource(name="userDao")
	private UserDao userDao;

	@Override
	public boolean addUser(Users users) {

		return userDao.addUser(users);
	}
	@Override
	public boolean validation(String userAcc) {
	
		Users user = userDao.validation(userAcc);
		if (user!=null) {
			return true;
		}
		return false;
	}
	@Override
	public Users login(Users users) {
		
		return userDao.login(users);
		
	}
	@Override
	public boolean contact(Users users) {
		return userDao.contact(users);
	}
	
	@Override
	public boolean updateUser(Users user) {
		return userDao.updateUser(user);
	}

	@Override
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param) {
		return userDao.queryUsers(page, pageSize, param);
	}
	
	@Override
	public Users queryUsersById(int user_id) {
		return userDao.queryUsersById(user_id);
	}

	@Override
	public List<Users> queryUsersByName(String user_realName) {
		return userDao.queryUsersByName(user_realName);
	}

	@Override
	public PageData<Users> queryUserByState(Integer page, Integer pageSize,int user_state) {
		return userDao.queryUserByState(page, pageSize, user_state);
	}
	@Override
	public List<Users> queryUsersByState(int user_state) {
		return userDao.queryUsersByState(user_state);
	}
	@Override
	public boolean updateUserState(int user_id, int user_state) {
		return userDao.updateUserState(user_id, user_state);
	}
	@Override
	public boolean deleteUserById(int user_id) {
		return userDao.deleteUserById(user_id);
	}
	@Override
	public boolean batchSetUsersState(List<Integer> list, int user_state) {
		return userDao.batchSetUsersState(list, user_state);
	}
	@Override
	public boolean batchDeleteUsers(List<Integer> list) {
		return userDao.batchDeleteUsers(list);
	}
}
