package org.example.day22.자료구조;

import java.util.Stack;
// NEW01-Java-9(알고리즘2).pdf  p.68
public class 스택함수연습2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(-1);
        }
        System.out.println(stack.size());
        System.out.println(stack.empty());
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(-1);
        }
        stack.push("3");
        System.out.println(stack.empty());
        System.out.println(stack.peek());
    }
}
