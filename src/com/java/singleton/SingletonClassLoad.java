package com.java.singleton;

/**
 * @author Tao
 */
public class SingletonClassLoad {
    //把构造方法设为私有
    private SingletonClassLoad(){

    }
    //定义一个私有的、静态的内部类
    private static class Inner{
        //把实例创建出来
        private static SingletonClassLoad instance = new SingletonClassLoad();
    }
    //提供一个公开的静态方法
    public static SingletonClassLoad getInstance(){
        return Inner.instance;
    }
}
