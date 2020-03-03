package com.java.demo04.setName;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Demo04SetThreadName
 * @Description TODO
 * @date 2020-03-03 21:32
 **/
public class Demo04SetThreadName {
    public static void main(String[] args) {


        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        //开启多线程
        new MyThread("旺财").start();
    }
}
