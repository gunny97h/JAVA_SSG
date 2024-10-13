package org.example.day8.class만들기;

public class 일기장 {
    // 속성 --> 항목, 멤버변수
    // default : public이 없는 상태 --> 같은 패키지(class만들기) 내에서만 사용 가능
    public String title;   // 제목
    public String content; // 내용
    public String weather; // 날씨

    // 기능 --> 메서드, 멤버메서드
    // void(없다)
    public void 일기쓰다() {
        System.out.println("그림하나 넣고.");
        System.out.println("제목 넣고, 내용 쓰고, 날짜를 쓴다");
    }
    public void 일기삭제하다() {
        System.out.println("파일을 삭제하다.");

    }

}
