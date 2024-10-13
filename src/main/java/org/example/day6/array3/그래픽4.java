package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//1. 결제하기 버튼 추가
//2. 버튼 클릭하면 count++처리
//3. 결제하기 버튼 클릭시
//한장당 10000원으로 계산하여
//전체 결제금액 다이얼로그로
//   알려주세요.
//           (JOptionPane.showMessageDialog(frame, ~)
//--------추가
//4. 결제하기 버튼 클릭시
//전체 결제금액과 예매한 자리
//알려주세요.

public class 그래픽4 {

    static int count = 0;  //아직 배우지 않은 내용
    static String seatNo = "";  //예매한 좌석 번호를 위한 빈 공간

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();   //add()한 순서대로 물 흐르듯이 뒤에다 붙여줌
        frame.setLayout(layout);

        for (int i = 0; i < 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {    // e --> 버튼 정보 가져오기
                    //버튼 클릭시 실행되는 내용
                    //버튼을 클릭하면 ActionListener안에 있는 actionPerformed()라는 함수가 자동으로 실행!
                    String s = e.getActionCommand(); //버튼 위에 있는 글자를 가지고 온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s + "번 에매 완료.");
                    button.setEnabled(false);   //액션 기능 삭제
                    button.setBackground(Color.red);
                    count++;

                    seatNo = seatNo + s + "  "; //예매한 좌석 번호 추가
                }
            });
        }

        JButton button2 = new JButton();
        button2.setText("결제하기");
        button2.setBackground(Color.YELLOW);
        frame.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "최종 결제 금액 : " + (count * 10000) + "원\n"
                        + "예매한 좌석 번호\n" + seatNo);
            }
        });


        //맨 끝!
        frame.setVisible(true);
    }
}//comit

/*
package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예매시스템 {
    static int count = 0; //예매수 누적용
    static String sum = ""; //좌석번호 누적용

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);//add()한 순서래도 물흐르듯이 뒤에다 붙여줌.!

        for (int i = 0; i < 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //버튼클릭했을 때 실행되는 내용!
                    //버튼클릭하면 ActionListener안에 있는 actionPerformed()라는
                    //함수가 자동 실행!
                    String s = e.getActionCommand();//버튼 위에 있는 글자를 가지고 온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s+"번 예매됨.");
                    button.setEnabled(false);
                    button.setBackground(Color.red);
                    count++;//예매수 카운트
                    sum = sum + s + " "; //sum += s + " ";
                }
            });
        }

        JButton pay = new JButton();
        pay.setText("결제하기");
        frame.add(pay);
        pay.setBackground(Color.red);
        pay.setForeground(Color.yellow);

        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, count * 10000 + "원 결제금액입니다. \n좌석번호는 " + sum);
            }
        });
        //맨 끝!
        frame.setVisible(true);
    }
}
*/