package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.bean.entity.OrderBean;
import com.etc.entity.Order;

/**
 * 訂單相關dao
 * 
 * @author HongPeiQi
 *
 */
@Repository(value = "orderDao")
public interface OrderDao {

	/**
	 * 添加訂單
	 * 
	 * @param order
	 * @return True 成功 False 失敗
	 */
	public boolean addOrder(Order order);

	/**
	 * 依據用戶編號->查詢所屬訂單
	 * 
	 * @param user_id
	 *            用戶編號
	 * @return List
	 */
	public List<OrderBean> queryOrderByUserId(int user_id);

	/**
	 * 依據訂單狀態->查詢用戶所屬訂單
	 * 
	 * @param user_id
	 *            用戶編號
	 * @param orderstate
	 *            訂單狀態
	 * @return List
	 */
	public List<Order> queryOrderByUserIdAndState(int user_id, int orderstate);

	/**
	 * 依據訂單狀態->查詢所有訂單
	 * 
	 * @param orderstate
	 *            訂單狀態
	 * @return List
	 */
	public List<Order> queryOrderByState(int orderstate);

	/**
	 * 依據下單日期->查詢所有訂單
	 * 
	 * @param order_date
	 *            下單日期
	 * @return List
	 */
	public List<Order> queryOrderByOrderDate(String order_date);

	/**
	 * 依據下單日期->查詢用戶所屬訂單
	 * 
	 * @param user_id
	 *            用戶編號
	 * @param order_date
	 *            下單日期
	 * @return
	 */
	public List<Order> queryOrderByUserAndOrderDate(int user_id, String order_date);

	/**
	 * 依據訂單編號->查詢詳細資料
	 * 
	 * @param order_id
	 * @return
	 */
	public List<OrderBean> queryOrderByOrderId(int order_id);

	/**
	 * 更新訂單
	 * 
	 * @param order
	 * @return
	 */
	public boolean updateOrder(Order order);

	/**
	 * 用戶付款給平台
	 * 
	 * @param user_id
	 *            用戶編號
	 * @param money
	 *            金額
	 * @param order_id
	 *            訂單編號
	 * @return
	 */
	public boolean payForPlatfrom(int user_id, double money, int order_id);

	/**
	 * 平台付款給用戶
	 * @param user_id
	 * @param money
	 * @return
	 */
	public boolean payForSeller(int user_id, double money);

}
