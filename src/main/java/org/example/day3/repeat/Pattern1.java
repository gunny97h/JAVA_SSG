package org.example.day3.repeat;

import javax.swing.*;

public class Pattern1 {
    public static void main(String[] args) {
        // 숫자 누적
        int sum = 0; // 누적용 변수, 반복문에 넣지 않음.
        for (int i = 100; i < 1000; i++) {
            sum = sum + i;  // sum += i;
        }

// 문자열 누적
        String sum2 = "";  //null에 String을 추가하면 null도 String으로 되기 때문에 문자열 누적에서는 ""로 초기화!
        for (int i = 0; i < 3; i++){
            String data = JOptionPane.showInputDialog("과목 입력");
            sum2 = sum2 + data;   // sum2 += data;
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}
