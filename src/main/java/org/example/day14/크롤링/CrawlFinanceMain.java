package org.example.day14.크롤링;

import javax.swing.*;

public class CrawlFinanceMain {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog(" code 입력 ");
        // 005930, 035720
        CrawlFinance naver = new CrawlFinance();

        try {
            String data = naver.crawl(code);
            JOptionPane.showMessageDialog(null, data);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
