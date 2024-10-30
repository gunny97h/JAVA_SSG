package org.example.day22.문자열;

public class 아스키코드2 {
    public static void main(String[] args) {
        String s = "1234";
        // char 배열로 변경하여
        // 각 값들을 다 더하세요.
        char[] chars = s.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum = sum + (c - 48);
        }
        System.out.println(sum);
    }
}
