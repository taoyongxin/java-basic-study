package com.java.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tao
 */
public class GenericsTest {
    /**
     * GenericsTest与ListTest进行加了泛型与不加泛型的区别
     * @param args
     */
    public static void main(String[] args) {
        //加泛型，添加和遍历
        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("hello");
        list.add("word");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            //因为添加了泛型，就说明集合中装的全部都是String类型的数据
            //所有这里用String类型接受，就不会发生异常，并且可以使用String的方法
            String str = iterator.next();
            System.out.println(str.length());
        }
    }
}
