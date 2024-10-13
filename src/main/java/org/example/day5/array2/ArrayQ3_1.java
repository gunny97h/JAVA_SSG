package org.example.day5.array2;

import java.util.Scanner;

public class ArrayQ3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int member = 1;
        // int[] scores = new int[member];
        int[] scores = null;

        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("프로그램 종료");
                break;
            }
            else if (choice == 1) {
                System.out.print("학생수 >> ");
                member = sc.nextInt();
            }
            else if (choice == 2) {
                for (int i = 0; i < member; i++) {
                        System.out.println("scores[" + i + "] >> ");
                        scores[i] = sc.nextInt();
                    }
            }
            else if (choice == 3) {
                for (int i = 0; i < member; i++) {
                        System.out.println("scores[" + i +"]: " + scores[i]);
                    }
            }



//            switch (choice) {
//                case 1:
//                    System.out.print("학생수 >> ");
//                    member = sc.nextInt();
//                    break;
//                case 2:
//                    for (int i = 0; i < member; i++) {
//                        System.out.println("scores[" + i + "] >> ");
//                        scores[i] = sc.nextInt();
//                    }
//                case 3:
//                    for (int i = 0; i < member; i++) {
//                        System.out.println("scores[" + i +"]: " + scores[i]);
//                    }
//            }


        }
        sc.close();
    }
}
