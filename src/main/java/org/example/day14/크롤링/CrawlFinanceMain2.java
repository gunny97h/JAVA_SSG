package org.example.day14.크롤링;

import javax.swing.*;
import java.util.ArrayList;

public class CrawlFinanceMain2 {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog(" code 입력 ");
        // 005930, 035720
        CrawlFinance2 naver = new CrawlFinance2();
        
        try {
            ArrayList list = naver.crawl(code);
            // code가 035720인 회사의 최고가는 37,000이고 최저가는 35,000이다
            JOptionPane.showMessageDialog(null,
                    "CODE가 "+ code+ "인 회사의 " +
                            "최고가는 "+ list.get(0) +
                            "이고 전일가는 "+ list.get(2) + "이다");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
ArrayList 대신 String[] 사용

import javax.swing.*;

public class 증권크롤러Main2 {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code입력");
        //005930, 035720
        증권크롤러2 naver = new 증권크롤러2();
        try {
            //힌트는 crawl()메서드내에
            //String[]을 만들어 각 값들을 집어 넣으세요.
            //그 String[]을 리턴!
            String[] data = naver.crawl(code);
            //code가 035720인 회사의 최고가는 37,000이고
            //전일가는 35,000이다.
            System.out.println( "code가 " + code +
                                "인 회사의 최고가는 " + data[1] + "이고 \n" +
                                "전일가는 " + data[3] + "이다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

 */