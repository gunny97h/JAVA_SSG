package org.example.dayQ.inherit1;

public class Q1_매니저 extends Q1_직원 {

    // - toString() 재정의,
    // - main() --> static 변수

    private static int bonus;

    public Q1_매니저(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }


    public static void test() {
        System.out.println(", Manager [bonus=" + bonus  + "]\n"+"This is a test method in the Manager class.");
    }
}

/*
package com.example.basic_q1_inherit;

public class Manager extends Employee {
    // 멤버 변수
    private int bonus;

    // 생성자
    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);  // 상위 클래스의 생성자 호출
        this.bonus = bonus;
    }

    // test 메서드
    public void test() {
        System.out.println("This is a test method in the Manager class.");
    }

    // toString 메서드 재정의
    @Override
    public String toString() {
        return super.toString() + ", Manager [bonus=" + bonus + "]";
    }

    // 메인 메서드
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "123 Main St", 50000, 123456789, 5000);
        System.out.println(manager.toString());
        manager.test();
    }
}


 */