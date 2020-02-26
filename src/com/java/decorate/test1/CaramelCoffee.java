package com.java.decorate.test1;

/**
 * @author Tao
 */
public class CaramelCoffee implements Coffee{
    @Override
    public void buy() {
        System.out.println("购买了一杯焦糖咖啡，价格为15元");
    }
}
