package com.java.adapter;

public class MyClient extends MyAdapter {
    @Override
    public void methodA(String param) {
        System.out.println(param);
    }

    @Override
    public void methodD() {
        System.out.println("输出方法");
    }
}
