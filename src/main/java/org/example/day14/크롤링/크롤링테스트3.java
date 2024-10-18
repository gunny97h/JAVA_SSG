package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
삼성전자 005930
SK하이닉스 000660
한미반도체 042700
 */
public class 크롤링테스트3 {
    public static void main(String[] args) throws Exception {
//        Document doc1 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
//        Document doc2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=000660").get();
//        Document doc3 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=042700").get();
        String[] names = {"삼성전자", "SK하이닉스", "한미반도체"};  // 배열 2개 사용
        String[] codes = {"005930", "000660", "042700"};       // 다시 공부하기

        // 많은 줄의 코드를 for문으로 둘러싸주고 싶을 때
        // 1. 블록을 잡는다.
        // 2. 상단 code --> surroundwith
        for (int i = 0; i < names.length; i++) {
            Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + codes[i]).get();
            Elements list = doc.select("span.code"); //0~여러개
            Element e1 = list.get(0); //<span class="code">005930</span>
            String code = e1.text();

            Elements list5 = doc.select("span.blind");

//            for (int j = 0; j < list5.size(); j++) {
//                System.out.println(j + ": " + list5.get(j));
//            }


            //고가 high에 넣기
            String high = list5.get(18).text();
            //현재가 today에 넣기
            String today = list5.get(14).text();
            //전일 yesterday에 넣기
            String yesterday = list5.get(17).text();
            //다음과 같이 프린트해보자.
            //회사명 : 삼성전자
            System.out.println("회사명 : " + names[i]);
            //코드 :
            System.out.println("코드 : " + code);
            //고가 :
            System.out.println("고가 : " + today);
            //현재가 :
            System.out.println("현재가 : " + high);
            //전일가 :
            System.out.println("전일가 : " + yesterday);

            System.out.println("-----------------------------------");
        }
    }
}
