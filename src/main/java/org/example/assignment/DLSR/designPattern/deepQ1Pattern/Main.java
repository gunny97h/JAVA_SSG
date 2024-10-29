package org.example.assignment.DLSR.designPattern.deepQ1Pattern;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection singleton1 = DatabaseConnection.getInstance();
        System.out.println(singleton1);

        DatabaseConnection singleton2 = DatabaseConnection.getInstance();
        System.out.println(singleton2);
    }
}




/*
package org.example.assignment.DLSR.designPattern.deepQ1Pattern;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        DatabaseConnection connection3 = DatabaseConnection.getInstance();

        System.out.println("Connection 1 주소: " + System.identityHashCode(connection1));
        System.out.println("Connection 2 주소: " + System.identityHashCode(connection2));
        System.out.println("Connection 3 주소: " + System.identityHashCode(connection3));
    }
}
 */