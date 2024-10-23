package org.example.assignment.interface1.basicQ2Interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            Socket client = new Socket("localhost", 5500);
            System.out.println(i + "번:  클라이언트가 " + client.getPort() + "포트 서버에 연결을 요청함.");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String data = bufferedReader.readLine();
            System.out.println("서버로 부터 받은 데이터 >> " + data);
        }
    }
}

/*
package com.example.basic_q2_interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws Exception {
        for (int j = 0; j < 10000; j++) {
            Socket socket = new Socket("localhost", 9100);
            System.out.println("client=> " + j + " 서버와 연결됨.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String data = input.readLine();
            System.out.println("받은 데이터: " + data);
            System.out.println("클라이언트 포트>> " + socket.getLocalPort());
        }
    }
}
*/