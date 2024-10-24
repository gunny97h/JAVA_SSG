package org.example.day18.디자인패턴.싱글톤;

// SingletonMain 클래스: Singleton 클래스를 테스트하는 메인 프로그램
//                      여러 번 호출해도 동일한 객체가 반환됨을 보여줌
public class SingletonMain {
    public static void main(String[] args) {

        // Singleton 객체를 3번 호출하여 3개의 참조 변수에 할당
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        // 각 인스턴스의 주소를 출력
        // 각 참조 변수에 저장된 Singleton 인스턴스의 메모리 주소를 출력
        System.out.println("Instance 1: " + instance1);
        System.out.println("Instance 2: " + instance2);
        System.out.println("Instance 3: " + instance3);
        // 주소가 동일한지 확인
        // 세 개의 참조가 모두 동일한 인스턴스를 가리키고 있는지 확인하는 코드.
        // 세 개의 참조가 동일한지 (== 연산자 사용) 확인하고 그 결과를 출력.
        System.out.println("Are all instances the same? " +
                (instance1 == instance2 && instance2 == instance3));
    }
}
