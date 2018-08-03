package com.sue.test;

import com.sue.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void  main(String[] args)
    {
        Test test = new Test();
        test.list();
    }
    public void list() {
        DBUtil util = new DBUtil();
        Connection conn = util.getConnection();

        String sql = "SELECT * FROM UserTbl";

        try {
            //创建语句
            Statement stmt = conn.createStatement();
            //创建结果集
            ResultSet rs  = stmt.executeQuery(sql);

            while(rs.next())
            {
                //可以用列索引，也可用列名称
                int id = rs.getInt("id");
                String username = rs.getString(2);
                String password = rs.getString(3);

                System.out.println(id+" "+username+" "+password);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
