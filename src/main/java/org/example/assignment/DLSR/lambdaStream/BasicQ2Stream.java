package org.example.assignment.DLSR.lambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicQ2Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. 3초과인 데이터 들만 모은 list를 생성해 출력하세요.
        List<Integer> num1 = numbers.stream()
                                    .filter(n -> n > 3)
                                    .collect(Collectors.toList());
        System.out.println(num1);

        // 2. 각 요소에 대해 10을 곱한 후 list를 생성해 출력하세요.
        List<Integer> num2 = numbers.stream()
                                    .map(n -> n * 10)
                                    .collect(Collectors.toList());
        System.out.println(num2);

    }
}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q2_stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. 3초과인 데이터만 모은 리스트 생성
        List<Integer> filteredList = numbers.stream()
                .filter(n -> n > 3) // 3초과 필터링
                .collect(Collectors.toList());
        System.out.println("3초과 숫자: " + filteredList);

        // 2. 각 요소에 대해 10을 곱한 후 리스트 생성
        List<Integer> multipliedList = numbers.stream()
                .map(n -> n * 10) // 각 요소에 10 곱하기
                .collect(Collectors.toList());
        System.out.println("각 요소에 10을 곱한 숫자: " + multipliedList);
    }
}

 */