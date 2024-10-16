package org.example.day12.상속;

public class Thread1 extends Thread {
    // run() : 동시에 실행하고 싶은 코드..

    @Override
    public void run() { // run + Enter // 재정의
        //super.run(); --> 거의 사용 x
        for (int i = 0; i < 100; i++) {
            System.out.println("증가 >> " + i);
        }
    }

    // start() : run()안에 있던 코드를 동시에 실행하라고 시작..
    //           여기서 start()를 사용하지는 않음
}
