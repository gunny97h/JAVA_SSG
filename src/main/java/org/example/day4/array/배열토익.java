package org.example.day4.array;

import java.util.Random;

public class 배열토익 {
    public static void main(String[] args) {
        // 1. 답안 배열, 내 답 배열
        // 2. Random 이용해서 1~4까지 범위로 하여 배열에 990개를 넣으세요.
        // 3. 답안과 내 답의 인덱스 값을 각각 비교해서 맞으면 1점!
        // 4. 총점을 출력해주세요!


        // 블록 잡지 않고 한 줄 복사 [Ctrl + D]
        // 블록 잡지 않고 한 줄 삭제 [Ctrl + Y]

        int[] answer = new int[990];
        int[] myAnswer = new int[990];
        Random r = new Random();
        int jumsu = 0;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = r.nextInt(4) + 1;
            myAnswer[i] = r.nextInt(4) + 1;
        }

        System.out.println("번호 : 답안 : 내답");
        for (int i = 0; i < answer.length; i++) {
            System.out.println(i +"  :  " + answer[i] + "  <->  " + myAnswer[i] + " ");
            if (answer[i] == myAnswer[i]) {
                jumsu++;
            }
        }
        System.out.println("내 점수: " + jumsu);
    }
}
