package org.example.day19.스트림;

import java.util.*;
import java.util.stream.IntStream;

public class 추가문제 { // 스트림과 람다 이용
    public static void main(String[] args) {
        // 1. 정수값 100개를 111~222까지 랜덤하게 스트림으로 만들어서
        //    최대값, 최소값, 합계, 평균을 구하시오.
        System.out.println("\n----- 1번 -----");
        Random r = new Random();
        IntStream intStream = r.ints(100, 111, 223);
        OptionalInt max = intStream.max();
        //OptionalInt min = intStream.min();  // 스트림은 한 번 소모하면 재사용이 불가
        OptionalInt min = r.ints(100, 111, 223).min();
        int sum = r.ints(100, 111, 223).sum();
        OptionalDouble avg = r.ints(100, 111, 223).average();

        System.out.println(
                "최대값: " + max.getAsInt()
                + "\n최소값: " + min.getAsInt()
                + "\n합계: " + sum
                + "\n평균: " + avg.getAsDouble()
        );


        // 2. 실수값 200개를 11.1~55.5까지 랜덤하게 스트림을 만들어서
        //    전체 개수, 맨 앞에 있는 값, 평균을 구하시오.
        System.out.println("\n----- 2번 -----");
        long count = r.doubles(200, 11.1, 55.5).count();
        double first = r.doubles(200, 11.1, 55.5)
                        .findFirst()
                        .orElse(0);  // 값이 없을 경우 0 반환
        double avg2 = r.doubles(200, 11.1, 55.5)
                       .average()
                       .orElse(0);

        System.out.println(
                "전체 개수: " + count
                + "\n맨 앞: " + first
                + "\n평균: " + avg2
        );


        // 3. 먹고 싶은 음식 7개를 List<String>에 넣은 후,
        //    스트림으로 만들고 글자가 3글자 이상인 것들만 모아서 프린트
        System.out.println("\n----- 3번 -----");
//        List<String> food = new ArrayList<>();
//        food.add("피자");
//        food.add("초밥");
//        food.add("스테이크");
        List<String> foods = Arrays.asList("피자", "초밥", "스테이크", "햄버거", "김치", "파스타", "콜라");
        List<String> foodsresult = foods.stream()
                                        .filter(f -> f.length() >= 3)
                                        .toList();
        System.out.println(foodsresult);


        // 4. 가고 싶은 곳 5개(산 2개 이상 넣음)를 String[]에 넣은 후, 스트림으로 만들고
        //    글자가 "산"으로 끝나는 것을 모아 List<String>으로 모은 후 출력
        System.out.println("\n----- 4번 -----");
        String[] places = {"한라산", "설악산", "제주도", "지리산", "일본"};
        List<String> mountains = Arrays.stream(places)
                                       .filter(place -> place.endsWith("산"))
                                       .toList();
        mountains.forEach(System.out::println);
        System.out.println(mountains);




        // 5. List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);를 스트림으로 만들어
        //   최대값, 최소값, 합계, 평균을 구하시오.
        System.out.println("\n----- 5번 -----");
        List<Double> list5 = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);
        //Optional<Double> max2 = list.stream().max();
        OptionalDouble max5 = list5.stream().mapToDouble(Double::doubleValue).max();
        OptionalDouble min5 = list5.stream().mapToDouble(Double::doubleValue).min();
        int sum5 = list5.stream().mapToInt(Double::intValue).sum();
        double avg5 = list5.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println(
                "최대값: " + max5.getAsDouble()
                        + "\n최소값: " + min5.getAsDouble()
                        + "\n합계: " + sum5
                        + "\n평균: " + avg5
        );

// 코드의 타입 차이
        // OptionalDouble min2 = list.stream().mapToDouble(Double::doubleValue).min();
        //      mapToDouble(Double::doubleValue): list가 List<Double>이기 때문에, 각 요소는 Double 객체입니다.
        //                                        mapToDouble 메서드를 사용하여 이를 기본형 double 스트림(DoubleStream)으로
        //                                        변환했습니다.
        //      min(): DoubleStream에서 min() 메서드는 OptionalDouble을 반환합니다.
        //             이는 값이 존재하지 않을 경우 OptionalDouble.empty()로 처리할 수 있게 합니다.

        //int sum2 = list.stream().mapToInt(Double::intValue).sum();
        //mapToInt(Double::intValue): mapToInt 메서드는 Double 객체를 기본형 int로 변환해 IntStream을 생성합니다.
        //sum(): IntStream의 sum() 메서드는 모든 요소를 합산하여 기본형 int 값을 반환합니다.


        // 6. List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);을 스트림으로 만들어
        //   중복을 제거후, 오름차순으로 정렬한 후 최소값을 구하시오.


        System.out.println("\n----- 6번 -----");
        List<Integer> list6 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);
        OptionalInt min6 = list6.stream().distinct().sorted().mapToInt(Integer::intValue).min();
        System.out.println("최소값: " + min6.getAsInt());
        // Optional<Integer>: 객체 타입이므로, 값을 저장할 때 Integer 객체를 생성해야 합니다.
        //                    이로 인해 메모리 사용량이 증가할 수 있습니다.
        //OptionalInt: **기본형 int**를 직접 다루도록 설계되었기 때문에 Optional<Integer>보다 메모리를 덜 사용합니다.
        //             박싱과 언박싱 과정이 없어서 성능 면에서도 유리합니다.
    }
}
