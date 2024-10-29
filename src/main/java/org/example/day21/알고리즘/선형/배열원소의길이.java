package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 배열원소의길이 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String[] strlist = {"We", "are", "the", "world!"};
        int[] answer = s.solution(strlist);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution3 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        // strlist 배열에 값을 꺼내어
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        // 길이를 구한 후 answer배열의 같은 인덱스 위치에
        // 길이를 넣으세요.

        return answer;
    }
}