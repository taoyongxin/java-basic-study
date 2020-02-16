package com.java.singleton;

/**
 * 懒汉式
 * 特点 1.延迟创建
 *      2.线程不安全
 *      3.添加synchronized（加锁懒汉式）同步情况下效率低
 * @author Tao
 */
public class SingletonLazyLock {
    //一上来不传建一个实例，什么时候用什么时候创建
    private static SingletonLazyLock instance;
    /*把构造器变成私有的*/
    private  SingletonLazyLock(){

    };
    //专门对外的方法
    //假设现在有2个线程在操作这个代码A/B线程
    //synchronized 同步（关门）synchronized 执行效率非常低
    public synchronized static SingletonLazyLock getInstance(){
        //其他代码...
        if (instance == null){
            //B...就会导致返回的实例不是同一个
            instance = new SingletonLazyLock();
        }
        return instance;
    }
}
