package org.example.day8.class사용;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class 입력스트림2 {
    public static void main(String[] args) {

        //==> p. 77 : 읽어와 배열에 저장 후 배열을 프린트(imsi2.txt)

        try {
            InputStream is = new FileInputStream("C:\\dataSSG\\imsi2.txt");

            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data);

                if (num == -1) { break; }

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }

            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 자세하게 프린트
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
