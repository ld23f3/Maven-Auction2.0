package com.etc.service.impl;

import org.springframework.stereotype.Service;

import com.etc.entity.GoodsImg;
import com.etc.service.GoodsImgService;
@Service(value="goodsImgService")
public class GoodsImgServiceImpl implements GoodsImgService {

	private GoodsImgService gis;
	@Override
	public int AddGoodsImg(GoodsImg gi) {
		// TODO Auto-generated method stub
		return gis.AddGoodsImg(gi);
	}

}
