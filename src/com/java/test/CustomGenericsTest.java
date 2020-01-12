package com.java.test;

/**
 * @author Tao
 */
public class CustomGenericsTest {
    /**
     * 自定义一个带有一个参数的泛型类，可以向传入什么类型就传入什么类型
     */
    public static void main(String[] args) {
        Person<String> perStr = new Person<String>();
        perStr.setT("一段字符串");
        String str = perStr.getT();
        System.out.println(str);

        //进行测试，传入一个Integer对象
        Person<Integer> perInt = new Person<Integer>();
        perInt.setT(888);
        Integer integer = perInt.getT();
        System.out.println(integer);
    }
}

/**
 * 自定义一个带有一个参数的泛型类
 * @param <T>
 */
class Person<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
