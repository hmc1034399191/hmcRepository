package com.j1823.ShoppingMall.service.serviceimpl;

import com.j1823.ShoppingMall.dao.UserDao;
import com.j1823.ShoppingMall.dao.daoimpl.Userdaoimpl;
import com.j1823.ShoppingMall.entity.UseresBeans;
import com.j1823.ShoppingMall.service.UserService;

public class UserServiceimpl implements UserService {
    UserDao ud=new Userdaoimpl();
    //插入一个用户
    @Override
    public int inserUser(UseresBeans user) {
        return ud.insUser(user);
    }

    //查询一个用户
    @Override
    public UseresBeans seleUser(String u_usernum) {
        return ud.oneUser(u_usernum);
    }
}
