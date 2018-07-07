package com.etc.service;

import java.util.List;

import com.etc.entity.GoodsType;

public interface GoodsTypeService {

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
	public GoodsType queryGoodsTypeById(int goodstype_id);
	
	/**
	 * ����idɾ������
	 * @param goodstype_id
	 * @return
	 */
	public boolean delGoodsTypeById(int goodstype_id);
	/**
	 * ������Ʒ����
	 * 2018��7��7��10:52:56
	 * �޸���(LHC)
	 * ҵ����Ҫ
	 * @param goodsType
	 * @return
	 */
	public boolean updateTypeById(GoodsType goodsType);
}
