package com.etc.dao;

import javax.annotation.Resource;

import com.etc.entity.Users;

@Resource(name="userDao")
public interface UsersDao {
	/**
	 * �û�ע��
	 * @param user_acc
	 * @param user_email
	 * @param user_pwd
	 * @return
	 */
	public boolean register(Users users);
	/**
	 * ��֤�˺��Ƿ����
	 * @param userAcc
	 * @return
	 */
	public Users validation(String userAcc);
	/**
	 * ��½
	 * @param users
	 * @return
	 */
	public Users login(Users users);
	/**
	 * ������Ϣ
	 * @param users
	 * @return
	 */
	public boolean contact(Users users);
}
