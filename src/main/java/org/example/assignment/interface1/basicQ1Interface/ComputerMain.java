package org.example.assignment.interface1.basicQ1Interface;

public class ComputerMain {
    public static void main(String[] args) {
        AppleComputer apple = new AppleComputer();
        BananaComputer banana = new BananaComputer();

        System.out.println("-----------애플 컴퓨터-----------");
        apple.start();
        apple.shutdown();
        apple.restart();

        System.out.println("----------바나나 컴퓨터----------");
        banana.start();
        banana.shutdown();
        banana.restart();
    }
}

/*
package com.example.basic_q1_interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("애플컴퓨터---------------");
        AppleComputer appleComputer = new AppleComputer();
        appleComputer.start();
        appleComputer.shutdown();
        appleComputer.restart();

        System.out.println("바나나컴퓨터---------------");
        BananaComputer bananaComputer = new BananaComputer();
        bananaComputer.start();
        bananaComputer.shutdown();
        bananaComputer.restart();
    }
}

 */