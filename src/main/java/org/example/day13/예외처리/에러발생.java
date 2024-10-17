package org.example.day13.예외처리;

public class 에러발생 { // 직접 처리
    public static void main(String[] args) {
        System.out.println("1. 나는 프린트가 잘 될 예정.");

        try {
            System.out.println("2. 문제 발생 코드" + 10 / 0);
        } catch (Exception e) { // ArithmeticException : 수학 문제 오류만
            System.out.println("수학 실행할 때 문제 발생함");
            e.printStackTrace(); // 발생한 문제에 대해 구체적으로 프린트
            System.out.println(e.getMessage()); // 문제에 대해 간단하게 String으로 리턴
        }

        System.out.println("3. 나는 과연 프린트될까요?");
    }
}
