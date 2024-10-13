package org.example.day2.control;

import java.util.Scanner;

public class 기본4번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("여행 지역을 입력하세요: ");
        String area = sc.next();
        System.out.print("1인당 경비를 입력하세요: ");
        int money = sc.nextInt();
        System.out.print("여행 인원을 입력하세요: ");
        int men  = sc.nextInt();
        System.out.print("할인율(%)을 입력하세요: ");
        int disc = sc.nextInt();
        System.out.print("VIP 여부 (true/false)를 입력하세요: ");
        boolean vip = sc.nextBoolean();
        sc.nextLine();
        System.out.print("당부의 말을 입력하세요: ");
        String word = sc.nextLine();


        int discVip = 0;
        if (vip == true) {
            discVip = 5;
        }
        int discSum = disc + discVip;
        int allMoney = money * men;
        double discounted = (double)allMoney*discSum/100;

        System.out.println("\n===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " + area);
        System.out.println("1인당 경비: " + (double)money + "원");
        System.out.println("여행 인원: " + men + "명");
        System.out.println("기본 할인율: " + (double)disc + "%");
        System.out.println("VIP 추가 할인율: " + (double)discVip + "%");
        System.out.println("최종 할인율: " +(double)discSum + "%");
        System.out.println("총 경비: " + allMoney + "원");
        System.out.println("할인 금액: " + discounted + "원");
        System.out.println("할인 후 총 금액: " + (allMoney - discounted) + "원");
        System.out.println("당부의 말: " + word);

        sc.close();
    }
}
