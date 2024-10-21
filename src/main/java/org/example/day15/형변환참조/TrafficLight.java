package org.example.day15.형변환참조;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//NEW01-Java-6(형변환+컬렉션+제너릭).pdf p.30
public class TrafficLight {
    public static void main(String[] args) {
        JFrame f = new JFrame("나의 신호등");
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
                // 이미지를 만들어 라벨에 끼운 후 프레임에 add하기
                JLabel label = new JLabel();
                ImageIcon icon = new ImageIcon("r.png");
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);  // JLabel을 동적으로 새로 만들기 때문에 다시 넣어줘야 함
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel();
                ImageIcon icon = new ImageIcon("g.png");
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);
            }
        });
        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel();
                ImageIcon icon = new ImageIcon("y.png");
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);
            }
        });

        f.setVisible(true);

    }
}
