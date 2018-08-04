package com.sue.dao.impl;

import com.sue.bean.User;
import com.sue.util.DBUtil;
import com.sue.dao.UserDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao
{

    public void update(User u) {
        String sql = "update usertbl set username=?,password=? where iduser=?";
        Connection conn = new DBUtil().openConnection();
        DBUtil util = new DBUtil();
        try
        {
            PreparedStatement pstmt = null;
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(3,u.getIduser());
            pstmt.setString(1,u.getUsername());
            pstmt.setString(2,u.getPassword());
            pstmt.executeUpdate();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            util.closeConnection(conn);
        }

    }

    public User get(int id) {
        String sql = "select * from usertbl where id = ?";
        DBUtil util  = new DBUtil();
        Connection conn = util.openConnection();

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next())
            {
                String username = rs.getString(2);
                String password = rs.getString(3);

                User u = new User();
                u.setIduser(id);
                u.setUsername(username);
                u.setPassword(password);

                return u;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            util.closeConnection(conn);
        }

        return null;
    }

    public void save(User u)
    {
        String sql = "insert into usertbl(username,password) values(?,?))";
        Connection conn = new DBUtil().openConnection();
        DBUtil util = new DBUtil();
        try
        {
            PreparedStatement pstmt = null;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,u.getUsername());
            pstmt.setString(2,u.getPassword());

            pstmt.executeUpdate();


        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            util.closeConnection(conn);
        }
    }

    public void delete(int id)
    {
        String sql = "delete from usertbl where id=?";
        Connection conn = new DBUtil().openConnection();
        DBUtil util = new DBUtil();
        try
        {
            PreparedStatement pstmt = null;
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            util.closeConnection(conn);
        }

    }

    public List list() {
        String sql = "select * from usertbl";
        DBUtil util  = new DBUtil();
        Connection conn = util.openConnection();

        try {
            Statement  stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            List list = new ArrayList();
            while(rs.next())
            {
                int iduser = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);

                User u = new User();
                u.setIduser(iduser);
                u.setUsername(username);
                u.setPassword(password);

                list.add(u);
            }
            return list;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            util.closeConnection(conn);
        }

        return null;
    }
}
