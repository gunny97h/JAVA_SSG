package org.example.day7.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 로그인화면 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  사용할 글씨 크기 및 폰트
        Font font1 = new Font("돋음", Font.BOLD, 90);
        Font font2 = new Font("돋음", Font.BOLD, 25);
        //  JLabel 3개, JTextField 2개, JButton 2개 메모리에 넣기
        JLabel top = new JLabel();
        top.setText("일기장");
        top.setFont(font1);

        JLabel id = new JLabel();
        id.setText("ID");
        id.setFont(font2);

        JLabel pw = new JLabel();
        pw.setText("PW");
        pw.setFont(font2);

        JTextField id2 = new JTextField(10);  //입력하는 개체
        id2.setFont(font2);
        JTextField pw2 = new JTextField(10);
        pw2.setFont(font2);

        JButton ok = new JButton();
        ok.setText("OK~!");
        ok.setFont(font2);
        JButton del = new JButton();
        del.setText("Del");
        del.setFont(font2);

        //이미지를 넣을 때는 이미지 아이콘으로 만들어서 버튼에 설정해야함.
        ImageIcon icon1 = new ImageIcon("ok.png");
        ImageIcon icon2 = new ImageIcon("del.png");
        ok.setIcon(icon1);
        del.setIcon(icon2);

        //순서대로 띄우는 설정
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        //색 지정
        id2.setBackground(Color.BLACK);
        pw2.setBackground(Color.BLACK);
        id2.setForeground(Color.RED);
        pw2.setForeground(Color.RED);

        ok.setBackground(Color.WHITE);
        del.setBackground(Color.WHITE);
        ok.setForeground(Color.BLUE);
        del.setForeground(Color.BLUE);

        //프레임에 추가
        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);
        frame.add(ok);
        frame.add(del);

        //ok버튼 - 아이디와 패스워드가 root, 1234가 맞는지 체크
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //ok 버튼을 클릭했을 때 처리하는 내용
                String id3 = id2.getText();
                String pw3 = pw2.getText();
                //System.out.println("입력한 값:" + id3 + "te" + pw3 + "st"); //--> 아무 입력 없으면 공백을 가져옴
                if (id3.length() == 0 || pw3.length() == 0) {
                    //JOptionPane.showMessageDialog(frame, "id / pw를 입력하세요.");
                    frame.setTitle("id / pw를 입력하세요.");
                } else if (id3.equals("root") && pw3.equals("1234")) {
                    //JOptionPane.showMessageDialog(frame, "로그인 성공!");
                    frame.setTitle("로그인 성공!");
                } else {
                    //JOptionPane.showMessageDialog(frame, "로그인 실패!");
                    frame.setTitle("로그인 실패!");
                }
            }
        });

        //del버튼 - 입력한 값 지우기
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // del 버튼을 클릭했을 때 처리하는 내용
                id2.setText(""); // ID 입력 필드 초기화
                pw2.setText(""); // 비밀번호 입력 필드 초기화
                //JOptionPane.showMessageDialog(frame, "입력 내용이 삭제되었습니다.");
            }
        });
        frame.setVisible(true);

    }
}


 /*  강사님 코드
package org.example.day7.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 로그인화면 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JLabel 3개, JTextField 2개, JButton 2개
        JLabel top = new JLabel();
        top.setText("일기장");
        Font font = new Font("궁서", Font.BOLD, 90);
        top.setFont(font);
        JLabel id = new JLabel();
        id.setText("ID");
        JLabel pw = new JLabel();
        pw.setText("PW");
        Font font2 = new Font("궁서", Font.BOLD, 25);
        id.setFont(font2);
        pw.setFont(font2);

        //입력하는 객체
        JTextField id2 = new JTextField(10);
        JTextField pw2 = new JTextField(10);
        id2.setFont(font2);
        pw2.setFont(font2);

        JButton ok = new JButton();
        ok.setText("OK~!");
        JButton del = new JButton();
        del.setText("Del");
        ok.setFont(font2);
        del.setFont(font2);
        //이미지를 넣을 때는 이미지아이콘으로 만들어서 버튼에 설정해야함.
        ImageIcon icon = new ImageIcon("ok.png");
        ImageIcon icon2 = new ImageIcon("del.png");
        ok.setIcon(icon);
        del.setIcon(icon2);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        id2.setBackground(Color.YELLOW); //배경색 설정
        pw2.setBackground(Color.YELLOW);
        id2.setForeground(Color.BLUE);
        pw2.setForeground(Color.BLUE);
        ok.setBackground(Color.GREEN);
        del.setBackground(Color.GREEN);

        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);
        frame.add(ok);
        frame.add(del);

        //ok버튼 - 아이디와 패스워드가 root, 1234가 맞는지 체크 처리
        //del버튼 - 입력한 값 지우기 처리

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //ok버튼을 클릭했을 때 처리하는 내용을 넣으세요.
                String id3 = id2.getText();//id2에 입력한 값을 가지고 와주는 함수.
                String pw3 = pw2.getText();
                System.out.println(id3.length() + " " + pw3.length());


                //id3가 root이고, pw3이 1234와 같으면,
                //로그인 성공! 알려주세요.!
                //아니면 로그인 실패! 알려주세요.!
                if(id3.length() > 0 && pw3.length() > 0){
                    if (id3.equals("root") && pw3.equals("1234")) {
                       //JOptionPane.showMessageDialog(frame, "로그인 성공!");
                        frame.setTitle("로그인 성공!");
                    } else {
                        //JOptionPane.showMessageDialog(frame, "로그인 실패!");
                        frame.setTitle("로그인 실패!");
                    }
                }else{
                   //JOptionPane.showMessageDialog(frame, "id,pw를 입력하세요.");
                    frame.setTitle("id,pw를 입력하세요.");
                }
            }
        });

        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id2.setText("");
                pw2.setText("");
            }
        });
        //맨 끝!
        frame.setVisible(true);
    }
}
 */