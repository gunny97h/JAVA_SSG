package org.example.day1.oper;

import javax.swing.*;

public class Oper1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("당신의 이름을 입력하시오."); // "홍길동"
        String age = JOptionPane.showInputDialog("당신의 나이를 입력하시오.");        // "100"
// int age , double age : 오류
// 입력받는 값은 숫자여도 String으로 저장

        int age2 = Integer.parseInt(age); // age라는 값은 평생 String이기 때문에 타입 변환 후 새로운 저장 공간을 만들어 저장해야 함

        System.out.println(name+ " " + age2);

//Quiz: age2에 1을 더해서 age3에 넣었다가 프린트
        int age3 = age2 + 1; // int나 long 가능  // 기본형 끼리의 연산자는 실제 연산처럼 계산
        System.out.println("내년 나이는 " + age3); // 하나라도 String이면 결과값은 String
    }
}
