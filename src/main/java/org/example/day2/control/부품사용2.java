package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        // JFrame 만들고
        // 버튼을 하나 만들어
        // 그 위에 얹어보세요!
        // 설정은 여러분 마음대로!

        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setTitle("부품 사용 연습");
        JButton jb1 =  new JButton();
        jb1.setText("Button1");
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.WHITE);
        jb1.setSize(1, 1);
        JButton jb2 =  new JButton("Button2");
        jb2.setBackground(Color.BLUE);
        jb2.setForeground(Color.WHITE);
        jb2.setSize(200, 100);

        FlowLayout fl = new FlowLayout();
        jf.setLayout(fl);

        jf.add(jb1);
        jf.add(jb2);
        jf.setVisible(true);
    }
}
