package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        //입력
        //ram에 있어야
        //int x = 100;
        Scanner sc = new Scanner(System.in);      // System.in --> 시스템의 기본 입력 장치(키보드)로 입력
        System.out.print("나이 입력>> ");          // println(), printf()
        int age = sc.nextInt();                  // 컴퓨터는 모든 입력 타입을 String으로 인식 --> int로 변경
        System.out.print("아침을 먹었는지 입력(true/false)? ");
        boolean result = sc.nextBoolean();

        //처리  --> cpu가 처리함
        int nextAge = age + 1;
        String text = null;                         // 주소가 없음  // 기본형이 아닌 데이터는 null로 초기화
        if (result) {                               // 조건 자체가 boolean이면 자체로 사용 가능
            text = "점심을 조금 먹어도 되겠네요.!";                  //--> 현실적인 코드
            //System.out.println("점심을 조금 먹어도 되겠네요.!");   //--> 내가 쓰던 코드
        } else {
            text = "점심을 많이 먹어야 되겠네요.!";
            //System.out.println("점심을 많이 먹어야 되겠네요.!");
        }

        //출력
        System.out.println("내년 나이는 " + nextAge + "세");
        System.out.println("아침 식사 여부 결과 " + text);

        // jvm이 사용할 수 있게 Input1.class로 바꿈 --> daemon 프로그램 (Gradle)
        // 콘솔창의 결과 --> log 기록 --> 실행에 걸린 시간, 오류 등 여러 정보
    }
}
