package org.example;

import java.util.Arrays;

public class ArrPrint {

    // 배열만 프린트하는 기능 --> 메서드 정의
    public static void p(int[] x) {
        System.out.println(Arrays.toString(x));
    }
    public static void p(char[] x) { System.out.println(Arrays.toString(x)); }
    public static void p(double[] x) {
        System.out.println(Arrays.toString(x));
    }
    public static void p(Object[] x) {
        System.out.println(Arrays.toString(x));
    }  // String, 버튼 등 가능

}
