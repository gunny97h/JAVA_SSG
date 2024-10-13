package org.example.day9.문자파일;

/*
2. Q3 문제(도서관 관리 프로그램)
    Book, Main2 클래스를 만들어서
    Book 2권 등록하고
    아래에 등록된 도서관 책 목록 프린트
    메모리 그림으로 그려보세요.
*/

import java.util.Scanner;

public class Q2ClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q2ClassBook book1 = new Q2ClassBook();
        Q2ClassBook book2 = new Q2ClassBook();

        System.out.print("제목, 작가, isbn을 순서대로 입력 >> ");
        String[] book1s = sc.nextLine().split(" ");
        book1.setTitle(book1s[0]);
        book1.setAuthor(book1s[1]);
        book1.setIsbn(book1s[2]);

        System.out.print("제목, 작가, isbn을 순서대로 입력 >> ");
        String[] book2s = sc.nextLine().split(" ");
        book2.setTitle(book2s[0]);
        book2.setAuthor(book2s[1]);
        book2.setIsbn(book2s[2]);

        System.out.println("\n------등록된 도서관 책 목록------");
        book1.displayInfo();
        book2.displayInfo();


        sc.close();
    }
}
