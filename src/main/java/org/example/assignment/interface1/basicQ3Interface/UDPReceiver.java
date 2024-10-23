package org.example.assignment.interface1.basicQ3Interface;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(7500);
        System.out.println("받는 쪽 소켓 시작 ");

        //byte[] data = new byte[256];
        byte[] data = new byte[1024];  // 최대 데이터 크기로 배열을 준비

        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("받을 준비 끝 ");


        socket.receive(packet);

        // 실제 받은 데이터의 길이를 사용하여 데이터 처리
        int length = packet.getLength();  // 실제 받은 데이터의 길이
        String receivedData = new String(data, 0, length);  // 데이터의 유효한 부분만 String으로 변환

        System.out.println("받은 데이터: " + new String(receivedData));
        socket.close();
    }
}

/*
packet.getLength(): DatagramPacket 객체에서 받은 실제 데이터의 길이를 반환합니다.
                    이를 통해 고정된 크기의 배열에서 필요한 만큼의 데이터만을 가져올 수 있습니다.

new String(data, 0, length): 받은 데이터를 바이트 배열에서 유효한 부분
                             (즉, 실제 받은 데이터 크기만큼)만 String으로 변환합니다.
 */