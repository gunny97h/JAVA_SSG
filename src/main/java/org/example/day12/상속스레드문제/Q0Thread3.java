package org.example.day12.상속스레드문제;

public class Q0Thread3 extends Thread {

    String[] foods = {"a", "b", "c", "d", "e", "f"};
    @Override
    public void run() {
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
    }
}
