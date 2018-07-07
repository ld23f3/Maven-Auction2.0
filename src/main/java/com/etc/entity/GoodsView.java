package com.etc.entity;

import java.io.Serializable;

public class GoodsView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3941587899915123677L;
	private String goods_name;
	private int goods_minprice;
	private String goodsimg_src;
	private int goods_id;
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public int getGoods_minprice() {
		return goods_minprice;
	}
	public void setGoods_minprice(int goods_minprice) {
		this.goods_minprice = goods_minprice;
	}
	public String getGoodsimg_src() {
		return goodsimg_src;
	}
	public void setGoodsimg_src(String goodsimg_src) {
		this.goodsimg_src = goodsimg_src;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public GoodsView(String goods_name, int goods_minprice, String goodsimg_src, int goods_id) {
		super();
		this.goods_name = goods_name;
		this.goods_minprice = goods_minprice;
		this.goodsimg_src = goodsimg_src;
		this.goods_id = goods_id;
	}
	public GoodsView() {
		super();
	}
	@Override
	public String toString() {
		return "GoodsView [goods_name=" + goods_name + ", goods_minprice=" + goods_minprice + ", goodsimg_src="
				+ goodsimg_src + ", goods_id=" + goods_id + "]";
	}
	
	

}
