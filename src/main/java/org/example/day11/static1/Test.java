package org.example.day11.static1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] n = {3, 5, 7, 9, 1};
        // 정렬! 오름차순!
        Arrays.sort(n); // static 메서드 // 파괴형 메서드 (원본을 바꿈)

        System.out.println(Arrays.toString(n));

        System.out.println(n);

        String s = Arrays.toString(n);  // 비파괴형 메서드
        System.out.println(s);


        System.out.println("\n");
        Random r = new Random();
        System.out.println(r.nextDouble() + "\n");

        for (int i = 0; i < 5; i++) {
            double n2 = Math.random();  // return double
            System.out.println(n2);
            // 0 ~ 0.9999...
            double n3 = n2 * 10;
            System.out.println(Math.floor(n3));
            System.out.println(Math.round(n3));
        }

        System.out.println("\n");
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(Calendar.YEAR);
        System.out.print(cal.get(Calendar.YEAR) + "년 ");
        System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");
        System.out.print(cal.get(Calendar.DATE) + "일 ");
        System.out.print(cal.get(Calendar.HOUR) + "시 ");
        System.out.print(cal.get(Calendar.MINUTE) + "분 ");
        System.out.print(cal.get(Calendar.SECOND) + "초 ");
        System.out.println(cal.get(Calendar.AM_PM));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.plusWeeks(2));

        System.out.println(localDateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        System.out.println(dtf.format(localDateTime));

        LocalDateTime myDateTime = LocalDateTime.of(2000, 1, 1, 0,0, 0);
        System.out.println(dtf.format(myDateTime));
        System.out.println(myDateTime.plusYears(18));

    }
}

/*
int[] n = {3, 5, 7, 9, 1};
        //정렬! 오름차순!
        Arrays.sort(n); //파괴형메서드
        System.out.println(Arrays.toString(n));
        System.out.println(n);

        String s = Arrays.toString(n); //비파괴형메서드
        System.out.println(s);

        Random random = new Random();
        System.out.println(random.nextDouble());

        for (int i = 0; i < 5; i++) {
            double n2 = Math.random();
            System.out.println(n2);//double
           // System.out.println(n2 * 100000000);
            //0~0.9999
            System.out.println((int)(n2 * 10) + 1);
        }

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(Calendar.YEAR);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.AM_PM));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.plusWeeks(2));

        System.out.println(localDateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        System.out.println(dtf.format(localDateTime));

        LocalDateTime myDateTime = LocalDateTime.of(2000, 1, 1, 0,0, 0);
        System.out.println(dtf.format(myDateTime));
        System.out.println(myDateTime.plusYears(18));
 */
