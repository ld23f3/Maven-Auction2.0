package com.etc.entity;

/**
 * 实体类 商品表
 * @author HongPeiQi
 *
 */
public class Goods {

	private int goods_id; //商品编号 自增
	private String goods_name; //商品名称
	private double goods_minprice; //商品起拍价格
	private double goods_currentprice; //商品当前竞拍价格
	private double goods_getprice; //商品得标价格
	private int goods_typeid; //商品类型编号
	private String goods_desc; //商品描述
	private int good_state; //商品竞拍情况（0未竞拍1正在竞拍2已出售 3流标）
	private int user_id; //用户编号
	private double goods_minpremium; //最低加价
	private int goods_auctiontime; //商品拍卖时间（单位：天）
	private double goods_margin; //商品竞拍保证金
	private String goods_create; //新增时间
	private String goods_modified; //更新时间
		
	
	/**
	 * 默认构造
	 */
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增时调用构造	
	 * @param goods_name 商品名称
	 * @param goods_minprice 商品起拍价格
	 * @param goods_currentprice 商品当前竞拍价格
	 * @param goods_getprice 商品得标价格
	 * @param goods_typeid 商品类型编号
	 * @param goods_desc 商品描述
	 * @param good_state 商品竞拍情况（0未竞拍1正在竞拍2已出售 3流标）
	 * @param user_id 用户编号
	 * @param goods_minpremium 最低加价
	 * @param goods_auctiontime 商品拍卖时间（单位：天）
	 * @param goods_margin 商品竞拍保证金
	 * @param goods_create 新增时间
	 * @param goods_modified 更新时间
	 */
	public Goods(String goods_name, double goods_minprice, double goods_currentprice, double goods_getprice,
			int goods_typeid, String goods_desc, int good_state, int user_id, double goods_minpremium,
			int goods_auctiontime, double goods_margin, String goods_create, String goods_modified) {
		super();
		this.goods_name = goods_name;
		this.goods_minprice = goods_minprice;
		this.goods_currentprice = goods_currentprice;
		this.goods_getprice = goods_getprice;
		this.goods_typeid = goods_typeid;
		this.goods_desc = goods_desc;
		this.good_state = good_state;
		this.user_id = user_id;
		this.goods_minpremium = goods_minpremium;
		this.goods_auctiontime = goods_auctiontime;
		this.goods_margin = goods_margin;
		this.goods_create = goods_create;
		this.goods_modified = goods_modified;
	}


	/**
	 * 完整构造
	 * @param goods_id
	 * @param goods_name
	 * @param goods_minprice
	 * @param goods_currentprice
	 * @param goods_getprice
	 * @param goods_typeid
	 * @param goods_desc
	 * @param good_state
	 * @param user_id
	 * @param goods_minpremium
	 * @param goods_auctiontime
	 * @param goods_margin
	 * @param goods_create
	 * @param goods_modified
	 */
	public Goods(int goods_id, String goods_name, double goods_minprice, double goods_currentprice,
			double goods_getprice, int goods_typeid, String goods_desc, int good_state, int user_id,
			double goods_minpremium, int goods_auctiontime, double goods_margin, String goods_create,
			String goods_modified) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_minprice = goods_minprice;
		this.goods_currentprice = goods_currentprice;
		this.goods_getprice = goods_getprice;
		this.goods_typeid = goods_typeid;
		this.goods_desc = goods_desc;
		this.good_state = good_state;
		this.user_id = user_id;
		this.goods_minpremium = goods_minpremium;
		this.goods_auctiontime = goods_auctiontime;
		this.goods_margin = goods_margin;
		this.goods_create = goods_create;
		this.goods_modified = goods_modified;
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
	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_minprice=" + goods_minprice
				+ ", goods_currentprice=" + goods_currentprice + ", goods_getprice=" + goods_getprice
				+ ", goods_typeid=" + goods_typeid + ", goods_desc=" + goods_desc + ", good_state=" + good_state
				+ ", user_id=" + user_id + ", goods_minpremium=" + goods_minpremium + ", goods_auctiontime="
				+ goods_auctiontime + ", goods_margin=" + goods_margin + ", goods_create=" + goods_create
				+ ", goods_modified=" + goods_modified + "]";
	}
	
	
}
