package org.example.day13.예외처리;

public class 에러발생4Main {
    public static void main(String[] args) {
        에러발생4 error = new 에러발생4();
        try {
            error.call();  // 에러가 있는 메서드를 호출함.
            //    --> Unhandled exception: java. lang. Exception (try/catch 없는 경우)
            //        메서드에서 예외처리를 던지면 여기서 받아야 함
        } catch (Exception e) {
            System.out.println("부르는 곳에서 예외처리함.");
        }
        System.out.println("에러 발생 후 실행될까요..!!!!!");
        System.out.println("에러 발생 후 실행될까요..!!!!!");
        System.out.println("에러 발생 후 실행될까요..!!!!!");
        System.out.println("에러 발생 후 실행될까요..!!!!!");
        System.out.println("에러 발생 후 실행될까요..!!!!!");
        System.out.println("에러 발생 후 실행될까요..!!!!!");
        System.out.println("에러 발생 후 실행될까요..!!!!!");
    }
}
