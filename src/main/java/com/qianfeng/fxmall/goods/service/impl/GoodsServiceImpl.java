package com.qianfeng.fxmall.goods.service.impl;

import com.qianfeng.fxmall.commons.info.Constants;
import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.mapper.GoodsMapper;
import com.qianfeng.fxmall.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
public class GoodsServiceImpl implements IGoodsService {

    //private IGoodDAO goodsDao = new GoodsDAOImpl();
    @Autowired
    private GoodsMapper goodsService;

    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) throws Exception {

        if (page < 1){
            throw new IndexOutOfBoundsException("页码不能小于1");
        }
        //计算起始下标
        int index = (page -1)* Constants.Page.PAGE_SIZE;

        List<WxbGood> goods = goodsService.queryGoodsByPage(index,Constants.Page.PAGE_SIZE);
        return goods;
    }

    @Override
    public void insertGoods(WxbGood wxbGood) {
        goodsService.insertGoods(wxbGood);
    }

    @Override
    public WxbGood queryGoodsById(String goodId) {
        return goodsService.queryGoodsById(goodId);
    }
}
