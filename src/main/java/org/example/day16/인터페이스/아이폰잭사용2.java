package org.example.day16.인터페이스;

public class 아이폰잭사용2 {
    public static void main(String[] args) {
        //애플잭 apple = new 애플잭();  <-- 이렇게하면 banana잭 등은 사용 불가능
        아이폰잭 a = new 바나나잭();

        a.납작하게만들다();
        a.이센치로만들다();
    }
}
