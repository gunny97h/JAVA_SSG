package org.example.day21.알고리즘.선형;

import org.example.ArrPrint;

public class 배열뒤집기 { // NEW01-Java-9(알고리즘).pdf  p.152
    public static void main(String[] args) {
        int[] num_list = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        Solution8 s = new Solution8();
        int[] answer = s.solution(num_list);
        ArrPrint.p(answer);
    }
}

// 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
// num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록
// solution 함수를 완성해주세요.

class Solution8 {
    public int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length];
        // 그대로 옮겨보자.
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        // 뒤집어서 옮겨보자.
        int j = num_list.length - 1;
        for (int i = 0; i < num_list.length; i++) {
            answer[j] = num_list[i];
            j--;
        }

        return answer;
    }
}
