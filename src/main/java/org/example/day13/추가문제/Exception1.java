package org.example.day13.추가문제;

public class Exception1 { // 예외처리문제.java
    public static void main(String[] args) {

        String[] names = {"홍길동", "김길동"};
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        int[] ages = null;
        try {
            System.out.println(ages.length);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("예외처리 끝");
    }
}
