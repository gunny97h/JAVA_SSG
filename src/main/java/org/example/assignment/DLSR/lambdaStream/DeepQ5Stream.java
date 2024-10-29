package org.example.assignment.DLSR.lambdaStream;

public class DeepQ5Stream {

}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class deep_q5_stream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        // 1. 각 숫자에 3을 곱하기
        List<Integer> multipliedList = numbers.stream()
                .map(num -> num * 3) // 3 곱하기
                .collect(Collectors.toList());

        // 2. 결과에서 짝수만 필터링
        List<Integer> evenList = multipliedList.stream()
                .filter(num -> num % 2 == 0) // 짝수 필터링
                .collect(Collectors.toList());

        // 3. 남은 숫자들을 각 숫자의 제곱으로 변환
        List<Integer> squaredList = evenList.stream()
                .map(num -> num * num) // 제곱하기
                .collect(Collectors.toList());

        // 4. 변환된 수를 내림차순으로 정렬
        List<Integer> sortedList = squaredList.stream()
                .sorted((a, b) -> b - a) // 내림차순 정렬
                .collect(Collectors.toList());

        // 5. 최대 5개의 요소만 포함하는 새로운 리스트 생성
        List<Integer> limitedList = sortedList.stream()
                .limit(5) // 최대 5개 요소
                .collect(Collectors.toList());

        // 결과 출력
        System.out.println("최종 리스트: " + limitedList);
    }
}

 */