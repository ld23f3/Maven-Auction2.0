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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<GoodsType> queryAllGoodsType() {
		// TODO Auto-generated method stub
		return goodsTypeDao.queryAllGoodsType();
	}

	@Override
	public List<GoodsType> queryGoodsTypeById(int goodstype_id) {
		// TODO Auto-generated method stub
		return goodsTypeDao.queryGoodsTypeById(goodstype_id);
	}

	@Override
	public boolean delGoodsTypeById(int goodstype_id) {
		// TODO Auto-generated method stub
		return false;
	}

}
