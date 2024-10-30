package org.example.day22.문제풀이;

// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
// 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
public class 수박수박수 {
    public static void main(String[] args) {
        int n = 22;
        Solution4 s4 =  new Solution4();
        System.out.println(s4.solution(n));
    }
}

class Solution4 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("수");
            } else sb.append("박");
        }
        return sb.toString();
    }
}