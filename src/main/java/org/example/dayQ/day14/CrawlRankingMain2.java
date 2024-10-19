package org.example.dayQ.day14;

import javax.swing.*;

public class CrawlRankingMain2 {
    public static void main(String[] args) {

        String title = JOptionPane.showInputDialog(" 영화 제목 입력 ");


        CrawlRanking2 rank = new CrawlRanking2();

        try {
            rank.crawl(title);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
