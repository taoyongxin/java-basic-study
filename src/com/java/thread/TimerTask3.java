package com.java.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Tao
 * @version 1.0
 * @ClassName TimerTask3
 * @Description 使用ScheduledExecutorService来实现定时任务
 * 相比于上两个方法，它有以下好处
 * 相比于Timer的单线程 它是通过线程池的方式来执行任务的
 * 可以很灵活的去设定第一次执行任务delay时间
 * 提供了良好的约定，以便设定执行的时间间隔
 * @date 2020-03-01 21:50
 **/
public class TimerTask3 {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            LocalDateTime current = LocalDateTime.now();
            String timeString = current.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss"));
            System.out.println(timeString);
        };
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        //执行周期性任务，延时0秒，间隔1秒（最后的时间单位）
        ses.scheduleAtFixedRate(runnable,0,1, TimeUnit.SECONDS);
    }
}
