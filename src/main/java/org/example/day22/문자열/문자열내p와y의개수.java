package org.example.day22.문자열;

// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
// 다르면 False를 return 하는 solution를 완성하세요.
// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
// 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
//
//제한사항
//문자열 s의 길이 : 50 이하의 자연수
//문자열 s는 알파벳으로만 이루어져 있습니다.
public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        Solution3 s3 = new Solution3();
        System.out.println(s3.solution(s));
    }
}

class Solution3 {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();  // --> 대소문자 구분 X
        int count = 0;
        //int cy = 0; // --> +와 -로 하면 변수 두 개 필요 없음
        // 문자열 길이가 길거나 메모리를 아껴야 하는 상황이라면 첫 번째 방식이 더 효율적입니다.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            } else if (s.charAt(i) == 'y') {
                count--;
            }
        }
        // 문자열 길이가 매우 짧다면 두 방식 모두 성능 차이는 미미하므로,
        // 코드의 간결성 때문에 for-each를 사용하는 것이 좋습니다.
//        for (char c : s.toCharArray()) {
//            if (c == 'p') {
//                cp++;
//            } else if (c == 'y') {
//                cy++;
//            }
//        }
        if (count != 0) answer = false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
