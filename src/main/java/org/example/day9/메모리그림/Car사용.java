package org.example.day9.메모리그림;

// 같은 패키지내에 있어서 import x

public class Car사용 {
    public static void main(String[] args) {
        Car car1 = new Car();
        // Car(틀, class) --new--> car1 객체 생성
        // car1 : 클래스의 인스턴스, 객체(object)
        // new로 객체를 생성한 경우
        // 멤버변수가 힙역역에 만들어진다.
        // new할 때마다(객체 생성할 때마다 각각의 멤버변수들이 힙영역에 만들어진다.)
        car1.size = 10;
        car1.speed = 20;
        // 클래스의 인스턴스 car1 : 참조형 변수
        // 주소(힙영역) --> (.을 이용해) 필드(멤버변수) 접근, 메서드 호출 가능!
        System.out.println(car1.print());
        car1.hi();
        int age = 100;
        System.out.println("내 나이는 " + age);


    }
}
