package org.example.day1.var;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");
// 기본형 4가지 : 정수, 실수, 문자1, 논리

//가을이다. 관련된 데이터를 기본형으로 4가지 넣어보고 프린트!!
//상수도 추가해주세요. final을 붙임. 변수명 대문자로!

        int month = 9;
        double tempThis = 22.2; //낙타표기법, package, class, var 등에 사용
        final char COLOR = 'b';
        boolean rain = false;

        System.out.println("달은 :  " + month);
        System.out.println("온도는 : " + tempThis);
        System.out.println("색은 : " + COLOR);
        System.out.println("비가 오나 : " + rain);

        month = 10;
// COLOR = 'r'; // 값 변경 금지
// nowTime = 15; 에러: 변수 지정 x

        int nowTime;  // 이런식으로 코딩 x
        nowTime = 17;

        int nowTime2 = 0;   //변수 초기화
        nowTime2 = 17;      //변수는 반드시 초기화를 시켜주어야함.
    }
}
