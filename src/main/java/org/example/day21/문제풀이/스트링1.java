package org.example.day21.문제풀이;

import java.util.Arrays;

public class 스트링1 {
    public static void main(String[] args) {
        // 1. String s = "감,배,위"; 각 글자를 추출 후(split())
        //    오름차순으로 정렬하여 String에 넣어 프린트
        String s = "감,배,위";
        String[] sArr = s.split(",");
        Arrays.sort(sArr);
        StringBuffer sb = new StringBuffer();
        for (String str : sArr) {
            sb.append(str);
        }
        System.out.println(sb);

    }
}
