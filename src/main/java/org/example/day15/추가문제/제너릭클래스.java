package org.example.day15.추가문제;

public class 제너릭클래스 {

        //  제너릭 추가문제
        //    - 다음과 같이 객체 생성시 타입을
        //      지정하여 사용할 수 있도록 Box<T>클래스를
        //      만드시오.
        //  ------------------------------------
    public static void main(String[] args) {
        // 정수를 저장하는 Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box: " + integerBox.getContent());
        // 문자열을 저장하는 Box
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        System.out.println("String Box: " + stringBox.getContent());
    }

     // 타입 파라미터는 'T', 'E', 'K', 'V' 등으로 자주 사용
     // - T: Type (일반적인 타입)
     // - E: Element (컬렉션에서 요소를 나타낼 때 주로 사용)
     // - K: Key (맵의 키를 나타낼 때 주로 사용)
     // - V: Value (맵의 값을 나타낼 때 주로 사용)
    public static class Box<T> { // 객체를 생성할 때 'T'를 실제 사용할 타입으로 대체

         // T는 제너릭 타입 파라미터로, 실제 타입은 객체 생성 시 결정됩니다.
         T content; // Box 클래스가 저장할 실제 데이터 타입 (T는 정수, 문자열 등 다양한 타입으로 대체 가능)

         // Box에 데이터를 저장하는 메서드. 입력값의 타입은 제너릭 타입 T.
         public void setContent(T content) {
             this.content = content;
         }

         // Box에 저장된 데이터를 반환하는 메서드. 반환 타입도 제너릭 타입 T.
         public T getContent() {
             return content;
         }
    }


}