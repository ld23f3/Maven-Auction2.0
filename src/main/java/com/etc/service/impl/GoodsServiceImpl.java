package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.bean.entity.GoodsBean;
import com.etc.dao.GoodsDao;
import com.etc.entity.Goods;
import com.etc.entity.GoodsView;
import com.etc.service.GoodsService;

//@Service(value="goodsServiceImpl")
@Service(value="goodsService")
public class GoodsServiceImpl implements GoodsService {
  
	private GoodsService gs;
	
	@Resource(name="goodsDao")
	private GoodsDao goodsDao;
	
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
	
	@Override
	public boolean addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Goods> queryGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GoodsBean> queryGoodsByGoodsId(int goods_id) {
		// TODO Auto-generated method stub
		return goodsDao.queryGoodsByGoodsId(goods_id);
	}

	@Override
	public List<Goods> queryGoodsByName(String goods_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> queryGoodsByType(int goods_typeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GoodsBean> queryGoodsByUserId(int user_id) {
		// TODO Auto-generated method stub
		return goodsDao.queryGoodsByUserId(user_id);
	}

	@Override
	public List<Goods> queryGoodsByUserIdAndType(int user_id, int goods_typeid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<GoodsBean> queryGoodsBean() {
		return goodsDao.queryGoodsBean();
	}

	@Override
	public List<GoodsBean> queryGoodsBeanByGoodtate(int good_state) {
		return goodsDao.queryGoodsBeanByGoodtate(good_state);
	}

	@Override
	public boolean updateGoodsState(int goods_id, int good_state) {
		return goodsDao.updateGoodsState(goods_id, good_state);
	}

	@Override
	public boolean batchSetGoodsState(List<Integer> list, int good_state) {
		return goodsDao.batchSetGoodsState(list, good_state);
	}


}
