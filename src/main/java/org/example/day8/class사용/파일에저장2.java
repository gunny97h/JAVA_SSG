package org.example.day8.class사용;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class 파일에저장2 {
    public static void main(String[] args) {
        //주말동안 할 일 입력받아 저장
        //할 일이 "운동"이면 파일명은 "운동.txt"
        //저장 위치는 c:/data/운동.txt로 생성되게 하시오.
        //입력은 2회 받음.
        //1. 주말동안 할 일은?(예, 운동, 코딩, 여행 등)
        //                  운동
        //2. 구체적인 내용 입력?(예, 장소-시간-내용을 입력)
        //                  잠실운동장-2시간-뛰기
        //파일은 3개 이상 만들어지도록 처리

        // 입력 --> 처리 --> 출력 순으로
        String s1 = JOptionPane.showInputDialog("1. 주말동안 할 일은? (예, 운동, 코딩, 여행 등)");
        String s2 = JOptionPane.showInputDialog("2. 구체적인 내용 입력? (예, 장소-시간-내용을 입력)");
        String[] total = s2.split("-"); // {"내일은 금요일", "모레는 토요일이닷!"}

        System.out.println(total.length);
        System.out.println(Arrays.toString(total));

        String s3 = total[0];
        String s4 = total[1];
        String s5 = total[2];

        Date date = new Date();
        String ymd = date.getYear() + 1900 + "-" + (date.getMonth() + 1) + "-" + date.getDate();
        String hms = date.getHours() + "-" + date.getMinutes() + "-" + date.getSeconds() + "\n";
        String time = hms + ymd;

        try {
            FileWriter f = new FileWriter("C:\\dataSSG\\" + s1 + ".txt");
            for (String x : total) {
                f.write(x + "\n");
            }
            f.write("\n" + time);
            f.close();

        } catch (IOException e) {
            System.out.println("파일 다룰 때 에러가 발생함.");
            e.printStackTrace();    // 에러 정보 구체적으로 프린트!
        }

        System.out.println("저장 끝");
    }
}
