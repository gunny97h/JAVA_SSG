package org.example.day19.디자인패턴.전략;

public class 자동차main {
    public static void main(String[] args) {
        // 인터페이스가 더 큰 개념이기 때문에 변수 타입으로 사용 가능

        //자동차 taxi = new 택시();
        //자동차 truck = new 트럭();
        //taxi.타고가다();
        //truck.타고가다();

        // --> 택시() 대신 트럭()으로만 변경하면 전략적으로 바꿔 사용 가능
        //자동차 car = new 트럭();
        자동차 car = new 택시();
        car.타고가다();


    }
}
