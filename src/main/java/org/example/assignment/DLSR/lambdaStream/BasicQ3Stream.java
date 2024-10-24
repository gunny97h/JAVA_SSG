package org.example.assignment.DLSR.lambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicQ3Stream {
    public static void main(String[] args) {

        List<String> words  = Arrays.asList("hello", "HI", "smile");

        // 1. 각 요소를 모두 대문자로 변경한 후, 글자 수가 4를 초과하는 데이터들의 list를 생성해 출력하세요.
        List<String> string1 = words.stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 4)
                .collect(Collectors.toList());

        List<String> string11 = words.stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 4)
                .toList();

        System.out.println(string1);
        System.out.println(string11);

        // 2. 각 요소에 대해 “님"을 붙인 후, list를 생성해 출력하세요.
        List<String> string2 = words.stream()
                .map(n -> n + "님")
                .collect(Collectors.toList());

        System.out.println(string2);
    }
}
