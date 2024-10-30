package org.example.day22.문제풀이;

public class 숫자찾기 {  // day21 문제 11
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int 몇번째 = 0;  // index + 1

        // int --> String --> char[]
        String num2 = String.valueOf(num);
        String num22 = " " + num;

        char[] chars = num22.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] - '0') == k) {
                몇번째 = i;
            }
        }
        System.out.println(몇번째);

    }
}
