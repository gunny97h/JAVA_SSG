package org.example.dayQ.day12;

public class Q0Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 500; i > 0; i--) {

            try {
                System.out.println(i);
                sleep(1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
