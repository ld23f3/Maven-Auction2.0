package com.etc.dao;

import org.springframework.stereotype.Repository;

import com.etc.entity.GoodsImg;
@Repository(value="goodsImgDao")
public interface GoodsImgDao {

	public int AddGoodsImg(GoodsImg gi);
}
