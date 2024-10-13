package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Array3Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Popular Song Voting");

        // 강사님 설명 코드
//        ActionListener ac = new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(frame, " ");
//            }
//        };

        GridLayout layout= new GridLayout(5, 1);
        frame.setLayout(layout);

        JLabel label = new JLabel();
        label.setText("Select your favorite song:");
        label.setFont(new Font("돋음", Font.BOLD, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Font font = new Font("돋음", Font.BOLD, 15);

        ActionListener ac = new ActionListener() { // 버튼 함수처럼 만들기
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "You voted for ";
                String option = e.getActionCommand();
                if (option.equals("아이유 - LILAC")) {
                    s += "아이유 - LILAC";
                } else if (option.equals("프로미스나인 - We Go")) {
                    s += "프로미스나인 - We Go";
                } else if (option.equals("스테이씨 - ASAP")) {
                    s += "스테이씨 - ASAP";
                } else {
                    System.exit(0);
                }

                JOptionPane.showMessageDialog(frame, s);
            }
        };

        JButton button = new JButton("아이유 - LILAC");
        button.setFont(font);
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(frame, "You voted for 아이유 - LILAC");
//            }
//        });
        button.addActionListener(ac);

        JButton button2 = new JButton("프로미스나인 - We Go");
        button2.setFont(font);
        button2.addActionListener(ac);

        JButton button3 = new JButton("스테이씨 - ASAP");
        button3.setFont(font);
        button3.addActionListener(ac);

        JButton button4 = new JButton("종료");
        button4.setFont(font);
        button4.addActionListener(ac);

        frame.add(label);
        frame.add(button);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);



        frame.setVisible(true);



    }
}//comit

 /*
김창훈님 코드
package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        FlowLayout flow = new FlowLayout();
        frame.setLayout(new GridLayout(5, 1));
        frame.setTitle("Popular Song Voting");

        JLabel label = new JLabel();
        label.setText("Select your favorite song:");
        label.setFont(new Font("돋음", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);

        Font font = new Font("돋음", Font.BOLD, 15);

        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "You voted for ";
                String option = e.getActionCommand();
                if (option.equals("아이유 - LILAC")) {
                    s += "아이유 - LILAC";
                } else if (option.equals("프로미스나인 - WE GO")) {
                    s += "프로미스나인 - WE GO";
                } else if (option.equals("스테이씨 - ASAP")) {
                    s += "스테이씨 - ASAP";
                } else {
                    System.exit(0);
                }

                JOptionPane.showMessageDialog(frame, s);
            }
        };

        JButton button1 = new JButton("아이유 - LILAC");
        button1.setFont(font);
        button1.addActionListener(ac);

        JButton button2 = new JButton("프로미스나인 - WE GO");
        button2.setFont(font);
        button2.addActionListener(ac);

        JButton button3 = new JButton("스테이씨 - ASAP");
        button3.setFont(font);
        button3.addActionListener(ac);

        JButton button4 = new JButton("종료");
        button4.setFont(font);
        button4.addActionListener(ac);

        frame.add(label, BorderLayout.NORTH);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setVisible(true);
    }
}

 */
