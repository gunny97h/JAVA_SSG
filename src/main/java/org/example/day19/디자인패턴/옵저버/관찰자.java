package org.example.day19.디자인패턴.옵저버;

// 옵저버 패턴
// ---------------
// interface  관찰자 정의
// --> void  update(int temp){ //에어컨 온도 변경시 알려줌.
//    	print(temp + "도가 변경되었습니다.");
//     }
// class 에어컨 implements 관찰자
// ArrayList<String> managers = {"alice", "hong", "park"};
// void setTemp(int temp) :  온도변화시 위 명단에 알려주도록 구현
// --> 출력형태는 각 위의 manager 각각에게 다음과 같이 알려주면 됨.
//      	alice님 10도가 변경되었습니다.
//	        alice님 10도가 변경되었습니다.
//	        alice님 10도가 변경되었습니다.
// class 에어컨온도변환Main 구현
// 에어컨 a = new 에어컨();
// a.setTemp(10);
public interface 관찰자 {
    void update(int temp);
}
