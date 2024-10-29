package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = s.solution(num_list); // 주소
        System.out.println(Arrays.toString(answer));
    }
}

class Solution2 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int x : num_list) {
            if (x % 2 == 0) answer[0]++;
             else answer[1]++;
        }
        return answer;
    }
}