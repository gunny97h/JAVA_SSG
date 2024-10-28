package org.example.day20.알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 위치찾기 {
    public static void main(String[] args) {
        double[] arr = new double[5];

//        int index1 = -1;
//        int index2 = -1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("입력" + i + " >> ");
            arr[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 22.2) {
                System.out.println("22.2의 위치(인덱스): " + i);
            } else if (arr[i] == 33.3) {
                System.out.println("33.3의 위치(인덱스): " + i);
            }

        }

//        System.out.println("22.2의 위치(인덱스): " + index1);
//        System.out.println("33.3의 위치(인덱스): " + index2);

        sc.close();
    }
}
