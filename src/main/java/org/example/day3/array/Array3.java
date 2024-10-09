package org.example.day3.array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] a = new int[3]; // {0,0,0}의 주소 a
        // a에는 주소가 들어가 있음. a변수 --> (참조형변수) 기본형이 아닌 것들은 다 참조형 변수
        System.out.println(a);
        a[0] = 100;
        a[1] = 200;
        a[a.length - 1] = 300;
        System.out.println(Arrays.toString(a)); // 한 줄로 읽기만

        // 1. 정수 배열을 만들어 11,22,33,44,55를 넣으세요.
        // (처음부터 값을 알고 있는 경우)
        int[] arr1 = {11, 22, 33, 44, 55};
        // 1-1. 첫번째 값을 프린트
        System.out.println(arr1[0]);
        // 1-2. 세번째 값을 프린트
        System.out.println(arr1[2]);
        // 1-3. 마지막 값을 프린트
        System.out.println(arr1[arr1.length - 1]);
        // 1-4. 전체 프린트
        for (int arr : arr1) {
            System.out.print(arr + " ");
        }
        System.out.println();

        // 2. 실수 배열을 만들어 11.1, 22.2, 33.3을 넣으세요.
        // (처음부터 값을 알고 있는 경우)
        double[] arr2 = {11.1, 22.2, 33.3};
        // 2-1. 첫번 째 값과 두번째 값을 더해서 프린트
        System.out.println(arr2[0] + arr2[1]);
        // 2-2. 첫번 째 값과 마지막 값을 더해서 프린트
        System.out.println(arr2[0] + arr2[arr2.length - 1]);
        // 2-3. 배열에 들어있는 전체 개수를 프린트
        System.out.println(arr2.length);
        // 2-4. 전체 프린트
        System.out.println(Arrays.toString(arr2));

        // 3. 개수가 4개인
        // 문자(char) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        char[] arr3 = new char[3];
        // 3-1. 첫 번째 위치에 '남'을 넣어, 첫 번째 값 프린트
        arr3[0] = '남';
        System.out.println(arr3[0]);
        // 3-2. 두 번째 위치에 '여'를 넣어, 두 번째 값 프린트
        arr3[1] = '여';
        System.out.println(arr3[1]);
        // 3-3. 전체 개수와 전체 배열의 값을 프린트
        System.out.println(arr3.length);
        for (char g : arr3) {
            System.out.print(g + " ");
        }
        System.out.println();

        // 4. 개수가 3개인
        // 문자열(String) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        String[] arr4 = new String[3];
        // 4-1. 각 인덱스의 자리에 여행가고 싶은 곳을 제일 가고 싶은 곳부터 순서대로
        // 세 곳을 넣어서 저장(부산, 제주도, 전주인 경우)
        arr4[0] = "부산";
        arr4[1] = "제주도";
        arr4[2] = "전주";
        // 4-2. 전체 프린트
        System.out.println(Arrays.toString(arr4));
        // 4-3. 다음과 같이 프린트되도록 처리
        // 내가 첫 번째 가고 싶은 곳은 부산이고, 마지막 가고 싶은 곳은 전주이다.
        System.out.println("내가 첫 번째 가고 싶은 곳은 " + arr4[0] + "이고, 마지막 가고 싶은 곳은 " + arr4[arr4.length -1] + "이다.");
    }
}
