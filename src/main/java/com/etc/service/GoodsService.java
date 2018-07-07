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
     * ������Ʒ���Ͳ�ѯ��ʾ��Ʒ
     * @param goods_typeid
     * @return
     */
    public List<GoodsView> queryAllGoodsByType(int goods_typeid);
	/**
	 * �������Ʒ
	 * 
	 * @param goods
	 *            ��Ʒ
	 * @return ture ��ӳɹ� false ���ʧ��
	 */
	public boolean addGoods(Goods goods);

	/**
	 * ��ԃ������Ʒ
	 * 
	 * @return List
	 */
	public List<Goods> queryGoods();

	/**
	 * ������ƷID ��ԃ��ƷԔ���YӍ
	 * 
	 * @param goods_id
	 *            ��Ʒ��̖
	 * @return Goods
	 */
	public List<GoodsBean> queryGoodsByGoodsId(int goods_id);

	/**
	 * ������Ʒ���Q ��ģ����ԃ
	 * 
	 * @param goods_name
	 *            ��Ʒ���Q
	 * @return List
	 */
	public List<Goods> queryGoodsByName(String goods_name);

	/**
	 * ������Ʒe��ԃ
	 * 
	 * @param goods_typeid
	 *            ��Ʒe��̖
	 * @return List
	 */
	public List<Goods> queryGoodsByType(int goods_typeid);

	/**
	 * �����Ñ�ID ��ԃ�����ٵ���Ʒ
	 * 
	 * @param user_id
	 *            �Ñ�ID
	 * @return List
	 */
	public List<GoodsBean> queryGoodsByUserId(int user_id);

	/**
	 * �����Ñ�ID �c ��Ʒe����ԃ
	 * 
	 * @param user_id
	 *            �Ñ���̖
	 * @param goods_typeid
	 *            ��Ʒe��̖
	 * @return List
	 */
	public List<Goods> queryGoodsByUserIdAndType(int user_id, int goods_typeid);

	/**
	 * ����ӆ��
	 * 
	 * @param goods
	 *            ��Ʒ
	 * @return True ��ӳɹ� False���ʧ��
	 */
	public boolean updateGoods(Goods goods);
	/**
	 * ��ԃ������Ʒ
	 * 2018��7��7��9:58:19
	 * �޸���LHC
	 * (��̨��Ҫ�õ�)
	 * @return GoodsBean
	 */
	public List<GoodsBean> queryGoodsBean();
	/**
	 * ��ԃָ��״̬����Ʒ
	 * 2018��7��7��10:08:46
	 * �޸���LHC
	 * (��̨��Ҫ�õ�)
	 * @param good_state
	 * @return
	 */
	public List<GoodsBean> queryGoodsBeanByGoodtate(int good_state);
	/**
	 * �����û�״̬
	 * 2018��7��7��10:18:11
	 * �޸���(LHC)
	 * ������Ʒ��ҵ��,�ϼ��¼�,���
	 * @param good_state 
	 * @return
	 */
	public boolean updateGoodsState(int goods_id ,int good_state);
	/**
	 * ����������Ʒ״̬
	 * 2018��7��7��10:36:02
	 * �޸���(LHC)
	 * ����������Ʒ��ҵ��,�ϼ��¼�,���
	 * @param list
	 * @param good_state
	 * @return
	 */
	public boolean batchSetGoodsState(List<Integer> list,int good_state);
}
