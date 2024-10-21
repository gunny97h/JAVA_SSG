package org.example.dayQ.day15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TrafficLight 리팩토링
// 리팩토링(refactoring)은 소프트웨어 공학에서 '결과의 변경 없이 코드의 구조를 재조정함'을 뜻한다.
// 가독성을 높이고 유지보수를 편하게 하기 위해 코드를 재개편하는 것을 의미한다.

public class TrafficLight2 {
    static JFrame f;
    public static void main(String[] args) {
        f = new JFrame("나의 신호등");
        f.setSize(500, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JFrame에는 배경색 설정 기능이 없고, ContentPane을 가지고 온 후, 여기서 배경색 설정
        f.getContentPane().setBackground(Color.BLACK);
        // FlowLayout 생성
        FlowLayout fl = new FlowLayout();
        // 버튼 3개 만들기
        Button red = new Button("빨강신호");
        Button green = new Button("파랑신호");
        Button yellow = new Button("노랑신호");
        red.setBackground(Color.RED);
        green.setBackground(Color.GREEN);
        yellow.setBackground(Color.YELLOW);
        // 프레임에 레이아웃 설정
        f.setLayout(fl);
        // 프레임에 버튼 3개 추가
        f.add(red);
        f.add(yellow);
        f.add(green);
        // 글씨 크기 키우기
        Font font = new Font("돋움", Font.BOLD, 35);
        red.setFont(font);
        green.setFont(font);
        yellow.setFont(font);
        // 버튼에 기능 만들기
        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("r.png");
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("g.png");
            }
        });
        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("y.png");
            }
        });

        f.setVisible(true);

    } // main

    public static void show(String filename) {
        // 이미지를 만들어 라벨에 끼운 후 프레임에 add하기
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon(filename);
        label.setIcon(icon);
        f.add(label);
        f.setVisible(true);  // JLabel을 동적으로 새로 만들기 때문에 다시 넣어줘야 함
    }
}
