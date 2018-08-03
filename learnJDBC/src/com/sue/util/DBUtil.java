package com.sue.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static  void main(String[] args)
    {
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();
        System.out.println(conn);


    }

    public Connection  getConnection()
    {
        try
        {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Skx101610161016");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public void closeConnection(Connection conn)
    {
        if(conn != null)
        {

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
