package com.etc.entity;

/**
 * 实体类 银行卡表
 * @author HongPeiQi
 *
 */
public class BankCard {

	private int bankcard_id; //编号 自增
	private int user_id; //用户编号 外键
	private String bankcard_number; //银行卡卡号 
	private String bankcard_create; //新增时间
	private String bankcard_modified; //更新时间
	
	/**
	 * 默认构造
	 */
	public BankCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增时调用构造
	 * @param user_id 用户编号 外键
	 * @param bankcard_number 银行卡卡号 
	 * @param bankcard_create 新增时间
	 * @param bankcard_modified 更新时间
	 */
	public BankCard(int user_id, String bankcard_number, String bankcard_create, String bankcard_modified) {
		super();
		this.user_id = user_id;
		this.bankcard_number = bankcard_number;
		this.bankcard_create = bankcard_create;
		this.bankcard_modified = bankcard_modified;
	}
	
	/**
	 * 完整构造
	 * @param bankcard_id
	 * @param user_id
	 * @param bankcard_number
	 * @param bankcard_create
	 * @param bankcard_modified
	 */
	public BankCard(int bankcard_id, int user_id, String bankcard_number, String bankcard_create,
			String bankcard_modified) {
		super();
		this.bankcard_id = bankcard_id;
		this.user_id = user_id;
		this.bankcard_number = bankcard_number;
		this.bankcard_create = bankcard_create;
		this.bankcard_modified = bankcard_modified;
	}
	public int getBankcard_id() {
		return bankcard_id;
	}
	public void setBankcard_id(int bankcard_id) {
		this.bankcard_id = bankcard_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getBankcard_number() {
		return bankcard_number;
	}
	public void setBankcard_number(String bankcard_number) {
		this.bankcard_number = bankcard_number;
	}
	public String getBankcard_create() {
		return bankcard_create;
	}
	public void setBankcard_create(String bankcard_create) {
		this.bankcard_create = bankcard_create;
	}
	public String getBankcard_modified() {
		return bankcard_modified;
	}
	public void setBankcard_modified(String bankcard_modified) {
		this.bankcard_modified = bankcard_modified;
	}
	@Override
	public String toString() {
		return "BankCard [bankcard_id=" + bankcard_id + ", user_id=" + user_id + ", bankcard_number=" + bankcard_number
				+ ", bankcard_create=" + bankcard_create + ", bankcard_modified=" + bankcard_modified + "]";
	}
	
	
	
}
