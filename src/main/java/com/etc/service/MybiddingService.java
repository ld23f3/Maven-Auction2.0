package com.etc.service;

import java.util.List;

import com.etc.entity.Goods;
import com.etc.entity.Mybidding;
import com.etc.entity.Users;

public interface MybiddingService {
	// 显示我的竞标记录
	public List<Mybidding> queryMybidding(int user_id);

	// 通过id得到商品的信息
	public Goods queryByGoodsId(int goodsId);

	// 修改当前价格
	public boolean updateGoods(Goods goods,Users user);
	//增加竞拍记录
	public boolean addMybidding(Mybidding mybidding);
	//修改商品的状态
	public boolean updateGoodsState(Goods goods);
}
