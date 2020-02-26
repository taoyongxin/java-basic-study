package com.java.decorate.test1;

public class DeicingDecorator extends CoffeeDecorator{
    public DeicingDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void buy(){
        decoratedCoffee.buy();
        setDeicing(decoratedCoffee);
    }

    private void setDeicing(Coffee decoratedCoffee){
        System.out.println("给"+ decoratedCoffee +"去冰");
    }
}
