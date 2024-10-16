package org.example.dayQ.inherit1;

public class Q1_Main {
    public static void main(String[] args) {

        Q1_매니저 manager = new Q1_매니저("John Doe", "123 Main St", 50000, 123456789, 5000);

        System.out.print(manager);
        Q1_매니저.test();

    }
}
