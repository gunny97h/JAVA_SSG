package org.example.day19.스트림;

import java.util.stream.IntStream;

public class 범위스트림만들기 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(1, 100).sum()  // 범위 내 값 더하기
        );
        System.out.println(
                IntStream.range(1, 100).sum()  // 범위 내 값 더하기
        );
        // rangeClosed(1, 100)는 1부터 100까지의 범위를 포함하고,
        // range(1, 100)는 1부터 99까지로 100을 포함하지 않습니다.

    }
}
