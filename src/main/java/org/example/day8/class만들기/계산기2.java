package org.example.day8.class만들기;

import java.util.Date;

public class 계산기2 {

    // ==> 하나의 이름으로 여러 입력 파라메터 형태를
    //      만들어 쓸 수 있다. (다형성)

    public int add(int x, int y){
        return x + y;
    }
    public double add(int x, double y){
        return x + y;
    }
    public double add(double x, double y){
        return x + y;
    }
    public String add(String x, int y){
        return x + y;
    }
    public int[] add(){
        int[] num = {1,2,3};
        return num;
    }
    public int call(){
        Date date = new Date();
        int month = date.getMonth() + 1;
        return month;
    }
    /*
    public ____ add(int x, int y){
        return x + y;
    }
    public ____ add(int x, double y){
        return x + y;
    }
    public ____ add(double x, double y){
        return x + y;
    }
    public ____ add(String x, int y){
        return x + y;
    }
    public ____ add(){
        int[] num = {1,2,3};
        return num;
    }
    public ____ call(){
        Date date = new Date();
        int month = date.getMonth() + 1;
    }
    */
}
