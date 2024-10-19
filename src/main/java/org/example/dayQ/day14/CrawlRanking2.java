package org.example.dayQ.day14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlRanking2 {

    public void crawl(String title) throws Exception {
        Document doc = Jsoup.connect("https://serieson.naver.com/v3/movie/ranking/realtime").get();

        Element ol = doc.select("ol.RankingList_ranking_list__N4QsH").first();
        Elements lis = ol.children();

        //System.out.println(li);

        for (Element li : lis) {
            String s = li.select("em.RankingNumber_rank__zZLNC span.blind").text();
            String title1 = li.select("span.Title_title__s9o0D").text();
            if (title.equals(title1)) {
                System.out.println(s.replace(" ", ""));
            }
        }
    }
}
