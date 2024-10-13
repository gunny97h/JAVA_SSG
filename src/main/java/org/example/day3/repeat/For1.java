package org.example.day3.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        //3번 환영합니다. 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("환영합니다");
        }
        System.out.println("==========================");

//숫자를 100부터 200까지 출력
        for (int j = 0; j<101; j++){
            System.out.println(j+100);
        }
        System.out.println("==========================");

//Random한 정수값 5개 출력(범위는 0~99)
        Random r = new Random();
        for (int k = 0; k < 5; k++) {
            System.out.println(r.nextInt(100));
        }
    }
}
