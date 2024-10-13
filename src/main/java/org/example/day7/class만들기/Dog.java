package org.example.day7.class만들기;

//  속성 - 2개 이상
//  동작 - 2개 이상

//  거실
//  강아지 만든 것 사용
//  Dog dog = new Dog();
//  동작, 속성 지정해서 프린트
public class Dog {
    public String name;
    public int age;
    public String color;


    public void call(String name){
        System.out.println(name + "를 불렀습니다.....");
    }

    public void eat(String name){
        System.out.println(name + "에게 밥을 줍니다.....");
    }

    public void play(String name){
        System.out.println(name + "랑 놉니다.....");
    }
}
