package com.java.singleton;

/**
 * @author Tao
 */
public class ChocolateFactoryTest {
    //看一下地址
    public static void main(String[] args) {
        ChocolateFactory c1 = ChocolateFactory.getInstance();
        ChocolateFactory c2 = ChocolateFactory.getInstance();
        c1.fill();
        c2.boil();
        c1.drain();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1==c2);

        /*ChocolateFactory chocolateFactory1 = new ChocolateFactory();
        ChocolateFactory chocolateFactory2 = new ChocolateFactory();
        chocolateFactory1.fill();
        chocolateFactory2.boil();
        System.out.println(chocolateFactory1);
        System.out.println(chocolateFactory2);
        System.out.println(chocolateFactory1 == chocolateFactory2);*/
    }
}
