package com.java.demo02.Thread;

/**
 * @author Tao
 * @version 1.0
 * @ClassName MyThread
 * @Description TODO
 * @date 2020-03-02 23:07
 * 1.创建一个Thread类的子类
 * 2.在Thread类的子类中重写Thread类的中run方法，设置线程任务（开启线程要做什么？）
 **/

public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20 ; i++) {
            System.out.println("run:"+i);
        }
    }
}
