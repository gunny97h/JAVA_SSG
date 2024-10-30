package org.example.day21.문제풀이;

// 7. 226페이지 - 문자열 다루기 기본
// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
// solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class 문제7 {
    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";
        Solution7 s7 = new Solution7();
        //boolean a7 = s7.solution(s1);
        //boolean a72 = s7.solution(s2);
        System.out.println(s7.solution(s1));
        System.out.println(s7.solution(s2));
        //-----------------------------------------------------------

    }
}

class Solution7 {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("\\d+");
        } else return false;

    }
}

/*
public class 문자열다루기기본 {
    public static void main(String[] args) {
        String x = "a234";
        boolean result = true;
        //1.문자열길이가 4 또는 6
        //2.x를 하나씩 문자로 분리해서
        //  숫자인지 판단하자!
        int size = x.length(); //4, 6

        if (size == 4 || size == 6){
            char[] c = x.toCharArray();
            for (char one: c){
                //if (one >= '0' && one <= '9'){ //숫자인지 조건
                if (one < '0' || one > '9'){ //숫자가 아닌지 조건
                    result = false;
                    break;//반복문의 break!
                }
            }//for
        }else {
            result = false;
        }
    }
}
 */