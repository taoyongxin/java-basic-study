package com.java.proxy;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("数据已经保存");
    }
}
