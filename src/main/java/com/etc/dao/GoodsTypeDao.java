package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.GoodsType;

@Repository(value="goodsTypeDao")
public interface GoodsTypeDao {
	
	/**
	 * ��ӷ���
	 * @param goodsType
	 * @return
	 */
	public boolean addGoodsType(GoodsType goodsType);
	
	/**
	 * ��ѯȫ������
	 * @return
	 */
	public List<GoodsType> queryAllGoodsType();
	
	/**
	 * ����id��ѯ����
	 * @param goodstype_id
	 * @return
	 */
	public List<GoodsType> queryGoodsTypeById(int goodstype_id);
	
	/**
	 * ����idɾ������
	 * @param goodstype_id
	 * @return
	 */
	public boolean delGoodsTypeById(int goodstype_id);

}
