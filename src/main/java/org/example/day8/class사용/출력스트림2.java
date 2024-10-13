package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림2 {
    public static void main(String[] args) {

        //==> p. 73-1 : 1바이트 배열로 써서 파일 생성(imsi2.txt)

        try {
            OutputStream os = new FileOutputStream("C:\\dataSSG\\imsi2.txt");
            byte[] array = {10, 20, 30, 40};
            os.write(array);

            os.flush();
            os.close();

        } catch (Exception e) {
            e.printStackTrace(); // 자세하게 프린트
        }
    }
}
