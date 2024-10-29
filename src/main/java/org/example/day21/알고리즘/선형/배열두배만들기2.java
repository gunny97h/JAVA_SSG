package org.example.day21.알고리즘.선형;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열두배만들기2 { // 프로그래머스 X
    public static void main(String[] args) {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        // 2의 배수를 찾아서, 10을 곱한 후 배열에 모으세요!
        // 조건: 반드시 1개 이상은 있음
        Solution7 s = new Solution7();
        int[] answer = s.solution(numbers); //주소, 100번
        System.out.println(Arrays.toString(answer));
    }
}

class Solution7 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int x : numbers) {
            if (x % 2 == 0) {
                list.add(x * 10);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}