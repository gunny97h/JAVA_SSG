package org.example.day21.알고리즘.스트링;

import java.util.Arrays;

// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해
// 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
public class 문자열내림차순배치하기 {
    public static void main(String[] args) {
        String s1 = "Zbcdefg";
        Solution s = new Solution();
        String answer = s.solution(s1);
        System.out.println(answer);
    }
}

// 대 ~~ 소
// 소문자는 z ~~ a
// 소문자앞 + 대문자뒤
// 오름차순 정렬 후 뒤집기
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray(); // 한 글자씩 나누기
        Arrays.sort(c); // 오름차순 정렬
        // 1. 컬렉션으로 만들어서 뒤집어도 되고
        // 2. sb로 넣어서 뒤집어도 됨.
        StringBuilder sb = new StringBuilder(new String(c)); // char 배열로도 가능
        return sb.reverse().toString();
    }
}