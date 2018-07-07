package com.etc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.etc.bean.entity.GoodsBean;
import com.etc.entity.Goods;
import com.etc.entity.GoodsView;

public interface GoodsService {

	public int InsertGoods(Goods g);

	public List<Goods> queryGoods(String goods_name);

	public List<GoodsView> queryAllGoods();
	/**
     * 根据物品类型查询显示物品
     * @param goods_typeid
     * @return
     */
    public List<GoodsView> queryAllGoodsByType(int goods_typeid);
	/**
	 * 添加新商品
	 * 
	 * @param goods
	 *            商品
	 * @return ture 添加成功 false 添加失敗
	 */
	public boolean addGoods(Goods goods);

	/**
	 * 查詢所有商品
	 * 
	 * @return List
	 */
	public List<Goods> queryGoods();

	/**
	 * 依據商品ID 查詢商品詳細資訊
	 * 
	 * @param goods_id
	 *            商品編號
	 * @return Goods
	 */
	public List<GoodsBean> queryGoodsByGoodsId(int goods_id);

	/**
	 * 依據商品名稱 做模糊查詢
	 * 
	 * @param goods_name
	 *            商品名稱
	 * @return List
	 */
	public List<Goods> queryGoodsByName(String goods_name);

	/**
	 * 依據商品類別查詢
	 * 
	 * @param goods_typeid
	 *            商品類別編號
	 * @return List
	 */
	public List<Goods> queryGoodsByType(int goods_typeid);

	/**
	 * 依據用戶ID 查詢他所屬的商品
	 * 
	 * @param user_id
	 *            用戶ID
	 * @return List
	 */
	public List<GoodsBean> queryGoodsByUserId(int user_id);

	/**
	 * 依據用戶ID 與 商品類別做查詢
	 * 
	 * @param user_id
	 *            用戶編號
	 * @param goods_typeid
	 *            商品類別編號
	 * @return List
	 */
	public List<Goods> queryGoodsByUserIdAndType(int user_id, int goods_typeid);

	/**
	 * 更新訂單
	 * 
	 * @param goods
	 *            商品
	 * @return True 添加成功 False添加失敗
	 */
	public boolean updateGoods(Goods goods);
	/**
	 * 查詢所有商品
	 * 2018年7月7日9:58:19
	 * 修改人LHC
	 * (后台需要用到)
	 * @return GoodsBean
	 */
	public List<GoodsBean> queryGoodsBean();
	/**
	 * 查詢指定状态的商品
	 * 2018年7月7日10:08:46
	 * 修改人LHC
	 * (后台需要用到)
	 * @param good_state
	 * @return
	 */
	public List<GoodsBean> queryGoodsBeanByGoodtate(int good_state);
	/**
	 * 更新用户状态
	 * 2018年7月7日10:18:11
	 * 修改人(LHC)
	 * 操作商品的业务,上架下架,审核
	 * @param good_state 
	 * @return
	 */
	public boolean updateGoodsState(int goods_id ,int good_state);
	/**
	 * 批量设置商品状态
	 * 2018年7月7日10:36:02
	 * 修改人(LHC)
	 * 批量操作商品的业务,上架下架,审核
	 * @param list
	 * @param good_state
	 * @return
	 */
	public boolean batchSetGoodsState(List<Integer> list,int good_state);
}
