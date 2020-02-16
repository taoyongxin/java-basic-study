package com.java.singleton;

/**
 * @author Tao
 */
public class SingletonTest {
    public static void main(String[] args) {
        SingletonHungry sh1 = SingletonHungry.getInstance();
        SingletonHungry sh2 = SingletonHungry.getInstance();
        System.out.println(sh1 == sh2);

        SingletonLazy sl1 = SingletonLazy.getInstance();
        SingletonLazy sl2 = SingletonLazy.getInstance();
        System.out.println(sl1 == sl2);
    }
}
