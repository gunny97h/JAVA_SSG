package org.example.day18.람다식.람다스트림;

import java.util.Arrays;
import java.util.List;

public class LambdaStream8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "lambda", "stream", "example");

        // 각 문자열의 길이를 계산하여 출력1
        words.stream()
                .map(n -> n.length())
                .forEach(System.out::println);

        // 각 문자열의 길이를 계산하여 출력2
        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
