package org.example.day11.static1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 포맷팅지정 {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df;

        // 정수 자리까지 표기
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        // 무조건 소수 첫째 자리까지 표기
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));

        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));
    }
}
