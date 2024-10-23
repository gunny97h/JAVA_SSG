package org.example.assignment.inherit1.basicQ1Inherit;

public class Employee {
    public String name;
    String address;
    protected int salary;
    private int rrn;

    public Employee(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }


    @Override
    public String toString() {
        return "Q1_직원{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", rrn=" + rrn +
                '}';
    }
}
/*
package com.example.basic_q1_inherit;

public class Employee {
    // 멤버 변수
    public String name;
    public String address;
    protected int salary;
    private int rrn;

    // 생성자
    public Employee(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    // toString 메서드
    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
    }
}

 */