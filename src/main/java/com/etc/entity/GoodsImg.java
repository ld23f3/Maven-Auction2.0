package com.etc.entity;

/**
 * 实体类 商品图片表
 * @author HongPeiQi
 *
 */
public class GoodsImg {
	
	private int goodsimg_id; //编号 自增
	private int goods_id; //商品编号 外键
	private String goodsimg_src; //照片地址
	private String goodsimg_create; //新增时间
	private String goodsimg_modified; //更新时间
	
	/**
	 * 默认构造
	 */
	public GoodsImg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增时调用构造
	 * @param goods_id 商品编号 外键
	 * @param goodsimg_src 照片地址
	 * @param goodsimg_create 新增时间
	 * @param goodsimg_modified 更新时间
	 */
	public GoodsImg(int goods_id, String goodsimg_src, String goodsimg_create, String goodsimg_modified) {
		super();
		this.goods_id = goods_id;
		this.goodsimg_src = goodsimg_src;
		this.goodsimg_create = goodsimg_create;
		this.goodsimg_modified = goodsimg_modified;
	}
	
	/**
	 * 完整构造
	 * @param goodsimg_id
	 * @param goods_id
	 * @param goodsimg_src
	 * @param goodsimg_create
	 * @param goodsimg_modified
	 */
	public GoodsImg(int goodsimg_id, int goods_id, String goodsimg_src, String goodsimg_create,
			String goodsimg_modified) {
		super();
		this.goodsimg_id = goodsimg_id;
		this.goods_id = goods_id;
		this.goodsimg_src = goodsimg_src;
		this.goodsimg_create = goodsimg_create;
		this.goodsimg_modified = goodsimg_modified;
	}
	public int getGoodsimg_id() {
		return goodsimg_id;
	}
	public void setGoodsimg_id(int goodsimg_id) {
		this.goodsimg_id = goodsimg_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoodsimg_src() {
		return goodsimg_src;
	}
	public void setGoodsimg_src(String goodsimg_src) {
		this.goodsimg_src = goodsimg_src;
	}
	public String getGoodsimg_create() {
		return goodsimg_create;
	}
	public void setGoodsimg_create(String goodsimg_create) {
		this.goodsimg_create = goodsimg_create;
	}
	public String getGoodsimg_modified() {
		return goodsimg_modified;
	}
	public void setGoodsimg_modified(String goodsimg_modified) {
		this.goodsimg_modified = goodsimg_modified;
	}
	@Override
	public String toString() {
		return "GoodsImg [goodsimg_id=" + goodsimg_id + ", goods_id=" + goods_id + ", goodsimg_src=" + goodsimg_src
				+ ", goodsimg_create=" + goodsimg_create + ", goodsimg_modified=" + goodsimg_modified + "]";
	}
	
}
