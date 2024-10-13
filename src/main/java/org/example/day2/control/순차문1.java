package org.example.day2.control;

import javax.swing.*;

public class 순차문1 {
    public static void main(String[] args) {
        // 참조형(String) 비교

        String id = "root";
        String pw = "1234";

        //입력하는 처리 필요
        String id2 = null; // 기본형이 아닌 변수의 초기화
        String pw2 = null;
        id2 = JOptionPane.showInputDialog("ID를 입력하세요.");  // "admin", "root"
        pw2 = JOptionPane.showInputDialog("PW를 입력하세요.");  // "1111", "1234"

        System.out.println(id.equals(id2) && pw.equals(pw2));
    }
}
