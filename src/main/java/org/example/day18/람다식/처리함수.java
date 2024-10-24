package org.example.day18.람다식;

// 람다 + 메서드 // 정적(static)메서드, 일반(instance) 메서드
public class 처리함수 {

    public static void staticPrint(String content) {
        System.out.println(" *** " + content + " *** ");
    }

    public void generalPrint(String name, String job) {
        System.out.println(" *** " + name + " *** " + job + " *** ");
    }
}
