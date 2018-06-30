package com.etc.entity;

/**
 * 实体类 收货地址表 
 * @author HongPeiQi
 *
 */
public class ShoppingAddress {

	private int address_id; //地址编号 自增
	private int user_id; //寄件人编号
	private String consignee_name; //收货人姓名
	private String consignee_tel; //收货人电话
	private String consignee_address; //收货人地址
	private String address_create;//新增时间
	private String address_modified;//更新时间
	
	
	/**
	 * 默认构造
	 */
	public ShoppingAddress() {
		super();
	}
	
	/**
	 * 新增时调用构造		
	 * @param user_id 寄件人编号
	 * @param consignee_name 收货人姓名
	 * @param consignee_tel 收货人电话
	 * @param consignee_address 收货人地址
	 * @param address_create 新增时间
	 * @param address_modified 更新时间
	 */
	public ShoppingAddress(int user_id, String consignee_name, String consignee_tel, String consignee_address,
			String address_create, String address_modified) {
		super();
		this.user_id = user_id;
		this.consignee_name = consignee_name;
		this.consignee_tel = consignee_tel;
		this.consignee_address = consignee_address;
		this.address_create = address_create;
		this.address_modified = address_modified;
	}


	/**
	 * 完整构造
	 * @param address_id
	 * @param user_id
	 * @param consignee_name
	 * @param consignee_tel
	 * @param consignee_address
	 * @param address_create
	 * @param address_modified
	 */
	public ShoppingAddress(int address_id, int user_id, String consignee_name, String consignee_tel,
			String consignee_address, String address_create, String address_modified) {
		super();
		this.address_id = address_id;
		this.user_id = user_id;
		this.consignee_name = consignee_name;
		this.consignee_tel = consignee_tel;
		this.consignee_address = consignee_address;
		this.address_create = address_create;
		this.address_modified = address_modified;
	}

	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getConsignee_name() {
		return consignee_name;
	}
	public void setConsignee_name(String consignee_name) {
		this.consignee_name = consignee_name;
	}
	public String getConsignee_tel() {
		return consignee_tel;
	}
	public void setConsignee_tel(String consignee_tel) {
		this.consignee_tel = consignee_tel;
	}
	public String getConsignee_address() {
		return consignee_address;
	}
	public void setConsignee_address(String consignee_address) {
		this.consignee_address = consignee_address;
	}
	public String getAddress_create() {
		return address_create;
	}
	public void setAddress_create(String address_create) {
		this.address_create = address_create;
	}
	public String getAddress_modified() {
		return address_modified;
	}
	public void setAddress_modified(String address_modified) {
		this.address_modified = address_modified;
	}
	@Override
	public String toString() {
		return "ShoppingAddress [address_id=" + address_id + ", user_id=" + user_id + ", consignee_name="
				+ consignee_name + ", consignee_tel=" + consignee_tel + ", consignee_address=" + consignee_address
				+ ", address_create=" + address_create + ", address_modified=" + address_modified + "]";
	}
	
	
	
	
}
