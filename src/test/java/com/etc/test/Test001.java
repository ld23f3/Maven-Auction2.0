package com.etc.test;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.security.RunAs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etc.dao.MybiddingDao;
import com.etc.entity.Goods;
import com.etc.entity.GoodsImg;
import com.etc.entity.Mybidding;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml","classpath:mybatis-config.xml"})
public class Test001 {
	@Resource(name="mybiddingDao")
	private MybiddingDao mybiddingDao;
	
	
	@Test
	public void queryMybidding() {	
		
	List<Mybidding> list=mybiddingDao.queryMybidding(1);	
	for (Mybidding mybidding : list) {
		System.out.println("mybidding"+mybidding);
	}
		
	}
	@Test
	public void getGoods() {
	Goods	list=mybiddingDao.queryByGoodsId(1);
		List<GoodsImg> list2= list.getGoodsImg();
//	System.out.println(list.getGoodsImg());
		for (GoodsImg goodsImg : list2) {
			System.out.println(goodsImg.getGoodsimg_src());
		}
		
	}
	@Test
	public void updateGoods() {
		Goods goods=new Goods();
		goods.setGoods_currentprice(150000);
		goods.setGoods_id(1);
		mybiddingDao.updateGoods(goods);
		
	}
	@Test
	public void addMybidding() {
		Mybidding m=new Mybidding();
		m.setUser_id(1);
		m.setGoods_id(1);
		m.setBid_state(0);
		m.setBid_price(9998);
		mybiddingDao.addMybidding(m);
		
	}
	@Test
	public void updateGoodsState() {
		Goods goods=new Goods();
		goods.setGood_state(1);
		goods.setGoods_id(1);
		
		mybiddingDao.updateGoodsState(goods);
	}
	
	@Test
	public void listById() {
		
	Goods	list=mybiddingDao.queryByGoodsId(1);
	
	System.out.println(list);
		
	}
	

}
