package org.example.assignment.cast1;

import org.example.day15.형변환참조.사람;

import java.util.ArrayList;

public class BasicQ3Casting {
    public static void main(String[] args) {

        // 다음 코드에 대해 [자동형변환/강제형변환/박싱/언박싱] 관점에서 주석을 달아 설명하시오.

        ArrayList list = new ArrayList();
        list.add("자바");

        list.add(new 사람());
        list.add(new ArrayList());

        String s = (String)list.get(0);

        list.add(100);

        int i = (Integer)list.get(3);
    }
}

/*
package com.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class basic_q3_casting {
    public static void main(String[] args) {
        try {
            // 1. 사이트에 연결해서, HTML 문서를 다 가지고 오기
            Document doc = Jsoup.connect("https://news.naver.com/").get();

            // 2. 원하는 요소를 선택해서 가져오기
            Elements list = doc.select(".Nitem_link_menu"); // class가 Nitem_link_menu인 태그를 선택

            // 3. 가져온 요소의 크기 출력
            System.out.println("Number of items: " + list.size());

            // 4. 각 요소의 텍스트를 출력
            for (int i = 0; i < list.size(); i++) {
                Element tag = list.get(i);
                System.out.println(i + ": " + tag.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
