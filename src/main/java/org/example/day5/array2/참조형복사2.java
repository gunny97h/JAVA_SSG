package org.example.day5.array2;

import java.util.Arrays;

public class 참조형복사2 {
    public static void main(String[] args) {
        int[] term1 = {100, 200, 300};
        int[] term2 = term1.clone();
        //2학기 과목 중 첫 번째 과목 96점으로 변경
        term2[0] = 96;

        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));
        System.out.println(term1 + "\n" + term2);

        //배열의 복사는 깊은 복사를 써야 함

        /*
        과목명 = {"국어", "영어", "수학", "컴퓨터", "회화"}
        1학기 성적 =  {44, 66, 22, 99, 100}
        배열의 깊은 복사 이용
        2학기 성적 =  {22, 66, 88, 99, 100}
        전체 1학기, 2학기 성적 프린트
        1학기, 2학기 성적 중 동일한 성적의 과목수
        1학기, 2학기 성적 중 오른 과목수
        1학기, 2학기 성적 중 오른 과목명
         */


    }
}
