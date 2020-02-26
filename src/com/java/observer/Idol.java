package com.java.observer;

public interface Idol {
    //添加粉丝
    void addFan(Fan fan);
    //拉黑模式
    void delFan(Fan fan);
    //发布动态
    void notify(String message);

}
