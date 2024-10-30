package org.example.day22.문자열;

import org.example.ArrPrint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문자열 my_string이 매개변수로 주어질 때,
// my_string 안에 있는 숫자만 골라 오름차순 정렬한
// 리스트를 return 하도록 solution 함수를 작성해보세요.
public class 문자열정렬하기1 {
    public static void main(String[] args) {
        String str = "p2o4i8gj2";
        Solution6 s6 = new Solution6();
        ArrPrint.p(s6.solution(str));
    }
}
class Solution6 {
    public int[] solution(String str) {
        List<Integer> numbers = new ArrayList<>();

        // 문자열을 순회하며 숫자 추출
        for (char c : str.toCharArray()) {
            if (c > 47 && c < 58) { // 숫자인지 확인
                numbers.add(Character.getNumericValue(c)); // 숫자를 정수로 변환하여 리스트에 추가
            }
        }

        // 오름차순 정렬
        Collections.sort(numbers);

        // List<Integer>를 int[]로 변환
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}