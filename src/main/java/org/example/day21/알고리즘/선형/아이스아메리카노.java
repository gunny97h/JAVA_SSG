package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 아이스아메리카노 {
    public static void main(String[] args) {
        int money = 15000;
        Solution s = new Solution();
        int[] answer = s.solution(money);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2]; // == int[] answer = {0, 0];

        // 잔수 계산, answer[0]
        int a0 = money / 5500;

        // 잔돈 계산, answer[1]
        int a1 = money % 5500;

        answer[0] = a0;
        answer[1] = a1;

        return answer;
    }
}