package org.example.day21.문제풀이;

// 11. 191페이지 - 숫자찾기
//  정수 num과 k가 매개변수로 주어질 때,
//  num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
//  없으면 -1을 return 하도록 solution 함수를 완성해보세요.
public class 문제11 {
    public static void main(String[] args) {
        int num = 23858;
        int k = 8;
        Solution11 s11 = new Solution11();
        System.out.println(s11.solution(num, k));

    }
}

class Solution11 {
    public int solution(int num, int k) {
//        String str = String.valueOf(num);
//        int answer = str.indexOf(String.valueOf(k));
//        if (answer == -1) {
//            return -1;
//        }
//        return answer + 1;
        return (" " + num).indexOf(String.valueOf(k));
    }
}