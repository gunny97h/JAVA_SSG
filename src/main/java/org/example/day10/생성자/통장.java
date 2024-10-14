package org.example.day10.생성자;

public class 통장 {
    String name;
    String ssn;
    int money;
    static int count; // 0  // static이 없으면 누적되지 않음
    // static 키워드가 붙어있는 변수는
    // 객체 생성과 상관없이
    // 클래스에서 바로 접근해서 사용 가능한 변수
    // 정적 변수, static 변수, 클래스 변수
    // 클래스명.변수명 접근해서 사용 가능
    // + instance 변수와 반대 의미
    // + 사용하는 이유
    // 1) 객체마다 공유할 목적 (누적)
    // 2) 객체 생성하지 않고 언제든지 접근해서 사용 (main()에 static이 붙은 이유, jvm)


    public 통장(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        count++;
    }

    public String toString() {
        return "통장{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", money=" + money +
                '}';
    }

}
