package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴 {
    public static void main(String[] args) {
        // 1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기  (배열에 자동으로 데이터 넣기)
        int[] jumsu = new int[5];
        Random r = new Random(100); // 아무 값이나 만들어주는 부품
        // 배열에 값을 넣을 때는 index 필요
        for (int i = 0; i < jumsu.length; i++) {
            // String num = JOptionPane.showInputDialog("숫자 입력");   // 100번 이라고 입력시 ? ==> 예외(에러창)처리,
            // jumsu[i] = Integer.parseInt(num);                      // 자체적으로 처리
            jumsu[i] = r.nextInt(100); // 0~99 범위 내에서
        }
        //for (int x: jumsu) {
        //    System.out.print(x + "\t");
        //}
        System.out.println(Arrays.toString(jumsu));

        // 2. 배열에 있는 값을 꺼내어 누적 (배열의 모든 데이터 처리하기)
        int sum = 0;    // 누적하는 변수는 반복문에 넣지 않음.
        for (int x : jumsu) {
            sum = sum + x;  // 연산자 순서 체크
            // 앞의 sum : 새값까지 누적된 값
            // 뒤의 sum : 이전까지 더해진 값
        }
        System.out.println("전체 합계: " + sum);
        double avg = (double) sum / jumsu.length;
        System.out.println("전체 평균: " + avg);

        // 3. 배열에 있는 값들을 반복해서 처리하는데 조건이 있는 경우 (원하는 데이터만 처리하기)
        int sum2 = 0;           // sum과 다르게 x는 다시 사용해도 되는 이유
        for (int x : jumsu) {   // for문 안에서만 사용하기 때문에 밖에서는 인식 x (지역변수, 전역변수)
            if (x >= 80) {
                sum2 = sum2 + x;
            }
        }
        System.out.println("80점 이상 점수 합계: " + sum2);

        // 4. 배열에 있는 값을 가지고 위치를 찾는 경우 (원하는 데이터 찾기)
        // 위치를 찾기 위해서는 index가 필요
        // for-each 사용 x
        for (int i = 0; i < jumsu.length; i++) {
            // System.out.println(i);
            if (jumsu[i] == 88) {
                // 88이 하나라고 가정 시
                System.out.println("88 찾음 / " + (i+1) + " 번째");
                break;   // if가 아니라 반복문의 break!
            }
            // 순서 찾기시 정렬 후 찾으면 속도가 더 빠름
        }

    }
}
