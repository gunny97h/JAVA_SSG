package org.example.day9.문자파일;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileTest1 {
    public static void main(String[] args) {
        //파일에 쓰기(String --> byte변환 저장)
        /*
        try {
            OutputStream os = new FileOutputStream("c:/data/data.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write("안녕!!!");
            writer.flush();
            writer.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();//자세히 에러정보를 프린트!
        }
        */


        //파일 읽어오기(byte단위 전송됨.)
        //surround-with 코드 완성(컨트롤+알트+T)
        try {
            InputStream is = new FileInputStream("c:/dataSSG/공부.txt");
            Reader reader = new InputStreamReader(is);
            long start = System.nanoTime();
            char[] data = new char[10];
            while (true) {
                int num = reader.read(data);
                if(num == -1) break;
                String str = new String(data, 0, num);
                System.out.println(str);
            }

            is.close();
            reader.close();
            long end = System.nanoTime();
            System.out.println(end-start);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

