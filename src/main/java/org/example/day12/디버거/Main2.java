package org.example.day12.디버거;

public class Main2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b); // 값을 전달  // a,b가 참조형 변수라면 주소를 전달
        System.out.println("결과: " + result);

        System.out.println("여기까지 실행");
        // Run to Cursor (단계마다가 아닌 커서가 있는 곳까지 실행!)
    }
    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

}
