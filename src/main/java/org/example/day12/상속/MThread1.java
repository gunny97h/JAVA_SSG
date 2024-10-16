package org.example.day12.상속;
// NEW02-Java-5(상속+스레드+예외처리).pdf p.93
public class MThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("*");
        }
    }
}
