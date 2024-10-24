package org.example.day18.디자인패턴.팩토리메서드;

// NEW01-Java-8(디자인패턴+람다+스트림+리플렉션).pdf  p.8
public class ObjectFactory1 {

    public Object createObject(String objectType) {
        if (objectType.equalsIgnoreCase("A")) {
            return new 애플클래스();
        } else if (objectType.equalsIgnoreCase("B")) {
            return new 바나나클래스();
        } else {
            return null;
        }
    }
}
