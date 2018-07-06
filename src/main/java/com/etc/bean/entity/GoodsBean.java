package com.etc.bean.entity;

public class GoodsBean {
	
	private int goods_id; //商品编号 自增
	private String goods_name; //商品名称
	private double goods_minprice; //商品起拍价格
	private double goods_currentprice; //商品当前竞拍价格
	private double goods_getprice; //商品得标价格
	private int goods_typeid; //商品类型编号
	private String goods_desc; //商品描述
	private int good_state; //商品竞拍情况（0未竞拍1正在竞拍2已出售 3流标）
	private int user_id; //用户编号
	private String user_acc; // 账号
	private double goods_minpremium; //最低加价
	private int goods_auctiontime; //商品拍卖时间（单位：天）
	private double goods_margin; //商品竞拍保证金
	private String goods_create; //新增时间
	private String goods_modified; //更新时间
	private String goodstype_desc; //类型描述
	private String goodstype_create; //新增时间
	private String goodstype_modified; //更新时间
	
	
	@Override
	public String toString() {
		return "GoodsBean [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_minprice=" + goods_minprice
				+ ", goods_currentprice=" + goods_currentprice + ", goods_getprice=" + goods_getprice
				+ ", goods_typeid=" + goods_typeid + ", goods_desc=" + goods_desc + ", good_state=" + good_state
				+ ", user_id=" + user_id + ", user_acc=" + user_acc + ", goods_minpremium=" + goods_minpremium
				+ ", goods_auctiontime=" + goods_auctiontime + ", goods_margin=" + goods_margin + ", goods_create="
				+ goods_create + ", goods_modified=" + goods_modified + ", goodstype_desc=" + goodstype_desc
				+ ", goodstype_create=" + goodstype_create + ", goodstype_modified=" + goodstype_modified + "]";
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
	public double getGoods_minprice() {
		return goods_minprice;
	}
	public void setGoods_minprice(double goods_minprice) {
		this.goods_minprice = goods_minprice;
	}
	public double getGoods_currentprice() {
		return goods_currentprice;
	}
	public void setGoods_currentprice(double goods_currentprice) {
		this.goods_currentprice = goods_currentprice;
	}
	public double getGoods_getprice() {
		return goods_getprice;
	}
	public void setGoods_getprice(double goods_getprice) {
		this.goods_getprice = goods_getprice;
	}
	public int getGoods_typeid() {
		return goods_typeid;
	}
	public void setGoods_typeid(int goods_typeid) {
		this.goods_typeid = goods_typeid;
	}
	public String getGoods_desc() {
		return goods_desc;
	}
	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}
	public int getGood_state() {
		return good_state;
	}
	public void setGood_state(int good_state) {
		this.good_state = good_state;
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
	public double getGoods_minpremium() {
		return goods_minpremium;
	}
	public void setGoods_minpremium(double goods_minpremium) {
		this.goods_minpremium = goods_minpremium;
	}
	public int getGoods_auctiontime() {
		return goods_auctiontime;
	}
	public void setGoods_auctiontime(int goods_auctiontime) {
		this.goods_auctiontime = goods_auctiontime;
	}
	public double getGoods_margin() {
		return goods_margin;
	}
	public void setGoods_margin(double goods_margin) {
		this.goods_margin = goods_margin;
	}
	public String getGoods_create() {
		return goods_create;
	}
	public void setGoods_create(String goods_create) {
		this.goods_create = goods_create;
	}
	public String getGoods_modified() {
		return goods_modified;
	}
	public void setGoods_modified(String goods_modified) {
		this.goods_modified = goods_modified;
	}
	public String getGoodstype_desc() {
		return goodstype_desc;
	}
	public void setGoodstype_desc(String goodstype_desc) {
		this.goodstype_desc = goodstype_desc;
	}
	public String getGoodstype_create() {
		return goodstype_create;
	}
	public void setGoodstype_create(String goodstype_create) {
		this.goodstype_create = goodstype_create;
	}
	public String getGoodstype_modified() {
		return goodstype_modified;
	}
	public void setGoodstype_modified(String goodstype_modified) {
		this.goodstype_modified = goodstype_modified;
	}
	
	
}