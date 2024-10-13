/*
package org.example.day8.class사용;

import java.io.File;

public class 파일다루기 {
    public static void main(String[] args) {
        File file = new File("C:\\jdk-17\\bin");    //Font("궁서", ...)처럼 값이 있어야 함
        // / --> 슬러시  --> C:/jdk-17/bin
        // \ --> 역슬러시 --> C:\\jdk-17\\bin

        System.out.println("존재 여부 >>" + file.exists());
        System.out.println("파일 여부 >>" + file.isFile());
        // 디렉토리 == 폴더 == 패키지
        System.out.println("폴더 여부 >>" + file.isDirectory());
        //System.out.println(Arrays.toString(file.listFiles()));

        File[] list = file.listFiles();
        System.out.println(list.length);
        for (File f : list) {
            // 확장자가 exe인 경우만 프린트!
            String name = f.getName();
            if (name.endsWith(".exe")) {
                System.out.println(name);
            }
        }
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath()); // 절대 경로

    }
}
*/