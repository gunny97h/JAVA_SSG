package org.example.assignment.DLSR.lambdaStream;

import java.util.Arrays;
import java.util.List;

public class BasicQ7Stream {
    public static void main(String[] args) {
        // 1. 중복을 제거하여 프린트하시오.
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");

        numbers.stream().
                distinct()
                .forEach(System.out::println);


        // 2. 5글자 이상 문자열만 필터링하여 목록을 생성 후 출력하시오
        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");

        List<String> Strings2 = strings.stream()
                                       .filter(s -> s.length() >= 5)
                                       .toList();
        System.out.println(Strings2);
    }
}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q7_stream {
    public static void main(String[] args) {
        // 1. 중복된 과일을 제거하고 출력
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        List<String> uniqueFruits = numbers.stream()
                .distinct() // 중복 제거
                .collect(Collectors.toList());
        System.out.println("중복 제거된 과일: " + uniqueFruits);

        // 2. 5자 이상인 문자열만 필터링하여 목록 생성 후 출력
        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        List<String> longWords = strings.stream()
                .filter(word -> word.length() >= 5) // 5자 이상 필터링
                .collect(Collectors.toList());
        System.out.println("5자 이상의 단어: " + longWords);
    }
}

 */