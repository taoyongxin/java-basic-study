package com.java.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Tao
 * @version 1.0
 * @ClassName TimerTask2
 * @Description 使用Timer和TimerTask
 * @date 2020-03-01 21:48
 **/
public class TimerTask2 {
    public static void main(String[] args) {
        final long timeInterval = 1000;
        long delay = 2000;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask,delay,timeInterval);
    }
}
