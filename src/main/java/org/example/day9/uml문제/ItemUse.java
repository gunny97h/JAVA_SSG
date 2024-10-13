package org.example.day9.uml문제;

import java.util.Scanner;

// NEW01_JAVA_요일별문제_PDF
// 1007-NEW01-CLASS.pdf
public class ItemUse {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "Burger";
        item1.price = 5.99;
        Item item2 = new Item();
        item2.name = "Fries";
        item2.price = 2.99;
        Item item3 = new Item();
        item3.name = "Soda";
        item3.price = 1.99;
        Item[] items = {item1, item2, item3};  // 반복문 사용하기 위해 배열에 넣기

        // 메뉴 출력
        System.out.println("주문 가능한 메뉴입니다.");
        System.out.println("===================================");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ">> " + items[i].getName() + ": " + items[i].getPrice() + "$");
        }

        // 메뉴 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴 번호를 입력(ex: 1 2 3 2) >> ");
        String n1 = sc.nextLine();
        String[] n2 = n1.split(" ");

        sc.close();

        // 주문 결과
        //int[] n3 = new int[n2.length];
        double totalPrice = 0;
        for (int i = 0; i < n2.length; i++) {  // 나중에는 둘러싸기 단축기 사용
            //n3[i] = Integer.parseInt(n2[i]);
            int n4 = Integer.parseInt(n2[i]);
            totalPrice = totalPrice + items[n4 - 1].getPrice();
            System.out.println(">> " + items[n4 - 1].getName() + ": " + items[n4 - 1].getPrice() + "$");
        }
        //System.out.println("Total >> " + totalPrice + "$");
        System.out.println("주문 개수 >> " + n2.length);
        System.out.printf("총 금액 >> %.2f$%n", totalPrice);

    }
}


/*
package org.example.day9.uml문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "햄버거";
        item1.price = 50.5;
        Item item2 = new Item();
        item2.name = "냉면";
        item2.price = 60.5;
        Item item3 = new Item();
        item3.name = "커피";
        item3.price = 5.5;
        Item[] items = {item1, item2, item3};
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 메뉴 중 3번 주문하세요. (번호입력: 주문, x: 종료)");
        //메뉴 출력
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + "-> " + items[i].getName() + ": " + items[i].getPrice() + "$");
        }
        //메뉴 보고 주문
        String n = sc.nextLine(); //"1 2 3"
        String[] s = n.split(" ");//{"1", "2", "3"}
        System.out.println("주문 내용입니다.--------------");
        for (int i = 0; i < s.length; i++) {
            int s2 = Integer.parseInt(s[i]); //1 <-- "1"
            System.out.println(items[s2 - 1].getName() + " " + items[s2 - 1].getPrice() + "$");
        }
        sc.close();

        System.out.println();
        //System.out.println("1-> " + item1.getName() + ": " + item1.getPrice() + "$");
        //System.out.println("2-> " + item2.getName() + ": " + item2.getPrice() + "$");
        //System.out.println("3-> " + item3.getName() + ": " + item3.getPrice() + "$");

    }
}
*/