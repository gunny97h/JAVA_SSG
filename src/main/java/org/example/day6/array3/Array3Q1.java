package org.example.day6.array3;

import java.util.Random;
import java.util.Scanner;

public class Array3Q1 {
    public static void main(String[] args) {
        String[] movie = {"인사이드 아웃2", "데드풀과 울버린", "콰이어트 플레이스: 첫째 날", "너의 이름은.", "초속5센티미터"};
        int[] view = new int[movie.length];
        Random r = new Random();
        for (int i = 0; i < movie.length; i++) {
            view[i] = r.nextInt(100000);
        }

        //버블정렬
        for (int i = 0; i < view.length - 1; i++) {
            for (int j = 0; j < view.length - 1 - i; j++) {
                if (view[j] < view[j + 1]) { // 내림차순
                    // 조회수 배열 정렬
                    int tempView = view[j];
                    view[j] = view[j + 1];
                    view[j + 1] = tempView;

                    // 영화 배열도 같은 순서로 정렬
                    String tempMovie = movie[j];
                    movie[j] = movie[j + 1];
                    movie[j + 1] = tempMovie;
                }
            }
        }
        //

        for (int i = 0; i < movie.length; i++) {
            System.out.println(i+1 + ". " + movie[i] + "- 조회수: " + view[i]); //i+1에 ()
        }

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("\n정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5 / 0 => 종료): ");
            int choice = sc.nextInt();
            if (choice > 0 && choice < movie.length + 1) {
                System.out.println("선택한 영화: " + movie[choice-1] + "\n조회수: " + view[choice-1]);
            }else if (choice == 0) {
                System.out.println("종료");
                break;
            }else {
                System.out.println("1-5 중 선택하세요.");
            }
        }
        sc.close();

    }
}
//comit