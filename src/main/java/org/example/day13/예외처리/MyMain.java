package org.example.day13.예외처리;

public class MyMain {
    public static void main(String[] args) {
        MyAccount account = new MyAccount();
        try {
            account.money();
        } catch (MyException e) { // catch (Exception e)도 가능 (상속에서 MyException보다 상위이기 때문에)
            System.out.println("main에서 에러 처리함.");
            System.out.println(e.getMessage());
        }
    }
}
