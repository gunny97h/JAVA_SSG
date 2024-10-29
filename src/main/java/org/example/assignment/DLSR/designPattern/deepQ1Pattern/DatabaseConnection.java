package org.example.assignment.DLSR.designPattern.deepQ1Pattern;

public class DatabaseConnection {
    // 데이터베이스와의 연결을 관리하는 클래스를 만들 때, 연결 객체는 프로그램 전체에서 하나만 존재해야 한다.
    // 이를 통해 리소스를 효율적으로 사용하고 데이터베이스 연결 오버헤드를 줄일 수 있다.
    // DB연결할 수 있는 클래스를 정의하고 main메서드 안에서 싱글톤 객체 생성하시오.
    // 동일한 객체의 주소를 2개 더  획득 후, 총 3개의 주소를 비교해보시오.
    // 클래스명 : DatabaseConnection, Main

    private static DatabaseConnection instance;
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String toString() {
        return instance.hashCode() + "";
    }
}




/*
package org.example.assignment.DLSR.designPattern.deepQ1Pattern;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    // private constructor to prevent instantiation
    private DatabaseConnection() {
        System.out.println("데이터베이스 연결 객체가 생성되었습니다.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}


 */