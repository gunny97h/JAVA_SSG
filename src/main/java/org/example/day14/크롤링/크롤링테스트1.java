package org.example.day14.크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트1 {
    public static void main(String[] args) throws Exception {
        // conncet에 예외처리 포함   // 스트림 생성
        // Connection : 연결통로를 나타내는 스트링 객체
        Connection con = Jsoup.connect("https://www.naver.com/"); // connect() return Connection
        // Document(소스코드)
        Document doc = con.get(); // con.get() return Document
        // 체인식 코드
        // Document doc2 = Jsoup.connect("https://www.naver.com/").get();

        System.out.println(doc.title());  //코드를 String으로 만들어줌.
        System.out.println("설치 성공~~~~~!!!");

        // Elements는 ArrayList를 상속받아서 만든 것.
        Elements list = doc.select("span.blind");  // 가변형(여러개)
        System.out.println(list.size());  // 개수 --> 3개
        System.out.println(list);

        Element e1 = list.get(0);
        String e1Text = e1.text();
        System.out.println(e1Text);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).text());
        }
    }
}

/*
Maven
<!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->
<dependency>
    <groupId>org.jsoup</groupId>    // --> 회사 도메인 (반대로)
    <artifactId>jsoup</artifactId>  // --> 프로젝트
    <version>1.14.2</version>       // --> 버전
</dependency>

 */