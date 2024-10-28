package org.example.day20.알고리즘;

import java.util.Random;

public class 배열최소값찾기 {
    public static void main(String[] args) {
        Random r = new Random(100);
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000);
        }

        //int max = 0;      // 만약 배열이 모두 음수라면,
        int max = arr[0];  // 0보다 큰 값이 없어 max가 0으로 유지


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("최대값: " + max);
    }
}
