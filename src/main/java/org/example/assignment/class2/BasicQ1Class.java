package org.example.assignment.class2;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class BasicQ1Class {
    public static void main(String[] args) {
//        String id1 = "root";
//        String pw1 = "1234";  --> 변수 없이 "".equals()

        // - 입력을 미리 받은 후 파일 입력


        Scanner sc = new Scanner(System.in);

        System.out.print("ID를 입력하세요: ");
        String id = sc.nextLine();
        System.out.print("PW를 입력하세요: ");
        String pw = sc.nextLine();

        //String date = "";

        if ("root".equals(id) && "1234".equals(pw)) {
            System.out.println("일기 작성을 시작합니다.");
            System.out.println("날짜를 입력하세요 (예: 20241015): ");
            String date = sc.nextLine();


            try {
                OutputStream os = new FileOutputStream("C:\\dataSSG\\" + date + ".txt");
                // 2바이트를 1바이트로 바꿔서 저장  // 네트워크로 보낼 때 사용 // UTF-8로 형식 지정
                Writer writer = new OutputStreamWriter(os, "UTF-8");


                writer.write("날짜: " + date + "\n");
                // 일기 내용 입력 받기
                System.out.println("제목을 입력하세요: ");
                String Title = sc.nextLine();
                writer.write("제목: " + Title+ "\n");

                System.out.println("내용을 입력하세요: ");
                String Content = sc.nextLine();
                writer.write("내용: " + Content+ "\n");

                writer.flush();
                writer.close();
                os.close();

            } catch (Exception e) {
                e.printStackTrace();  // 자세한 에러정보를 프린트!
            }
        }else {
            System.out.println("ID 또는 PW가 잘못되었습니다.");
        }

        sc.close();
    }
}

/*
package com.example;

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class basic_q1_class {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("ID를 입력하세요:");
            String id = scanner.nextLine();
            System.out.println("비밀번호를 입력하세요:");
            String password = scanner.nextLine();

            if ("root".equals(id) && "1234".equals(password)) {
                System.out.println("일기 작성을 시작합니다.");

                System.out.println("날짜를 입력하세요 (예: 20230612):");
                String date = scanner.nextLine();
                System.out.println("제목을 입력하세요:");
                String title = scanner.nextLine();
                System.out.println("내용을 입력하세요:");
                String content = scanner.nextLine();

                String filename = date + ".txt";

                try (PrintWriter writer = new PrintWriter(filename)) {
                    writer.println("제목: " + title);
                    writer.println("내용: " + content);
                    System.out.println("일기가 저장되었습니다: " + filename);
                } catch (IOException e) {
                    System.out.println("파일 쓰기에 실패했습니다.");
                    e.printStackTrace();
                }
            } else {
                System.out.println("ID 또는 비밀번호가 잘못되었습니다.");
            }

            scanner.close();
        }
    }

 */