package org.example.assignment.DLSR.lambdaStream;

public class DeepQ4Stream {

}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class deep_q4_stream {

        public static void main(String[] args) {
            // 1. 랜덤한 정수 배열 생성
            Random random = new Random();
            int[] numbers = random.ints(500, -200, 201).toArray();

            // 2. 배열에서 0 이상인 짝수만 필터링
            List<Integer> evenNumbers = Arrays.stream(numbers)
                    .filter(num -> num >= 0 && num % 2 == 0)
                    .boxed()
                    .collect(Collectors.toList());

            // 3. 필터링된 결과에서 각 숫자의 제곱을 구하기
            Map<Integer, Integer> squaredMap = evenNumbers.stream()
                    .collect(Collectors.toMap(num -> num, num -> num * num));

            // 4. 제곱 결과를 기준으로 각 숫자를 그룹화하고, 각 그룹 내에서 원래 숫자의 합 계산하기
            Map<Integer, List<Integer>> groupedMap = squaredMap.keySet().stream()
                    .collect(Collectors.groupingBy(squaredMap::get));

            // 5. 각 그룹의 합이 가장 큰 값을 찾기
            int maxSum = Integer.MIN_VALUE;
            int maxKey = 0;

            for (Map.Entry<Integer, List<Integer>> entry : groupedMap.entrySet()) {
                int sum = entry.getValue().stream().mapToInt(Integer::intValue).sum();
                if (sum > maxSum) {
                    maxSum = sum;
                    maxKey = entry.getKey();
                }
            }

            // 6. 해당 그룹에 속한 숫자들 출력
            System.out.println("가장 큰 합을 가진 그룹의 제곱 값: " + maxKey);
            System.out.println("해당 그룹에 속한 숫자들: " + groupedMap.get(maxKey));
        }
    }


 */