package com.java.adapter.ClassAdapter;

/**
 * @author Tao
 */
public class Phone {
    /**
     * 充电
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.outPut5V() == 5){
            System.out.println("电压为5V，可以充电！");
        } else {
            System.out.println("电压不为5V，无法充电！");
        }
    }
}
