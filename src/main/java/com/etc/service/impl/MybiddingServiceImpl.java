package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etc.dao.MybiddingDao;
import com.etc.entity.Goods;
import com.etc.entity.Mybidding;
import com.etc.entity.Users;
import com.etc.service.MybiddingService;
@Service(value="mybiddingService")
public class MybiddingServiceImpl implements MybiddingService {
	@Resource(name="mybiddingDao")
	private MybiddingDao mybiddingDao;
	@Override
	public List<Mybidding> queryMybidding(int user_id) {
		// TODO Auto-generated method stub
		return mybiddingDao.queryMybidding(user_id);
	}

	
	@Override
	public Goods queryByGoodsId(int goodsId) {
		// TODO Auto-generated method stub
		return mybiddingDao.queryByGoodsId(goodsId);
	}
	@Override
	public boolean addMybidding(Mybidding mybidding) {
		// TODO Auto-generated method stub
		return mybiddingDao.addMybidding(mybidding);
	}
	
	@Override
	@Transactional
	//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
	public boolean updateGoods(Goods goods,Users user) {
		// TODO Auto-generated method stub
		//修改商品信息
		boolean	flag1=mybiddingDao.updateGoods(goods);
		//增加竞拍记录(事务)
		Mybidding mybidding=new Mybidding();
		mybidding.setUser_id(user.getUser_id());
		mybidding.setGoods_id(goods.getGoods_id());
		mybidding.setBid_state(goods.getGood_state());
		mybidding.setBid_date(goods.getGoods_modified());
		mybidding.setBid_price(goods.getGoods_currentprice());
		System.out.println("商品编号"+goods.getGoods_id()+"用户编号"+goods.getUser_id()+"商品的状态"+goods.getGood_state()+"用户提交的价格"+goods.getGoods_currentprice()+"更新的时间"+goods.getGoods_modified());
		System.out.println(mybidding.getUser_id());
		boolean flag2=mybiddingDao.addMybidding(mybidding);
		
		if(flag1 && flag2)
			
		return true;
		return false;
	}
	
	@Override
	public boolean updateGoodsState(Goods goods) {
		// TODO Auto-generated method stub
		return mybiddingDao.updateGoodsState(goods);
	}
	
}
