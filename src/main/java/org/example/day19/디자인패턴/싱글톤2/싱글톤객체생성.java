package org.example.day19.디자인패턴.싱글톤2;

public class 싱글톤객체생성 {
    public static void main(String[] args) {
        //new 싱글톤클래스(); // 외부에서 객체 생성 불가능!
        // 싱글톤 객체는 싱글톤 클래스 안에서 하나만 만들도록 해야함.
        // 외부에서는 하나만 만들어놓은 싱글톤 객체의 주소를 가져다가 사용해야함.
        // 외부에서는 하나가 만들어졌는지 모름. static으로 호출해서 확인!
        싱글톤클래스 one  = 싱글톤클래스.getInstance();
        System.out.println(one);
        System.out.println(one.hashCode());
        싱글톤클래스 two  = 싱글톤클래스.getInstance();
        System.out.println(two);
        System.out.println(two.hashCode());
    }
}
