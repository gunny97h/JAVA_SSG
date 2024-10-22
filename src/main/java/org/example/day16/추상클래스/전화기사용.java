package org.example.day16.추상클래스;

public class 전화기사용 {
    public static void main(String[] args) {
        //Megaphone p1 = new MegaPhone(); // X --> 인터페이스는 객체 생성 불가
        //ApplePhone p2 = new ApplePhone(); // X --> 추상클래스도 객체 생성 불가
        ApplePhone1 p3 = new ApplePhone1(); // O --> 일반클래스는 가능
        ApplePhone2 p4 = new ApplePhone2(); // O --> 일반클래스는 가능
        ApplePhone p5 = p3;
        System.out.println(MegaPhone.DATA);

    }
}
