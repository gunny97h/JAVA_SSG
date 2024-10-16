package org.example.day12.상속;

public class Truck사용 {

    public static void main(String[] args) {
        Truck t = new Truck();
        t.color = "핑크"; // Car
        t.speed = 100;   // Car
        t.weight = 1;    // Truck

        System.out.println(t);

        t.start();  // Car
        t.move();   // Truck
        t.end();    // Car

        /*
        Car c = new Car();
        Truck t = new Truck();
        Sedan s = new Sedan();
        c = t;
        t = c; 컴파일 오류가 발생

        c = t;
        컴파일 오류가 발생하지 않습니다. Truck은 Car의 자식 클래스이므로,
        자식 객체를 부모 타입 변수에 할당할 수 있습니다. 이는 업캐스팅(upcasting)으로, 자동으로 수행됩니다1.
        t = c;
        컴파일 오류가 발생합니다. Car 타입의 객체를 Truck 타입 변수에 직접 할당할 수 없습니다.
        이는 다운캐스팅(downcasting)으로, 명시적 형변환이 필요합니다.


         */


    }
}
