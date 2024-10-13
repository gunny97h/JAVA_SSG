package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayQ2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(50);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(51, 100);
        }

        System.out.println("배열 1: " + Arrays.toString(arr1));
        System.out.println("배열 2: " + Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("정렬된 배열 1: " + Arrays.toString(arr1));
        System.out.println("정렬된 배열 2: " + Arrays.toString(arr2));

        System.out.print("두 배열에서 각각 가장 큰 값들을 더한 결과값: ");
        System.out.println(arr1[arr1.length - 1] + arr2[arr2.length - 1]);
        System.out.print("두 배열에서 각각 가장 작은 값들을 더한 결과값: ");
        System.out.println(arr1[0] + arr2[0]);
    }
}
