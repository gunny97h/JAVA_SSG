package org.example.day15.컬렉션;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

// NEW01-Java-6(형변환+컬렉션+제너릭).pdf  p.51
public class Collection2 {
    public static void main(String[] args) {
        // 2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 현관에는
        //    신발의 정보를 컬렉션으로 만들어서
        //    1) 전체 프린트,
        //    2) 현관에는 무엇이 있나요?,
        //    3) 거실에 책상으로 변경하여 전체 프린트(map)
        HashMap room = new HashMap();

        room.put("안방", "TV");
        room.put("거실", "쇼파");
        room.put("부엌", "냉장고");
        room.put("현관", "신발");
        System.out.println(room);
        System.out.println(room.get("현관"));
        room.put("거실", "책상");
        System.out.println(room);

        // key 값만 확인하고 싶을 때
        Set keys = room.keySet();
        System.out.println(keys.contains("베란다"));

        // value 값만 확인하고 싶을 때
        Collection values = room.values();
        System.out.println(values.contains("스타일러"));
        System.out.println(values.contains("TV"));

        // index가 없어 for-i 불가능
        // map은 key 목록을 Set으로 먼저 구해서 for-each로 값을 구해줌.
        for (Object key : keys) {
            System.out.println(key + ": " + room.get(key));
        }

    }
}
