package org.example.day18.디자인패턴.싱글톤;

// Singleton 클래스: 오직 하나의 인스턴스만 존재하도록 보장하는 디자인 패턴을 구현.
public class Singleton {
    // 클래스 내부에서 단 하나의 Singleton 인스턴스를 유지하는 정적 변수.
    private static Singleton instance;
    // private 생성자: 외부에서 이 클래스를 직접 인스턴스화하지 못하도록 제한.
    private Singleton() {}

    // getInstance() 메서드: 외부에서 Singleton 인스턴스를 얻기 위한 메서드.
    // synchronized를 사용하여 다중 스레드 환경에서도 동시 접근을 제어.
    public static synchronized Singleton getInstance() {
        // 처음 호출되었을 때만 instance를 생성하고, 이후에는 기존 인스턴스를 반환
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
