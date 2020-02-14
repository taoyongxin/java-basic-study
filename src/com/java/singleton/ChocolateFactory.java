package com.java.singleton;

/**
 * @author Tao
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;
    private static ChocolateFactory uniqueInstance = null;
    public ChocolateFactory(){
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ChocolateFactory();
        }
        return uniqueInstance;
    }

    public void fill(){
        if (empty){
            //添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if((!empty) && boiled){
            //排出巧克力动作
            empty = true;
        }
    }
    public void boil(){
        if ((!empty) && (!boiled)){
            //煮沸
            boiled = true;
        }
    }
}
