package org.example.day16.네트워크;

import java.io.IOException;
import java.net.ServerSocket;

public class 신세계서버2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000); // 포트 번호는 달라야 함.
        // ip는 컴퓨터 따라감.
        while (true) {
            System.out.println("서버가 돌아가는 중...");
            server.accept();
            System.out.println("승인이 떨어짐...");
        }
    }
}
