package org.example.day18.람다식.람다스트림;

import java.util.Arrays;
import java.util.List;

public class LambdaStream6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // 홀수 숫자의 제곱 구하여 출력
        numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
