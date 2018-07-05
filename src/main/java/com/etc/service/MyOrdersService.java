package com.etc.service;

import java.util.List;

import com.etc.bean.entity.OrderBean;

public interface MyOrdersService {
	
	public List<OrderBean> queryOrderByUserId(int user_id);

}
