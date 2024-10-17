package org.example.day13.예외처리;

/*
MyException: Exception 클래스를 상속받아 사용자 정의 예외를 생성합니다.
             생성자에서 메시지를 받아 부모 클래스인 Exception의 생성자를 호출합니다.

MyAccount: money() 메서드를 통해 특정 조건(n >= 10000)을 만족하면 MyException을 던집니다.
           예외가 발생하면 호출된 곳에서 이를 처리해야 합니다.

MyMain: MyAccount 객체를 생성하고 money() 메서드를 호출합니다.
        이때 예외가 발생할 수 있으므로 try-catch 블록을 사용하여 예외를 처리합니다.
        catch 블록에서는 MyException의 메시지를 출력합니다.
 */

public class MyException extends Exception {
    // Exception의 message 필드

    public MyException(String message) {
        super(message);
    }

}
