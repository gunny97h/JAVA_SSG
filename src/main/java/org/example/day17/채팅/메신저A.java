package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 메신저A extends JFrame {

    JTextArea list;  // 채팅 리스트(전역변수)

    public 메신저A() throws Exception {
        // 여기에 코드를 다 하면, static이 아니여서 더 좋은 코드를 만들 수 있음.
        System.out.println("생성자 시작.");

        setTitle(" 메신저A ");
        setSize(500, 500);
        getContentPane().setBackground(Color.BLACK);

        list = new JTextArea();  // 채팅 리스트
        JTextField input = new JTextField(); // 채팅 입력창

        // 위치 설정
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);

        // 폰트 및 색상, 채팅창 설정
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setFont(font);
        list.setBackground(Color.GRAY);
        input.setBackground(Color.BLACK);
        list.setForeground(Color.BLACK);
        input.setForeground(Color.GRAY);
        list.setEditable(false);  // textarea에 입력 불가능
        list.setAutoscrolls(true);  // 현재 입력 중인 부분을 화면에 보이게 해줌.
        list.setLineWrap(true);  // 텍스트가 영역의 끝에 도달했을 때 자동으로 줄바꿈.
        input.setAutoscrolls(true);


        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  // Enter시 실행하고 싶은 내용을 쓰자
                // 1. 입력한 값을 가지고 와서
                String data = input.getText();
                // 2. 리스트에 올린다
                list.append("나: " + data + "\n");
                input.setText("");

                // 3. 입력한 내용을 상대방에게 보내기.
                // 전화기 역할인 소켓 필요.
                try {
                    // 소켓 만들기.
                    DatagramSocket socket = new DatagramSocket();
                    // 전송할 데이터를 바이트 배열로 변환 .
                    byte[] data2 = data.getBytes();
                    // 전송할 단위인 데이터그램 패킷으로 만들기
                    InetAddress ip = InetAddress.getByName("127.0.0.1");
                    DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 7777);
                    // 소켓으로 패킷을 보낸 후 통신 종료
                    socket.send(packet);
                    socket.close();

                } catch (Exception ex) {
                    //throw new RuntimeException(ex);
                    System.out.println(ex.getMessage());
                }

            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void process() throws Exception{
        while (true) {
            // 1. 받는 소켓 객체 생성
            // 전화기 역할 소켓 만들고
            DatagramSocket socket = new DatagramSocket(5555);
            // 2. 받는 패킷을 만들어놓아야 한다.
            byte[] data = new byte[30];  // 받은 데이터 저장 장소
            DatagramPacket packet = new DatagramPacket(data, data.length);
            // byte[]를 만들어놓아야 한다.
            // 데이터(바이트배열버퍼, 데이터크기)

            socket.receive(packet);
            System.out.println(packet.getAddress());
            System.out.println(packet.getPort());
            list.append("너: " + new String(data) + "\n"); // byte로 받은 data를 String으로
        }
    }

    public static void main(String[] args) throws Exception {
        메신저A m = new 메신저A();
        m.process();  // 수신 루프 실행
    }
}
