package org.example.day13.예외처리;
/*
배열에러1
- array()메서드내에서 예외처리
배열에러처리Main1
- array()메서드 호출
 */
public class 배열에러1 { //NEW02-Java-5(상속+스레드+예외처리).pdf p.116
    public void array() {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]); // 에러
        } catch (Exception e) {
            System.out.println("array()메서드내에서 예외처리함.");
        }
    }
}
