package org.example.assignment.DLSR.designPattern.basicQ1Pattern;

public class ObjectFactory {
    public Object createObject(String objectType) {
        if (objectType.equalsIgnoreCase("Apple")) {
            return new AppleClass();
        } else if (objectType.equalsIgnoreCase("Banana")) {
            return new BananaClass();
        } else if (objectType.equalsIgnoreCase("Ice")) {
            return new IceClass();
        } else {
            return null;
        }
    }
}
