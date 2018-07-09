package com.etc.bean.entity;

public class OrderBean {
	
	private int order_id; //订单编号 自增
	private int user_id; //用户编号
	private String user_acc; // 账号
	private int goods_id; //商品编号
	private String goods_name; //商品名称
	private String goods_desc; //商品描述
	private String goodstype_desc; //类型描述
	private double goods_getprice; //商品得标价格
	private String address_id; //送货地址编号
	private String consignee_address; //收货人地址
	private String senddate; //发货时间
	private String payment; //付款方式
	private double sendprice; //运费
	private int order_state; //订单状态(1交易成功0交易关闭2未付款）
	private String order_date;//订购日期
	
	
	@Override
	public String toString() {
		return "OrderBean [order_id=" + order_id + ", user_id=" + user_id + ", user_acc=" + user_acc + ", goods_id="
				+ goods_id + ", goods_name=" + goods_name + ", goods_desc=" + goods_desc + ", goodstype_desc="
				+ goodstype_desc + ", goods_getprice=" + goods_getprice + ", address_id=" + address_id
				+ ", consignee_address=" + consignee_address + ", senddate=" + senddate + ", payment=" + payment
				+ ", sendprice=" + sendprice + ", order_state=" + order_state + ", order_date=" + order_date + "]";
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
	public String getUser_acc() {
		return user_acc;
	}
	public void setUser_acc(String user_acc) {
		this.user_acc = user_acc;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_desc() {
		return goods_desc;
	}
	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}
	public String getGoodstype_desc() {
		return goodstype_desc;
	}
	public void setGoodstype_desc(String goodstype_desc) {
		this.goodstype_desc = goodstype_desc;
	}
	public double getGoods_getprice() {
		return goods_getprice;
	}
	public void setGoods_getprice(double goods_getprice) {
		this.goods_getprice = goods_getprice;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getConsignee_address() {
		return consignee_address;
	}
	public void setConsignee_address(String consignee_address) {
		this.consignee_address = consignee_address;
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
	
	

}
