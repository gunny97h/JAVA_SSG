package org.example.day15.형변환참조;

public class 참조형2 {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();  // Car(부모) <-- Truck(자식), Taxi(자식)
        사람 person = new 사람();    // Car, Truck과 관계 없음

        // 자동형변환
        car = truck;          // 부모클래스(개념적으로 크다.) <-- 자식클래스(개념적으로 작다.)

        // 강제형변환
        truck = (Truck)car;   // 자식(작) <-- 부모(크)

        // person = car;      // 참조형 형변환은 상속 관계가 아니면,
                              // 개념적으로 완전히 다르기 때문에 형변한 불가능!!

        // public void call(Car c)
        // call(택시), call(트럭) : 가능
        // call(사람) : 불가능

    }
}
