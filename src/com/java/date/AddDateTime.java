package com.java.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Tao
 */
public class AddDateTime {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime=LocalDateTime.ofInstant(instant, zone);
        LocalDateTime newTime = localDateTime.minusMonths(1);
        LocalDate localDate = newTime.toLocalDate();
        System.out.println(localDateTime);
        System.out.println(newTime);
        System.out.println(localDate);
    }

}
