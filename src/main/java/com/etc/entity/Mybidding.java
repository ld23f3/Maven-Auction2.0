package com.etc.entity;

/**
 * ʵ���� �ҵľ����
 * @author HongPeiQi
 *
 */
public class Mybidding {
	
	private int bid_id; //������� ����
	private int user_id; //�û���� ���
	private int goods_id;//��Ʒ������
	private Goods goods;//����һ����Ʒ��
	private double bid_price; //�û��ľ��ļ۸�
	private int bid_state; //��Ʒ���������0δ����1���ھ���2�ѳ��� 3���꣩
	private String bid_date; //��������
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
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
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
		return "Mybidding [bid_id=" + bid_id + ", user_id=" + user_id + ", goods_id=" + goods_id + ", goods=" + goods
				+ ", bid_price=" + bid_price + ", bid_state=" + bid_state + ", bid_date=" + bid_date + "]";
	}
	public Mybidding(int bid_id, int user_id, int goods_id, Goods goods, double bid_price, int bid_state,
			String bid_date) {
		super();
		this.bid_id = bid_id;
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.goods = goods;
		this.bid_price = bid_price;
		this.bid_state = bid_state;
		this.bid_date = bid_date;
	}
	public Mybidding() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
	
	
	
	
	
	

	
	
	
	
}
