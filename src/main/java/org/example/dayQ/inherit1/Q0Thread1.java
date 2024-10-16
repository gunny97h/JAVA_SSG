package org.example.dayQ.inherit1;

public class Q0Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 500; i > 0; i--) {
            try {
                System.out.println(i);
                sleep(10);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
