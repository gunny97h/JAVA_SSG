package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setTitle("그래픽 연습2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton();
        button.setText("Button1");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.white);

        JButton button2 = new JButton();
        button2.setText("Button2");
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
//        // 레이아웃 매니저를 비활성화  // 버튼 위치 및 크기 조절하기 위해서
//        f.setLayout(null);
//        button.setBounds(100, 100, 150, 50); // x, y, width, height

        //JFrame은 위쪽, 왼쪽, 가운데, 오른쪽, 아래쪽 중에서 선택해서 넣을 것으로 기본 설정.
        //위치를 정해주지 않으면 가운데에 계속 덮어쓴다
        f.add(button, BorderLayout.NORTH);
        f.add(button2, BorderLayout.CENTER);
//        f.add(button);
//        f.add(button2);


        f.setVisible(true);

    }
}//comit
