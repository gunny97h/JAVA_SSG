package org.example.day22.문제풀이;

import java.util.HashSet;

// 7. int s7 = 204534567;에서 중복된 수를 제외하고 각 자리수를 더하시오.
public class 문제7HashSet {
    public static void main(String[] args) {
        int s7 = 204534567;
        String s70 = "" + s7;

        HashSet<String> set = new HashSet<>();
        String[] arr = s70.split("");
        for (String x : arr) {
            set.add(x);
        }
        System.out.println(set);
        int sum = 0;
        for (String x : set) {
            sum = sum + Integer.parseInt(x);
        }
        System.out.println(sum);

    }
}
