package org.example.day6.array3;

import javax.swing.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();            //프레임 만들기
        frame.setSize(300, 300);   //프레임 크기 설정
        frame.setTitle("그래픽 연습");
        // 창 닫기 버튼을 클릭하면 프로그램 종료
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //(EXIT_ON_CLOSE = 3) ==> 상수값

        JButton button = new JButton();     //버튼 사용하기
        button.setText("나를 눌러!");     //함수, 메서드, 명령어 ==> 명령어(입력데이터);
        frame.add(button);      //버튼 추가하기

        //맨 끝!
        frame.setVisible(true); // 보이게 만들기

    }
}//comit
