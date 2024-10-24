package org.example.assignment.DLSR.lambdaStream;


import java.util.Arrays;
import java.util.List;

public class BasicQ5Stream {
    public static void main(String[] args) {
        // 다음을 람다와 스트림을 이용하여 해결하시오.

        // 1. 3보다 큰 수들을 필터링한 후, 중복을 제거하여 목록을 출력하시오.
        int[] arr1 = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
        List<Integer> arr10 = Arrays.stream(arr1)
                                    .filter(n -> n > 3)
                                    .distinct()
                                    .boxed()
                                    .toList();
        System.out.println(arr10);

        // 2. 모두 더한 수를 출력하시오.
        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
        double arr20 = Arrays.stream(arr2)
                             .sum();
        System.out.println(arr20);

        // Integer[] arr = {5, 3, 1, 33, 35};
        // int sum = Arrays.stream(arr)
        //                 .mapToInt(Integer::intValue)  // Integer -> int 변환
        //                 .sum();
        // System.out.println(sum);

        // 3. 모든 요소에 "사무실"을 뒤에 붙인 후, 목록을 출력하시오.
        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
        List<String> arr30 = Arrays.stream(arr3)
                                   .map(n -> n + " 사무실")
                                   .toList();
        System.out.println(arr30);

    }

}
/*
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q5_stream {
    public static void main(String[] args) {
// 1. int 배열에서 3보다 큰 수 필터링 후 중복 제거
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 8};
        List<Integer> filteredList = Arrays.stream(arr)
                .filter(num -> num > 3) // 3보다 큰 수 필터링
                .distinct() // 중복 제거
                .boxed() // int에서 Integer로 변환
                .collect(Collectors.toList());
        System.out.println("3보다 큰 수 (중복 제거): " + filteredList);

        // 2. double 배열의 모든 값 출력
        double[] arr2 = {5.0, 3.0, 10.0, 33.0, 35.0};
        List<Double> doubleList = Arrays.stream(arr2) // double 배열 스트림 생성
                .boxed() // double에서 Double로 변환
                .collect(Collectors.toList());
        System.out.println("모든 double 값: " + doubleList);

        // 3. String 배열의 모든 요소에 "사무실"을 붙인 후 출력
        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
        List<String> appendedList = Arrays.stream(arr3)
                .map(word -> word + " 사무실") // 각 요소에 "사무실" 추가
                .collect(Collectors.toList());
        System.out.println("모든 요소에 '사무실'을 붙인 리스트: " + appendedList);
    }
}

 */