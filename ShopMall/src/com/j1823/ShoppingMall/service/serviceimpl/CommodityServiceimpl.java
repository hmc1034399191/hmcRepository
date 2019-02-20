package com.j1823.ShoppingMall.service.serviceimpl;

import com.j1823.ShoppingMall.dao.CommodityDao;
import com.j1823.ShoppingMall.dao.daoimpl.CommodityDaoimpl;
import com.j1823.ShoppingMall.entity.CommodityBeans;
import com.j1823.ShoppingMall.service.CommodityService;

import java.util.List;

public class CommodityServiceimpl implements CommodityService {
    CommodityDao cd=new CommodityDaoimpl();
    //查询商品信息
    @Override
    public List<CommodityBeans> showall() {
        return cd.showall();
    }
    //根据商品类别查询商品信息
    @Override
    public List<CommodityBeans> showone(String c_sort) {
        return cd.showone(c_sort);
    }
    //根据商品ID查询相应的商品信息
    @Override
    public CommodityBeans showCom(int c_id) {
        return cd.showCom(c_id);
    }
}
