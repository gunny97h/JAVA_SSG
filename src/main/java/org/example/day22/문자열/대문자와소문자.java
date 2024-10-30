package org.example.day22.문자열;


// 문자열 my_string이 매개변수로 주어질 때,
// 대문자는 소문자로 소문자는 대문자로 변환한 문자열을
// return하도록 solution 함수를 완성해주세요.
public class 대문자와소문자 {
    public static void main(String[] args) {
        String myString = "abCdEfghIJ";
        Solution2 s2 = new Solution2();
        System.out.println(s2.solution(myString));
    }
}

class Solution2 {
    public String solution(String ms) {
        String answer = "";
        StringBuilder sb = new StringBuilder(ms);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) < 97) {
                sb.setCharAt(i, (char)(sb.charAt(i) + 32));
            } else {
                sb.setCharAt(i, (char)(sb.charAt(i) - 32));
            }
        }
        return sb.toString();
    }
}
/*
public class 대문자소문자 {
    public static void main(String[] args) {
        String myString = "cccCCC";
        char[] c = myString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char x : c) {
            //소문자이면 대문자로
            if(x >= 'a' && x <= 'z') x -= 32;
            //대문자이면 소문자로
            else if (x >= 'A' && x <= 'Z') x += 32;
            stringBuilder.append(x);
        }//for
        System.out.println(stringBuilder.toString());
    }
}
 */