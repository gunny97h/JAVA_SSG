package org.example.assignment.inherit1.basicQ1Inherit;

public class MMain {
    public static void main(String[] args) {

        org.example.assignment.inherit1.basicQ1Inherit.Manager manager =
                new org.example.assignment.inherit1.basicQ1Inherit.
                        Manager("John Doe", "123 Main St", 50000, 123456789, 5000);

        System.out.print(manager);
        Manager.test();

    }
}
