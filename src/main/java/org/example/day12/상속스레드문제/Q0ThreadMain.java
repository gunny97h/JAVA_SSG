package org.example.day12.상속스레드문제;

/*
스레드 추가 문제
===========
1. 멀티스레드 3개 클래스 정의
카운터 500부터 1까지 프린트
시각을 3000번 프린트(new Date()사용)
String[] foods = {"a", "b", "c", "d", "e", "f"}; 배열의 값을 하나씩 프린트
2. 위 세개의 스레드를 동시에 실행!
 */
public class Q0ThreadMain {

    public static void main(String[] args) {
        // 스레드 사용 3가지 단계
        // 1. 스레드 상속받아 클래스 정의
        // 2. 1에서 만든 스레드 클래스 객체 생성
        // 3. 실행 대기줄에 등록
        Q0Thread1 thread1 = new Q0Thread1();
        Q0Thread2 thread2 = new Q0Thread2();
        Q0Thread3 thread3 = new Q0Thread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
