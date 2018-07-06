package com.etc.entity;

import java.io.Serializable;

public class GoodsView implements Serializable {
	private String goods_name;
	private int goods_minprice;
	private String goodsimg_src;
	public GoodsView() {
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return "GoodsView [goods_name=" + goods_name + ", goods_minprice=" + goods_minprice + ", goodsimg_src="
				+ goodsimg_src + "]";
	}
	public GoodsView(String goods_name, int goods_minprice, String goodsimg_src) {
		super();
		this.goods_name = goods_name;
		this.goods_minprice = goods_minprice;
		this.goodsimg_src = goodsimg_src;
	}
	

}
