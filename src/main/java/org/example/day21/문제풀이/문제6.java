package org.example.day21.문제풀이;

// 6. 216페이지 - 특정문자 제거하기
//   문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//   my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
public class 문제6 {
    public static void main(String[] args) {
        String my_string = "BCBdbe";
        String letter = "B";
        Solution6 s6 = new Solution6();
        String a6 = s6.solution(my_string, letter);
        System.out.println(a6);
        //-----------------------------------------------------------

    }
}

class Solution6 {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        return answer;
    }
}

/*
public class 특정문자제거 {
    public static void main(String[] args) {
        String myString = "abcdef";
        String letter = "f";
        //myString에 있는 것 하나씩 빼서 f가 아니면 모으자!
        //String을 모을 때는 StringBuilder쓰자.
        StringBuilder sb = new StringBuilder();
        //1.char배열로
        //2.chatAt(인덱스)
        for (int i = 0; i < myString.length(); i++) {
            //System.out.println(myString.charAt(i));
            if(myString.charAt(i) != letter.charAt(0)){
                sb.append(myString.charAt(i));
            }
        }//for
        String result = sb.toString();
        System.out.println(result);
    }

}
 */