package com.java.decorate.test1;

/**
 * @author Tao
 */
public class HotDecorator extends CoffeeDecorator {
    public HotDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void buy(){
        decoratedCoffee.buy();
        setHot(decoratedCoffee);
    }

    private void setHot(Coffee decoratedCoffee){
        System.out.println("给"+ decoratedCoffee +"加热");
    }
}
