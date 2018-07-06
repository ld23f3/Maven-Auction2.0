package com.etc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;

import com.etc.entity.Users;
import com.etc.util.PageData;

@Resource(name="userDao")
public interface UserDao {
	/**
	 * �û�ע��
	 * @param user_acc
	 * @param user_email
	 * @param user_pwd
	 * @return
	 */
	public boolean addUser(Users users);
	
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
	
	/**
	 * �����Ñ�
	 * 
	 * @param user
	 * @return
	 */
	public boolean updateUser(Users user);

	/**
	 * ��ԃ�����Ñ�
	 * @param page ��ǰ퓔�
	 * @param pageSize ÿ퓔���
	 * @param param ����
	 * @return
	 */
	public PageData<Users> queryUsers(Integer page, Integer pageSize, Object... param);

	/**
	 * �����Ñ���̖->��ԃ�Ñ�Ԕ���YӍ
	 * 
	 * @param user_id
	 *            �Ñ���̖
	 * @return
	 */
	public Users queryUsersById(int user_id);

	/**
	 * �����Ñ�����->��ԃ�Ñ�(ģ����ԃ)
	 * 
	 * @param user_realName
	 *            �Ñ�����
	 * @return
	 */
	public List<Users> queryUsersByName(String user_realName);
	/**
	 * 2018��7��6��14:51:10
	 * �޸���(LHC)
	 * �����û�״̬��ѯ�û�
	 * (��̨��ѯʱ��Ҫ�����û�״̬����)
	 * @param user_state
	 * @return
	 */
	public List<Users> queryUsersByState(int user_state);
	/**
	 * 2018��7��6��17:57:27
	 * �޸���(LHC)
	 * �����û�ID�����û�״̬
	 * @param user_id �û�ID
	 * @param user_state �û�״̬
	 * @return
	 */
	public boolean updateUserState(@Param("user_id") int user_id,@Param("user_state") int user_state);
	/**
	 * 2018��7��6��17:57:27
	 * �޸���(LHC)
	 * ����ɾ���û�
	 * (��̨���������Ҫ,�˹���Ӧ������)
	 * @param user_id
	 * @return
	 */
	public boolean deleteUserById(int user_id);
	/**
	 * 2018��7��6��17:57:27
	 * �޸���(LHC)
	 * ���������û�״̬
	 * (��̨���������Ҫ)
	 * @param list
	 * @return
	 */
	public boolean batchSetUsersState(@Param("list")List<Integer> list ,@Param("user_state")int user_state);
	/**
	 * 2018��7��6��18:50:48
	 * �޸���(LHC)
	 * ����ɾ���û�
	 * (��̨���������Ҫ)
	 * @param list �û��б�
	 * @return
	 */
	public boolean batchDeleteUsers(List<Integer> list);
	/**
	 * �����Ñ���B->��ԃ�Ñ�
	 * 
	 * @param user_state
	 * @return
	 */
	public PageData<Users> queryUserByState(Integer page, Integer pageSize,int user_state);
}
