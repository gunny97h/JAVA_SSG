package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// CrawlFinance
public class 증권크롤러1 {
    public void crawl(String code) throws Exception {
        Document doc2 =  Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
        Elements list5 = doc2.select("span.blind");

        //고가 high에 넣기
        String high = list5.get(18).text();
        //현재가 today에 넣기
        String today = list5.get(14).text();
        //전일 yesterday에 넣기
        String yesterday = list5.get(17).text();
        //다음과 같이 프린트해보자.
        //코드 :
        System.out.println("코드 : " + code);
        //고가 :
        System.out.println("고가 : " + today);
        //현재가 :
        System.out.println("현재가 : " + high);
        //전일가 :
        System.out.println("전일가 : " + yesterday);

        //회사명 : 삼성전자
        //코드 : 005930
        //고가 : 59,300
        //현재가 : 60,100
        //전일가 : 59,700



    }

}