package com.java.singleton;

/**
 * 饿汉式
 * 特点：1.立即创建
 *      2.线程安全
 * @author Tao
 */
public class SingletonHungry {//JVM加载就创建实例，JVM机制是线程安全的
    //一上来就传建一个实例
    public static SingletonHungry instance = new SingletonHungry();
    /*把构造器变成私有的*/
    private  SingletonHungry(){

    };
    //专门对外的方法
    public static SingletonHungry getInstance(){
        //其他代码...
        return instance;
    }
}
