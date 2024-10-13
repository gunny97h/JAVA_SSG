package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        // 입력할 때 자동으로 년원일, 시분초로 구해주고 싶다.
        // 명확하지 않아서 자동 import x
        Date date = new Date();
        int year = date.getYear() + 1900;   // 년
        int month = date.getMonth() + 1;    // 월
        int date1 = date.getDate();         // 일
        int day = date.getDay();            // 요일
        int hour = date.getHours();         // 시
        int minute = date.getMinutes();     // 분
        int second = date.getSeconds();     // 초

        System.out.println(year + " " + month + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);
        // 년도에서 1900년은 생략되므로 1900을 더함

        //오늘 무슨 요일인가요? 프린트

        switch (day){
//            case 0:
//                System.out.println("일요일");
//                break;
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            default:
                System.out.println("일요일");
                break;
        }
    }
}
