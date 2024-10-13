package org.example.day5.array2;

import java.util.Arrays;

public class ArrayQ5 {
    public static void main(String[] args) {
        //ppt p.107
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

        String[] class1 = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] score1 = {44, 66, 22, 99, 100};
        //2학기 성적 =  {22, 66, 88, 99, 100}
        //배열의 깊은 복사 이용
        int[] score2 = score1.clone();
        score2[0] = 22;
        score2[2] = 88;
        //전체 1학기, 2학기 성적 프린트
        System.out.println(Arrays.toString(score1));
        System.out.println(Arrays.toString(score2));
        //1학기, 2학기 성적 중 동일한 성적의 과목수
        int same = 0;
        for (int i = 0; i < score1.length; i++) {
            if (score1[i] == score2[i]) {
                same++;
            }
        }
        System.out.println("1학기, 2학기 성적 중 동일한 성적의 과목수: " + same);
        //1학기, 2학기 성적 중 오른 과목수
        int highNum = 0;
        for (int i = 0; i < score1.length; i++) {
            if (score1[i] < score2[i]) {
                highNum++;
            }
        }
        System.out.println("1학기, 2학기 성적 중 오른 과목수: " + highNum);
        //1학기, 2학기 성적 중 오른 과목명
        System.out.print("1학기, 2학기 성적 중 오른 과목명: ");
        for (int i = 0; i < score1.length; i++) {
            if (score1[i] < score2[i]) {
                System.out.println(class1[i]);
            }
        }


    }
}
