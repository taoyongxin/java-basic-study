package com.java.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Tao
 * @version 1.0
 * @ClassName ClockTest
 * @Description 测试程序
 * @date 2020-03-01 22:00
 **/
public class ClockTest {
    public static void main(String[] args) {
        ClockThread clockThread = new ClockThread();
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(clockThread,0,1, TimeUnit.SECONDS);
        LocalDateTime ldt = LocalDateTime.of(2020,3,1,20,52,20);
        String timeString = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        clockThread.setAlertTime(timeString);
    }
}
