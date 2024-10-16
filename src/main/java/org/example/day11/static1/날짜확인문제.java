package org.example.day11.static1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 날짜확인문제 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String now = dtf.format(localDateTime);
        String then = dtf.format(localDateTime.plusWeeks(2));
        System.out.println("시작일: " + now);
        System.out.println("종료일: " + then);

    }
}
