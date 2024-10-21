package org.example.day15.제너릭;

public class Truck <T1, T2>{
    // 객체 생성할 때 타입을 내가 마음대로 지정해서 쓸 수 있음.  // 실무에서는 직접 만드는 것보다 사용하는 경우가 많음
    // 클래스를 만들 때, 타입을 지정하지 않음.
    // 특정하게 타입을 지정(specific)하지 않음. --> (generic)
    T1 무게;
    T2 거리;

    @Override
    public String toString() {
        return "Truck{" +
                "무게=" + 무게 +
                ", 거리=" + 거리 +
                '}';
    }
}
