package org.example.day5.array2;

import java.util.Arrays;

public class 참조형복사 {
    public static void main(String[] args) {
        int[] term1 = {100, 200, 300};
        int[] term2 = term1;
        //2학기 과목 중 첫 번째 과목 96점으로 변경
        term2[0] = 96;

        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));

        // term1, term2에는 주소가 들어있기 때문에 기본형처럼 복사 시 같은 데이터를 가르킴
        //ppt p.99



    }
}
