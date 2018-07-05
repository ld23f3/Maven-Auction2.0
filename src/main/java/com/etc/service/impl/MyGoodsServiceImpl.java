package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.bean.entity.GoodsBean;
import com.etc.dao.MyGoodsDao;
import com.etc.service.MyGoodsService;

@Service(value="myGoodsService")
public class MyGoodsServiceImpl implements MyGoodsService {
	
	@Resource(name="myGoodsDao")
	private MyGoodsDao myGoodsDao;

	@Override
	public List<GoodsBean> queryGoodsByUserId(int user_id) {
		// TODO Auto-generated method stub
		return myGoodsDao.queryGoodsByUserId(user_id);
	}
	@Override
	public List<GoodsBean> queryGoodsByGoodsId(int goods_id) {
		// TODO Auto-generated method stub
		return myGoodsDao.queryGoodsByGoodsId(goods_id);
	}
	


}
