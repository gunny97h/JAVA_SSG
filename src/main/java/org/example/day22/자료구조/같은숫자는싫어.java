package org.example.day22.자료구조;


import org.example.ArrPrint;

import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr));
    }


}

class Solution {
    public int[] solution(int[]arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int x : arr) {
            if (x != stack.peek()) stack.push(x);
        }
        int[] result = new int [stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        ArrPrint.p(result);

        return result;
    }
}