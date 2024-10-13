package org.example.day9.문자파일;

import java.io.*;

public class Q1FileA {
    public static void main(String[] args) {

        try {
            InputStream is2 = new FileInputStream("C:\\dataSSG\\test01.txt");
            OutputStream os2 = new FileOutputStream("C:\\dataSSG\\test02.txt");
            is2.transferTo(os2);
            System.out.println("o");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
