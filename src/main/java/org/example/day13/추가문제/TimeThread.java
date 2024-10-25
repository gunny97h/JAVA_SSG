package org.example.day13.추가문제;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread {
    @Override
    public void run() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // 시분초 형식
        for (int i = 0; i < 300; i++) {
            System.out.println(timeFormat.format(new Date()));
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}
