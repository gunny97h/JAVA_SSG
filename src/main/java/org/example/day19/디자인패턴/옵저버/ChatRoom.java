package org.example.day19.디자인패턴.옵저버;

public class ChatRoom {
    public static void main(String[] args) {
        Chat room = new Chat();
        User user = new User("홍길동");
        room.addUser(user);  // --> 삭제하려면 User 주소값이 필요함
        //room.addUser(new User("홍길동"));
        room.addUser(new User("김길동"));
        room.addUser(new User("박길동"));

        room.notifyUsers("와! 오늘은 신나는 금요일!!!");

        System.out.println();
        // 채팅창에서 "홍길동" 삭제
        //room.romoveUser(new User("홍길동"));
        room.romoveUser(user);
        room.notifyUsers("내일은 토요일!!!");
    }
}
