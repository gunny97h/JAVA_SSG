package org.example.day8.class사용;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class 파일에저장 {
    public static void main(String[] args) {
        // 날짜, 제목, 내용을 입력해서
        // 날짜별 파일에 저장
        // 위치는 c:/dataSSG/날짜.txt로 저장


        //String s1 = JOptionPane.showInputDialog("날짜 입력");
        //String s2 = JOptionPane.showInputDialog("제목 입력");
        //String s3 = JOptionPane.showInputDialog("내용 입력");
        Date date = new Date();
        String ymd = date.getYear() + 1900 + "" + (date.getMonth() + 1) + "" + date.getDate();
        System.out.println(ymd);
        String hms = date.getHours() + "" + date.getMinutes() + "" + date.getSeconds();
        System.out.println(hms);
        String s1 = ymd + hms;

        String s = JOptionPane.showInputDialog("제목 - 내용 순서대로 입력");
        System.out.println(s); // 내일은 금요일 - 모레는 토요일이닷!
        String[] total = s.split("-"); // {"내일은 금요일", "모레는 토요일이닷!"}
        String s2 = total[0];
        String s3 = total[1];


        // 파일 생성하고 s1, s2, s3를 저장하고 싶음.
        try {                                                                      // image: 1byte
            FileWriter f = new FileWriter("C:\\dataSSG\\" + s1 + ".txt"); // char: 2byte 단위로 처리

            f.write(s1 + "\n");
            //f.write(s2 + "\n");
            //f.write(s3 + "\n");
            for (String x : total) {
                f.write(x + "\n");
            }

            f.close(); // Stream(강물) --> 정식 명칭
            // 연결(connection), 통로 닫기(자바-외부파일/네트워크 연결)

        } catch (IOException e) {
            System.out.println("파일 다룰 때 에러가 발생함.");
            e.printStackTrace();    // 에러 정보 구체적으로 프린트!
            System.out.println(e.getMessage()); // 에러 정보 간단하게 스트링으로 리턴!
            //throw new RuntimeException(e);
        }
    }
}
