package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// 스트링으로 만들어 가져오기
public class CrawlFinance {

    public String crawl(String code) throws Exception {
        Document doc2 =
                Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();

        Elements list5 = doc2.select("span.blind");

        String high = list5.get(18).text();
        String today = list5.get(14).text();
        String yesterday = list5.get(17).text();

//        System.out.println("코드 : " + code);
//        System.out.println("고가 : " + high);
//        System.out.println("현재가 : " + today);
//        System.out.println("전일가 : " + yesterday);

        // 좋지 않은 코드, 원래는 값 하나하나 리턴
        String data = "코드 : " + code + "\n" +
                      "고가 : " + high + "\n" +
                      "현재가 : " + today + "\n" +
                      "전일가 : " + yesterday;


        return data;
    }
}
