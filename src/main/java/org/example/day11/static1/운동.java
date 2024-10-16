package org.example.day11.static1;


public class 운동 {
    String doing;
    String with;
    int time;
    static int count;
    private static int sum;

    public 운동(String doing, String with, int time) {
        this.doing = doing;
        this.with = with;
        this.time = time;

        count++;
        sum = sum + time;
    }

    public static String getCount() {
        return "총 운동 횟수 : " + count;
    }

    public static String getTime() {
        return "총 운동 시간 : " + sum;
    }

    public String toString() {
        return "운동{" +
                "doing='" + doing + '\'' +
                ", who='" + with + '\'' +
                ", time=" + time +
                '}';
    }
}
