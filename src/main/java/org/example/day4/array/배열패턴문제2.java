package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열패턴문제2 {
    public static void main(String[] args) {
        // ppt p.38  배열에 입력 후 최대값 구하기

        Scanner sc = new Scanner(System.in);   // 콘솔로 입력만 가능, 콘솔에 출력은 불가능 stream이라고 함
        int[] save = new int[5];
        for (int i = 0; i < save.length; i++){
            System.out.print("숫자 입력>> ");
            save[i] = sc.nextInt();             // 모든 입력은 String --> int로 변경하는 기능으로 포함
        }
        System.out.println(Arrays.toString(save));
        Arrays.sort(save);    // 오름차순 정렬  // 데이터가 많을 경우 시간복잡도가 높아 쓰이지 않음
        System.out.println("최소값: " + save[0]);
        System.out.println("최대값: " + save[save.length - 1]);

        // 해당 인덱스까지 최대값 넣는 변수 필요
        int max = save[0];  // int max = 0 으로 초기화하면 x, 최대값이 음수일 수 있기 때문에.
        for (int i = 1; i < save.length; i++){  // 인덱스[1]부터 시작
            if (max < save[i]){
                max = save[i];
            }
        }
        System.out.println("다른 방법>> " + max);

        sc.close();                            // Stream 닫힘. 맨 끝에 위치!


    }
}
