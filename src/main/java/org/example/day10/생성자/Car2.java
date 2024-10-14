package org.example.day10.생성자;

public class Car2 {
    // 필드, 멤버변수
    String model;
    String color;
    int maxSpeed;

    public Car2() { // 명시적 생성자
        System.out.println("\n객체 생성됨");
    }

    public Car2(String model, String color, int maxSpeed) {
        System.out.println("\n객체 생성됨");
        this.model = model; // this. --> 이 클래스에서 사용하는 변수를 찾음
        this.color = color; //           이 클래스에 생성된 객체의 주소
        this.maxSpeed = maxSpeed;
    }

    // Alt + insert(Generate) --> Constructor
    public Car2(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public Car2(String model) {
        this.model = model;
    }

    // 멤버메서드
    public void speedUp() {
        System.out.println("속도UP!");
    }

    public String toString1() {
        return "생성된 객체의 힙영역 데이터 : " + model + " " + color + " " + maxSpeed;
    }

    public String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
