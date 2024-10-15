package org.example.day11.review;
// 1013-NEW01-STATIC Q1
public class Day {
    String doing; // 한 일
    int time; // 시간
    String location; // 장소
    // static <--> instance
    static int count;
    static int sum; // time 누적
    // static 변수는 공유, 누적 목적으로 사용 --> 정적변수, 클래스변수
    // static은 미리 메모리에 올라가져 있어 필요한 경우에만 사용

    // 객체 생성 시 멤버변수 초기화할 목적으로
    // 생성자 메서드, 객체 생성 시 자동 호출

    // 생성자 메서드가 되기 위한 조건
    // 1. 클래스 이름과 무조건 동일해야함.
    // 2. 리턴 타입을 명시하면 자동 호출 되지 않음.

    // 생성자의 특징
    // 1. 오버로딩할 수 있음.
    // 2. 프로그래머가 하나도 생성자를 명시하지 않으면 컴파일러가 하나를 추가해줌.
    //     public 클래스명() {...} --> 입력 매개변수가 없는 메서드를 생성해줌
    //     기본생성자(default constructor) --> 입력매개변수가 없는 생성자 메서드

    // 멤버변수 초기화 --> 생성자
    public Day(String doing, int time, String location) {
        this.doing = doing;
        this.time = time;
        this.location = location;
        count++;
        sum = sum + time;
    }

    public static double getAvg() {
        // System.out.println(getDoing());
        // --> static 메서드 내에서는 static만 호출 가능하기 때문에 불가능

        return (double) sum / count;
        // static 메서드내에 사용할 수 있는 변수는 static변수만 써야한다.
        // 이유 --> static은 객체 생성 이전에 언제든지 호출할 수 있는 개념이기 때문에
        //         객체 생성 후 힙역역에 접근하여 사용하는
    }

    // 내부(Day클래스)에서는 호출(메서드 이름)을 통해 바로 사용 가능
    public String getDoingTime() {
        return getDoing() + " " + time;
    }
    public String getDoing() {
        return doing;
    }

    // 멤버변수를 프린트할 목적!
    // @Override --> 생략 가능
    public String toString() {
        return "Day{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';
    }
    // --> 이 클래스로 생성된 객체(참조형변수, day1)를 프린트할 때,
    //     프린트할 스트링을 자동으로 만들어주는 것!
    //     모든 클래스는 toString() 메서드를 가지고 시작함(묵시적)
    //     패키지명.클래스명@주소 --> 원래는 이렇게 스트링을 만들어줌.
}
