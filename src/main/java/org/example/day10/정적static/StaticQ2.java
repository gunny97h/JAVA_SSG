package org.example.day10.정적static;
// 1013-NEW01-STATIC Q2
public class StaticQ2 {
    String what;
    int time;
    String where;
    static int time2;
    static int n;

    public StaticQ2(String what, int time, String where){
        this.what = what;
        this.time = time;
        this.where = where;
        time2 = time2 + time;
        n++;
    }

    //double avg = time2/n;

    public String time1() {
        return "전체 시간 : " + time2;

    }

    public String avg() {
        return "평균 시간 : " + (double)(time2 / n);

    }

    public String toString() {
        return "what='" + what + '\'' + ", time=" + time + ", where='" + where + '\'' + '}';
    }
}

/*
public class Day {
    private String activity;
    private int hours;
    private String location;

    private static int totalHours = 0;
    private static int totalDays = 0;

    public Day(String activity, int hours, String location) {
        this.activity = activity;
        this.hours = hours;
        this.location = location;

        totalHours += hours;
        totalDays++;
    }

    public static int getTotalHours() {
        return totalHours;
    }

    public static double getAverageHours() {
        return (double) totalHours / totalDays;
    }

    @Override
    public String toString() {
        return activity + " " + hours + "시간, 장소: " + location;
    }
}
 */