package org.example.day12.상속;

public class 볼펜 extends 학용품 {

    public int thick;

    public 볼펜 (int price, String company, int thick) {
        super(price, company);
        this.thick = thick;
    }

    public void write() {
        System.out.println("글을 쓰다.");
    }

    @Override
    public String toString() {
        return "볼펜{" +
                "price=" + price +
                ", company='" + company + '\'' +
                ", thick=" + thick +
                '}';
    }
}
