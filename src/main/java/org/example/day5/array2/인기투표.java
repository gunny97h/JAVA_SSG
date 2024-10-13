package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        //이름 배열
        String[] name = {"아이유", "유재석", "방탄"};
        //투표수 배열
        int[] tv = new int[3];  //{0, 0, 0}
        //int sum = 0;
        Scanner sc = new Scanner(System.in);  //자바코드 <= 연결스트림 오픈 => 콘솔
        while (true) {
            System.out.println("인기투표 1)아이유  2)유재석  3)BTS  4)종료 ");
            System.out.print("선택번호>> ");
            int num = sc.nextInt();
            //무한루프인 경우 종료시점 반드시 명시!
            if (num == 4) {
                System.out.println("종료합니다.\n");
                break;
            }
            //종료시점 아래에 구체적인 조건 처리 넣기!
            else if (num == 1) {
                System.out.println("아이유가 한 표 획득!\n");
                tv[0]++;
            }else if (num == 2) {
                System.out.println("유재석이 한 표 획득!\n");
                tv[1]++;
            }else if (num == 3) {
                System.out.println("방탄이 한 표 획득!\n");
                tv[2]++;
            }else {
                System.out.println("다시\n");
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + ": " + tv[i] + "표");
        }
        //sum = tv[0] + tv[1] + tv[2];
        System.out.println("전체 득표수: " + (tv[0] + tv[1] + tv[2]));  // int에 ()를 해줘야 정수로 처리

        sc.close();
    }
}

/*
package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        //이름 배열
        String[] name = {"아이유", "유재석", "방탄"};
        //투표수 배열
        int[] tv = new int[3]; //{0,0,0}
        Scanner sc = new Scanner(System.in); //자바코드<-연결스트림 오픈->콘솔
        while (true) {
            System.out.println("인기투표 1)아이유, 1)유재석, 3)방탄, 4)종료");
            System.out.print("선택번호>> ");
            int num = sc.nextInt();
            //무한루프인 경우 종료시점 반드시 명시!
            if (num == 4) {
                System.out.println("아이유 : " + tv[0]);
                System.out.println("유재석 : " + tv[1]);
                System.out.println("방탄 : " + tv[2]);
                System.out.println("총 투표수: " + (tv[0] + tv[1] + tv[2]));
                break; //투표 종료!
            }
            //종료시점 아래에 구체적인 조건 처리넣어주세요.!
            switch (num) {
                case 1:
                    tv[0]++;
                    System.out.println("아이유 선택하셨군요.!");
                    break; //한줄 복사 컨트롤+D
                case 2:
                    tv[1]++;
                    System.out.println("유재석 선택하셨군요.!");
                    break;
                case 3:
                    tv[2]++;
                    System.out.println("방탄 선택하셨군요.!");
                    break;
                default:
                    System.out.println("틀린 번호를 선택하셨군요.!");
            }
        }
        sc.close();
    }
}
 */