package org.example.day13.예외처리;

public class 에러발생2 { // JVM 자동 처리
    public static void main(String[] args) throws Exception {

        System.out.println("1. 나는 프린트가 잘 될 예정.");

        System.out.println("2. 문제 발생 코드" + 10 / 0);

        System.out.println("3. 나는 과연 프린트될까요?");
    }
}
