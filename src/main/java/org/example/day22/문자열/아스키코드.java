package org.example.day22.문자열;

public class 아스키코드 {  // day21 문제 11
    public static void main(String[] args) {
        char c = '1';
        char c2 = '2';
        System.out.println(c + c2);  // 99
        // int로 변경 후 더해야 함.
        int ic = c - '0';    // 49 - 48 = 1
        int ic2 = c2 - '0';  // 50 - 48 = 2
        System.out.println(ic + ic2);
    }
}
