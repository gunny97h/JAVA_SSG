package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayQ1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r  = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println("배열 프린트: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 후 프린트: " + Arrays.toString(arr));
        System.out.println("MAX: " + arr[arr.length - 1]);
        System.out.println("MIN: " + arr[0]);
    }
}
