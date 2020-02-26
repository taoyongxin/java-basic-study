package com.java.decorate.test1;

public class LatteCoffee implements Coffee{
    @Override
    public void buy() {
        System.out.println("购买了一杯拿铁咖啡，价格为20元");
    }
}
