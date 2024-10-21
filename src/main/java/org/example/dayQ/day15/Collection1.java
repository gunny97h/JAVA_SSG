package org.example.dayQ.day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
// NEW01-Java-6(형변환+컬렉션+제너릭).pdf  p.51
public class Collection1 {
    public static void main(String[] args) {
        // 1. 한번 갔던 여행지는 가지 않으려고 합니다.
        //    가고 싶은 여행지 5곳을 컬렉션으로 만들어 전체 프린트(set)
        HashSet place = new HashSet();
        System.out.println("1번");
        place.add("하와이");
        place.add("티니안");
        place.add("괌");
        place.add("사이판");
        place.add("산토리니");
        System.out.println(place);

        // 2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 현관에는
        //    신발의 정보를 컬렉션으로 만들어서
        //    1) 전체 프린트,
        //    2) 현관에는 무엇이 있나요?,
        //    3) 거실에 책상으로 변경하여 전체 프린트(map)
        HashMap room = new HashMap();
        System.out.println("\n2번");
        room.put("안방", "TV");
        room.put("거실", "쇼파");
        room.put("부엌", "냉장고");
        room.put("현관", "신발");
        System.out.println(room);
        System.out.println(room.get("현관"));
        room.put("거실", "책상");
        System.out.println(room);

        // 3. 오늘 내가 할일 우선순위 5개 목록을 만들어서
        //    1) 전체 프린트,
        //    2) 첫번째 할 일과 마지막 할 일 프린트,
        //    3) 2번째 할 일을 “청소”로 변경해서 전체 프린트(list)

        ArrayList list = new ArrayList();
        System.out.println("\n3번");
        list.add("일 1");
        list.add("일 2");
        list.add("일 3");
        list.add("일 4");
        list.add("일 5");
        System.out.println(list);
        System.out.println(list.get(0) + " " + list.get(4));
        list.remove(1);
        list.add(1, "청소");
        System.out.println(list);

    }
}
