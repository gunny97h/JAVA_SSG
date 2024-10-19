package org.example.dayQ.day14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlRanking2 {

    // 'crawl' 메서드는 영화 제목(title)을 입력받아서 그 영화의 실시간 순위를 출력하는 기능을 한다.
    public void crawl(String title) throws Exception {
        // Jsoup을 이용해 영화 랭킹 페이지에 접속해서 HTML 데이터를 가져온다.
        Document doc = Jsoup.connect("https://serieson.naver.com/v3/movie/ranking/realtime").get();

        // HTML 문서에서 영화 순위 리스트가 담겨 있는 'ol' 태그를 찾아서 ol 변수에 저장.
        Element ol = doc.select("ol.RankingList_ranking_list__N4QsH").first();
        // 'ol' 태그 안의 모든 자식 요소들 (영화 항목들)을 'lis'에 저장.
        Elements lis = ol.children();

        //System.out.println(li);

        // 각 영화 항목을 하나씩 처리하기 위해 for문으로 순회.
        for (Element li : lis) {
            // 순위 정보를 가져와 's' 변수에 저장.
            String s = li.select("em.RankingNumber_rank__zZLNC span.blind").text();
            // 영화 제목을 가져와 'title1' 변수에 저장.
            String title1 = li.select("span.Title_title__s9o0D").text();
            // 사용자가 입력한 영화 제목과 일치하는지 확인.
            if (title.equals(title1)) {
                // 순위에서 공백을 제거하고 출력.
                System.out.println(s.replace(" ", ""));
            }
        }
    }
}
