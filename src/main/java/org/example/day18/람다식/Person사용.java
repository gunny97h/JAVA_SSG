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
    }
}
