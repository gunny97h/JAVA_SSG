package org.example.assignment.var1;


public class BasicQ2Var {
    public static void main(String[] args) {

        // 개인 정보 변수 선언
        String name = "John Doe";
        byte age = 30;
        int mathJumsu = 100;
        float height = 175.5F; // cm 단위
        double weight = 70.2;  // kg 단위
        String address = "123 Main St, Anytown, USA";
        String phoneNumber = "010-1234-5678";
        char gender = 'F';

        // 출력
        System.out.println("\n===== 개인 정보 =====");
        System.out.printf("이름      : %s%n", name);
        System.out.printf("나이      : %d세%n", age);
        System.out.printf("키        : %.1fcm%n", height);
        System.out.printf("몸무게    : %.1fkg%n", weight);
        System.out.printf("주소      : %s%n", address);
        System.out.printf("전화번호  : %s%n", phoneNumber);
        String result =  gender == 'F' ? "여성" : "남성";
        System.out.printf("성별  : %s%n", result);
        System.out.printf("수학점수  : %s점%n", mathJumsu);
    }
}

/*

● 기본형 (Primitive Types)
    기본형은 자바에서 가장 기본적인 데이터 타입으로,
    값을 직접 저장합니다. 크기가 고정되어 있고,
    자바 메모리의 스택 영역에 저장됩니다.
    기본형은 총 8가지가 있습니다.

1. 정수형 (Integer Types)
자료형	    크기	                범위
byte	    1 byte (8 bits)	    -128 ~ 127
short	    2 bytes (16 bits)	-32,768 ~ 32,767
int	        4 bytes (32 bits)	-2^31 ~ 2^31 - 1
long	    8 bytes (64 bits)	-2^63 ~ 2^63 - 1

2. 실수형 (Floating-Point Types)
자료형	    크기	                범위	                    정밀도
float	    4 bytes (32 bits)	약 1.4E-45 ~ 3.4E38	    7자리
double	    8 bytes (64 bits)	약 4.9E-324 ~ 1.7E308	15자리

3. 문자형 (Character Type)
자료형	    크기	                범위
char	    2 bytes (16 bits)	0 ~ 65,535 (Unicode)

4. 논리형 (Boolean Type)
자료형	    크기	                값
boolean	    1 bit (이론적으로)	true, false


구분	        기본형 (Primitive Types)	            참조형 (Reference Types)
저장 값	    값을 직접 저장	                    객체의 주소(참조 값) 저장
메모리	    스택(Stack) 메모리에 저장	            힙(Heap) 메모리에 객체가 저장되고, 주소는 스택에 저장
기본 크기	고정된 크기 (예: int는 4 bytes)	    동적으로 크기 결정
기본 값	    0, false, \u0000 (기본형의 초기 값)	null (참조형의 초기 값)
예시	        int, char, boolean, double	        String, 배열, 사용자 정의 객체
 */
