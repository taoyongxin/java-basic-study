package com.java.adapter.Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        MyAdapter md = new MyClient();
        md.methodA("方法A");
        md.methodD();
    }
}
