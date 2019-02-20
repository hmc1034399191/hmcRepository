package com.j1823.ShoppingMall.service;

import com.j1823.ShoppingMall.entity.CommodityBeans;

import java.util.List;

public interface CommodityService {
    //查询所有商品信息
    List<CommodityBeans> showall();
    //根据商品类别查询商品信息
    List<CommodityBeans> showone(String c_sort);
    //根据商品ID查询相应的商品信息
    CommodityBeans showCom(int c_id);
}
