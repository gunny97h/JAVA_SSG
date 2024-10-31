package org.example.day23.thread메서드;

// NEW01-Java-5(상속+스레드+예외처리)2.pdf  p.81
public class Join메서드 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // 메인 스레드에서 count 값을 출력 (join() 메서드 필요)
        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

/*
join() 메서드는 해당 스레드가 종료될 때까지 호출한 스레드를 일시 정지시킵니다.

이 예제에서는 t1.join()과 t2.join()이 메인 스레드에서 호출되고 있기 때문에,
t1과 t2가 끝날 때까지 메인 스레드가 기다립니다.
join()을 사용하지 않으면 메인 스레드가 t1과 t2가 끝나기 전에
System.out.println("Final count: " + counter.getCount());를 실행할 수 있어,
최종 count 값을 정확하게 얻지 못할 가능성이 큽니다.

join() 메서드는 다음과 같은 상황에서 유용하게 사용됩니다:
동기화: 여러 스레드가 같은 데이터를 다루고 있을 때, 스레드가 모두 완료된 후에 결과를 얻고 싶을 때 사용.
종료 대기: 다른 스레드가 끝날 때까지 기다려야 하는 경우 (예: 작업 순서를 지켜야 하는 경우).

이 코드에서 t1.join()과 t2.join()이 없으면 counter의 값이 아직 증가하는 중일 때 결과가 출력될 수 있습니다.
 */

/*
synchronized의 역할
이 예제에서는 synchronized를 increment() 메서드에 적용하여 여러 스레드가 동시에 count 값을 수정하지 못하게 합니다.

synchronized의 동작 방식
동시 접근 제한: 한 스레드가 increment() 메서드를 실행하는 동안, 다른 스레드는 이 메서드에 접근할 수 없습니다.
상호 배제 보장: 각 스레드가 순차적으로 increment()를 호출하도록 하여 count 값의 일관성을 보장합니다.
임계 구역 설정: synchronized가 붙은 메서드나 블록은 하나의 스레드만 접근할 수 있는 임계 구역이 되어,
              공유 데이터가 일관된 상태로 유지됩니다.

예제에서 synchronized가 없다면?
increment() 메서드가 여러 스레드에서 동시에 실행될 경우 count++ 연산 중간에
다른 스레드가 개입하여 count의 값이 예기치 않게 변할 수 있습니다.
예를 들어, count가 1 증가해야 할 상황에서 2 이상의 값이 증가하거나, 증가되지 않는 문제가 발생할 수 있습니다.

요약
이 예제에서 synchronized는 count 변수에 대한 동기화된 접근을 보장하여, 여러 스레드가 안전하게 count 값을 증가할 수 있도록 해줍니다.
 */