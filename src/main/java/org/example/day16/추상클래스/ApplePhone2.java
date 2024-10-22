package org.example.day16.추상클래스;

public class ApplePhone2 extends ApplePhone{
    // 추상클래스를 상속받은 경우
    // 무조건!!! 추상메서드를 일반메서드로
    // 오버라이드해서 구현해야함.
    @Override
    public void camera() {
        System.out.println("인덕션 카메라로 찍다.");
    }

}
