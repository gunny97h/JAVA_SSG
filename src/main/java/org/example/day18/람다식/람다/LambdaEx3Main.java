package org.example.day18.람다식.람다;

public class LambdaEx3Main {
    public static void main(String[] args) {
        // 문자열 길이를 계산하는 람다식 구현
        LambdaEx3 getLength = (input) -> input.length();

        // 문자열 길이 계산 및 출력
        int result = getLength.func3("abc");
        System.out.println(result);
    }
}