package org.example.day8.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

/*
1. JFrame frame = new JFrame();
   frame.setSize(350, 700);
   //맨끝!
   frame.setVisible(true);
2. 오늘의 날짜, 오늘의 제목, 오늘의 내용
   --> JLabel today, title, content 3개
3. 20200123, 목요일, 오늘은 연휴 전날임
   --> JTextField today2, title2, content2
        3개 필요
4. 파일에 일기 저장
   --> JButton save 1개 필요
5. 파일에 일기 저장을 클릭하면
   today2, title2, content2에 입력한
   내용 가지고 와서 콘솔에 출력
*/

public class 일기쓰기화면 {
    public static void main(String[] args) {

        // 기본 설정
        JFrame frame = new JFrame();
        frame.setSize(340, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 사용할 글씨 크기 및 폰트
        Font font2 = new Font("돋음", Font.BOLD, 25);

        // 순서대로 띄우는 설정
        //FlowLayout flowLayout = new FlowLayout();
        //frame.setLayout(flowLayout);

        // GridBagLayout 설정
        GridBagLayout gridBagLayout = new GridBagLayout();
        frame.setLayout(gridBagLayout);
        GridBagConstraints gbc = new GridBagConstraints();

        // JLabel 4개, JTextField 3개, JButton 1개 메모리에 넣기
        JLabel image1 = new JLabel();
        //image1.setText("            ");
        //image1.setFont(font1);

        JLabel date1 = new JLabel();
        date1.setText("오늘의 날짜");
        date1.setFont(font2);

        JLabel title1 = new JLabel();
        title1.setText("오늘의 제목");
        title1.setFont(font2);

        JLabel text1 = new JLabel();
        text1.setText("오늘의 내용");
        text1.setFont(font2);

        JTextField date2 = new JTextField(10);  // 입력하는 개체
        date2.setFont(font2);

        JTextField title2 = new JTextField(10);
        title2.setFont(font2);

        JTextField text2 = new JTextField(100);
        text2.setFont(font2);

        JButton save = new JButton();
        save.setText("파일에 일기 저장");
        save.setFont(font2);

        // 이미지를 넣을 때는 이미지 아이콘으로 만들어서 버튼에 설정해야함.
        ImageIcon icon1 = new ImageIcon("diary.jpg");
        image1.setIcon(icon1);

        // 배경색 변경
        frame.getContentPane().setBackground(Color.YELLOW);
        //frame.getContentPane().setLayout(null);

        // 색 지정
        date2.setForeground(Color.BLUE);
        title2.setForeground(Color.BLUE);
        text2.setForeground(Color.BLUE);
        save.setForeground(Color.PINK);
        save.setBackground(Color.BLACK);

        // 프레임에 추가
        frame.add(image1);
        frame.add(date1);
        frame.add(date2);
        frame.add(title1);
        frame.add(title2);
        frame.add(text1);
        frame.add(text2);
        frame.add(save);

        // 버튼 동작
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String date3 = date2.getText();
                String title3 = title2.getText();
                String text3 = text2.getText();
                if (date3.length() == 0 || title3.length() == 0 || text3.length() == 0) {
                    JOptionPane.showMessageDialog(frame, "날짜 / 제목 / 내용을 입력하세요.");
                } else {
                    System.out.println("오늘의 날짜 >> " + date3);
                    System.out.println("오늘의 제목 >> " + title3);
                    System.out.println("오늘의 내용 >> " + text3);
                    //JOptionPane.showMessageDialog(frame, "일기 저장 완료");
                    frame.setTitle("일기 저장 완료");

                    // 파일을 만드는 부품
                    // 가지고 온 데이터를 파일에 저장

                    // 파일도 만들어주고, String으로 데이터를 저장까지 해주는 기능의 부품
                    try {// 외부의 파일이나 링크와 연결되려면 대비책으로 예외처리를 해줘야 함
                        FileWriter file = new FileWriter(date3 + ".txt");
                        file.write(date3 + "\n");
                        file.write(title3 + "\n");
                        file.write(text3 + "\n");
                        file.close();   // 닫지 않으면 String이 메모리에 계속 남아있음
                    } catch (IOException ex) {
                        System.out.println("파일과 관련된 문제가 생김.");
                        //throw new RuntimeException(ex);
                    }

                    // 입력한 내용 지우기
                    date2.setText("");
                    title2.setText("");
                    text2.setText("");
                }
            }
        });

        // GridBagLayout을 사용한 컴포넌트 배치
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // 이미지를 가운데로 정렬
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(image1, gbc);

        gbc.anchor = GridBagConstraints.WEST; // 나머지 컴포넌트들은 왼쪽 정렬

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(date1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(date2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(title1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(title2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(text1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        frame.add(text2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 0;
        frame.add(save, gbc);

        // 마지막
        frame.setVisible(true);
    }
}
