package com.j1823.ShoppingMall.test;

import com.j1823.ShoppingMall.entity.UseresBeans;
import com.j1823.ShoppingMall.service.UserService;
import com.j1823.ShoppingMall.service.serviceimpl.UserServiceimpl;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mytset {
    //测试连接是否正常
    @Test
    public void conn() throws SQLException {
        DataSource ds = new ComboPooledDataSource();//c3p0自己去读配置文件
        Connection con = ds.getConnection();
        System.out.println("con:"+con);
        String sql="select * from Useres";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet re = pstm.executeQuery();
        while(re.next()){
            System.out.println(re.getString(1));
            System.out.println(re.getString(2));
        }
    }
    @Test
    public void entity(){
        String str="s";
        String str2="se";
        System.out.println(str==str2);
    }
    //检查能否正常插入用户信息
    @Test//'张三','1034399191','123','男','110','湖南长沙','10357@qq.com'
    public void inserUser(){
        UseresBeans ub = new UseresBeans();
        ub.setU_name("李四");
        ub.setU_usernum("0123");
        ub.setU_pwd("123");
        ub.setU_sex("男");
        ub.setU_phone("120");
        ub.setU_adds("湖南郴州");
        ub.setU_emall("xx@xx.com");
        UserService us=new UserServiceimpl();
        int i = us.inserUser(ub);
        System.out.println(i);
    }
    //检查能否正常查询用户信息
    @Test
    public void showone(){
        UserService us=new UserServiceimpl();
        UseresBeans ub = us.seleUser("0123");
        System.out.println(ub.getU_name());
    }
}
