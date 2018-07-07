package com.etc.service;

import java.util.List;

import com.etc.entity.Goods;
import com.etc.entity.Mybidding;
import com.etc.entity.Users;

public interface MybiddingService {
	// ��ʾ�ҵľ����¼
	public List<Mybidding> queryMybidding(int user_id);

	// ͨ��id�õ���Ʒ����Ϣ
	public Goods queryByGoodsId(int goodsId);

	// �޸ĵ�ǰ�۸�
	public boolean updateGoods(Goods goods,Users user);
	//���Ӿ��ļ�¼
	public boolean addMybidding(Mybidding mybidding);
	//�޸���Ʒ��״̬
	public boolean updateGoodsState(Goods goods);
}
