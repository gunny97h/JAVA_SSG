package org.example.day21.알고리즘.선형;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class N의배수고르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        Solution6 s = new Solution6();
        int[] answer = s.solution(n, numlist); //주소, 100번
        System.out.println(Arrays.toString(answer));
    }
}

class Solution6 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int x: numlist) {
            if (x % n == 0) {
                list.add(x);
            }
        }
        // 컬렉션 sort(오름차순, 내림차순)
        Collections.sort(list); // 오름차순
        Collections.reverse(list); // 내림차순(순서 뒤집기)

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
