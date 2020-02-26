package com.java.factory;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Main
 * @Description TODO
 * @date 2020-02-26 12:10
 **/
public class Main {
    public static void main(String[] args) {
        ComputerFactory.createComputer("hp").start();
        ComputerFactory.createComputer("asus").start();
    }
}
