package org.example.day12.상속;

public class Truck extends Car{
    // 묵시적
    // 필드 : 2개 (color, speed)
    // 메서드 : 2개 (start(), end())

    // 트럭의 특징에 해당하는 필드 + 메서드 추가
    int weight; // 무게
    public void move() {
        System.out.println(speed + "속도로 짐을 나르다.");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
