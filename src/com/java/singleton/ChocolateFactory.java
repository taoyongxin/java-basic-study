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
            //添加巧克力牛奶原料动作
            empty = false;
            boiled = false;
        }
        System.out.println("原料是否为空："+empty+",是否加热："+boiled);
    }

    public void drain(){
        if((!empty) && boiled){
            //排出巧克力动作
            empty = true;
        }
        System.out.println("原料是否为空："+empty+",是否加热："+boiled);
    }

    public void boil(){
        if ((!empty) && (!boiled)){
            //煮沸
            boiled = true;
        }
        System.out.println("原料是否为空："+empty+",是否加热："+boiled);
    }
}
