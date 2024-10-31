package org.example.day22.문제풀이;

import java.util.HashMap;

// 2. HashMap을 이용해서 푸세요.
//   String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
//   밥과 커피먹은 횟수 구하여 출력
//   밥을 더 많이 먹었으면 "밥을 더 먹었군요"
//   커피를 더 많이 마셨으면 "커피를 더 마셨군요"
public class 문제2HashMap {
    public static void main(String[] args) {
        String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
        HashMap<String, Integer> hashMap = new HashMap();

        for (String x : s2) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hashMap);
        if (hashMap.get("밥") > hashMap.get("커피")) {
            System.out.println("밥을 더 먹었군요");
        } else if (hashMap.get("밥") == hashMap.get("커피")) {
            System.out.println("똑같다.");
        } else {
            System.out.println("커피를 더 마셨군요");
        }
    }
}
