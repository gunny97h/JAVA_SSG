package org.example.day12.상속;
// NEW02-Java-5(상속+스레드+예외처리).pdf p.93
public class MThreadUse {

    public static void main(String[] args) {

        MThread1 MT1 = new MThread1();
        MThread2 MT2 = new MThread2();
        MT1.start();
        MT2.start();  // 순서는 상관 없음

    }
}
