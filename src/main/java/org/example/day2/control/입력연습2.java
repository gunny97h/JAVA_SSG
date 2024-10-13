package org.example.day2.control;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {
        // 수동 import ==> Alt + Enter
        Scanner sc = new Scanner(System.in);

        // 정수 2개를 입력받아서 첫 번째 숫자가 두 번째 숫자보다 큰지 큰지 비교해서 출력

//        System.out.print("정수 A를 입력하세요 >> ");
//        int num1 = sc.nextInt();
//        System.out.print("정수 B를 입력하세요 >> ");
//        int num2 = sc.nextInt();
//        System.out.println(num1 > num2);


        // 70 페이지 연습 문제
        System.out.print("나의 이름은? ");
        String name = sc.next();
        System.out.print("나의 키는? ");
        double height = sc.nextDouble();
        System.out.print("나의 몸무게는? ");
        double weight = sc.nextDouble();
        System.out.print("나는 저녁을 먹었나요? ");
        boolean eat = sc.nextBoolean();
        String word = sc.nextLine();           // 위에서 입력한 엔터 처리
        System.out.print("나의 좌우명은? ");
        String life = sc.nextLine();

        System.out.println("내 이름은" + name + "입니다.");
        System.out.println("내 내년 키는 " + (height + 11) + "입니다.");
        System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
        System.out.println("나는 저녁을 " + eat + "했습니다.");
        System.out.println("내 좌우명은 " + life + "입니다.");

        sc.close();
    }
}
