package com.etc.service;

import java.util.List;

import com.etc.entity.GoodsType;

public interface GoodsTypeService {

	/**
	 * 添加分类
	 * @param goodsType
	 * @return
	 */
	public boolean addGoodsType(GoodsType goodsType);
	
	/**
	 * 查询全部分类
	 * @return
	 */
	public List<GoodsType> queryAllGoodsType();
	
	/**
	 * 根据id查询分类
	 * @param goodstype_id
	 * @return
	 */
	public List<GoodsType> queryGoodsTypeById(int goodstype_id);
	
	/**
	 * 根据id删除分类
	 * @param goodstype_id
	 * @return
	 */
	public boolean delGoodsTypeById(int goodstype_id);
}
