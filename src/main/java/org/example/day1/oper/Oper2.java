package org.example.day1.oper;

public class Oper2 {
    public static void main(String[] args) {
        int x = 200;
        int y = 100;

        int sum = x + y; // 정수 + 정수 ==> 결과는 무조건 정수
        System.out.println(sum);

        double div = y / x; // 0.0 = 100/200 (x)
        System.out.println("잘못된 결과: "+div);
// 자바는 정적타입이라 정수 변수를 실수 변수로 바꿀 수는 없음.
// cpu가 값을 가지고 와서 실수로 변경해 주어야 한다.
        double div2 = (double)y / x;
// cpu가 타입을 변환하는 것을 casting(캐스팅)
        System.out.println("원하는 결과: "+div2);
    }
}
