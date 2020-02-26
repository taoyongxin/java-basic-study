package com.java.test2;

/**
 * @ClassName BuilderPatternTest
 * @Description 测试类
 * @Author mq_xu
 * @Date 2020/2/25
 * @Version 1.0
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        //通过建造者模式创建两个对象，链式调用设置属性的值，没有顺序要求
        Student student1 = Student.builder().name("小明").age(19).build();
        System.out.println(student1);
        Student student2 = Student.builder().age(20).name("小兰").build();
        System.out.println(student2);
    }
}
