package org.example.day23.thread메서드;

class SharedResource {
    private boolean isProduced = false;

    public synchronized void produce() throws InterruptedException {
        if (isProduced) {
            wait(); // 자원이 소비될 때까지 대기
        }
        System.out.println("Producing resource...");
        isProduced = true;
        notify(); // 소비자에게 알림
    }

    public synchronized void consume() throws InterruptedException {
        if (!isProduced) {
            wait(); // 자원이 생성될 때까지 대기
        }
        System.out.println("Consuming resource...");
        isProduced = false;
        notify(); // 생산자에게 알림
    }
}

public class Wait메서드 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }

}

/*
wait()와 notify()는 동기화 메서드 또는 동기화 블록 내에서 사용되어 스레드 간의 협력을 가능하게 합니다.

wait()와 notify() 메서드의 역할
wait(): wait() 메서드는 스레드를 일시 정지 상태로 만들며, 다른 스레드가 notify()나 notifyAll()을 호출하여 깨울 때까지 기다리게 합니다.
        wait() 메서드가 호출되면, 스레드는 모니터 잠금을 해제하고 대기 상태에 들어갑니다.
notify(): notify() 메서드는 대기 상태에 있는 스레드 중 하나를 깨워서 실행 대기 상태로 전환시킵니다.
          깨운 스레드는 모니터 잠금을 다시 획득한 후 실행을 이어갑니다.

코드 분석
produce() 메서드:
isProduced가 true이면, 이미 자원이 생성된 상태이므로 wait()을 호출해 자원이 소비될 때까지 대기합니다.
                        자원을 생성한 후, isProduced를 true로 설정하고 notify()를 호출하여
                        소비자 스레드가 자원을 소비할 수 있음을 알립니다.
consume() 메서드:
isProduced가 false이면, 자원이 생성되지 않은 상태이므로 wait()을 호출해 자원이 생성될 때까지 대기합니다.
                        자원을 소비한 후, isProduced를 false로 설정하고 notify()를 호출하여
                        생산자 스레드가 자원을 다시 생성할 수 있음을 알립니다.

실행 순서
producer 스레드가 produce() 메서드를 호출하고, 자원이 생성된 후 notify()로 consumer 스레드에 신호를 보냅니다.
consumer 스레드는 consume() 메서드를 호출해 자원을 소비한 뒤, notify()로 다시 producer 스레드에 신호를 보냅니다.
이 과정을 5번 반복하며 생산자와 소비자가 번갈아 가며 실행됩니다.

주의점
wait()와 notify()는 반드시 동기화된 메서드 또는 동기화 블록 내에서 호출해야 합니다. 그렇지 않으면 IllegalMonitorStateException이 발생합니다.

요약
wait()는 스레드를 대기 상태로 만들고, notify()는 대기 중인 스레드를 깨워서 협력 작업을 가능하게 합니다.
이를 통해 생산자와 소비자가 효율적으로 자원을 교대로 사용할 수 있도록 조정합니다.
 */