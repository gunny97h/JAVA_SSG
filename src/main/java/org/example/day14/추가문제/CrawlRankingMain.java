package org.example.day14.추가문제;

import javax.swing.*;

public class CrawlRankingMain {
    public static void main(String[] args) {

        String c = JOptionPane.showInputDialog(" M(영화) / B(방송) 중 입력 ");
        String code = "";
        if (c.equals("M")) {
            code = "movie";
        }else if (c.equals("B")) {
            code = "broadcasting";
        }

        CrawlRanking rank = new CrawlRanking();

        try {
            rank.crawl(code);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


/* 현우님 코드
package org.example.day14.Crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.*;

public class MovieCrawlmain2 {
    public static void main(String[] args) {
        try{
            Document doc2 = Jsoup.connect("https://serieson.naver.com/v3/movie/ranking/realtime").get();

            Elements movieElements = doc2.select("span.Title_title__s9o0D");
            String inputMovie = JOptionPane.showInputDialog("영화 제목을 입력하세요: ");

            boolean found = false;
            for (int i = 0; i < movieElements.size(); i++) {
                String movieTitle = movieElements.get(i).text();
                if (movieTitle.equalsIgnoreCase(inputMovie)){
                    System.out.println(inputMovie + "은(는) " + (i + 1) + "위입니다.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("해당 영화는 랭킹에 없습니다.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
 */