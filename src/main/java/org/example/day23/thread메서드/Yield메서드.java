package org.example.day23.thread메서드;

public class Yield메서드 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("Even Thread", 0); // 짝수만 출력
        MyThread2 t2 = new MyThread2("Odd Thread", 1);  // 홀수만 출력

        t1.start();
        t2.start();
    }
}

class MyThread2 extends Thread {
    private String name;
    private int startNumber;

    public MyThread2(String name, int startNumber) {
        this.name = name;
        this.startNumber = startNumber;
    }

    public void run() {
        for (int i = startNumber; i <= 10; i += 2) {
            System.out.println(name + ": " + i);
            Thread.yield(); // CPU 양보 요청
        }
    }
}

/*
yield() 메서드는 현재 실행 중인 스레드가 CPU를 다른 스레드에게 양보하도록 요청합니다.
이 메서드는 스레드가 자신에게 할당된 CPU 시간을 다른 스레드에게 넘기고, 실행 대기 상태로 돌아가도록 합니다.
다만, yield()는 명령이 아닌 요청이므로, 반드시 다른 스레드에게 CPU가 넘어가는 것은 아니며, 운영체제 스케줄러의 정책에 따라 결정됩니다.

코드에서 yield()의 동작
Even Thread와 Odd Thread라는 이름의 두 스레드 t1, t2가 각각 짝수와 홀수 숫자를 출력합니다.
각 스레드는 자신의 run() 메서드에서 for 루프를 통해 숫자를 출력한 후 yield()를 호출합니다.
yield()는 현재 스레드가 실행을 잠시 멈추고, 다른 실행 가능한 스레드에게 우선권을 주도록 요청합니다.

yield()의 사용 목적
CPU 자원 최적화: 여러 스레드가 번갈아 가며 자원을 사용하는 방식으로,
                스레드가 상대적으로 짧은 시간 동안 CPU를 사용하고 다른 스레드에게 양보하는 경우.
스레드 간 균형 유지: 스레드가 너무 많이 실행되는 것을 방지하고 다른 스레드가 더 많은 기회를 가질 수 있도록 지원.

예제 실행 결과 예측
이 예제에서는 Even Thread와 Odd Thread가 yield()를 호출하면서 실행 기회를 서로 양보하지만,
실제로 yield() 호출 후 반드시 다른 스레드가 실행되지는 않습니다. 결과는 운영체제 스케줄러의 정책에 따라 달라질 수 있습니다.

요약
yield()는 현재 스레드가 CPU를 다른 스레드에게 양보하도록 요청합니다. 그러나, 요청이 반드시 수락되는 것은 아니며, 스레드 스케줄러에 따라 처리됩니다.
 */