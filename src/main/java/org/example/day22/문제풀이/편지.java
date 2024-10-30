package org.example.day22.문제풀이;

public class 편지 {
    public static void main(String[] args) {
        String message = "happy birthday!";
        Solution5 s5 = new Solution5();
        System.out.println(s5.solution(message));
    }
}

class Solution5 {
    public int solution(String message) {
        return message.length() * 2;
    }
}