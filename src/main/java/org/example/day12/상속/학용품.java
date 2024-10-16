package org.example.day12.상속;

public class 학용품 {
    public int price;
    public String company;


    public 학용품(int price, String company) {
        this.price = price;
        this.company = company;
    }

    public void buy() {
        System.out.println("사다.");
    }
}
