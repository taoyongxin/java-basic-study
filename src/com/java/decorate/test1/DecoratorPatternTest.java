package com.java.decorate.test1;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Coffee coffee = new CaramelCoffee();
        coffee.buy();

        System.out.println("******************");
        coffee = new DeicingDecorator(new CaramelCoffee()) ;
        coffee.buy();

        System.out.println("******************");
        coffee = new HotDecorator(new LatteCoffee()) ;
        coffee.buy();
    }
}
