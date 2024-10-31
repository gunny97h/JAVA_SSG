package org.example.day22.문제풀이;

import java.util.TreeSet;

// 3. TreeSet을 이용해서 푸세요.
//   int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3}을 중복을 제거후 오름차순으로
//   정렬 후 가장 큰 값과 가장 작은 값을 출력하세요.
public class 문제3TreeSet {
    public static void main(String[] args) {
        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3};
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int x : s3) treeSet.add(x);
        System.out.println(treeSet);
        System.out.println("최대: " + treeSet.last());
        System.out.println("최소: " + treeSet.first());
    }
}
