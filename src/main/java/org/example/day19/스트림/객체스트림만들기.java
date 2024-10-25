package org.example.day19.스트림;

import java.util.ArrayList;
import java.util.List;

public class 객체스트림만들기 {
    public static void main(String[] args) {
        // 컬렉션, 배열, 파일, 랜덤하게 만들 수도 있음.

        // 1. 컬렉션(list, set, map, queue)
        List<Integer> list = new ArrayList<Integer>();  // < -- 전략적 패턴
        // Stream<Integer>를 생성!
        // 통로Stream[ Integer 주소, Integer 주소, Integer 주소 ]
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);

        //list.stream().forEach(System.out::println);
        list.stream()
            .map(x -> x + 100)
            .forEach(x -> System.out.println(x));

        System.out.println(
                list.stream()
                    .map(x -> x + 100)
                    .mapToInt(Integer::intValue)
                    //.mapToInt(x -> x)
                    .sum()

                //.mapToInt(Integer::intValue) ==>
                //.mapToInt(x -> Integer.intValue(x)) : intStream

                // .mapToInt(Integer::intValue): Integer 객체의 intValue 메서드를 참조하여 int로 변환합니다.
                //                               메서드 참조를 사용하는 방식이라 코드가 간결하게 보이는 장점이 있습니다.
                // .mapToInt(x -> x): x가 이미 Integer 타입임을 알고 있을 때, 람다 표현식으로
                //                    x 자체를 int로 해석하도록 하는 방식입니다.
                //                    다만, 이 방식은 코드 작성 시 x의 타입이 Integer임을 명확히 알아야 실수가 줄어듭니다.
        );
    }
}
