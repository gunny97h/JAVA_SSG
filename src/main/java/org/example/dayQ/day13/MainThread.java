package org.example.dayQ.day13;

public class MainThread { //스레드사용2.java
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        TimeThread timeThread = new TimeThread();
        timeThread.start();
        evenThread.start();
    }

}
