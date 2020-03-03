package com.java.demo06.Runnable;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RunnableImpl
 * @Description TODO
 * @date 2020-03-03 21:47
 **/
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
