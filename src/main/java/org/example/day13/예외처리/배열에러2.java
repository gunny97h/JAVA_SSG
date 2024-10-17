package org.example.day13.예외처리;
/*
배열에러2
- array()메서드를 호출한 곳을 예외처리를 떠넘겨보자.!
배열에러처리Main2
- array()메서드 호출
 */
public class 배열에러2 {
    public void array() throws Exception{
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // 에러
    }
}
