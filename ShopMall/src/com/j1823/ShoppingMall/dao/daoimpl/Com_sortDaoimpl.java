package com.j1823.ShoppingMall.dao.daoimpl;

import com.j1823.ShoppingMall.dao.Com_sortDao;
import com.j1823.ShoppingMall.entity.Com_sortBeans;
import com.j1823.ShoppingMall.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Com_sortDaoimpl implements Com_sortDao {
    ResultSet re;
    PreparedStatement pstm;
    Connection conn;
    //查询所有商品分类信息
    @Override
    public List<Com_sortBeans> showall() {
        DBHelper db = new DBHelper();
        List<Com_sortBeans> list=new ArrayList<>();
        try {
            conn=db.getConn();
            String sql="select * from com_sort";
            pstm=conn.prepareStatement(sql);
            re=pstm.executeQuery();

            while(re.next()){
                Com_sortBeans cb = new Com_sortBeans();
                cb.setC_sort(re.getString(1));
                cb.setS_id(re.getInt(2));
                list.add(cb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.close(re,pstm,conn);
        }
        return list;
    }
}
