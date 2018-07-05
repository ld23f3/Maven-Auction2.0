package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Goods;
import com.etc.entity.Mybidding;
@Repository(value="mybiddingDao")
public interface MybiddingDao {
	
	//��ѯ�ҵľ��ļ�¼
	public List<Mybidding> queryMybidding(int user_id);
	
	
	//ͨ��id�õ���Ʒ����Ϣ
	public Goods queryByGoodsId(int goodsId);
	
	//�޸ĵ�ǰ�۸�
	public boolean updateGoods(Goods goods);
	
	
	//��Ӿ��ļ�¼
	
	public boolean addMybidding(Mybidding mybidding);
	
	
	//�޸���Ʒ��״̬
	public boolean updateGoodsState(Goods goods);
}
