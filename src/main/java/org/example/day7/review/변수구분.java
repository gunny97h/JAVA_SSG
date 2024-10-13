package org.example.day7.review;

public class 변수구분 {
    static int z;  //전역변수 --> 자동초기화!
    // 전역 변수는 배열과 같이 초기화 하지 않아도 됨

    public static void main(String[] args) {
        //저장공간을 먼저 만들고, 그 저장공간에 값을 넣는다!
        //언제 저장공간을 만드나 --> 선언할 때
        //타입명 변수명; ---> 선언!
        int x;      //쓰레기값이 들어있는 상태
        //코드를 망칠 수 있으므로 사용 x
        //출력도 연산도 불가능

        int y = 0;  //변수 생성시 초기화를 꼭 해야함
        //--> 자바에서는 선언의 위치가 이 변수가 사용될 수 있는 범위를 결정!
        //--> x, y변수는 main() 메서드 안에서만 사용 가능하다
        //--> 지역변수(local)  <--->  전역변수(global)

        for (int i = 0; i < 3; i++) {
            int temp = 0;   //for문 밖에서는 사용 불가
            //temp와 i는 for문 지역내에서만 쓸 수 있음   //지역변수

        }

        System.out.println("z = " + z);
    }
}

//클래스로 찍어낸 실제 부품 오브젝트? 인스턴스?