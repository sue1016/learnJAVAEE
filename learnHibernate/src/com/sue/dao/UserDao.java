package com.sue.dao;

import com.sue.bean.User;

import java.util.List;

public interface UserDao
{
    public void save(User u);
    public void delete(int id);
    public User get(int id);
    public void update(User u);
    public List list();
}
