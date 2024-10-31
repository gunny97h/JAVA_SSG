package org.example.day23.thread기본;

public class Thread만들기Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread만들기());
        Thread t2 = new Thread(new Thread만들기2());

        t1.start();
        t2.start();
    }
}
