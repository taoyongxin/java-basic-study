package com.java.observer;

public class Test {
    public static void main(String[] args) {
        //创建一个具体的明星
        ConCrateIdol conCrateIdol = new ConCrateIdol();
        //创建三个具体粉丝
        ConCreateFan fan1 = new ConCreateFan("粉丝1号");
        ConCreateFan fan2 = new ConCreateFan("粉丝2号");
        ConCreateFan fan3 = new ConCreateFan("粉丝3号");

        //关注明显
        conCrateIdol.addFan(fan1);
        conCrateIdol.addFan(fan2);
        conCrateIdol.addFan(fan3);

        //明星发布动态
       conCrateIdol.notify("发布一条关于演唱会的信息");

    }
}
