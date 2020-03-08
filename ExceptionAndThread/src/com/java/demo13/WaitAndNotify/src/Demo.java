package com.java.demo13.WaitAndNotify.src;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Dem
 * @Description TODO
 * @date 2020-03-08 11:28
 **/
public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
