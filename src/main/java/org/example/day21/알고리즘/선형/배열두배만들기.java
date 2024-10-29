package org.example.day21.알고리즘.선형;


import java.util.Arrays;

public class 배열두배만들기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        Solution5 s = new Solution5();
        int[] answer = s.solution(numbers); //주소, 100번
        System.out.println(Arrays.toString(answer));
    }
}

class Solution5 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}