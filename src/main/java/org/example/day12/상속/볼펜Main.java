package org.example.day12.상속;

public class 볼펜Main {
    public static void main(String[] args) {

        볼펜 pen = new 볼펜(1000, "모나미", 5);
        System.out.println(pen);
        pen.write();
    }
}
