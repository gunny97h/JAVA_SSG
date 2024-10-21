package org.example.day15.형변환참조;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class 참조형4 {
    public static void main(String[] args) {
        // 가변길이, 여러개의 데이터를 다룰 때 사용
        ArrayList list = new ArrayList();

        // list.add(Object e); // Object --> 모든 타입을 다 넣을 수 있음
        list.add("hong");        // String --> Object (자동형변환)
        list.add(new Date());    // Date --> Object
        list.add(new Random());  // Random --> Object
        list.add(new Truck());   // Truck --> Object

        // 기본형은 상속관계가 아닌데도 가능한 이유?
        // 기본형을 참조형에 넣고 싶을 때는
        // 참조형(Wrapper Class, 포장클래스)으로 만들어주면 된다.
        // 자동 형변환인 경우 자동으로 해줌.
        list.add(100);   // 정수, int --Auto Boxing--> Integer --자동형변환(UpCasting)--> Object
        list.add(11.1);  // 실수
        list.add(true);  // 논리
        list.add('a');   // 문자


        System.out.println(list);
        // 넣을 때는 다 모으고 싶어서 Object으로 형변환해서 다 넣어놓음
        // add(Object e)
        // 단점 : 삽입, 삭제 등 변경사항이 생기면 전체가 이동
        // (ex : 인덱스 1번에 새로 추가되면 인덱스 1이상의 값들 인덱스를 +1씩)
        System.out.println("---------------------------------------");
        // 이제 꺼내보자.
        System.out.println(list.get(0));  // 출력은 가능
        Object name = list.get(0);
        // name.contains(); --> String 값이어도 Object으로 넣었기 때문에 String 메서드를 사용할 수 없다.
        // 꺼내서 String 메서드를 쓸 때는 String으로 다시 형변환해야 String 메서드 사용 가능
        // String name2 = list.get(0)  :  String(작) <-- Object(큰)
        String name2 = list.get(0).toString();
        String name3 = (String)list.get(0);
        System.out.println(name3.contains("kim"));
        System.out.println(name2 + "  " + name3);

        // 날짜 꺼내서 현재 시/분을 프린트!
//        String time = (String)list.get(1);
//        System.out.println(time);
        Object date = list.get(1);
        //System.out.println(date.getHours()); // X
        Date date2 = (Date)list.get(1);  // Date <-- Object
        System.out.println(date2.getHours() + " : " + date2.getMinutes());

        // list.get(4) = 100
        int x = (Integer)list.get(4);
        // int <--오토언박싱-- Integer <-- Object
        Double y1 = (Double)list.get(5); // 메서드 등을 사용하는 경우
        double y2 = (double)list.get(5); // 값만 사용하는 경우
    }
}
