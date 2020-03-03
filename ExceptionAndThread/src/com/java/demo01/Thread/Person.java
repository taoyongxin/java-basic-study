package com.java.demo01.Thread;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Person
 * @Description TODO
 * @date 2020-03-02 22:07
 **/
public class Person {
    private String name;

    public void run(){
        //定义循环，执行20次
        for (int i=0; i<20; i++){
            System.out.println(name+"--->"+i);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
