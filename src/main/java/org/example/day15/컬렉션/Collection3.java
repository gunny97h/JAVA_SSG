package org.example.day15.컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

// NEW01-Java-6(형변환+컬렉션+제너릭).pdf  p.51
public class Collection3 {
    public static void main(String[] args) {

        // 3. 오늘 내가 할일 우선순위 5개 목록을 만들어서
        //    1) 전체 프린트,
        //    2) 첫번째 할 일과 마지막 할 일 프린트,
        //    3) 2번째 할 일을 “청소”로 변경해서 전체 프린트(list)

        ArrayList list = new ArrayList();

        list.add("수업듣기");
        list.add("문제풀기");
        list.add("밥먹기");
        list.add("오후수업");
        list.add("문제풀기2");
        System.out.println(list);
        System.out.println(list.get(0) + " " + list.get(4));
        list.remove(1);
        list.add(1, "청소");
        System.out.println(list);

        // index가 있는 경우
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        // index가 없는 경우1
        for (Object x: list){
            System.out.println(x);
        }

        System.out.println();

        // index가 없는 경우2
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
