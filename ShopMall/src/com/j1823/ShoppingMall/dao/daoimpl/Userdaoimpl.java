package com.j1823.ShoppingMall.dao.daoimpl;

import com.j1823.ShoppingMall.dao.UserDao;
import com.j1823.ShoppingMall.entity.UseresBeans;
import com.j1823.ShoppingMall.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Userdaoimpl implements UserDao {
    Connection conn=null;
    ResultSet re=null;
    PreparedStatement pstm=null;
    //查询所有用户信息
    @Override
    public List<UseresBeans> showAll() {
        DBHelper db = new DBHelper();
        List<UseresBeans>list=new ArrayList<>();
        try {
            conn=db.getConn();
            String sql="select * from Useres";
            pstm=conn.prepareStatement(sql);
            re=pstm.executeQuery();
            while(re.next()){
                UseresBeans ub = new UseresBeans();
                ub.setId(re.getInt(1));
                ub.setU_name(re.getString(2));
                ub.setU_usernum(re.getString(3));
                ub.setU_pwd(re.getString(4));
                ub.setU_sex(re.getString(5));
                ub.setU_phone(re.getString(6));
                ub.setU_adds(re.getString(7));
                ub.setU_emall(re.getString(8));
                ub.setU_imag(re.getString(9));
                list.add(ub);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.close(re,pstm,conn);
        }
        return list;
    }
    //按ID查询用户信息
    @Override
    public UseresBeans oneUser(String u_usernum) {
        DBHelper db = new DBHelper();
        UseresBeans ub=null;
        try {
            conn=db.getConn();
            String sql="SELECT *FROM Useres WHERE u_usernum=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,u_usernum);
            re=pstm.executeQuery();
            while(re.next()){
                ub = new UseresBeans();
                ub.setId(re.getInt(1));
                ub.setU_name(re.getString(2));
                ub.setU_usernum(re.getString(3));
                ub.setU_pwd(re.getString(4));
                ub.setU_sex(re.getString(5));
                ub.setU_phone(re.getString(6));
                ub.setU_adds(re.getString(7));
                ub.setU_emall(re.getString(8));
                ub.setU_imag(re.getString(9));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.close(re,pstm,conn);
        }
        return ub;
    }
    //修改用户信息
    @Override
    public int upUser(UseresBeans useresBeans) {
        return 0;
    }
    //删除用户信息
    @Override
    public int deUser(UseresBeans useresBeans) {
        return 0;
    }
    //增加一个新用户
    @Override
    public int insUser(UseresBeans useresBeans){
        DBHelper db = new DBHelper();
        int i=0;
        try {
            conn=db.getConn();
            String sql="INSERT INTO Useres VALUES(null,?,?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,useresBeans.getU_name());
            pstm.setString(2,useresBeans.getU_usernum());
            pstm.setString(3,useresBeans.getU_pwd());
            pstm.setString(4,useresBeans.getU_sex());
            pstm.setString(5,useresBeans.getU_phone());
            pstm.setString(6,useresBeans.getU_adds());
            pstm.setString(7,useresBeans.getU_emall());
            pstm.setString(8,useresBeans.getU_imag());
            i = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.close(re,pstm,conn);
        }
        return i;
    }
}
