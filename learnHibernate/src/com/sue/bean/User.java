package com.sue.bean;

//把数据库的表结构映射成一个javabean

//同一个业务用例，不同的表现方式
//表现在数据库里就是一个表
//表现在面向对象里就是一个类

public class User {
/*
    create table 'usertbl'
            (
                    iduser int not null  auto_increment,
                    primary key,
                    username varchar(45) null,
                    password varchar(45) null
            );
*/

    private int iduser;
    private String username;
    private String password;

    public int getIduser() {
        return iduser;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
