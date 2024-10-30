package org.example.day22.문제풀이;

// 머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며
// 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
// 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
// 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
public class 게임369 {
    public static void main(String[] args) {
        int order = 29423;
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(order));
    }
}

class Solution1 {
    public int solution(int order) {
        int answer = 0;
        String num = "" + order;
        String[] nums = num.split("");
        for (String s : nums) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}