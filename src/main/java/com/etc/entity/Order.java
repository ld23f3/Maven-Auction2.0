package com.etc.entity;

/**
 * 实体类 订单表
 * @author HongPeiQi
 *
 */
public class Order {
	
	private int order_id; //订单编号 自增
	private int user_id; //用户编号
	private int goods_id; //商品编号
	private String address_id; //送货地址编号
	private String senddate; //发货时间
	private String payment; //付款方式
	private double sendprice; //运费
	private int order_state; //订单状态(1交易成功0交易关闭2未付款）
	private String order_date;//订购日期
	
	/**
	 * 默认构造
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增时调用构造	
	 * @param user_id
	 * @param goods_id
	 * @param address_id
	 * @param senddate
	 * @param payment
	 * @param sendprice
	 * @param orderstate
	 * @param goods_buydate
	 */
	public Order(int user_id, int goods_id, String address_id, String senddate, String payment, double sendprice,
			int order_state, String order_date) {
		super();
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.address_id = address_id;
		this.senddate = senddate;
		this.payment = payment;
		this.sendprice = sendprice;
		this.order_state = order_state;
		this.order_date = order_date;
	}
	
	/**
	 * 完整构造
	 * @param order_id
	 * @param user_id
	 * @param goods_id
	 * @param address_id
	 * @param senddate
	 * @param payment
	 * @param sendprice
	 * @param orderstate
	 * @param goods_buydate
	 */
	public Order(int order_id, int user_id, int goods_id, String address_id, String senddate, String payment,
			double sendprice, int order_state, String order_date) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.address_id = address_id;
		this.senddate = senddate;
		this.payment = payment;
		this.sendprice = sendprice;
		this.order_state = order_state;
		this.order_date = order_date;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getSenddate() {
		return senddate;
	}
	public void setSenddate(String senddate) {
		this.senddate = senddate;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public double getSendprice() {
		return sendprice;
	}
	public void setSendprice(double sendprice) {
		this.sendprice = sendprice;
	}
	public int getOrder_state() {
		return order_state;
	}
	public void setOrder_state(int order_state) {
		this.order_state = order_state;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", user_id=" + user_id + ", goods_id=" + goods_id + ", address_id="
				+ address_id + ", senddate=" + senddate + ", payment=" + payment + ", sendprice=" + sendprice
				+ ", order_state=" + order_state + ", order_date=" + order_date + "]";
	}
	
	
}
