package com.etc.service;

import com.etc.entity.Users;

public interface UsersService {
	/**
	 * �û�ע��
	 * @param users
	 * @return
	 */
	public boolean register(Users users);
	/**
	 * ��֤�˺��Ƿ����
	 * @param useracc
	 * @return
	 */
	public boolean validation(String userAcc);
	/**
	 * ��½
	 * @param users
	 * @return
	 */
	public Users login(Users users);
	/**
	 * ���Ƹ�����Ϣ
	 * @param users
	 * @return
	 */
	public boolean contact(Users users);
}
