package com.java.singleton;

/**
 * @author Tao
 */
public class SingletonTest {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        System.out.println(s1==s2);

    }
}
