package com.j1823.ShoppingMall.dao;

import com.j1823.ShoppingMall.entity.UseresBeans;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    //查询所有用户信息
    List<UseresBeans>showAll();
    //查询一个用户信息
    UseresBeans oneUser(String u_usernum);
    //修改用户信息
    int upUser(UseresBeans useresBeans);
    //删除用户信息
    int deUser(UseresBeans useresBeans);
    //插入用户信息
    int insUser(UseresBeans useresBeans);
}
