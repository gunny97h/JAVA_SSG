package org.example.day9.문자파일;

public class Q2ClassBook {
    String title;
    String author;
    String isbn;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayInfo() {
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getIsbn());
    }

}
