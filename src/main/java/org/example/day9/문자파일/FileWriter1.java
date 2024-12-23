package org.example.day9.문자파일;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriter1 {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("C:\\dataSSG\\test.txt");

            // 1 문자씩 출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            // 버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
            writer.flush();

            // 출력 스트림을 닫고 메모리 해제
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
