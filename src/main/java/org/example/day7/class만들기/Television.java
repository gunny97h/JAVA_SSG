package org.example.day7.class만들기;

public class Television {
    //속성(특징, 특성) : attribute, property --> 내가 클래스를 만들 때 넣을 항목들
    //항목 : item, field(필드, * )
    //  사이즈, 가격, 제조회사 --> 멤버 변수
    //  멤버 변수 --> 디른 항목들을 선택할 수 있었지만 내가 선택한 이 항목으로 변수를 만들겠다.

    public String size;    //전역변수, 자동초기화, 참조형 변수는 null로 초기화!
    //public --> 아무 곳에서나 다 사용 가능
    //private --> 다른 곳에서 사용 불가능
    // String size = "L"; --> 값 지정도 가능
    public int price;  //전역변수, 기본형 변수, 0으로 초기화
    public String manufacturer; //제조회사, 전역변수, 참조형변수, null로 초기화
    //final String manufacturer = "Apple"; --> final로 변경하지 못하게 함

    //기능(동작) : function, method(메서드, 절차/방법)
    //전원을 켜다, 전원을 끄다, 채널을 바꾸다 등
    //멤버 메서드
//  다 사용 가능 / 없다 / 기능 이름 /
    public void powerOn() {
        //전원을 켜기 위한 방법과 절차를 여기에 쭉 쓴다
        System.out.println("TV가 켜졌다......");
    }

    public void powerOff() {
        System.out.println("TV가 꺼졌다......");
    }

    public void changeCh() { //입력값 필요한 경우 public void changeCh(int ch)
        System.out.println("채널을 바꿨다......");
    }

}
