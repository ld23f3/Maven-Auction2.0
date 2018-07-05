package com.etc.dao;

import javax.annotation.Resource;

import com.etc.entity.Users;

@Resource(name="userDao")
public interface UsersDao {
	/**
	 * 用户注册
	 * @param user_acc
	 * @param user_email
	 * @param user_pwd
	 * @return
	 */
	public boolean register(Users users);
	/**
	 * 验证账号是否存在
	 * @param userAcc
	 * @return
	 */
	public Users validation(String userAcc);
	/**
	 * 登陆
	 * @param users
	 * @return
	 */
	public Users login(Users users);
	/**
	 * 完善信息
	 * @param users
	 * @return
	 */
	public boolean contact(Users users);
}
