package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.bean.entity.OrderBean;
import com.etc.dao.MyOrdersDao;
import com.etc.dao.OrderDao;
import com.etc.entity.Order;
import com.etc.service.OrderService;

/**
 * ”ÜÜŒœ‡ÍPòIÑ’Service åç¨FÓê
 * @author HongPeiQi
 *
 */
@Service(value="orderService")
public class OrderServiceImpl implements OrderService {

	@Resource(name="orderDao")
	private OrderDao orderDao;
	
	@Override
	public boolean addOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderBean> queryOrderByUserId(int user_id) {
		// TODO Auto-generated method stub
		return orderDao.queryOrderByUserId(user_id);
	}

	@Override
	public List<Order> queryOrderByUserIdAndState(int user_id, int orderstate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> queryOrderByState(int orderstate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> queryOrderByOrderDate(String order_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> queryOrderByUserAndOrderDate(int user_id, String order_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderBean> queryOrderByOrderId(int order_id) {
		// TODO Auto-generated method stub
		return orderDao.queryOrderByOrderId(order_id);
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payForPlatfrom(int user_id, double money, int order_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payForSeller(int user_id, double money) {
		// TODO Auto-generated method stub
		return false;
	}

}
