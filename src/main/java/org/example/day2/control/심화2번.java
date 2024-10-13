package org.example.day2.control;

import java.util.Scanner;

public class 심화2번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("게임을 계속 하시겠습니까? ( Y / N )");

        System.out.println("첫 번째 사람의 숫자를 입력하세요: ");
        int first = sc.nextInt();
        System.out.println("두 번째 사람의 숫자를 입력하세요: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("첫 번째 사람이 이겼습니다!");
        }else if (first == second) {
            System.out.println("비겼습니다.");
        }else {
            System.out.println("두 번째 사람이 이겼습니다!");
        }

        sc.close();
    }
}
