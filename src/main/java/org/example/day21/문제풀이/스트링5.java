package org.example.day21.문제풀이;

import org.example.ArrPrint;

import java.util.Arrays;

public class 스트링5 {
    public static void main(String[] args) {
        // 5. int[] s5 = {55, 100, 77, 88, 22}를 정렬 후 역순으로 int[] s6에 옮겨 프린트
        int[] s5 = {55, 100, 77, 88, 22};
        Arrays.sort(s5);
        int[] s6 = new int[s5.length];
        int j = s5.length - 1;
        for (int i = 0; i < s5.length; i++) {
            s6[j] = s5[i];
            j--;
        }
        ArrPrint.p(s6);


    }
}
