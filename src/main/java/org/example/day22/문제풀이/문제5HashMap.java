package org.example.day22.문제풀이;

import java.util.HashMap;

// String s5 = "감고나무감나무신세계신"; 각 글자가 몇 번 나왔는지 프린트
//   (HashMap을 이용해서 푸세요.)
public class 문제5HashMap {
    public static void main(String[] args) {
        String s5 = "감고나무감나무신세계신";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String x : s5.split("")) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hashMap);
    }
}
