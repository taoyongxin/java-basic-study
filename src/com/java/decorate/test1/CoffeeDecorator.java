package com.java.decorate.test1;

public class CoffeeDecorator implements Coffee{

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public void buy(){
        decoratedCoffee.buy();
    }
}
