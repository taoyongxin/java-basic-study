package com.java.demo03.getName;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Demo03GetThreadName
 * @Description TODO
 * @date 2020-03-03 9:47
 * 线程的名称：
 *        主线程：main
 *        新线程：Thread-0，Thread-1，Thread-2
 **/
public class Demo03GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
//        MyThread mt = new MyThread();
//        //调用start方法 开启新线程，执行run方法
//        mt.start();
//
//        new MyThread().start();
//        new MyThread().start();
        //获取线程名称
//        Thread t = Thread.currentThread();
//        System.out.println(t); //Thread[main,5,main]
//
//        String name = t.getName();
//        System.out.println(name);

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
