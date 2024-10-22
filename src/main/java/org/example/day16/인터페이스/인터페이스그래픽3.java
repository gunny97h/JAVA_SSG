package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 익명클래스(이름 없는 클래스)를 사용해서 만들기
public class 인터페이스그래픽3 {

    static TextArea list;
    static JButton b1, b2;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        b1 = new JButton("나를 눌러요.");
        b2 = new JButton("나도 눌러요.");
        f.add(b1);
        f.add(b2);
        Font font = new Font("굴림", Font.BOLD, 30);
        b1.setFont(font);
        b2.setFont(font);

        list = new TextArea(6, 13);
        list.setFont(font);
        f.add(list);

        b1.addActionListener(new ActionListener() {  // 익명클래스(이름 없는 클래스)를 사용해서 만들기
            public void actionPerformed(ActionEvent e) {
                list.append("b1 클릭함.\n");
            }
        });
        b2.addActionListener(new ActionListener() {  // 익명클래스(이름 없는 클래스)를 사용해서 만들기
            public void actionPerformed(ActionEvent e) {
                list.append("b2 클릭함.\n");
            }
        });



        f.setVisible(true);
    }
}
