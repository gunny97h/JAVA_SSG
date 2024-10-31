package org.example.day23.thread메서드;

public class Interrupt메서드 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();  // 스레드 객체 생성
        thread.start();
        try {
            Thread.sleep(2000); // 2초 후에 인터럽트 요청
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        thread.interrupt(); // 스레드에 인터럽트 요청
        // --> 실행 대기 상태로 감.
    }
}

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000); // 5초 대기
            // --> 중지 상태로 감.
            System.out.println("Thread is awake!");
        } catch (InterruptedException e) {
            System.out.println("내가 깨어났다...");
        }
    }
}

/*
interrupt() 메서드는 스레드에 인터럽트(중단) 신호를 보내어 스레드가 실행을 멈추거나 특정 작업을 중단하도록 요청합니다.
interrupt()는 스레드를 강제로 중지시키는 것이 아니라, 스레드가 중단될 수 있는 상태일 때 중단을 요청하는 방식입니다.

코드에서 interrupt()의 동작
메인 스레드에서의 interrupt() 호출: Thread.sleep(2000)을 통해 2초간 대기한 후 thread.interrupt()를 호출하여 MyThread에 인터럽트를 요청합니다.
인터럽트 신호 전송: interrupt() 메서드는 스레드의 인터럽트 플래그를 true로 설정합니다. 이 플래그는 스레드가 인터럽트 요청을 받았음을 나타냅니다.
스레드의 반응: MyThread의 run() 메서드에서 Thread.sleep(5000)으로 인해 스레드가 5초간 대기 상태에 들어가지만,
             이 상태에서 interrupt()가 호출되면 InterruptedException 예외가 발생합니다.

InterruptedException 예외
인터럽트가 발생하면, sleep(), wait(), join() 같은 특정 메서드는 즉시 예외를 발생시킵니다.
이 예외가 발생하면 스레드는 예외 처리 블록으로 이동하여 실행을 계속하거나 종료할 수 있습니다.

예제 실행 순서
메인 스레드에서 MyThread가 시작됩니다.
MyThread는 run() 메서드에서 Thread.sleep(5000)으로 5초간 대기 상태에 들어갑니다.
메인 스레드는 2초간 대기한 후 interrupt()로 MyThread에 인터럽트를 요청합니다.
MyThread가 InterruptedException을 받아 "내가 깨어났다..." 메시지를 출력합니다.

요약
interrupt()는 스레드에 인터럽트를 요청하여 실행 중이던 작업을 중단하거나 예외를 발생하게 합니다. 하지만 스레드가 이를 직접 처리해야 하며, 강제 중지는 아닙니다.
 */