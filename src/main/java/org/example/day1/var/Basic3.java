package org.example.day1.var;

public class Basic3 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");
// 기본형 4가지 : 정수, 실수, 문자1, 논리

//정수 : byte, short, int, long
        byte age = 120; // +-127
        short count = 25000;    // +-3만
        int money = 1000000;    // =-21억
        long bank = 2222222222L; // long을 사용할 때는 뒤에 소문자 or 대문자 L

//실수 : float, double
        float weight = 55.5f; //소수점 7자리까지 // float을 사용할 때는 뒤에 소문자 or 대문자 F
        double height = 188.8888; // 소수점을 거의 두 배 쓸 수 있어서 더블

        String name = "김건희"; // 0글자 이상 (문자열) // 기본형이 아니기에 대문자를 사용
        String job = "자바  프로그래머";

// 내가 미래에 가질 재산 프린트 (money+bank)
// 홍길동은 자바 프로그래머이다. 프린트 (name+job)

        System.out.println("내가 미래에 가질 재산은 " +(money+bank)+"원이다.");
        System.out.println(name+"는 "+job+"이다.");
    }
}
