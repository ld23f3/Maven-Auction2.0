package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Goods;
import com.etc.entity.Mybidding;
@Repository(value="mybiddingDao")
public interface MybiddingDao {
	
	//查询我的竞拍记录
	public List<Mybidding> queryMybidding(int user_id);
	
	
	//通过id得到商品的信息
	public Goods queryByGoodsId(int goodsId);
	
	//修改当前价格
	public boolean updateGoods(Goods goods);
	
	
	//添加竞拍记录
	
	public boolean addMybidding(Mybidding mybidding);
	
	
	//修改商品的状态
	public boolean updateGoodsState(Goods goods);
}
