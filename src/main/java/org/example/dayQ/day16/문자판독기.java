package org.example.dayQ.day16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class 문자판독기 {
    public static void main(String[] args) {
        JFrame f = new JFrame("문자판독기");
        f.setSize(300, 500);
        // flow를 만들어두고, 아래 코드에서 flow를 쓰는 경우
//        FlowLayout flow = new FlowLayout();
//        f.setLayout(flow);
        // 한번 쓰고 아래 코드에서 쓸 일이 없는 경우
        f.setLayout(new FlowLayout());

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("문장을 넣으세요.");
        JTextArea area = new JTextArea(7, 10);
        area.setAutoscrolls(true);  // 현재 입력 중인 부분을 화면에 보이게 해줌.
        area.setLineWrap(true);  // 텍스트가 영역의 끝에 도달했을 때 자동으로 줄바꿈.

        JButton b1 = new JButton("글자수 카운트");
        JButton b2 = new JButton("배경색 바꾸기");
        JButton b3 = new JButton("글자색 바꾸기");

        Font font = new Font("굴림", Font.BOLD, 30);
        label.setFont(font);
        area.setFont(font);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        f.add(label);
        f.add(area);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        // 1. text.length(); 글자수 구해줌.
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();  // area에 입력한 문장
                //글자수와 단어수를 파악해주세요.!
                int length = text.replace(" ", "").length();
                String[] data2 = text.split(" ");
                int count = data2.length;
                //다이얼로그창에 결과를 띄우자!
                JOptionPane.showMessageDialog(f,
                        "단어수는 " +  count + "\n" +
                                "글자수는 " + length );
                area.setText("");
            }
        });  // 익명클래스

        // 2. area.setBackground(Color.yellow);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //area.setBackground(Color.YELLOW);
                Random random = new Random();
                int r = random.nextInt(256);  // 0 ~ 255 사이의 값
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                area.setBackground(new Color(r, g, b));  // 랜덤 배경색 설정
            }
        });  // 익명클래스

        // 3. area.setForeground(Color.red);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //area.setForeground(Color.RED);
                Random random = new Random();
                int r = random.nextInt(256);  // 0 ~ 255 사이의 값
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                area.setForeground(new Color(r, g, b));  // 랜덤 배경색 설정
            }
        });  // 익명클래스

        f.setVisible(true);
    }
}
