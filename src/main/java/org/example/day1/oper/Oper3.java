package org.example.day1.oper;

import javax.swing.*;

public class Oper3 {
    public static void main(String[] args) {
        /*
Quiz:

정수1 입력 --> a변수 저장, 333
정수2 입력 --> b변수 저장, 222

입력을 받은 데이터를 int로 각각 변환하여 a2, b2로 저장
두 입력값의 평균을 구하시오.(실수로)

*/

        String a = JOptionPane.showInputDialog("정수A를 입력하시오.");
        String b = JOptionPane.showInputDialog("정수B를 입력하시오.");

        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        double avg = ((double)a2 + b2) / 2; // 내가 쓴 방법
// double avg = (a2 + b2) / 2.0;    // 간결해 보이는 방법
        System.out.println("두 입력값의 평균: " + avg);

        JOptionPane.showMessageDialog(null, "평균은 "+avg);
    }
}
