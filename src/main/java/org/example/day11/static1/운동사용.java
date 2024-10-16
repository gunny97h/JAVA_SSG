package org.example.day11.static1;
/*
1. 운동 클래스 정의
   static int count;
   private static int sum;
// 인스턴스 변수는 2번을 보고 선언해주세요.
   getTime()이라는 이름으로 static메서드 정의(선언)
2. 운동사용 클래스 정의
   main()메서드 내에서
   운동 w1 = new 운동("테니스", "친구", 3); //숫자는 시간임
   운동 w2 = new 운동("러닝", "동네모임", 2);
   2-1)w1, w2의 구체적인 내용을 각각 프린트
   2-2)운동을 총 몇 번이나 했는지 프린트(static변수 이용)
   2-3)운동을 총 몇 시간이나 했는지 프린트(운동.getTime()이용)
 */
public class 운동사용 {
    public static void main(String[] args) {

        운동 ex1 = new 운동("테니스", "친구", 3);
        운동 ex2 = new 운동("러닝", "동네모임", 2);

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(운동.count);
        System.out.println(운동.getCount());
        System.out.println(운동.getTime());


    }
}