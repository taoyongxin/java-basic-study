package com.java.factory;

/**
 * @author Tao
 * @version 1.0
 * @ClassName ComputerFactory
 * @Description TODO
 * @date 2020-02-26 12:04
 **/
public class ComputerFactory {
    public static Computer createComputer(String type){
        Computer computer = null;
        switch (type){
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "hp":
                computer = new HpComputer();
                break;
            case "asus":
                computer = new AsusComputer();
                break;
        }
        return computer;
    }
}
