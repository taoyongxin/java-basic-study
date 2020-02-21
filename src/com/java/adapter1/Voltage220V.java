package com.java.adapter1;

/**
 * 被适配的类
 * @author Tao
 */
public class Voltage220V {
    /**
     * 输出200V的电压
     * @return
     */
    public int outPut220V(){
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
