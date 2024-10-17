package org.example.day13.상속;



import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class threadGraphics extends JFrame {
    // 어디서든 접근 가능하게 main 밖에서
    JLabel count, image, day;   // 전역변수
//    카운터스레드2 count2;
//    시각스레드2 day2;
//    배열스레드2 image2;

    public threadGraphics() {
        setSize(700, 500);  // 프레임 만들기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼으로 프로그램 종료하기

        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        Font font = new Font("고딕", Font.BOLD, 30);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        FlowLayout flow = new FlowLayout(); // add()할 때 순서대로 화면에 배치
        setLayout(flow);

        add(count); // JFrame에 넣기.
        add(image);
        add(day);

        카운터스레드2 c = new 카운터스레드2();
        c.start();
        배열스레드2 a = new 배열스레드2();
        a.start();
        시각스레드2 t = new 시각스레드2();
        t.start();


        setVisible(true);   // 맨 끝!
    }   // 생성자 메서드 끝


    // 클래스안에 끼워진 클래스(내부클래스, innerClass)
    // 전역변수를 공유할 목적으로! 많이 사용하면 좋지 않음
    public class 시각스레드2 extends Thread{  // ? : 이름이 같아도 상관없는지?

        public void run(){
            for (int i = 0; i < 3000; i++) {
                //System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date()); // day를 사용하기 위해서 시각스레드 가져옴
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }// 시각스레드2

    public class 카운터스레드2 extends Thread{
        public void run(){
            for (int i = 500; i >= 0; i--) {

                if (i == 500){ //==> 카운터시작할 때 소리
                    Toolkit.getDefaultToolkit().beep();
                }
                //System.out.println("카운터 >> " + i);
                count.setText("카운터 >> " + i + "           ");
                try {
                    Thread.sleep(10); //1초(1000), 500(0.5초)
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
                if (i == 0) { // 0초 되면 창 띄우기
                    JOptionPane.showMessageDialog(count ,"사용시간이 다 되었습니다. 퇴실 부탁드립니다.");
                    dispose(); // JFrame을 닫아버림!
//                    image2.stop();
//                    day2.stop();
                }
            }
        }
    }// 카운터스레드2

    public class 배열스레드2 extends Thread{
        String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        public void run(){
            for (int i = 0; i < foods.length; i++) {
                //System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);   // --> 라벨에 이미지 넣기
                image.setIcon(icon);
                //image.setText("배열 >> " + foods[i]);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }// 배열스레드2
}


/*
package org.example.day13.상속;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class 스레드그래픽 extends JFrame {
    JLabel count, image, day; //전역변수, 아무데서나 접근 가능.
    Thread c, a, t;

    public 스레드그래픽(){
        setSize(700, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        FlowLayout flow = new FlowLayout(); //add()할때 순서대로 화면에 배치!
        setLayout(flow);

        Font font = new Font("궁서", Font.BOLD, 80);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        //Jframe에 끼워넣음.
        add(count);
        add(image);
        add(day);

        c = new 카운터스레드2();
        c.start();
        a = new 배열스레드2();
        a.start();
        t = new 시각스레드2();
        t.start();


        //맨끝!
        setVisible(true);
    } //생성자

    //클래스안에 끼워진 클래스(내부클래스, innerClass)
    //전역변수를 공유할 목적으로!
    public class 시각스레드2 extends Thread{

        public void run(){
            for (int i = 0; i < 3000; i++) {
                System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }

            }
        }
    } //시각스레드2 클래스

    public class 카운터스레드2 extends Thread{
        public void run(){
            for (int i = 5; i > 0; i--) {
                if (i == 5){
                    Toolkit.getDefaultToolkit().beep();
                }
                System.out.println("카운터 >> " + i);
                count.setText("카운터 >> " + i);
                if(i == 1){
                    JOptionPane.showMessageDialog(count, "이제 나갈시간시간입니다.");
                    //dispose(); //Jframe을 닫아버림!
                    a.stop();
                    t.stop();
                }
                try {
                    Thread.sleep(500); //1초(1000), 500(0.5초)
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    } //카운터스레드2

    public class 배열스레드2 extends Thread{
        String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        public void run(){
            for (int i = 0; i < foods.length; i++) {
                System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);
                image.setIcon(icon);
                //image.setText("배열 >> " + foods[i]);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }

}
 */

/* 강사님 수정 코드
import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class threadGraphics extends JFrame {
    JLabel count, image, day; //전역변수, 아무데서나 접근 가능.
    Thread c, a, t;

    public threadGraphics(){
        setSize(700, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        FlowLayout flow = new FlowLayout(); //add()할때 순서대로 화면에 배치!
        setLayout(flow);

        Font font = new Font("궁서", Font.BOLD, 80);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        //Jframe에 끼워넣음.
        add(count);
        add(image);
        add(day);

        c = new 카운터스레드2();
        c.start();
        a = new 배열스레드2();
        a.start();
        t = new 시각스레드2();
        t.start();


        //맨끝!
        setVisible(true);
    } //생성자

    //클래스안에 끼워진 클래스(내부클래스, innerClass)
    //전역변수를 공유할 목적으로!
    public class 시각스레드2 extends Thread{

        public void run(){
            for (int i = 0; i < 3000; i++) {
                System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }

            }
        }
    } //시각스레드2 클래스

    public class 카운터스레드2 extends Thread{
        public void run(){
            for (int i = 5; i > 0; i--) {
                if (i == 5){
                    Toolkit.getDefaultToolkit().beep();
                }
                System.out.println("카운터 >> " + i);
                count.setText("카운터 >> " + i);
                if(i == 1){
                    JOptionPane.showMessageDialog(count, "이제 나갈시간시간입니다.");
                    //dispose(); //Jframe을 닫아버림!
                    a.stop();
                    t.stop();
                }
                try {
                    Thread.sleep(500); //1초(1000), 500(0.5초)
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    } //카운터스레드2

    public class 배열스레드2 extends Thread{
        String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        public void run(){
            for (int i = 0; i < foods.length; i++) {
                System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);
                image.setIcon(icon);
                //image.setText("배열 >> " + foods[i]);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }

}
 */