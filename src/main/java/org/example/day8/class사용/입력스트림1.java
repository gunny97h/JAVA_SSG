package org.example.day8.class사용;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class 입력스트림1 {
    public static void main(String[] args) {

        //==> p. 75 : 1바이트씩 파일에서 읽어와 프린트(imsi.txt)

        try {
            InputStream is = new FileInputStream("C:\\dataSSG\\imsi.txt");

            while (true) {
                int data = is.read();

                if (data == -1) {
                    break;
                }
                System.out.println(data + " ");
            }
            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 자세하게 프린트
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
