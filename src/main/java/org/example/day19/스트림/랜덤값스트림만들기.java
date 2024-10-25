package org.example.day19.스트림;

import java.util.Random;
import java.util.stream.DoubleStream;

public class 랜덤값스트림만들기 {
    public static void main(String[] args) {
        Random r = new Random();
        // 랜덤한 값 만들어서 바로 스트림에 넣을 수 있음.
        // 1부터 99까지의 100개의 랜덤 정수를 생성하고 합계 출력
        int result = r.ints(100, 1, 100)
                      .sum();
        System.out.println(result);

        // 1부터 99까지의 10개의 랜덤 정수를 생성, 정렬 후 중복 제거하여 출력
        r.ints(10, 1, 100)
         .sorted()
         .distinct()
         .forEach(System.out::println);

        DoubleStream ds = r.doubles(10, 1, 100);
        long count = ds.count();
        System.out.println("중복 제거한 후 개수 >> " + count + "개");

//        DoubleStream ds2 = ds.distinct().sorted();
//        ds2.forEach(System.out::println);
        // 이 코드에는 DoubleStream의 스트림을 재사용하려 할 때 오류가 발생합니다.
        // count() 연산 이후 스트림은 소모되므로,
        // ds.distinct().sorted()에서 IllegalStateException이 발생합니다.

        // 이를 해결하려면, DoubleStream 스트림을 다시 생성하거나,
        // count와 distinct().sorted() 작업을 같은 스트림에서 한 번에 처리해야 합니다.

        // 스트림을 다시 생성하여 요소 출력
        r.doubles(10, 1, 100)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}
