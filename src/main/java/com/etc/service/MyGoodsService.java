package com.etc.service;

import java.util.List;

import com.etc.bean.entity.GoodsBean;

public interface MyGoodsService {
	
	public List<GoodsBean> queryGoodsByUserId(int user_id);
	
	public List<GoodsBean> queryGoodsByGoodsId(int goods_id);
	


}
