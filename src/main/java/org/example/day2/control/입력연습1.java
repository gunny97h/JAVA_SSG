package org.example.day2.control;

import java.util.Scanner;

public class 입력연습1 {
    public static void main(String[] args) {
        // 수동 import ==> Alt + Enter
        Scanner sc = new Scanner(System.in);  // 콘솔과 자바 간의 통로 만들기
        System.out.print("이름 입력 >> ");
        String name = sc.next();    // 한 단어만 입력, 홍길동
        System.out.print("나이 입력 >> ");
        int age = sc.nextInt();     // String --> int
        System.out.print("체중 입력 >> ");
        double w = sc.nextDouble(); // String --> double
        System.out.println(name + " " + age + " " + w);
        sc.close(); // 통로 닫기 (자원 관리)
    }
}
