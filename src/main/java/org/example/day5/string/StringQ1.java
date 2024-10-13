package org.example.day5.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringQ1 {
    public static void main(String[] args) {
        /*
        전화번호입력>>     011-245-1234
        1) 양쪽 공백을 제거하시오.
        2) -을 기준으로 분리해내세요.(String[])
        3) 첫 번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple
        4) 두 번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
        5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효하지 않은 전화번호
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("전화번호입력>> ");
        String ph = sc.nextLine();
        System.out.println(ph);

        System.out.println("1) 양쪽 공백을 제거하시오.");
        ph = ph.trim();
        System.out.println(ph);
        System.out.println("2) -을 기준으로 분리해내세요.(String[])");
        String[] ph1 = ph.split("-");
        System.out.println(Arrays.toString(ph1));

        System.out.println("3) 첫 번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple");
        if (ph1[0].equals("011")){   // == 대신 equals.() 사용
            System.out.println("SK");
        } else if (ph1[0].equals("019")) {
            System.out.println("LG");
        } else {
            System.out.println("Apple");
        }

        System.out.println("4) 두 번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰"); //lenght() 사용
        int phnum1 = ph1[1].length();
        if (phnum1 >= 4){
            System.out.println("최신폰");
        }else {
            System.out.println("올드폰");
        }


        System.out.println("5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효하지 않은 전화번호");
        // ph1의 모든 값을 더해서 사용

//        int phnum2 = ph.length();
//        if (phnum2 >= 10){
//            System.out.println("유효한 전화번호");
//        }else {
//            System.out.println("유효하지 않은 전화번호");
//        }
        int phNum2 = 0;
        for (int i = 0; i < ph1.length; i++) {
            phNum2 = phNum2 + ph1[i].length();
        }
        if (phNum2 >= 10){
            System.out.println("유효한 전화번호(" + phNum2 + ")");
        }else {
            System.out.println("유효하지 않은 전화번호(" + phNum2 + ")");
        }
        sc.close();
    }
}
