package org.example.day15.컬렉션;

import java.util.ArrayList;

public class 리스트 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //public void add(object o) {..}

        list.add("홍길동");
        list.add(100);
        list.add(11.2);
        list.add(true);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));

        System.out.println("\nfor-i");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nfor-each");
        for (Object o : list) {
            System.out.println(o);
        }

        // 0번에 "김길동"을 삽입
        // 원래 있던 0번부터 뒤에 있는 것들이
        // 쭉 하나씩 뒤로 밀린다!
        list.add(0, "김길동");
        System.out.println(list);
        // 제거
        list.remove(0);
        // == list.remove("김길동");
        System.out.println(list);
        // 변경
        list.set(0,"정길동");
        System.out.println(list);
        // 인덱스 찾기
        System.out.println(list.indexOf(true));
        // 포함하는지 확인
        System.out.println(list.contains(11.2));
        // 비어있는지 확인
        System.out.println(list.isEmpty());
        // 비우기
        list.clear();
        System.out.println(list);
    }
}
