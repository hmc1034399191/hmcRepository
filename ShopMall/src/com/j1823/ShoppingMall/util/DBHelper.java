package com.j1823.ShoppingMall.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
    public Connection getConn() throws SQLException {
        DataSource ds = new ComboPooledDataSource();
        Connection con = ds.getConnection();
        return con;
    }

    public void close(ResultSet resultSet, PreparedStatement pstm, Connection connection){
        try {
            if(resultSet!=null){
                resultSet.close();
            }
            if(pstm!=null){
                pstm.close();
            }
            if(connection!=null){
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
