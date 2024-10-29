package org.example.day21.문제풀이;

public class 스트링8 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        Solution8 s8 = new Solution8();
        System.out.println(s8.solution(seoul));
    }
}
// String형 배열 seoul의 element중 "c"의 위치 x를 찾아,
// "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
// seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
// "Kim"은 반드시 seoul 안에 포함되어 있습니다.

class Solution8 {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
// 8. 231페이지 - 서울에서 김서방 찾기
//9. 242페이지 - 문자 반복 출력하기
//10. 246페이지 - 문자열 뒤집기
//11. 191페이지 - 숫자찾기
//12. 192페이지 문제