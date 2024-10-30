package org.example.day21.문제풀이;

// 9. 242페이지 - 문자 반복 출력하기
//   문자열 my_string과 정수 n이 매개변수로 주어질 때,
//   my_string에 들어있는 각 문자를 n만큼 반복한 문자열을
//   return 하도록 solution 함수를 완성해보세요.
public class 문제9 {
    public static void main(String[] args) {
        String myString = "hello";
        int n = 3;
        Solution9 s9 = new Solution9();
        System.out.println(s9.solution(myString, n));

    }
}


class Solution9 {
    public String solution(String my_string, int n) {
        String answer = "";
        for (String s : my_string.split("")) {
            for (int i = 0; i < n; i++) {
                answer = answer + s;
            }
        }
        return answer;
    }
}

/*
public class 문자반복출력 {
    public static void main(String[] args) {
        String n = "hello";
        int k = 3;
        //1. n을 char로 분리시켜서 - 1)배열, 2)charAt(인덱스)
        //2. k만큼 반복해서 -for문
        //3. 붙이자. - StringBuilder
        char[] c = n.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char one: c) {
            for (int i = 0; i < k; i++) {
                sb.append(one);
            }
        } //for
        System.out.println(sb.toString());
    }
}
 */