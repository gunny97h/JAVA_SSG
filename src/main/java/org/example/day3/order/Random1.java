package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random();    // 아무 값을 만들어주는 클래스
        r.setSeed(100);             // 시드 값을 정해 같은 시드에서는 같은 값이 나오게


        // 반복문을 만들 때는 유한 반복, 무한 반복
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt();      // 다른 타입도 가능, 범위 설정 가능 // +-21억
            int num1 = r.nextInt(100);      // 0~99
            int num2 = r.nextInt(100) + 1;  // 1~100
            System.out.println(num2);
        }
    }
}

//package org.example.day3.order;
//
//import java.util.Random;
//
//public class Ramdom1 {
//    public static void main(String[] args) {
//
//        //의사 임시값!
//        Random r = new Random(100); //아무값을 만들어주는 클래스
//        //r.setSeed(100); //시드값, 씨앗값
//
//        //반복문을 만들때는 유한반복, 무한반복
//        for(int i = 0; i < 100; i++) {
//            int num = r.nextInt(100); //+-21억 ==> 0 ~ 99
//            int num2 = r.nextInt(100) + 1; //==> 1~100
//            System.out.println(num);
//            System.out.println(num2);
//        }
//    }
//}