package org.example.day21.문제풀이;

import java.util.ArrayList;
import java.util.List;

public class 스트링3 {
    public static void main(String[] args) {
        // 3. String[] s3 = {"제주도", "부산", "울릉도"};
        //    s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
        //    부산을 마산으로 변경후 하나의 String으로 묶어서 프린트
        String[] s3 = {"제주도", "부산", "울릉도"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s3.length; i++) {
            list.add(s3[i]);
        }
        list.add("울산");
        list.add("파주");
        list.add("인천");
        list.remove(0);
        list.set(0, "마산");
        //System.out.println(list);

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str + " ");
        }
        System.out.println(sb);

    }
}
