package org.example.day11.review;
// 1013-NEW01-STATIC Q1
public class Day사용 {
    public static void main(String[] args) {  // 객체 생성과 상관 없이 아무데서나 사용 가능
        System.out.println(Day.getAvg());
        System.out.println(Day.count);

        Day day1 = new Day("공부", 8, "삼성동");
        System.out.println(day1);
        //System.out.println(day1.toString()); // 명시적 호출도 상관 없음

        Day day2 = new Day("산책", 2, "선정릉");
        System.out.println(day2);

        Day day3 = new Day("가만히있기", 8, "삼성동");
        System.out.println(day3);

        System.out.println(Day.count);
        System.out.println(Day.sum);
        System.out.println(Day.getAvg());
    }
}
