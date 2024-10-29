package org.example.day21.알고리즘.선형;

public class 업캐스팅테스트 {
    int x = 2;
    Object x2 = x;  // Object(부모, 큼)  <-- Integer(자식, 작) <--(오토박싱)-- int

    int[] n1 = {1, 2, 3};
    //Object[] n2 = n1; --> X : 배열에서는 오토박싱 X
    Integer[] n3 = {4, 5, 6};
    Object[] n4 = n3; // --> O

    String[] n5 = {"a", "b", "c"};
    Object[] n6 = n5;  // String은 가능
}
