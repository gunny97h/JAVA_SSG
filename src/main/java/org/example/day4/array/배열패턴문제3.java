package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴문제3 {
    public static void main(String[] args) {
        // 랜덤한 값(시드값 42) 1000개를 만들어서 배열 만들기.
        // 범위는 1부터 45까지.
        // 30보다 큰 수가 몇 개인지 세어보기.
        int[] lotto = new int[1000];
        Random r = new Random(42);
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45) + 1;
        }
        System.out.println(Arrays.toString(lotto));  // print(lotto)처럼 간단하게 함수로 만들기

        // 카운트 누적 변수
        // 패턴 3번
        int count = 0;
        for (int i = 0; i < lotto.length; i++) {
            if (lotto[i] >= 15) {
                count++;
            }
        }
        System.out.println("30이상 개수>> " + count);
    }
}
