package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class 객체스트림to기본스트림 {
    public static void main(String[] args) {
        // 객체스트림 --> 기본스트림
        List<Integer> list = Arrays.asList(100, 200, 300);
        List<Double> list2 = Arrays.asList(100.0, 200.0, 300.0);
        // 스트림으로 만들어서
        // 평균을 구해보고,
        // 합도 구해보고,
        // 최대값도 구해보자.
        System.out.println("--- 방법 1 ---");
        //System.out.println("-- Integer --");
        //double avg2 = list.stream().mapToInt(Integer::intValue).average();
        OptionalDouble avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        // 평균이니 double로 가져옴
        if (avg.isPresent()) {
            System.out.println(avg.getAsDouble());
        } else {
            System.out.println("평균을 구할 수 없음.");
        }

        System.out.println("--- 방법 2 ---");
        //System.out.println("-- Double --");
        double avg2 = list2.stream()
                .mapToDouble(Double::valueOf)
                .average().
                orElse(0.0);  // --> 없을 경우 기본값을 설정하면 바로 추출 가능
        System.out.println(avg2);

        System.out.println("--- 방법 3 ---");
        list2.stream()
                .mapToDouble(Double::valueOf)
                .average()
                .ifPresent(System.out::println);  // 값이 있을 때만 실행
    }
}
