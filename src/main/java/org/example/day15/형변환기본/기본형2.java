package org.example.day15.형변환기본;

import javax.swing.*;

public class 기본형2 {
    public static void main(String[] args) {
        long x = 50L;
        JFrame f = new JFrame();
        f.setSize((int)x, 100);  // int형만 가능, 50은 int 범위의 값이기 때문에 가능

        // 기본형 형변환 중 강제형변환은
        // 강제로 변환될 데이터 타입 범위안에 들어있어야 가능.

    }
}
