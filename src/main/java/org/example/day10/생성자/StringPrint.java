package org.example.day10.생성자;

import java.util.ArrayList;
import java.util.HashSet;

public class StringPrint {
    public static void main(String[] args) {
        // 프린트 시 toString()을 먼저 호출하여 프린트할 스트링을 만들고 나서
        // 그렇게 만들어진 스트링을 프린트한다.
        // 배열, 고정길이
        int[] n1 = {1, 2, 3};
        System.out.println(n1); // 결과 >> [I@5ca881b5

        // 배열과 유사, 가변
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        System.out.println(list); // 결과 >> [100, 200]  // 참조형 변수이지만 미리 값이 나오게 설정됨

        // 가변 + 중복제거!
        HashSet set = new HashSet();
        set.add(100);
        set.add(200);
        set.add(200);
        set.add(300);
        System.out.println(set);  // 결과 >> [100, 200, 300]
    }
}
