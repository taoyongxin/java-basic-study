package com.java.demo01.ThreadPool;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RunableImpl
 * @Description TODO
 * @date 2020-03-08 15:51
 *
 *  2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
 **/
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
