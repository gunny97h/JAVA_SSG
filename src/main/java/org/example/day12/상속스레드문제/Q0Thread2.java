package org.example.day12.상속스레드문제;

import java.util.Date;

public class Q0Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3000; i++) {
            try {
                System.out.println(new Date());
                sleep(3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
