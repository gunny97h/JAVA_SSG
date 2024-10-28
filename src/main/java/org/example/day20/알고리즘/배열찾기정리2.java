package org.example.day20.알고리즘;

import java.util.Random;

public class 배열찾기정리2 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1, 1001);
        }

        int minIndex = 0;
        int count = 0;
        int[] arr2 = null;

        for (int i = 1; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        System.out.println("\n최소값: " + arr[minIndex]);
        System.out.print("위치값: ");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == arr[minIndex]) {
                System.out.print(j + " ");;
                count++;
            }
        }
        System.out.println("\n개수: " + count);
    }
}
