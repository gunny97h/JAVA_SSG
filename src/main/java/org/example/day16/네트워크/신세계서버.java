package org.example.day16.네트워크;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class 신세계서버 {  // TCP  // NEW01-Java-7(인터페이스+추상+네트워크).pdf  p.53참고
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        // 1. 서버가 start
        // ip는 컴퓨터 따라감.
        int count = 0;
        while (true) {
            System.out.println("서버가 돌아가는 중...");
            // 2. 요청이 들어오면 승인용 서버가 승인을 함.
            //    --> 연결통로(Stream)가 만들어진다.(Socket)
            Socket socket = server.accept();
            //server.accept();
            count++;
            System.out.println("현재까지 " + count + "개 승인이 떨어짐...");
            // 3. 보낼 데이터를 정하자.
            //    Stream으로 연결된 데이터를 보낼 수 있는 부품: PrintWriter
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  // 1byte로 변환해서 보냄
            out.print("나는 자바 프로그래머다!!!");  // 보낼 데이터

            out.close();
            socket.close();  // 연결 닫기
        }
    }
}
