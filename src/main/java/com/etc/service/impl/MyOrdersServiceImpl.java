package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.bean.entity.OrderBean;
import com.etc.dao.MyOrdersDao;
import com.etc.service.MyOrdersService;

@Service(value="myOrdersService")
public class MyOrdersServiceImpl implements MyOrdersService {
	
	@Resource(name="myOrdersDao")
	private MyOrdersDao myOrdersDao;

	@Override
	public List<OrderBean> queryOrderByUserId(int user_id) {
		// TODO Auto-generated method stub
		return myOrdersDao.queryOrderByUserId(user_id);
	}
	
	@Override
	public List<OrderBean> queryOrderByOrderId(int order_id) {
		// TODO Auto-generated method stub
		return myOrdersDao.queryOrderByOrderId(order_id);
	}


}
