package org.example.day19.디자인패턴.옵저버;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "이 메세지를 받음 >> " + message);
    }
}
