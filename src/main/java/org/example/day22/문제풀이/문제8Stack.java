package org.example.day22.문제풀이;

import java.util.Stack;

// 8. int[] s8 = {11, 3, 78, 9, 2, 2, 100, 3};를 Stack<Integer>로 옮겨
//   인덱스 0, 3, 5위치의 값을 각각 더한 후, top에서 3개를 pop하여
//   stack에 들어있는 목록을 프린트
public class 문제8Stack {
    public static void main(String[] args) {
        int[] s8 = {11, 3, 78, 9, 2, 2, 100, 3};

        Stack<Integer> stack = new Stack<>();
        for (int x : s8) {
            stack.push(x);
        }
        System.out.println(stack);
        int sum = stack.get(0) + stack.get(3) + stack.get(5);
        System.out.println(sum);
        try {
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println("잉");;
        }
        System.out.println(stack);
    }
}
