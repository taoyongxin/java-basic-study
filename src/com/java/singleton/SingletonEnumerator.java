package com.java.singleton;

/**
 * @author Tao
 */
public class SingletonEnumerator {
    //创建函数私有化
    private SingletonEnumerator(){

    }
    //提供一个公有的方法
    public static SingletonEnumerator getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    //使用枚举类型（类似于类）
    private static enum Singleton{
        INSTANCE;
        private SingletonEnumerator singletonEnumerator;

        //JVM会保证此方法绝对只会调用一次
        private Singleton(){
            singletonEnumerator = new SingletonEnumerator();
        }

        //开房一个公有的方法
        public SingletonEnumerator getInstance(){
            return singletonEnumerator;
        }
    }
}
