package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();    // 창 만들기  // 벽돌  // 자주 쓰지 않던 기능 램에 넣어놓기 // 주소
        JButton b1 = new JButton(); // 버튼 만들기
        JButton b2 = new JButton(); // 회색으로 보이는 애들은 쓰이지 않아서

        f.setSize(300,300); // 창 크기 정하기

        b1.setText("나를 클릭하세요.");
        b2.setText("나도 클릭하세요.");
        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);
        b1.setForeground(Color.YELLOW);
        b2.setForeground(Color.BLUE);

        Font font = new Font("궁서", Font.BOLD, 20);  // 특정한 데이터가 있어야 오류가 나지 않는 부품
        b1.setFont(font);
        b2.setFont(font);

// 배치해주는 부품
// 물 흐르는 것처럼 순서대로 댜 붙여주는 레이아웃
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        f.add(b1);
        f.add(b2);

        f.setVisible(true);             // 이 위에 작성한 코드들 보이게 하기 // 마지막에 위치
    }
}
