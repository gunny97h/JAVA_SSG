package org.example.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 우리 가족 정보를 배열에 넣어보자.
        // 5명, 이름, 나이, 키, 성별, 아침밥여부
        String[] names = {"홍길동", "김길동", "박길동", "정길동", "이길동"};
        // String names[]도 가능

//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);

        // c타입 for문
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println(names.length);
        // for_each문   // 실무에서 많이 응용 // 값 입력은 x
        for(String s : names) {
            System.out.println(s);
        }
        // 배열 내용 확인하기에 좋음
        System.out.println(Arrays.toString(names)); // names 배열 안의 내용을 모두 꺼내 String으로 만들어 프린트

        int[] ages = {56, 55, 28, 27, 11};
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        System.out.println(" ");
        for(int x : ages) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(ages));

        double[] heights = {178.0, 165.0, 180.0, 185.0, 22.2};
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println(" ");
        for (double h : heights) {
            System.out.print(h);
        }
        System.out.println(Arrays.toString(heights));

        char[] genders = {'m', 'f', 'm', 'm', 'm'};
        for (int i = 0; i < genders.length; i++) {
            System.out.print(genders[i] + " ");
        }
        System.out.println(" ");
        for (char g : genders) {
            System.out.print(g);
        }
        System.out.println(Arrays.toString(genders));

        boolean[] eats = {true, false, true, false, true};
        for (int i = 0; i < eats.length; i++) {
            System.out.print(eats[i] + " ");
        }
        System.out.println(" ");
        for (boolean eat : eats) {
            System.out.print(eat);
        }
        System.out.println(Arrays.toString(eats));

        System.out.println(names[names.length - 1]); // 마지막 인덱스

        // System.out.println(names[5]); --> 자주 발생하는 에러 확인용
    }
}
