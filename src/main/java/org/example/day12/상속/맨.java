package org.example.day12.상속;

public class 맨 extends 사람 {

    int power;

    public 맨(char gender, String name, int power) {
        // super()를 항상 맨 첫 줄에 써야함.
        super(gender, name);
        this.power = power;

    }

    // 사람 클래스에서 생성자 만든 후 생긴 오류
    // --> 상속받는 클래스에서 생성자 호출시
    //     부모 객체부터 먼저 만들어야 파생이 되므로
    //     부모 클래스의 생성자부터 먼저 호출해야함.
//    public 맨() {
//        super();
//    }


    public void run() {
        System.out.println("달리다.");
    }


}
