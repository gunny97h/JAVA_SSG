package org.example.day23.thread기본;

public class Thread만들기2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("나는 달러!!!");
        }
    }
}
