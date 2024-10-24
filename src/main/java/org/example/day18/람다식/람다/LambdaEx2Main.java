package org.example.day18.람다식.람다;

public class LambdaEx2Main {
    public static void main(String[] args) {
        // 문자열을 대문자로 변환하는 람다식 구현
        LambdaEx2 toUpperCase = input -> input.toUpperCase();
        //                      --> String 하나일 때는 () 없어도 가능

        // 문자열 변환 및 출력
        String result = toUpperCase.func2("abc");
        System.out.println(result);
    }
}