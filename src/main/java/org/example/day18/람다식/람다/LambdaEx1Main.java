package org.example.day18.람다식.람다;

public class LambdaEx1Main {
    public static void main(String[] args) {
        // Ctrl + SpaceBar --> 한글도 자동완성
        LambdaEx1 sum = (a, b) -> a + b;
        System.out.println(sum.fun1(100, 200));

        // 화살표 오른쪽의 내용을 바꿔 사용 가능    // 입력 개수는 같아야 함
        LambdaEx1 sum2 = (a, b) -> (a + 100) + (b - 100);
        System.out.println(sum2.fun1(100, 200));

    }
}
