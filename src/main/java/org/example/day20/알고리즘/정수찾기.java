package org.example.day20.알고리즘;

import java.util.Arrays;

public class 정수찾기 {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] num_list = {1, 2, 3, 4, 5};
//        int n = 3;
        int[] num_list = {15, 98, 23, 2, 15};
        int n = 20;
        int answer = s.solution(num_list, n);
        System.out.println("answer = " + answer);

    }

    static class Solution {
        public int solution(int[] num_list, int n) {
            int answer = 0;
            // 답안을 적자!!
            if (Arrays.stream(num_list).anyMatch(num -> num == n)) {
                answer = 1;
            }
            for (int x : num_list) {
                if (x == n) {
                    answer = 1;
                }
            }

            return answer;
        }
    }
}
