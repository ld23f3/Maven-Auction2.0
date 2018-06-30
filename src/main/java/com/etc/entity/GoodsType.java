package com.etc.entity;

/**
 * 实体类 商品类型表
 * @author HongPeiQi
 *
 */
public class GoodsType {
	
	private int goodstype_id; //编号 自增
	private String goodstype_desc; //类型描述
	private String goodstype_create; //新增时间
	private String goodstype_modified; //更新时间
	
	/**
	 * 默认构造
	 */
	public GoodsType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增时调用构造	
	 * @param goodstype_desc 类型描述
	 * @param goodstype_create 新增时间
	 * @param goodstype_modified 更新时间
	 */
	public GoodsType(String goodstype_desc, String goodstype_create, String goodstype_modified) {
		super();
		this.goodstype_desc = goodstype_desc;
		this.goodstype_create = goodstype_create;
		this.goodstype_modified = goodstype_modified;
	}
	
	/**
	 * 完整构造
	 * @param goodstype_id
	 * @param goodstype_desc
	 * @param goodstype_create
	 * @param goodstype_modified
	 */
	public GoodsType(int goodstype_id, String goodstype_desc, String goodstype_create, String goodstype_modified) {
		super();
		this.goodstype_id = goodstype_id;
		this.goodstype_desc = goodstype_desc;
		this.goodstype_create = goodstype_create;
		this.goodstype_modified = goodstype_modified;
	}
	public int getGoodstype_id() {
		return goodstype_id;
	}
	public void setGoodstype_id(int goodstype_id) {
		this.goodstype_id = goodstype_id;
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
	
	@Override
	public String toString() {
		return "GoodsType [goodstype_id=" + goodstype_id + ", goodstype_desc=" + goodstype_desc + ", goodstype_create="
				+ goodstype_create + ", goodstype_modified=" + goodstype_modified + "]";
	}

}
