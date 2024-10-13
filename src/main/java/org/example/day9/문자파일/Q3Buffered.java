package org.example.day9.문자파일;

/*
3. start1 프로젝트 아래
    c:/new_java/start1/build.gradle파일을
    버퍼에 넣어 한 줄씩 읽어와서
    프린트하고
    System.nanoTime()으로 처리 시간을 계산하여 출력
*/

import java.io.*;

public class Q3Buffered {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:\\new_java\\start1\\build.gradle");
            Reader reader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedReader bf2 = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\dataSSG\\data.txt")));

            System.out.println("\n============================================\n");
            long start = System.nanoTime();
            while (true) {
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            bf.close();  // 상위 객체인 BufferedReader를 먼저 닫고,
            reader.close(); // 그다음 차례로 Reader와 InputStream을 닫는 방식이 안전한 방법입니다.
            is.close();

            long end = System.nanoTime();
            System.out.println("Time >> " + (end-start));
            System.out.println("\n============================================");

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
