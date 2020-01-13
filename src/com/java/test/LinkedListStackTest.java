package com.java.test;

import java.util.LinkedList;

/**
 * @author Tao
 * LinkedList基于链表结构实现的，所以查询速度慢，增删速度快，提供了特殊的方法，对头尾的元素操作（进行增删查）
 * 使用LinkedList来实现栈和队列；栈先进后出，队列先进先出
 * 下面是利用LinkedList来模拟栈的实现代码
 */
public class LinkedListStackTest {
    public static void main(String[] args) {
        //测试栈
        MyStack stack = new MyStack();
        stack.push("第一个进入的元素");
        stack.push("第二个进入的元素");
        stack.push("第三个进入的元素");
        stack.push("第四个进入的元素");
        stack.push("第五个进入的元素");
        //取出
        while (!stack.isEmpty()){
            String pop = stack.pop();
            System.out.println(pop);
        }

    }
}
class MyStack {
    private LinkedList<String> linkedList = new LinkedList<String>();
    /** 压栈*/
    public void push(String str){
        linkedList.addFirst(str);
    }
    /**出栈*/
    public String pop(){
        return linkedList.removeFirst();
    }
    /**查看*/
    public String peek(){
        return linkedList.peek();
    }
    /**判断是否为空*/
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}

