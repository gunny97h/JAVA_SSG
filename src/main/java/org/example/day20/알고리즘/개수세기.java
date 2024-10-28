package org.example.day20.알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 개수세기 {
    public static void main(String[] args) {

        double[] arr = new double[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("입력" + i + " >> ");
            arr[i] = sc.nextDouble();
        }

        sc.close();

        System.out.println(Arrays.toString(arr));

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 22.2) {
                count++;
            }
        }

        System.out.println("22.2의 개수: " + count);

    }
}
