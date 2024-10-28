package org.example.day20.알고리즘;

import java.util.*;

/*
프로그래머스
 */

public class 문제모음 {
    public static void main(String[] args) {
        // 1. { 11, 55, 33, 22, 44 } 중 두 수를 곱해서 나올 수 있는 최대값은?  (최댓값)
        int[] arr1 = {11, 55, 33, 22, 44};
//        int max = arr1[0] * arr1[1];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (i != j) {
//                    if ((arr1[i] * arr1[j]) > max) {
//                        max = arr1[i] * arr1[j];
//                    }
//                }
//            }
//        }
//        System.out.println(max);
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length-1]*arr1[arr1.length-2]);

        // 2. { 22, -88, -4, 11, 55} 중 두 수를 곱해서 나올 수 있는 최대값은? (최댓값2)
        int[] arr2 = { 22, -88, -4, 11, 55};
        //int[] arr2 = {1, 2, -3, 4, -5};
        Arrays.sort(arr2);
        int left = arr2[0] * arr2[1];
        int right = arr2[arr2.length-1] * arr2[arr2.length - 2];
        int result = left > right ? left : right;
        System.out.println(result);

        // 3. {66, 33, 55, 22, 11} 중 크기를 기준으로 중앙값은? (중앙값)
        //   배열의 요소의 길이가 홀수일때는 가운데 있는 값을 찾음.
        int[] arr3 = {66, 33, 55, 22, 11};
        Arrays.sort(arr3);
        System.out.println(arr3[arr3.length/2]);

        // 4. {66, 33, 55, 22, 11, 66} 중 크기를 기준으로 중앙값은?
        //   배열의 요소의 길이가 짝수일때는 가운데 있는 값들을 찾아
        //   더한 후 2로 나누어서 찾음.

        int[] arr4 = {66, 33, 55, 22, 11, 66};
        Arrays.sort(arr4);
        System.out.println((arr4[arr4.length/2] + arr4[arr4.length/2 - 1]) / 2);

        // 5. 중복된 숫자 개수문제(p130)
        //    정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
        //    array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int count5 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count5++;
            }
        }
        System.out.println(count5);


        // 6. 점의 위치 구하기 문제(p129)
        int[] dot = {1, 3};
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (dot[1] > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

        // 7. 머쓱이보다 키 큰 사람(p127)
        //    머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
        //    머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
        //    머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
        int[] arr7 = {149, 180, 192, 170};
        int height = 167;

        int count7 = 0;
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] > height) {
                count7++;
            }
        }
        System.out.println(count7);

        // 8. 배열의 평균값(p115)
        // 정수 배열 numbers가 매개변수로 주어집니다.
        // numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
        int[] arr8 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double sum8 = 0;
        for (int i = 0; i < arr8.length; i++) {
            sum8 += arr8[i];
        }
        System.out.println(sum8/arr8.length);

        // 9. 옷가게 할인 받기(p112)
        //    머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
        //    구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
        int price = 580000;
        if (price >= 500000) {
            price = (price * 80 / 100);
        } else if (price >= 300000) {
            price = (price * 90 / 100);
        } else if (price >= 100000) {
            price = (price * 95 / 100);
        }


        // 10. 피자 나눠 먹기(2)(p111)
        //    머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
        //    n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를
        //    return 하도록 solution 함수를 완성해보세요.



    }
}
