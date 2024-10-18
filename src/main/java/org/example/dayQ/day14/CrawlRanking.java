package org.example.dayQ.day14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlRanking {

    public void crawl(String code) throws Exception {
        Document doc = Jsoup.connect("https://serieson.naver.com/v3/" +
                                         code + "/ranking/realtime").get();

        Elements list1 = doc.select("span.Title_title__s9o0D");

        for (int i = 0; i < list1.size(); i++) {
            Element element = list1.get(i);
            String title = element.text();
            System.out.println(i + 1 + " : " + title);
        }
    }
}
