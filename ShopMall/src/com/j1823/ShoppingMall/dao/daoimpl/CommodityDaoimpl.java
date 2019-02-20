package com.j1823.ShoppingMall.dao.daoimpl;

import com.j1823.ShoppingMall.dao.CommodityDao;
import com.j1823.ShoppingMall.entity.CommodityBeans;
import com.j1823.ShoppingMall.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommodityDaoimpl implements CommodityDao {
    ResultSet re;
    PreparedStatement pstm;
    Connection conn;
    //查询所有商品分类信息
    @Override
    public List<CommodityBeans> showall() {
        DBHelper db = new DBHelper();

        List<CommodityBeans> list=new ArrayList<>();
        try {
            conn=db.getConn();
            String sql="select * from commodity";
            pstm=conn.prepareStatement(sql);
            re=pstm.executeQuery();
            while(re.next()){
                CommodityBeans cb = new CommodityBeans();
                cb.setC_id(re.getInt(1));
                cb.setC_sort(re.getString(2));
                cb.setC_name(re.getString(3));
                cb.setC_proce(re.getFloat(4));
                cb.setC_count(re.getString(5));
                cb.setC_imag(re.getString(6));
                cb.setC_place(re.getString(7));
                list.add(cb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.close(re,pstm,conn);
        }
        return list;
    }
    //根据商品类别查询商品信息
    @Override
    public List<CommodityBeans> showone(String c_sort) {
        DBHelper db = new DBHelper();

        List<CommodityBeans> list=new ArrayList<>();
        try {
            conn=db.getConn();
            String sql="SELECT *FROM commodity AS a INNER JOIN com_sort AS b ON a.c_sort=b.c_sort WHERE b.c_sort = ?";
            pstm=conn.prepareStatement(sql);
            pstm.setString(1,c_sort);
            re=pstm.executeQuery();
            while(re.next()){
                CommodityBeans cb = new CommodityBeans();
                cb.setC_id(re.getInt(1));
                cb.setC_sort(re.getString(2));
                cb.setC_name(re.getString(3));
                cb.setC_proce(re.getFloat(4));
                cb.setC_count(re.getString(5));
                cb.setC_imag(re.getString(6));
                cb.setC_place(re.getString(7));
                list.add(cb);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.close(re,pstm,conn);
        }
        return list;
    }
    //根据商品ID查询相应的商品信息
    @Override
    public CommodityBeans showCom(int c_id) {
        DBHelper db = new DBHelper();
        CommodityBeans cb = new CommodityBeans();
        try {
            conn=db.getConn();
            String sql="SELECT *FROM commodity AS a INNER JOIN com_sort AS b ON a.c_sort=b.c_sort WHERE a.c_id = ?";
            pstm=conn.prepareStatement(sql);
            pstm.setInt(1,c_id);
            re=pstm.executeQuery();
            while(re.next()){

                cb.setC_id(re.getInt(1));
                cb.setC_sort(re.getString(2));
                cb.setC_name(re.getString(3));
                cb.setC_proce(re.getFloat(4));
                cb.setC_count(re.getString(5));
                cb.setC_imag(re.getString(6));
                cb.setC_place(re.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.close(re,pstm,conn);
        }
        return cb;
    }
}
