package org.example.day15.형변환참조;

import javax.swing.*;
import java.util.ArrayList;

public class 참조형3 {
    public static void main(String[] args) {

        JFrame f1 = new JFrame();
        JFrame f2 = new JFrame();
        JButton b1 = new JButton();
        JLabel l1 = new JLabel();
        JTextField t1 = new JTextField();
        JTextArea t2 = new JTextArea();
        ArrayList list = new ArrayList();

        f1.add(f2);
        f1.add(b1);
        f1.add(l1);   // f1.add(Component comp)
        f1.add(t1);   // Component(부모, 큰) <-- JButton(자식, 작)
        f1.add(t2);   // --> 자동형변환

        //f1.add(list); // 크다/작다 관계가 성립X (상속관계 X)
        // --> 참조형 형변환은 상속 관계일때만 가능
    }
}
