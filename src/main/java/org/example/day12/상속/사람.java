package org.example.day12.상속;

public class 사람 {

    char gender;
    String name;

    public 사람(char gender,String name) {// 자식 클래스인 '맨'에 오류 // 맨에 자동으로 비어있는 생성자가 생기기 때문
        // super(); --> 컴파일할 때 무조건 생성자 첫줄은 super() 자동생성됨.
        this.gender = gender;
        this.name = name;

    }

    public void sleep() {
        System.out.println("잠자다.");
    }

    public void eat() {
        System.out.println("먹다.");
    }

}
