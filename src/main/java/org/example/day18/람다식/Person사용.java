package org.example.day18.람다식;

public class Person사용 {
    public static void main(String[] args) {

        Person person = new Person();

        person.action1((x, y) -> {
            System.out.println(x + "님은 ");  // <-- Workable w
            System.out.println(y + "입니다.");
        }, "임아무개", "프로그래머");
        // -->
        // person.action1((x, y) -> Workable w, String name, String job);

        person.action1((x, y) -> System.out.println(x + "님은 " + y + "입니다."), "", "");

        person.action2(x -> System.out.println(x + "가 내용입니다."), "abc"); // (Speakable s, String content)

        // 처리함수 참고
        // 정적(static) 메서드
        person.action2(x -> 처리함수.staticPrint(x), "람다 표현식");
        person.action2(처리함수::staticPrint, "메서드 참조(:: 사용)");

        // 일반(instance) 메서드
        처리함수 p = new 처리함수();
        person.action1((x, y) -> p.generalPrint(x, y), "임아무개", "프로그래머");  // 람다 표현식
        person.action1(p::generalPrint, "임아무개", "프로그래머");  // 메서드 참조
    }
}
