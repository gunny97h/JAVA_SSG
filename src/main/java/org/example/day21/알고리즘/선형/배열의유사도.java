package org.example.day21.알고리즘.선형;

import java.util.Arrays;

// NEW01-Java-9(알고리즘).pdf  p.185
public class 배열의유사도 {
    public static void main(String[] args) {
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        int[] s3 = {11, 22, 33, 44, 55};
        System.out.println(Arrays.equals(s1, s2));
        System.out.println(Arrays.equals(s1, s3));
    }
}
