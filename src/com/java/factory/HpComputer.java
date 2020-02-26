package com.java.factory;

/**
 * @author Tao
 * @version 1.0
 * @ClassName HpComputer
 * @Description TODO
 * @date 2020-02-26 12:03
 **/
public class HpComputer extends Computer{
    @Override
    public void start() {
        System.out.println("惠普电脑启动");
    }
}
