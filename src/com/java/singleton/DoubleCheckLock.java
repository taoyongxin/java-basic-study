package com.java.singleton;

/**
 * 双重验证懒汉式（DCL）
 * 特点：1.延迟创建
 *      2.线程安全
 *      3.同步情况下效率高
 *      4.实现复杂
 * @author Tao
 */
public class DoubleCheckLock {
    //一上来不传建一个实例，什么时候用什么时候创建
    private static DoubleCheckLock instance;
    /*把构造器变成私有的*/
    private  DoubleCheckLock(){

    };
    //专门对外的方法
    //假设2个线程同时访问A B
    public static DoubleCheckLock getInstance(){
        if (instance == null){
            //B..
            synchronized (DoubleCheckLock.class){
                if (instance == null){
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
