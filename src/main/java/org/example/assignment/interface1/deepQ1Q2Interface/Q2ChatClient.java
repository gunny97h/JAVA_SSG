package org.example.assignment.interface1.deepQ1Q2Interface;

public class Q2ChatClient {
}
/*
package com.example.deep_q1_q2_interface;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class q2_ChatClient {
    static  DatagramSocket socket = null;
    public static void main(String[] args) {
        try {
            socket = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName("localhost");
            byte[] receiveData = new byte[1024];

            // 수신 쓰레드
            Thread receiveThread = new Thread(){
                @Override
                public void run() {
                    try {
                        while (true) {
                            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                            socket.receive(receivePacket);
                            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                            System.out.println(message);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            receiveThread.start();

            // 송신 쓰레드
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = scanner.nextLine();
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
 */