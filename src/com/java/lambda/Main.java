package com.java.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Tao
 */
public class Main {
    public static void main(String[] args) {
        //静态方法 --类名来调用
        Consumer<String> consumerStatic = Container::sysStatic;
        consumerStatic.accept("static");
        //实例方法 --通过new一个对象来实现
        Container container = new Container();
        Consumer<String> consumer = container::sys;
        consumer.accept("instance");

        Supplier<Container> supplier = Container::new;
        System.out.println(supplier.get());
    }

}
class Container{
    //静态方法
    public static void  sysStatic(String str){
        System.out.println(str);
    }
    //实例方法
    public void sys(String str){
        System.out.println(str);
    }
}