package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 배열자르기함수 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int[] sub1 = Arrays.copyOfRange(list, 1, 3);
        System.out.println(Arrays.toString(sub1));
        // 3, 4, 5
        System.out.println(Arrays.toString(Arrays.copyOfRange(list, 2, 5)));
        // 1, 2, 3
        System.out.println(Arrays.toString(Arrays.copyOfRange(list, 0, 3)));

    }
}
