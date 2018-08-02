package com.sue.util;

import java.sql.Connection;

public class DBUtil {
    public Connection getConnection(){
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        return null;
    }
}
