package org.example.day16.추상클래스;

public abstract class ApplePhone implements MegaPhone{
    // camera()와 같이 하나라도 추상 메서드를 가지면 추상클래스

    int size;  // 클래스는 필드(변수) 가능

    public abstract void camera();  // 클래스에서 기능을 추가할 수 있음
    // 상속받은 곳에서 반드시 구혀하도록 강제성을 클래스에서 지정하고 싶을 때
    // 클래스내에서 추상메서드 사용 가능!
    // 이 클래스로는 객체 생성 불가능!

    @Override
    public void siri() {
        System.out.println("시리 기능 구현");
    }

    @Override
    public void map() {
        System.out.println("지도 기능 구현");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 기능 구현");
    }

    @Override
    public void call() {
        System.out.println("통화 기능 구현");
    }

    @Override
    public void text() {
        System.out.println("문자 기능 구현");
    }

    @Override
    public void kakao() {
        System.out.println("카카오 기능 구현");
    }
}
