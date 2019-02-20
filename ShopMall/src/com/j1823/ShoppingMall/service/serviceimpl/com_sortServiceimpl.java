package com.j1823.ShoppingMall.service.serviceimpl;

import com.j1823.ShoppingMall.dao.Com_sortDao;
import com.j1823.ShoppingMall.dao.daoimpl.Com_sortDaoimpl;
import com.j1823.ShoppingMall.entity.Com_sortBeans;
import com.j1823.ShoppingMall.service.Com_sortService;

import java.util.List;

public class com_sortServiceimpl implements Com_sortService {
    Com_sortDao cs=new Com_sortDaoimpl();
    @Override
    public List<Com_sortBeans> showall() {
        return cs.showall();
    }
}
