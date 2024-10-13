package org.example.day5.string;

import java.util.Arrays;

public class StringQ2 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";
        //ppt p.95
        //1. String[]로 바꾸어보세요.
        String[] s1 = all.split(",");
        System.out.println(Arrays.toString(s1));
        //2. 바꾸었더니 공백이 포함되어 있다면, 공백을 모두 제거 후, 다시 배열에 넣으세요
//        all = all.trim();
//        String[] toArray2 = all.split(",");
//        System.out.println(Arrays.toString(toArray2));
        for (int i = 0; i < s1.length; i++) {
            s1[i] = s1[i].trim();
        }
        //3. 과목수는?
        System.out.println(s1.length);
        //4. 컴퓨터의 위치는?
        //5. 과목명이 3글자 미만인 과목수는?
    }
}
// String 변경 시 gc가 처리하기 전까지 기존 정보가 남아있기 때문에
// 읽기만 하거나, 한 번 정도 바꾸는 것이 아니면 쓰지 않는다.  ==> StringBuilder 사용 (StringBuffer)
// ppt p.87