package org.example.day23.thread기본;

public class Thread123Main {
    public static void main(String[] args) {
        // 스레드 객체 생성
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        // main스레드와 함께 3개의 스레드를 동시에 처리하는 목록을 등록
        t1.start();
        t2.start();
        t3.start();
    }
}
