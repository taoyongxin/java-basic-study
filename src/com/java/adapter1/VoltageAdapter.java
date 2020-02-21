package com.java.adapter1;

/**
 * @author Tao
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int outPut5V() {
        //获取220V电压
        int srcV = outPut220V();
        int dstV = srcV / 44 ; //转成5V
        return dstV;
    }

}
