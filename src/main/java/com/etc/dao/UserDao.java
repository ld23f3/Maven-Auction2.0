package com.etc.dao;

import java.util.List;

import javax.annotation.Resource;

import com.etc.entity.Users;
import com.etc.util.PageData;

@Resource(name="userDao")
public interface UserDao {
	/**
	 * 用户注册
	 * @param user_acc
	 * @param user_email
	 * @param user_pwd
	 * @return
	 */
	public boolean addUser(Users users);
	
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
	
	/**
	 * 更新用戶
	 * 
	 * @param user
	 * @return
	 */
	public boolean updateUser(Users user);

	/**
	 * 查詢所有用戶
	 * @param page 當前頁數
	 * @param pageSize 每頁數量
	 * @param param 參數
	 * @return
	 */
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param);

	/**
	 * 依據用戶編號->查詢用戶詳細資訊
	 * 
	 * @param user_id
	 *            用戶編號
	 * @return
	 */
	public Users queryUsersById(int user_id);

	/**
	 * 依據用戶名子->查詢用戶(模糊查詢)
	 * 
	 * @param user_realName
	 *            用戶名子
	 * @return
	 */
	public List<Users> queryUsersByName(String user_realName);

	/**
	 * 依據用戶狀態->查詢用戶
	 * 
	 * @param user_state
	 * @return
	 */
	public PageData<Users> queryUserByState(Integer page, Integer pageSize,int user_state);
}
