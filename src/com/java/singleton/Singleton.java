package com.java.singleton;

/**
 * @author Tao
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){}
    public static Singleton getSingletonInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        System.out.println(s1==s2);
    }
}


