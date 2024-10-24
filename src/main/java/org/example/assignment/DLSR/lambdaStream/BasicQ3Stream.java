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
                .toList();  // 위와 같은 기능인데 자주 사용해서 만들어 놓은 것

        System.out.println(string1);
        System.out.println(string11);

        // 2. 각 요소에 대해 “님"을 붙인 후, list를 생성해 출력하세요.
        List<String> string2 = words.stream()
                .map(n -> n + "님")
                .collect(Collectors.toList());

        System.out.println(string2);
    }
}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q3_stream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");

        // 1. 모든 요소를 대문자로 변환한 후, 길이가 4보다 큰 데이터의 리스트 생성
        List<String> upperCaseList = words.stream()
                .map(String::toUpperCase) // 대문자로 변환
                .filter(word -> word.length() > 4) // 길이가 4보다 큰 필터링
                .collect(Collectors.toList());
        System.out.println("대문자로 변환 후 길이가 4보다 큰 단어: " + upperCaseList);

        // 2. 각 요소에 대해 "밍"을 붙인 후 리스트 생성
        List<String> appendedList = words.stream()
                .map(word -> word + "님") // 각 요소에 "밍" 붙이기
                .collect(Collectors.toList());
        System.out.println("각 단어에 '님'을 붙인 리스트: " + appendedList);
    }
}

 */