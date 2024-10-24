package org.example.day18.디자인패턴.팩토리메서드;

public class 객체생성공장클래스 {
    public Object getInstance(String name) {
        // equalsIgnoreCase() : 같은지 비교, 대소문자 구별 X
        if (name.equalsIgnoreCase("apple")) {
            return new 애플클래스();
        } else if (name.equalsIgnoreCase("banana")) {
            return new 바나나클래스();
        } else {
            return null;
        }
    }
}
