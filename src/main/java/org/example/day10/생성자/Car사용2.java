package org.example.day10.생성자;

public class Car사용2 {
    public static void main(String[] args) {

        Car2 c1 = new Car2("테슬라", "검정", 140);
        System.out.println(c1);  // toString() 자동 호출 --> 재정의한 toString() 사용
        // ?
        //System.out.println(c1.toString1() + "\n");
        //System.out.println(c1.model + " " + c1.color + " " + c1.maxSpeed);
        c1.speedUp();

        Car2 c2 = new Car2("gv80", "회색", 150);
        System.out.println(c2);
        //System.out.println(c2.model + " " + c2.color + " " + c2.maxSpeed);
        c2.speedUp();
    }
}
