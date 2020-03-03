package com.java.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Tao
 * @version 1.0
 * @ClassName ClockThread
 * @Description 时间线程
 * @date 2020-03-01 21:57
 **/
public class ClockThread implements Runnable{
    private String alertTime;

    public void  setAlertTime(String alertTime) {
        this.alertTime = alertTime;
    }

    @Override
    public void run() {
        LocalDateTime current = LocalDateTime.now();
        String timeString = current.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(timeString);
        if (timeString.equals(alertTime)){
            System.out.println("时间到");
            System.exit(1);
        }
    }
}
