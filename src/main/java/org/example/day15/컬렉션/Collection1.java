package org.example.day15.컬렉션;

import java.util.HashSet;
import java.util.Iterator;

// NEW01-Java-6(형변환+컬렉션+제너릭).pdf  p.51
public class Collection1 {
    public static void main(String[] args) {
        // 1. 한번 갔던 여행지는 가지 않으려고 합니다.
        //    가고 싶은 여행지 5곳을 컬렉션으로 만들어 전체 프린트(set)
        HashSet tour = new HashSet();  // index 없음  // 순서 없음

        tour.add("괌");
        tour.add("하와이");
        tour.add("티니안");
        tour.add("사이판");
        tour.add("산토리니");
        System.out.println(tour);
        // 반복문으로 하나씩 꺼내와서 처리
        for (Object o : tour) {  // index가 없어도 for-each로 하나씩 처리 가능
            System.out.println(o);
        }

        // 반복해서 꺼내주는 부품을 달아주세요
        // 반복자(iterator, 이터레이터)
        Iterator it = tour.iterator();
        while (it.hasNext()) {
            // 꺼내줄꺼 있는지 체크먼저 해야함.
            Object x = it.next();  // 꺼내줌.
            System.out.println(x);
        }


    }
}
