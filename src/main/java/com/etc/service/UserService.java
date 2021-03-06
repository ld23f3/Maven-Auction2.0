package com.etc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etc.entity.Users;
import com.etc.util.PageData;

public interface UserService {
	/**
	 * 用户注册
	 * @param users
	 * @return
	 */
	public boolean addUser(Users users);
	
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
	
	/**
	 * 更新用戶
	 * @param user
	 * @return
	 */
	public boolean updateUser(Users user);	
	/**
	 * 查詢所有用戶
	 * @param page 當前頁數
	 * @param pageSize 總頁數
	 * @param param 參數
	 * @return
	 */
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param);
	
	/**
	 * 依據用戶編號->查詢用戶詳細資訊
	 * @param user_id 用戶編號
	 * @return
	 */
	public Users queryUsersById(int user_id);
	
	/**
	 * 依據用戶名子->查詢用戶(模糊查詢)
	 * @param user_realName 用戶名子
	 * @return
	 */
	public List<Users> queryUsersByName(String user_realName);
	/**
	 * 2018年7月6日14:51:10
	 * (LHC)
	 * 根据用户状态查询用户
	 * (后台查询时需要根据用户状态管理)
	 * @param user_state
	 * @return
	 */
	public List<Users> queryUsersByState(int user_state);
	/**
	 * 2018年7月6日17:57:27
	 * 修改人(LHC)
	 * 根据用户ID设置用户状态
	 * @param user_id 用户ID
	 * @param user_state 用户状态
	 * @return
	 */
	public boolean updateUserState(int user_id,int user_state);
	/**
	 * 依據用戶狀態->查詢用戶
	 * @param user_state
	 * @return
	 */
	public PageData<Users> queryUserByState(Integer pageNo, Integer pageSize,int user_state);
	/**
	 * 2018年7月6日17:57:27
	 * 修改人(LHC)
	 * 彻底删除用户
	 * (后台界面操作需要,此功能应该慎用)
	 * @param user_id
	 * @return
	 */
	public boolean deleteUserById(int user_id);
	/**
	 * 2018年7月6日17:57:27
	 * 修改人(LHC)
	 * 批量设置用户状态
	 * (后台界面操作需要)
	 * @param list
	 * @return
	 */
	public boolean batchSetUsersState(List<Integer> list ,int user_state);
	/**
	 * 2018年7月6日18:50:48
	 * 修改人(LHC)
	 * 批量删除用户
	 * (后台界面操作需要)
	 * @param list 用户列表
	 * @return
	 */
	public boolean batchDeleteUsers(List<Integer> list);
}
