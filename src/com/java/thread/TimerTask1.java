package com.java.thread;

/**
 * @author Tao
 * @version 1.0
 * @ClassName TimerTask1
 * @Description 通过sleep方法来达到定时任务的效果，每秒输出一次hello
 * @date 2020-03-01 21:45
 **/
public class TimerTask1 {
    public static void main(String[] args) {
        final long timeInterval = 1000;
        Runnable runnable = () -> {
            while (true){
                System.out.println("hello");
                try {
                    Thread.sleep(timeInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(runnable).start();
    }
}
