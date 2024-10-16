package org.example.day11.static1;


/*
https://www.coupang.com/np/categories/429893?listSize=60&brand=&offerCondition=&filterType=&isPriceRange=false&minPrice=&maxPrice=&channel=user&fromComponent=Y&selectedPlpKeepFilter=&sorter=bestAsc&filter=&component=429793&rating=0
 */
public class 물건 {
    String name;
    String comp;
    boolean free;
    int price;
    int weight;
    String date;

    static int sum;
    static int count;

    public 물건(String name, String comp, boolean free, int price, int weight, String date) {
        this.name = name;
        this.comp = comp;
        this.price = price;
        this.free = free;
        this.weight = weight;
        this.date = date;

        sum = sum + price;
        count++;
    }

    public double getAvgPrice() {
        return (double) price / weight;
    }

    public static String getSum(){
        return "총 가격 : " + sum;
    }



    public String toString() {
        return "물건{" +
                "제품명='" + name + '\'' +
                ", 제조사='" + comp + '\'' +
                ", 무료배송여부=" + free +
                ", 가격=" + price +
                ", 무게=" + weight +
                ", 10g당 가격=" + String.format("%.2f", getAvgPrice()) +
                ", 배송날짜='" + date + '\'' +
                '}';
    }
}
