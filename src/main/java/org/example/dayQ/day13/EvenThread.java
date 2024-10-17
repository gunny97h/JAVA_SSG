package org.example.dayQ.day13;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 100; i <= 500; i = i + 2) {
            System.out.println(i);
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}
