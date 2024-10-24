package org.example.day18.람다식.람다스트림;

import java.util.Arrays;
import java.util.List;

public class LambdaStream2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "sun", "sky", "sea");

        // 길이가 3 이상인 문자열 필터링하여 출력
        words.stream()
                .filter(word -> word.length() >= 3)
                .forEach(System.out::println);
    }
}
