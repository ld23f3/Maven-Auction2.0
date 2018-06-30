package com.etc.entity;

/**
 * 实体类 我的竞标表
 * @author HongPeiQi
 *
 */
public class Mybidding {
	
	private int bid_id; //竞标表编号 自增
	private int user_id; //用户编号 外键
	private int good_id; //商品编号 外键
	private double bid_price; //用户的竞拍价格
	private int bid_state; //商品竞拍情况（0未竞拍1正在竞拍2已出售 3流标）
	private String bid_date; //竞标日期
	
	/**
	 * 默认构造
	 */
	public Mybidding() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 新增时调用构造	
	 * @param user_id
	 * @param good_id
	 * @param user_price
	 * @param goods_state
	 * @param goods_buydate
	 */
	public Mybidding(int user_id, int good_id, double bid_price, int bid_state, String bid_date) {
		super();
		this.user_id = user_id;
		this.good_id = good_id;
		this.bid_price = bid_price;
		this.bid_state = bid_state;
		this.bid_date = bid_date;
	}

	/**
	 * 完整构造
	 * @param bid_id
	 * @param user_id
	 * @param good_id
	 * @param user_price
	 * @param goods_state
	 * @param goods_buydate
	 */
	public Mybidding(int bid_id, int user_id, int good_id, double bid_price, int bid_state, String bid_date) {
		super();
		this.bid_id = bid_id;
		this.user_id = user_id;
		this.good_id = good_id;
		this.bid_price = bid_price;
		this.bid_state = bid_state;
		this.bid_date = bid_date;
	}



	public int getBid_id() {
		return bid_id;
	}


	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getGood_id() {
		return good_id;
	}


	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}


	public double getBid_price() {
		return bid_price;
	}


	public void setBid_price(double bid_price) {
		this.bid_price = bid_price;
	}


	public int getBid_state() {
		return bid_state;
	}


	public void setBid_state(int bid_state) {
		this.bid_state = bid_state;
	}


	public String getBid_date() {
		return bid_date;
	}


	public void setBid_date(String bid_date) {
		this.bid_date = bid_date;
	}


	@Override
	public String toString() {
		return "Mybidding [bid_id=" + bid_id + ", user_id=" + user_id + ", good_id=" + good_id + ", bid_price="
				+ bid_price + ", bid_state=" + bid_state + ", bid_date=" + bid_date + "]";
	}
	
}
