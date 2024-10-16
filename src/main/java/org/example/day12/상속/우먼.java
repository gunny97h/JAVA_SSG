package org.example.day12.상속;

public class 우먼 extends 사람 {
//    public 우먼() {   --> 보이진 않지만 자동 생성되므로 오류 발생
//        super();
//    }

    int walk;

    public 우먼(char gender, String name, int walk) {
        super(gender, name);
        this.walk = walk;
    }
}
