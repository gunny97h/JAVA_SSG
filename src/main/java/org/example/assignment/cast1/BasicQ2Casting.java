package org.example.assignment.cast1;

import java.util.HashMap;

public class BasicQ2Casting {
    public static void main(String[] args) {
        HashMap<Integer, String> customer = new HashMap<>();
        customer.put(100, "김데이");
        customer.put(200, "김사전");
        customer.put(300, "김구조");
        customer.put(400, "김자료");

        customer.remove(200);
        customer.put(300, "김충성");

        System.out.println("고객의 전체 리스트:");
        for (Integer key : customer.keySet()) {
            System.out.println("고객 번호: " + key + ", 이름: " + customer.get(key));
        }

    }
}

/*
package com.example;

import java.util.HashMap;
import java.util.Map;

public class basic_q2_casting {
    public static void main(String[] args) {
        // 고객 정보를 저장하는 HashMap 초기화
        Map<Integer, String> customers = new HashMap<>();
        customers.put(100, "김데이");
        customers.put(200, "김사전");
        customers.put(300, "김구조");
        customers.put(400, "김자료");

        // 특정 고객 정보 업데이트
        customers.remove(200); // 200번 고객 탈퇴 처리
        customers.put(300, "김충성"); // 300번 고객 이름 변경

        System.out.println(customers);

        // 전체 고객 리스트 출력
        System.out.println("고객의 전체 리스트:");
        for (Map.Entry<Integer, String> entry : customers.entrySet()) {
            System.out.println("고객 번호: " + entry.getKey() + ", 이름: " + entry.getValue());
        }
    }
}

*/
