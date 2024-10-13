package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열패턴문제4 {
    public static void main(String[] args) {
        // 1. ppt p.48 성적변동문제
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};
        int count1 = 0;
        int count2 = 0;
        // 1-1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
        // 1-2. 성적이 1,2학기 동일한 학생의 수를 카운터해서 프린트
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] < term2[i] ) {
                count1++;
            }
            else if (term1[i] == term2[i]) {
                count2++;
            }
        }
        System.out.println("성적이 2학기에 향상된 학생의 수 : " + count1);
        System.out.println("성적이 1,2학기 동일한 학생의 수 : " + count2);


//        2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        숫자 입력 : 55
//        숫자 입력 : 77
//        숫자 입력 : 11
//                ----------------
//        합계 143
//        평균 47.666666667

        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("숫자 입력 : ");
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + (double)sum / num.length);


//        3. int[] n = new int[1000];
//        random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
//        3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
//        3-2. 전체 합계와 평균 출력
        int[] n = new int[1000];
        Random r = new Random(44);
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
        }
        System.out.println(Arrays.toString(n));
        int sum1 = 0;
        sum1 = sum1 + n[0];
        sum1 = sum1 + n[2];
        sum1 = sum1 + n[4];
        sum1 = sum1 + n[99];
        sum1 = sum1 + n[989];
        System.out.println("첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 : " + sum1);

        int sum2 = 0;
        for (int i = 0; i < n.length; i++) {
            sum2 = sum2 + n[i];
        }
        System.out.println("합계 : " + sum2);
        System.out.println("평균 : " + sum2/n.length);

//        4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
//        가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
//        당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.


        String[] location = {"백두산", "한라산", "후지산"};
        String[] tran = {"열차", "배", "비행기"};
        System.out.print("가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> ");
        int choice = sc.nextInt();
        System.out.println("당신이 가고 싶은 곳인 " + location[choice - 1] + "은 " + tran[choice - 1] + "를 타고 가야합니다.");
        sc.close();


//        5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
//        80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력

        int[] num2 = new int[1000];
        Random r2 = new Random(555);
        int count01 = 0;
        int count02 = 0;
        int count03 = 0;
        int count04 = 0;
        for (int i = 0; i < num2.length; i++) {
            num2[i] = r2.nextInt(100) + 1;
            if (num2[i] >= 80) {
                count01++;
            }else if (num2[i] >= 70) {
                count02++;
            }else if (num2[i] >= 50) {
                count03++;
            }else {
                count04++;
            }
        }
        System.out.println(count01);
        System.out.println(count02);
        System.out.println(count03);
        System.out.println(count04);
    }
}
