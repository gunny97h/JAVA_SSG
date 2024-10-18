package org.example.dayQ.day14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// NEW01-Java-5(크롤링).pdf p.13
public class 크롤링테스트4 {// 네이버 뉴스 크롤링

    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://news.naver.com/?viewType=pc").get();
        Elements list = doc.select("a.Nitem_link");

        //System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i).text());
        }


    }
}
