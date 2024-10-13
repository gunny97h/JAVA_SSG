package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림3 {
    public static void main(String[] args) {

        //==> p. 73-2 : 1바이트 배열로 써서 특정 구간만 파일 생성(imsi3.txt)

        try {
            OutputStream os = new FileOutputStream("C:\\dataSSG\\imsi3.txt");

            byte[] array2 = {10, 20, 30, 40, 50};
            os.write(array2, 1, 3);

            os.flush();
            os.close();

        } catch (Exception e) {
            e.printStackTrace(); // 자세하게 프린트
        }
    }
}
