package org.example.assignment.DLSR.lambdaStream;

import java.util.Arrays;
import java.util.List;

public class BasicQ8Stream {
    public static void main(String[] args) {
        // 다음을 람다와 스트림을 이용하여 해결하시오.
        // 1. 홀수만 필터링하여 합을 구한 후, 출력하시오
        int[] arr1 = {1, 2, 3, 4, 5};
        int arr10 = Arrays.stream(arr1)
                          .filter(x -> x % 2 == 1)
                          .sum();
        System.out.println(arr10);

        // 2. 가장 큰 값을 구한 후, 출력하시오.
        int[] arr2 = {5, 3, 10, 40, 2};
        int arr20 = Arrays.stream(arr2)
                          .max()
                          .getAsInt();
        System.out.println(arr20);


        // 3. 5보다 큰 수들을 필터링하여 중복을 제거한 후, 목록을 출력하시오.
        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};
        List<Integer> arr30 = Arrays.stream(arr3)
                                    .filter(n -> n > 5)
                                    .distinct()
                                    .boxed()
                                    .toList();
        System.out.println(arr30);
    }
}


/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q8_stream {

    public static void main(String[] args) {
        //1.
        // int[] arr = {1, 2, 3, 4, 5}; 홀수만 필터링하여 합을 구한 후, 출력하시오.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);
        System.out.println(sumOfOdds);

        //2.
        // int[] arr2 = {5, 3, 10, 40, 2}; 가장 큰 값을 구한 후, 출력하시오.
        List<Integer> numbers2 = Arrays.asList(5, 3, 10, 40, 2);
        int max = numbers2.stream()
                .max(Integer::compare)
                .orElse(Integer.MIN_VALUE);
        System.out.println(max);

        //3.
        // int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10}; 5보다 큰 수들을 필터링하여 중복을 제거한 후, 목록을 출력하시오.
        List<Integer> list = Arrays.asList(1, 2, 2, 5, 5, 6, 7, 8, 9, 10);
        List<Integer> addedList = list.stream()
                .map(n -> n + 5)
                .collect(Collectors.toList());
        System.out.println(addedList);
    }
}

 */