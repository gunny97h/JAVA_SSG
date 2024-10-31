package org.example.day22.문제풀이;

// 1. 스택을 이용해서 푸세요.
//   String[] s = {"밥", "커피", "밥", "커피", "밥", "밥"};
//   식사(밥)먹은 후에 커피를 마셨으면  true, 아니면 false

import java.util.Stack;

public class 문제1Stack {
    public static void main(String[] args) {
        String[] s = {"밥", "커피", "밥", "커피", "밥", "밥"};
        Stack<String> stack = new Stack<>();
        stack.push(s[0]);
        for (int i = 1 ; i < s.length; i++) {
            stack.push(s[i]);
        }
        for (int i = 0; i < stack.size(); i++) {
            String pop = stack.pop();
            String peek = stack.peek();
            System.out.println(pop != peek);
        }
    }
}
