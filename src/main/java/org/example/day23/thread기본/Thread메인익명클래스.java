package org.example.day23.thread기본;

public class Thread메인익명클래스 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("나는 별!!!");
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("나는 달러!!!");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
