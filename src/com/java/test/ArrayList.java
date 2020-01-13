package com.java.test;


import java.util.Iterator;
import java.util.List;

/**
 * @author Tao
 * ArrayList：底层使用数组实现，所以查询速度快，增删速度慢
 */
public class ArrayList {
    //使用ArrayList进行添加和遍历
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<String>();
        list.add("接口1");
        list.add("接口2");
        list.add("接口3");
        //第一种遍历方式，使用迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("****************");
        //第二种遍历方式，使用foreach
        for (String str : list){
            System.out.println(str);
        }

    }
}
