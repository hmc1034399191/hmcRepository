package com.j1823.ShoppingMall.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Utils {
    private static ComboPooledDataSource cpds;
    static {
        cpds = new ComboPooledDataSource();
    }
    public static DataSource getDataSource() {
        return cpds;
    }
    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
}
