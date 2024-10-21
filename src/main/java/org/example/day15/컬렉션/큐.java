package org.example.day15.컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {
    public static void main(String[] args) {
        // Queue, 큐, 대기줄
        //LinkedList queue = new LinkedList();
        Queue queue = new LinkedList();  // Queue가 LinkedList의 부모 역할이라서 더 큰 것을 쓰는 것이 좋음
        // 순서 + 선입선출(First Input First Output, FIFO)
        queue.add("어제 우유");
        queue.add("오늘 우유");
        queue.add("내일 우유");
        System.out.println(queue);

        // 리스트의 기능들도 있음
        queue.remove();  // 맨 앞줄에 있는 요소가 삭제
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
