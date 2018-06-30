package com.etc.entity;

/**
 * 实体类 用户信息表
 * 
 * @author HongPeiQi
 *
 */
public class Users {

	private int user_id; // 编号 自增
	private String user_acc; // 账号
	private String user_pwd; // 密码
	private String user_email; // 邮箱
	private String user_tel; // 电话
	private String user_realname; // 真实姓名
	private String user_cardid; // 身份证号码
	private String user_address; // 用户地址
	private double user_balance; // 用戶餘額
	private int user_state; // 用户状态(0启用1停权)
	private String user_create; // 新增时间
	private String user_modified; // 更新时间

	/**
	 * 默认构造
	 */
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 完整构造
	 * 
	 * @param uesr_id
	 * @param uesr_acc
	 * @param uesr_pwd
	 * @param user_email
	 * @param uesr_tel
	 * @param user_realname
	 * @param uesr_cardid
	 * @param user_address
	 * @param user_balance
	 * @param user_state
	 * @param user_create
	 * @param user_modified
	 */
	public Users(int user_id, String user_acc, String user_pwd, String user_email, String user_tel, String user_realname,
			String user_cardid, String user_address, double user_balance, int user_state, String user_create,
			String user_modified) {
		super();
		this.user_id = user_id;
		this.user_acc = user_acc;
		this.user_pwd = user_pwd;
		this.user_email = user_email;
		this.user_tel = user_tel;
		this.user_realname = user_realname;
		this.user_cardid = user_cardid;
		this.user_address = user_address;
		this.user_balance = user_balance;
		this.user_state = user_state;
		this.user_create = user_create;
		this.user_modified = user_modified;
	}

	/**
	 * 新增时调用构造
	 * 
	 * @param uesr_acc
	 *            账号
	 * @param uesr_pwd
	 *            密码
	 * @param user_email
	 *            邮箱
	 * @param uesr_tel
	 *            电话
	 * @param user_realname
	 *            真实姓名
	 * @param uesr_cardid
	 *            身份证号码
	 * @param user_address
	 *            用户地址
	 * @param user_balance
	 *            用戶餘額
	 * @param user_state
	 *            用户状态(0启用1停权)
	 * @param user_create
	 *            新增时间
	 * @param user_modified
	 *            更新时间
	 */

	public Users(String user_acc, String user_pwd, String user_email, String user_tel, String user_realname,
			String user_cardid, String user_address, double user_balance, int user_state, String user_create,
			String user_modified) {
		super();
		this.user_acc = user_acc;
		this.user_pwd = user_pwd;
		this.user_email = user_email;
		this.user_tel = user_tel;
		this.user_realname = user_realname;
		this.user_cardid = user_cardid;
		this.user_address = user_address;
		this.user_balance = user_balance;
		this.user_state = user_state;
		this.user_create = user_create;
		this.user_modified = user_modified;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_acc() {
		return user_acc;
	}

	public void setUser_acc(String user) {
		this.user_acc = user;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String uesr_tel) {
		this.user_tel = uesr_tel;
	}

	public String getUser_realname() {
		return user_realname;
	}

	public void setUser_realname(String user_realname) {
		this.user_realname = user_realname;
	}

	public String getUser_cardid() {
		return user_cardid;
	}

	public void setUser_cardid(String user_cardid) {
		this.user_cardid = user_cardid;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public double getUser_balance() {
		return user_balance;
	}

	public void setUser_balance(double user_balance) {
		this.user_balance = user_balance;
	}

	public int getUser_state() {
		return user_state;
	}

	public void setUser_state(int user_state) {
		this.user_state = user_state;
	}

	public String getUser_create() {
		return user_create;
	}

	public void setUser_create(String user_create) {
		this.user_create = user_create;
	}

	public String getUser_modified() {
		return user_modified;
	}

	public void setUser_modified(String user_modified) {
		this.user_modified = user_modified;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_acc=" + user_acc + ", user_pwd=" + user_pwd + ", user_email="
				+ user_email + ", user_tel=" + user_tel + ", user_realname=" + user_realname + ", user_cardid="
				+ user_cardid + ", user_address=" + user_address + ", user_balance=" + user_balance + ", user_state="
				+ user_state + ", user_create=" + user_create + ", user_modified=" + user_modified + "]";
	}
	
	
}
