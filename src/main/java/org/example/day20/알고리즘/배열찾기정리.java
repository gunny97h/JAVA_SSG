package org.example.day20.알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열찾기정리 {
    public static void main(String[] args) {

        int[] jumsu = new int[10];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < jumsu.length; i++) {
//            jumsu[i] = sc.nextInt();
//        }
//        sc.close();
        Random r = new Random();
        for (int i = 0; i < jumsu.length; i++) {
            jumsu[i] = r.nextInt(100);

        }
        System.out.println(Arrays.toString(jumsu));

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < jumsu.length; i++) {
            if (jumsu[i] > jumsu[maxIndex]) {
                maxIndex = i;
            }
            if (jumsu[i] < jumsu[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("최대값 인덱스: " + maxIndex + "\n최소값 인덱스: " + minIndex);

    }
}
