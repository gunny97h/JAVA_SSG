package org.example.day7.class사용;

import org.example.day7.class만들기.Dog;
import org.example.day7.class만들기.TV;
import org.example.day7.class만들기.Television;

public class LivingRoom {
    public static void main(String[] args) {
        System.out.println("====================================================");
        Television tv = new Television();   //객체(object) 생성 --> new 사용

        tv.powerOn();
        //tv.changeCh();
        tv.powerOff();

        System.out.println(tv.size);    //null로 초기화
        System.out.println(tv.price);   //o으로 초기화

        tv.size = "small";
        tv.price = 10000;
        tv.manufacturer = "samsung";

        System.out.println(tv.size);
        System.out.println(tv.price);
        System.out.println(tv.manufacturer);

        ///////////////////////////////////////////////////////////////////////////
        System.out.println("====================================================");

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dog.name = "Bo";
        dog.age = 10;
        dog.color = "silver";

        dog2.name = "Co";
        dog2.age = 1;
        dog2.color = "black";


        System.out.println(dog.name + " " + dog.age + " " + dog.color);
        System.out.println(dog2.name + " " + dog2.age + " " + dog2.color);

        dog.call(dog.name);
        dog2.eat(dog2.name);
        dog.play(dog.name);

        ///////////////////////////////////////////////////////////////////////////
        System.out.println("====================================================");

        TV myTV = new TV();     //객체(object) 생성
        TV yourTV = new TV();
        //메서드는 생성된 객체(object)의 주소만 있으면 된다
        myTV.채널을바꾸다();
        yourTV.채널을바꾸다();

        myTV.ch = 7;
        myTV.vol = 9;
        myTV.onOff = true;

        yourTV.ch = 7;
        yourTV.vol = 9;
        yourTV.onOff = true;

    }
}
