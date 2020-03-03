package com.java.demo07.InnerClassThread;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Demo01InnerClassThread
 * @Description TODO
 * @date 2020-03-03 21:57
 * 匿名内部类方法实现线程的创建
 * 匿名：没有名字
 * 内部类：写在其他类内部的类
 *
 * 匿名内部类作用：简化代码
 *      把资质类继承父类，重写父类的方法，创建子类对象和成一步完成
 *     把实现类接口，重写接口中的方法，创建实现类对象合成一步完成
 *     匿名内部类的最终产物：子类/实现类对象，而这个类没有名字
 *
 *     格式：
 *         new 父类/接口(){
 *             重复父类/接口中的方法
 *         };
 **/
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new MyThread().start();
        new Thread(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }.start();

        //线程的接口Runnable
        //Runnable r = new RunnableImpl ;多态
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20 ; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->"+"程序员");
                }
            }
        };
        new  Thread(r).start();

        //简化接口的方式
        new Thread(new Runnable() {
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"程序猿");
                }
            }
        }).start();
    }
}
