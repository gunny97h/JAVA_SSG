package org.example.day17.네트워크;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        // 1. 보내는 전화기 역할의 부품  --> DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        // 2. 주소: ip(InetAddress) + port(int)
        InetAddress ip = InetAddress.getByName("127.0.0.1");  // 127.0.0.1 == localhost
        // 램의 어느 주소에 부품이 있는 줄을 알면, 그걸 쓰면 됨.
        // 없으면, new 생성해서 넣어줌.
        // DatagramSocket ds = new DatagramSocket();

        // 3. 보낼 데이터: String --> byte[]
        String s = "I am a java programmer...";
        byte[] data = s.getBytes();
        // 4. 패킷 --> DatagramPacket(데이터, 주소)
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
        // 5. 소켓으로 패킷을 전송.
        socket.send(packet);
        System.out.println("패킷을 보냄.");
        // 6. 소켓 자원해제.
        socket.close();
    }
}
