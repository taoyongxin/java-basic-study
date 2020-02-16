package com.java.singleton;

/**
 * 懒汉式
 * @author Tao
 */
public class SingletonLazy {
    //一上来不传建一个实例，什么时候用什么时候创建
    public static SingletonLazy instance;
    /*把构造器变成私有的*/
    private  SingletonLazy(){

    };
    //专门对外的方法
    public static SingletonLazy getInstance(){
        //其他代码...
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
