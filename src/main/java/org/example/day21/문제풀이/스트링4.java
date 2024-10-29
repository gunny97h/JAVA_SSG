package org.example.day21.문제풀이;

import java.util.Arrays;

public class 스트링4 {
    public static void main(String[] args) {
        // 4. String s4 = "마사아차가나"; 오름차순으로 정렬 후 프린트
        String s4 = "마사아차가나";
        char[] s44 = s4.toCharArray();
        Arrays.sort(s44);
        StringBuilder sb = new StringBuilder(new String(s44)); // char 배열로도 가능
        System.out.println(sb);




    }
}
