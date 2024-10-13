package org.example.day9.메모리그림;

public class Car {
    // 필드 2개 --> 멤버변수, 전역변수(자동초기화)
    int size;
    int speed;

    // 메서드 2개 --> 멤버메서드
    public String print() {
        return "size: " + size + " speed: " + speed;
    }

    // 메서드 정의 --> 실행되지 않음, 호출했을 때 실행!
    public void hi() {
        int temp = 10;  // 지역변수(자동초기화 x), 기본형
        System.out.println(temp + "만큼 speed up!!");
        speed = speed + temp;

        // 같은 클래스내에서는 함수와 변수를 마음대로 불러 사용할 수 있다.
        // 외부에서는 참조형 변수(주소)가 필요하다.
        System.out.println(print());
    }
}
