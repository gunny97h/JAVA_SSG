package org.example.day18.람다식.람다스트림;

import java.util.Arrays;
import java.util.List;

public class LambdaStream4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, 5, -1, 7, -8, 2);

        // 음수 숫자만 필터링하여 출력
        numbers.stream()
                .filter(x -> x < 0)
                .forEach(System.out::println);
    }
}
