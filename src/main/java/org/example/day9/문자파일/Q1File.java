package org.example.day9.문자파일;

/*
1. 파일 복사
    c:/dataSSG/공부.txt를
    c:/dataSSG/공부2.txt로 복사
2. Q3 문제(도서관 관리 프로그램)
    Book, Main2 클래스를 만들어서
    Book 2권 등록하고
    아래에 등록된 도서관 책 목록 프린트
    메모리 그림으로 그려보세요.
3. start1 프로젝트 아래
    c:/new_java/start1/build.gradle파일을
    버퍼에 넣어 한 줄씩 읽어와서
    프린트하고
    System.nanoTime()으로 처리 시간을 계산하여 출력
*/

import java.io.*;

public class Q1File {
    public static void main(String[] args) {
        // 파일 가져오기
        try {
//            InputStream is = new FileInputStream("C:\\dataSSG\\data.txt");
//            Reader reader = new InputStreamReader(is);
//            BufferedReader bf = new BufferedReader(reader);
            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\dataSSG\\공부.txt")));

            OutputStream os = new FileOutputStream("C:\\dataSSG\\공부2.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            while (true) {
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);

                writer.write(line + "\r\n");

            }
            writer.flush();
            writer.close();
            os.close();
//            is.close();
//            reader.close();
            bf.close();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
