package org.example.day21.문제풀이;

public class 스트링6 {
    public static void main(String[] args) {
        String my_string = "BCBdbe";
        String letter = "B";
        Solution6 s6 = new Solution6();
        String a6 = s6.solution(my_string, letter);
        System.out.println(a6);
        //-----------------------------------------------------------

    }
}
// 6. 216페이지 - 특정문자 제거하기
// 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
// my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution6 {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        return answer;
    }
}
