package org.example.day21.문제풀이;

// 8. 231페이지 - 서울에서 김서방 찾기
//   String형 배열 seoul의 element중 "c"의 위치 x를 찾아,
//   "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
//   seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
//   "Kim"은 반드시 seoul 안에 포함되어 있습니다.
public class 문제8 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        Solution8 s8 = new Solution8();
        System.out.println(s8.solution(seoul));
    }
}

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

/*
public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                System.out.println("김서방은 " + i + "에 있다.");
            }
        }//for

        //이진검색!
        System.out.println(Arrays.binarySearch(seoul, "Kim")); //1
        System.out.println(Arrays.binarySearch(seoul, "Jane")); //0
        System.out.println(Arrays.binarySearch(seoul, "Park")); //음수
        //3, 5, 7, 8, 1
        //1-3-5-7-8
    }
}
 */