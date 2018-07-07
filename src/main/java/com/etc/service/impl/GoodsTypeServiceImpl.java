package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.GoodsTypeDao;
import com.etc.entity.GoodsType;
import com.etc.service.GoodsTypeService;

@Service(value="goodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService {

	@Resource(name="goodsTypeDao")
	private GoodsTypeDao goodsTypeDao;
	
	@Override
	public boolean addGoodsType(GoodsType goodsType) {
		return goodsTypeDao.addGoodsType(goodsType);
	}

	@Override
	public List<GoodsType> queryAllGoodsType() {
		return goodsTypeDao.queryAllGoodsType();
	}

	@Override
	public GoodsType queryGoodsTypeById(int goodstype_id) {
		return goodsTypeDao.queryGoodsTypeById(goodstype_id);
	}

	@Override
	public boolean delGoodsTypeById(int goodstype_id) {
		return goodsTypeDao.delGoodsTypeById(goodstype_id);
	}

	@Override
	public boolean updateTypeById(GoodsType goodsType) {
		return goodsTypeDao.updateTypeById(goodsType);
	}

}
