package org.example.dayQ.day13;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exception2 { // 파일에저장예외처리.java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("파일명 입력 >> ");  // test.txt
        String filename = sc.nextLine();
        System.out.print("파일 내용 입력 >> "); // 목요일!
        String text = sc.nextLine();


        String fn = "C:\\dataSSG\\" + filename + ".txt";

        try (PrintWriter writer = new PrintWriter(fn)) {
            writer.println("내용: " + text);
            System.out.println("일기가 저장되었습니다: " + fn);
        } catch (IOException e) {
            System.out.println("파일 쓰기에 실패했습니다.");
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
