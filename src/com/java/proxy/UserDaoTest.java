package com.java.proxy;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao target = new UserDaoImpl();
        target.save();
        System.out.println("********************");
        UserDao proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
