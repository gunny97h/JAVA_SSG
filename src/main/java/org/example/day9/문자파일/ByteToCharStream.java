package org.example.day9.문자파일;

import java.io.*;

// pdf p.86
public class ByteToCharStream {
    // 글자를 써서, 파일에 저장하고 싶습니다.
    // --> FileWriter
    // 글자를 써서, 네트워크로 전송해야한다.
    // 네트워크 전송은 1byte 단위로 전송할 예정
    // 글자를 써서 바이트배열로 변환 후,
    // --> 바이트배열을 바이트스트림으로 저장!
    public static void main(String[] args) {
        // 파일에 쓰기(String으로 작성 --> byte로 저장)
        try {
            OutputStream os = new FileOutputStream("C:\\dataSSG\\data.txt");
            // 2바이트를 1바이트로 바꿔서 저장  // 네트워크로 보낼 때 사용 // UTF-8로 형식 지정
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write("안녕!!!\n 얍\n abc");
            writer.flush();
            writer.close();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();  // 자세한 에러정보를 프린트!
        }

        // 파일 읽어오기(byte단위로 전송됨.)
        // surround-with 코드 완성(Ctrl + Alt + T)
        try {
            InputStream is = new FileInputStream("C:\\dataSSG\\data.txt");
            Reader reader = new InputStreamReader(is);  // 문자 단위로 처리
            char[] data = new char[100];
            int num = reader.read(data);
            String str = new String(data, 0, num);
            System.out.println(str);
        }// (FileNotFoundException e) --> 파일이 없을 때만 에러처리 // 이것만 사용하면 read에 에러
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
