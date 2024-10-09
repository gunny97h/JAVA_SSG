package org.example.day3.array;

public class Array1 {
    public static void main(String[] args) {
        // 배열을 만드는 방법 2가지
        // 공간을 여러개 만들 때(배열) 처음에 값을 모르는 경우
        // 유한 공간, 동일한 타입
        int[] s = new int[5]; // --> {0,0,0,0,0}, 자동으로 초기화된 값 목록이 생성
        // 프린트
        // 첫번째 값==> s안에 주소가 가르키고 있는 공간 s[0]
        // 두번째 값==> s안에 주소가 가르키고 있는 공간 s[1]
        System.out.println("s1 첫번째 값 ==> " + s[0]);
        System.out.println("s1 두번째 값 ==> " + s[1]);

        s[0] = 100;
        System.out.println("s1 변경 후 첫번째 값 ==> " + s[0]);

        // 공간을 여러개 만들 때 처음부터 값을 알고 있는 경우

        int[] s2 = {100, 200, 300, 400, 500}; // 5(length)라는 읽기 전용 값이 보이지 않지만 있음
        System.out.println("s2 첫번째 값 ==> " + s2[0]);
        System.out.println("s2 두번째 값 ==> " + s2[1]);
        System.out.println("s2의 길이: " + s2.length);
    }
}
