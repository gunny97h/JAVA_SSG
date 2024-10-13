package org.example.day4.array;

public class 배열비교 {
    public static void main(String[] args) {
        String[] title = {"국어", "수학", "영어", "컴퓨터", "음악"};
        int[] n1 = {44, 66, 77, 22, 11};
        int[] n2 = {33, 55, 77, 22, 40};

        // 1. 1학기, 2학기 동일한 점수인 과목수, 동일하지 않은 점수인 과목수
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < title.length; i++) {
            if (n1[i] == n2[i]) {
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("성적이 동일한 과목 개수: " + count1);
        System.out.println("성적이 동일하지 않은 과목 개수: " + count2);

        // 2. 2학기에 성적이 오른 과목수
        int count3 = 0;
        for (int i = 0; i < title.length; i++) {
            if (n1[i] < n2[i]) {
                count3++;
                // System.out.println(title[i]);
            }
        }
        System.out.println("성적이 오른 과목 개수: " + count3);

        // 3. 2학기에 성적이 오른 과목명
        System.out.print("성적이 오른 과목명: ");
        for (int i = 0; i < title.length; i++) {
            if (n1[i] < n2[i]) {
                System.out.print(title[i] + " ");
            }
        }

    }
}
