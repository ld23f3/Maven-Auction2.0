package com.etc.service;

import com.etc.entity.Users;

public interface UsersService {
	/**
	 * 用户注册
	 * @param users
	 * @return
	 */
	public boolean register(Users users);
	/**
	 * 验证账号是否存在
	 * @param useracc
	 * @return
	 */
	public boolean validation(String userAcc);
	/**
	 * 登陆
	 * @param users
	 * @return
	 */
	public Users login(Users users);
	/**
	 * 完善个人信息
	 * @param users
	 * @return
	 */
	public boolean contact(Users users);
}
