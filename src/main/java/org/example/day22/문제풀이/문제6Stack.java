package org.example.day22.문제풀이;

import org.example.ArrPrint;

import java.util.Stack;

// int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
//   int[] s6 = new int[s5.length];
//   s5의 원소들을 s6으로 역순으로 옮겨 프린트
public class 문제6Stack {
    public static void main(String[] args) {
        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        int[] s6 = new int[s5.length];

        Stack<Integer> stack = new Stack<>();
        for (int x : s5) {
            stack.push(x);
        }

        // while없이 옮기는 방법?
        int index = 0;
        while (!stack.isEmpty()) {
            s6[index++] = stack.pop();
        }

        ArrPrint.p(s6);

    }
}
