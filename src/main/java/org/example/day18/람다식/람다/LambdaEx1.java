package org.example.day18.람다식.람다;

// NEW01-Java-8(디자인패턴+람다+스트림+리플렉션).pdf  p.24 ~ 30
@FunctionalInterface
public interface LambdaEx1 {
    int fun1(int x, int y);
    //int add2(int x, int y); // @FunctionalInterface : 메서드 하나만 있어야 함
}
