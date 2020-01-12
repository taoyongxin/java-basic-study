package com.java.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tao
 */
public class ListTest {
    public static void main(String[] args) {
        //不加泛型
        List list = new ArrayList<>();
        list.add(1);
        list.add("123");
        list.add("hello");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            //没有添加泛型，这里只能使用Object接收
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
