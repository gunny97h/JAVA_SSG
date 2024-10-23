package org.example.assignment.interface1.basicQ3Interface;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket();

        InetAddress ip = InetAddress.getByName("127.0.0.1");

        String s = "I am a android programmer!";
        byte[] data = s.getBytes();

        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7500);
        socket.send(packet);
        System.out.println("클라이언트 포트 >> " + packet.getPort());
        socket.close();
    }
}
