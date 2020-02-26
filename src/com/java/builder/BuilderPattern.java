package com.java.builder;



/**
 * @author Tao
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Student student = Student.builder()
                .name("张三")
                .build();
        System.out.println(student);
    }
}

