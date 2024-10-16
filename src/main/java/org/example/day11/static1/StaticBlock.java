package org.example.day11.static1;
// NEW01-Java-4(생성자+static).pdf p.37
public class StaticBlock {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;
    static {
        info = company + "\n" + model;
    }

//    static인데,
//    1) 초기화가 간단하지 않은 경우
//    2) 초기화할 변수가 많은 경우

}
