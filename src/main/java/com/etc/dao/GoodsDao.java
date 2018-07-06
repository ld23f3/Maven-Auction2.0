package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Goods;
import com.etc.entity.GoodsView;
@Repository(value="goodsDao")
public interface GoodsDao {
	public int InsertGoods(Goods g);
	public List<Goods> queryGoods(String goods_name); 
    public List<GoodsView> queryAllGoods();
}
