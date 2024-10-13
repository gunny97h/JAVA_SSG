package org.example.day9.문자파일;

import java.io.*;

public class Buffered1 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\dataSSG\\data.txt");
            Reader reader = new InputStreamReader(is);  // 문자 단위로 처리
//            char[] data = new char[100];  // 버퍼 사용 전 코드
//            int num = reader.read(data);
//            String str = new String(data, 0, num);
//            System.out.println(str);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedReader bf2 = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\dataSSG\\data.txt")));


            while (true) {
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }

            is.close();
            reader.close();
            bf.close();

        }// (FileNotFoundException e) --> 파일이 없을 때만 에러처리 // 이것만 사용하면 read에 에러
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
