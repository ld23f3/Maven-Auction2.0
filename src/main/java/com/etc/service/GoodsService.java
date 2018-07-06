package com.etc.service;

import java.util.List;

import com.etc.entity.Goods;
import com.etc.entity.GoodsView;

public interface GoodsService {

	public int InsertGoods(Goods g);
	public List<Goods> queryGoods(String goods_name); 
	 public List<GoodsView> queryAllGoods();
}
