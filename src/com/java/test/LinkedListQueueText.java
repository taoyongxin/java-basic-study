package com.java.test;

import java.util.LinkedList;

/**
 * @author Tao
 */
public class LinkedListQueueText {
    public static void main(String[] args) {
        QueueTest queue = new QueueTest();
        queue.put("我是第一个进入的数");
        queue.put("我是第二个进入的数");
        queue.put("我是第三个进入的数");
        queue.put("我是第四个进入的数");
        /**遍历队列*/
        while (!queue.isEmpty()){
            String str = queue.get();
            System.out.println(str);
        }
    }
}
class QueueTest {
    private LinkedList<String> linkedList = new LinkedList<String>();
    /**放入*/
    public void put(String str){
        linkedList.addFirst(str);
    }
    /**获取*/
    public String get(){
        return linkedList.removeLast();
    }
    /**判空*/
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

}
