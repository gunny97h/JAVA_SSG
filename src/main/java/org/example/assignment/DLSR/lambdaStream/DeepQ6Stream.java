package org.example.assignment.DLSR.lambdaStream;

public class DeepQ6Stream {
}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class deep_q6_stream {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig");

        // 1. 문자열 길이가 5 이상인 것들만 필터링
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() >= 5) // 길이 필터링
                .collect(Collectors.toList());

        // 2. 각 문자열을 소문자로 변환
        List<String> lowerCaseWords = filteredWords.stream()
                .map(String::toLowerCase) // 소문자로 변환
                .collect(Collectors.toList());

        // 3. 각 문자열의 첫 글자를 기준으로 그룹화
        Map<Character, List<String>> groupedWords = lowerCaseWords.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        // 4. 각 그룹의 문자열 개수를 셉니다.
        Map<Character, Long> countMap = groupedWords.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (long) e.getValue().size()));

        // 5. 그룹화된 데이터를 알파벳 순으로 정렬하여 출력
        countMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // 키(첫 글자)로 정렬
                .forEach(entry -> System.out.println("첫 글자: " + entry.getKey() + ", 개수: " + entry.getValue()));

    }
}

 */