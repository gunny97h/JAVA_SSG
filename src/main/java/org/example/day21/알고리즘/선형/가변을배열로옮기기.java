package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가변을배열로옮기기 {  // 프로그래머스 X
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        // n배열 중 3이상 숫자를 찾아서
        // 10을 곱한 후 list에 모은 후
        List<Integer> list = new ArrayList<>();
        for (int x : n) {
            if (x >= 3) {
                list.add(x * 10);
            }
        }
        // 배열로 옮긴 후
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // 정렬 후 프린트
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));

    }
}
