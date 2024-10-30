package org.example.day21.문제풀이;

// 10. 246페이지 - 문자열 뒤집기
//   문자열 my_string이 매개변수로 주어집니다.
//   my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
public class 문제10 {
    public static void main(String[] args) {
        String myString = "bread";
        Solution10 s10 = new Solution10();
        System.out.println(s10.solution(myString));

    }
}

class Solution10 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        answer.reverse();
        return answer.toString();
    }
}

/*
public class 문자열뒤집기 {
    public static void main(String[] args) {
        String myString = "bread"; //last index값 d -> a -> e
        //뒤집어서 스트링으로 모으자.!
        //StringBuilder
        //String에서 뒤에서 가지고 와서 sb에 그냥 쌓기만 함.!
        int last = myString.length() - 1;//4,3,2,1,0
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = last; i >= 0 ; i--) {
            stringBuilder.append(myString.charAt(i));
        }//for
        System.out.println(stringBuilder.toString());
    }
}
 */