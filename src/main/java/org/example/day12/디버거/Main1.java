package org.example.day12.디버거;

// NEW01-Intellij debugger.pdf
public class Main1 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum>> " + sum);
    }

}
