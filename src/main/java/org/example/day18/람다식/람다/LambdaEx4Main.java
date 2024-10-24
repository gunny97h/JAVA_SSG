package org.example.day18.람다식.람다;

public class LambdaEx4Main {
    public static void main(String[] args) {
        // 두 숫자의 차이를 계산하는 람다식 구현
        LambdaEx4 subtract = (x, y) -> x - y;

        // 두 숫자의 차이 계산 및 출력
        int result = subtract.func4(10, 5);
        System.out.println(result);
    }
}