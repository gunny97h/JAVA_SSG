package org.example.dayQ.day15;

public class 제너릭배열 {
    // 제네릭 메서드를 이용한 배열 최소값 찾기
    public static <T extends Comparable<T>> T findMin(T[] array) {
        T min = array[0];  // 첫 번째 값을 초기 최소값으로 설정
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        // 정수 배열의 최소값 찾기
        Integer[] intArray = {1, 3, 5, 7, 9};
        System.out.println("정수 배열의 최소값: " + findMin(intArray));
        // 문자열 배열의 최소값 찾기 (사전순으로 가장 앞에 오는 값)
        String[] stringArray = {"apple", "banana", "orange"};
        System.out.println("문자열 배열의 최소값: " + findMin(stringArray));
    }

    // ==> 응용 문제: 배열에서 중복된 값의 개수 세기
    // 문제 설명: 배열에서 중복된 값의 개수를 세는 제네릭 메서드를 작성하세요.
    //           배열에 포함된 값들 중 몇 개의 값이 중복되었는지 카운트한 후,
    //           중복된 값의 개수를 반환하는 메서드를 구현하세요.

}
