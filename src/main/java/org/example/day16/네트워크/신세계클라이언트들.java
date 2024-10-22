package org.example.day16.네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class 신세계클라이언트들 {
    public static void main(String[] args) throws IOException {
        // ip + port 필요!
        // ip는 컴퓨터를 따라감. port: 5000
        for (int i = 0; i < 1000; i++) {
            Socket client = new Socket("localhost", 5000);
            System.out.println(i + 1 + "번 클라이언트가 접속함");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // buffer : 임시 기억(저장) 장치
            String data = bufferedReader.readLine();
            System.out.println("서버로 부터 받은 데이터 >> " + data);
        }
        //Socket client = new Socket("localhost", 5000);
        //System.out.println("클라이언트가 접속함");
    }
}
