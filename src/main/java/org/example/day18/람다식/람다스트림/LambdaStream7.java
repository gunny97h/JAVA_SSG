package org.example.day18.람다식.람다스트림;

import java.util.Arrays;
import java.util.List;

public class LambdaStream7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        // 'a'를 포함하는 문자열만 필터링하여 출력
        words.stream()
                .filter(n -> n.contains("a"))
                .forEach(System.out::println);
    }
}
