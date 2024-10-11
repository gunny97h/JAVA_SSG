package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        // 기본형 변수를 정리 - 정수, 실수, 문자1, 논리
        float temp = 23.5f;  // 뒤에 f 붙이기
        double d = 22.2;
        byte date = 26;      // -128 ~ 127 ==> int
        final char DAY = '목';     // '' 사용 // 상수(final) 변수명 대문자
        boolean food = true;
        food = false;

        String roomNo = "강의장 6호";

// 콘솔에 출력하기
        System.out.println("Temperature: " + temp);
        System.out.println("Double value: " + d);
        System.out.println("Date (byte): " + date);
        System.out.println("Day (char): " + DAY);
        System.out.println("Is there food? " + food);
        System.out.println("Room number: " + roomNo);
    }
}
