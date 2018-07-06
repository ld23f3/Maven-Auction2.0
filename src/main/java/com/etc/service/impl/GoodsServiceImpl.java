package com.etc.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etc.entity.Goods;
import com.etc.entity.GoodsView;
import com.etc.service.GoodsService;
@Service(value="goodsServiceImpl")
public class GoodsServiceImpl implements GoodsService {
  
	private GoodsService gs;
	@Override
	public int InsertGoods(Goods g) {
		// TODO Auto-generated method stub
		return gs.InsertGoods(g);
	}

	@Override
	public List<Goods> queryGoods(String goods_name) {
		// TODO Auto-generated method stub
		return gs.queryGoods(goods_name);
	}

	@Override
	public List<GoodsView> queryAllGoods() {
		// TODO Auto-generated method stub
		return gs.queryAllGoods();
	}

}
