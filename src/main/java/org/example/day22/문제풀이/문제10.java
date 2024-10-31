package org.example.day22.문제풀이;

import java.util.Arrays;

// 10. int[] s8 = {1,2,3}; int[] s9 = {1,2,3};이 같은지/다른지 비교하여 프린트
public class 문제10 {
    public static void main(String[] args) {
        int[] s8 = {1,2,3};
        int[] s9 = {1,2,3};

        // 배열 내용 비교
        if (Arrays.equals(s8, s9)) {
            System.out.println("두 배열은 같습니다.");
        } else {
            System.out.println("두 배열은 다릅니다.");
        }
    }
}
