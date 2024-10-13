package org.example.day8.class만들기;

public class 계산기 {
    // 필드 X

    /*
    메서드 정의:
     ● 형식: 사용범위 반환여부/타입 메소드이름(입력값)
     ● 설명: 해당 메서드 이름을 호출했을 때 처리할 기능을 여러 줄로 작성합니다.

    입력값에 따른 메서드 오버로딩:
     ● 입력값의 타입, 개수, 순서가 다르면 자바는 메서드 이름을 동일하게 쓸 수 있습니다.
     ● 입력값이 다르면 다른 메서드로 인식합니다.
     ● 반환값이 다른 것은 상관 없음.
     public int add(int x, int y)
     public double add(int x, int y) <-- 동시 사용 불가

    반환 여부:
     ● 메서드는 반환값이 있을 수도 있고, 없을 수도 있습니다.
     ● 반환값이 없는 경우는 void 키워드를 사용합니다.
     ● 반환값이 있는 경우는 메서드 끝에 return 키워드를 사용하며, 반환값에 따라 타입명을 작성합니다.
    */

    // n1, n2 : 매개변수, 파라메터라고 부름
    // --> 사용하는 곳과 실제 처리하는 곳에서 사용가능한 지역변수
    // 인자, 파라메터, 매개변수 <--> 인수(데이터, argument)
    public int 더하기(int n1, int n2) {
        System.out.println("더하기 기능 처리 내용");
        System.out.println(n1 + n2);
        return n1 + n2;
    }

    public void 빼기(int n1, int n2) {
        System.out.println("빼기 기능 처리 내용");
        System.out.println(n1 - n2);
    }

    public void 곱하기(int n1, int n2) {
        System.out.println("곱하기 기능 처리 내용");
        System.out.println(n1 * n2);
    }

    public void 나누기(int n1, int n2) {
        System.out.println("나누기 기능 처리 내용");
        System.out.println(n1 / n2);
    }

}
