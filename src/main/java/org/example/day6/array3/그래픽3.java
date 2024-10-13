package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 그래픽3 {
    //변수가 선언된 위치를 포함한 곳 안에서 사용 가능
    //static이 붙은 곳에 사용하려면 변수 앞에도 static이 필요함
    static int start = 2; // 현재 위치값
    public static void main(String[] args) {
        //================================================================================

        JFrame frame = new JFrame();
        frame.setTitle("웹툰 순위 - 네이버");
        frame.setSize(445, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //코딩하다 막힐 때
        //입력 --> 처리 --> 출력

        //입력
        //데이터 준비 --> 배열(같은 속성, 같은 타입, 많을 때 사용)
        String[] title = {" 윈드 브레이커", " 천재 타자", " 펜 홀더", " 위닝 샷", " 낫 오버"};
        String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
        double[] jumsu = {9.9, 8.8, 7.7, 6.6, 5.5};

        //================================================================================

        //처리
        //텍스트 3개 들어갈 자리 (위, 아래, 포스터 이미지) --> 라벨
        JLabel top = new JLabel();
        //top.setText("타이틀");
        top.setText(title[2]);

        JLabel under = new JLabel();
        //under.setText("평점");
        under.setText(" " + jumsu[2]);  //double이 아니라 String이 필요  //문법이 특징을 이용한 편법
        //under.setText(String.valueOf(jumsu[2]));      //정석적인 방법

        JLabel center = new JLabel();
        //center.setText("이미지 포스터");
        ImageIcon icon = new ImageIcon(img[2]);     //이미지를 아이콘으로 만들기
        center.setIcon(icon);                       //아이콘 사이즈 조절 불가능


//        left.addActionListener(new ActionListener() {
//            //addActionListener(처리하는 부품)는 버튼을
//            //클릭했을 때 처리하는 기능을 더함
//            public void actionPerformed(ActionEvent e) {
//                //이 actionPerformed()가 내가 클릭했을 때
//                //자동으로 실행되는 부분
//            }
//        });

        JButton left = new JButton();
        left.setText("<<");
        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("왼쪽 버튼을 눌렀구나");
                if (start > 0) {
                    start--;  // 1번째로 이동
                    top.setText(title[start]);
                    under.setText(jumsu[start]+"");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else {
                    JOptionPane.showMessageDialog(frame,"왼쪽 끝입니다.");
                }

            }
        });

        JButton right = new JButton();
        right.setText(">>");
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("오른쪽 버튼을 눌렀구나");
                if (start < 4) {
                    start++;  // 3번째로 이동
                    top.setText(title[start]);
                    under.setText(jumsu[start]+"");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else {
                    JOptionPane.showMessageDialog(frame,"오른쪽 끝입니다.");
                }
            }
        });

        //================================================================================

        //글자 폰트, 굵기, 크기 지정
        Font font = new Font("궁서", Font.BOLD, 25);      //()안에 데이터 필요
        top.setFont(new Font("궁서", Font.BOLD, 35));    //일회용이라면 이렇게도 가능
        under.setFont(font);                                      //각자 다르게 지정하려면 다른 폰트 필요
        left.setFont(font);
        right.setFont(font);

        //색 지정하기
        left.setBackground(Color.WHITE);
        left.setForeground(Color.BLUE);
        right.setBackground(Color.WHITE);
        right.setForeground(Color.BLUE);

        // 위치 지정해서 프레임에 추가
        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);

        //================================================================================

        JTextField textField = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JButton button = new JButton();
        JButton button2 = new JButton();


        frame.setVisible(true);

    }
}//comit

/*
package org.example.day6.array3;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 웹툰순위 {
    static int start = 2; //현재 위치!
    //변수가 선언된 위치를 포함한 곳 안에서 사용 가능!
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("웹툰 순위-네이버");
        frame.setSize(440,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //데이터 준비 --> 배열(같은 속성, 같은 타입, 많을 때 사용)
        String[] title = {"윈드 브레이커", "천재 타자", "펜 홀더", "위닝 샷", "낫 오버" };
        String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
        double[] jumsu = {9.9, 8.8, 7.7, 6.6, 5.5};


        //입력 --> 처리 --> 출력

        //텍스트 3개들어갈 자리(위, 아래, 포스터 이미지)
        JLabel top = new JLabel();
        top.setText(title[2]);

        JLabel under = new JLabel();
        under.setText(jumsu[2] + "");
        //String.valueOf(jumsu[2]);

        JLabel center = new JLabel();
        //center.setText("이미지 포스터");
        ImageIcon icon = new ImageIcon(img[2]);
        center.setIcon(icon);

        JButton left = new JButton();
        left.setText("<<");

        JButton right = new JButton();
        right.setText(">>");
        right.addActionListener(new ActionListener() {
            //addActionListener(처리하는 부품)는 버튼을
            //클릭했을 때 처리하는 기능을 더함.
            public void actionPerformed(ActionEvent e) {
                //이 actionPerformed()가 자동으로
                //내가 클릭했을 때 실행되는 부분!
                if(start < 4) {
                    System.out.println("오른쪽 버튼을 눌렀구나.!");
                    start++;//3
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else if (start == 4) {
                    JOptionPane.showMessageDialog(frame, "마지막페이지입니다.");
                }
            }
        });

        left.addActionListener(new ActionListener() {
            //addActionListener(처리하는 부품)는 버튼을
            //클릭했을 때 처리하는 기능을 더함.
            public void actionPerformed(ActionEvent e) {
                //이 actionPerformed()가 자동으로
                //내가 클릭했을 때 실행되는 부분!
                if(start > 0) {
                    System.out.println("왼쪽 버튼을 눌렀구나.!");
                    start--; //1
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else if (start == 0) {
                    JOptionPane.showMessageDialog(frame, "시작페이지입니다");
                }
            }
        });


        Font font = new Font("궁서", Font.BOLD, 25); //통장(이름, 금액, ...)

        top.setFont(new Font("궁서", Font.BOLD, 35));
        under.setFont(font);
        left.setFont(font);
        right.setFont(font);

        left.setBackground(Color.GREEN);
        right.setBackground(Color.GREEN);
        left.setForeground(Color.BLUE);
        right.setForeground(Color.BLUE);

        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);
        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);

        //맨 끝!!
        frame.setVisible(true);
    }
}
*/
